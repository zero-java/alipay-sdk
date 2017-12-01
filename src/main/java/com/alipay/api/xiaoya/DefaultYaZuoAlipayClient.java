package com.alipay.api.xiaoya;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alipay.api.*;
import com.alipay.api.domain.AlipayOfflineMaterialImageUploadModel;
import com.alipay.api.internal.util.AlipayLogger;
import com.alipay.api.internal.util.StringUtils;
import com.alipay.api.request.AlipayOfflineMaterialImageUploadRequest;
import com.yazuo.xiaoya.common.Identity;
import com.yazuo.xiaoya.common.json.NormalizerJSONString;
import com.yazuo.xiaoya.common.response.GenericResponse;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.nio.charset.Charset;
import java.util.Map;

/**
 * 小雅HTTP请求客户端，通过HTTP POST 请求开放平台数据，返回对应的Response
 * Created by jason.guan on 2017/10/17
 */
public class DefaultYaZuoAlipayClient implements YaZuoAlipayClient {
    private String serverUrl;
    private String appId;
    private String appSercet;
    private static final String charset = "UTF-8";
    private static final int timeout = 15000;
    private static HttpClient client;

    static {
        client = HttpClientBuilder.create().build();
    }

    /**
     * 初始化小雅HTTP Client,serverUrl，appId，appSercet为必填项，用于判断请求的服务器地址和调用方的标识信息
     */
    public DefaultYaZuoAlipayClient(String serverUrl, String appId, String appSercet) {
        this.serverUrl = serverUrl;
        this.appId = appId;
        this.appSercet = appSercet;
    }

    /**
     * 执行HTTP Post请求
     * 1.文件上传的请求 通过MultipartEntityBuilder 存放 字节数组
     * 2.普通POST请求 根据Request对象获取到方法名称，找到对应的URL请求地址，把Request中的BizModel作为请求Body，使用HttpEntity执行POST请求
     */
    @Override
    public <T extends AlipayResponse> GenericResponse execute(AlipayRequest<T> request, SerializerFeature... features) throws Exception {
        if (StringUtils.isEmpty(appId) || StringUtils.isEmpty(appSercet)) {
            throw new Exception("非法参数，appId|appSercet不能为空");
        }
        GenericResponse<T> genericResponse = new GenericResponse<T>();
        String methodName = request.getApiMethodName();
        Map<String, String> urlMaps = XiaoYaConstants.getUrlMap();
        String methodUrl = urlMaps.get(methodName);
        if (StringUtils.isEmpty(methodUrl)) {
            throw new Exception(methodName + ",未找到对应的接口方法,请升级对应的sdk版本");
        }
        if (request instanceof AlipayUploadRequest) {
            if (request instanceof AlipayOfflineMaterialImageUploadRequest) {
                AlipayOfflineMaterialImageUploadRequest uploadRequest = (AlipayOfflineMaterialImageUploadRequest) request;
                AlipayOfflineMaterialImageUploadModel model = (AlipayOfflineMaterialImageUploadModel) uploadRequest.getBizModel();
                FileItem fileItem = model.getFileItem();
                String fileName = fileItem.getFileName();
                byte[] content = fileItem.getContent();
                String result = upload(model.getIdentity(), fileName, serverUrl + methodUrl, content);
                String respStr = new String(new NormalizerJSONString(result).getNormalizerData());
                genericResponse = JSONObject.parseObject(respStr, new TypeReference<GenericResponse<T>>(request.getResponseClass()) {
                });
            }
        } else {
            String body = "";
            AlipayObject model = request.getBizModel();
            if(model !=null ){
                Identity identity =  model.getIdentity();
                if(identity == null){
                    identity = new Identity();
                }
                identity.setAppId(appId);
                model.setIdentity(identity);
                body = JSON.toJSONString(model);
            }
            String result = execute(serverUrl + methodUrl, body);
            String respStr = new String(new NormalizerJSONString(result).getNormalizerData());
            try{
                genericResponse = JSONObject.parseObject(respStr, new TypeReference<GenericResponse<T>>(request.getResponseClass()) {});
            }catch(JSONException exception) {
                try{
                    genericResponse = JSONObject.parseObject(result, new TypeReference<GenericResponse<T>>(request.getResponseClass()) {});
                }catch(JSONException exception2) {
                    AlipayLogger.logBizError("response数据转换异常："+result);
                    genericResponse.setCode("60000");
                    genericResponse.setMessage(result);
                    genericResponse.setSubMessage("response数据转换异常");
                }
            }
        }
        return genericResponse;
    }

    private static String execute(String url, String body) throws Exception {
        HttpPost post = new HttpPost(url);
        HttpEntity entity = new StringEntity(body, charset);
        post.setEntity(entity);
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(timeout).setConnectionRequestTimeout(timeout)
                .setSocketTimeout(timeout).build();
        post.setConfig(requestConfig);
        HttpResponse response = client.execute(post);
        if (response.getStatusLine().getStatusCode() == 200) {
            String resEntityStr = EntityUtils.toString(response.getEntity());
            return new String(resEntityStr.getBytes(charset), charset);
        } else if (response.getStatusLine().getStatusCode() == 404) {
            throw new Exception("人有失足,马有失蹄；404出错，请求地址不存在");
        } else {
            throw new Exception();
        }
    }

    private static String upload(Identity identity, String fileName, String url, byte[] content) throws Exception {
        HttpPost httpPost = new HttpPost(url);
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(timeout).setConnectionRequestTimeout(timeout)
                .setSocketTimeout(timeout).build();
        httpPost.setConfig(requestConfig);
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
        builder.setCharset(Charset.forName(charset));      //ContentType.create(type)
        builder.addBinaryBody("file", content, ContentType.DEFAULT_BINARY, fileName);
        builder.addTextBody("alipMerId", identity.getAlipMerId(), ContentType.create("text/plain", Charset.forName(charset)));
        if (!StringUtils.isEmpty(identity.getToken())) {
            builder.addTextBody("token", identity.getToken(), ContentType.create("text/plain", Charset.forName(charset)));
        }
        builder.addTextBody("fileName", fileName, ContentType.create("text/plain", Charset.forName(charset)));
        HttpEntity httpEntity = builder.build();
        httpPost.setEntity(httpEntity);
        HttpResponse httpResponse = client.execute(httpPost);
        if (httpResponse.getStatusLine().getStatusCode() == 200) {
            String resEntityStr = EntityUtils.toString(httpResponse.getEntity());
            return new String(resEntityStr.getBytes(charset), charset);
        } else if (httpResponse.getStatusLine().getStatusCode() == 404) {
            throw new Exception("人有失足,马有失蹄。404出错，请求地址不存在");
        } else {
            throw new Exception();
        }
    }
}
