package com.alipay.api.xiaoya;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alipay.api.AlipayRequest;
import com.alipay.api.AlipayResponse;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.FileItem;
import com.alipay.api.domain.AlipayOfflineMaterialImageUploadModel;
import com.alipay.api.internal.util.StringUtils;
import com.alipay.api.request.AlipayOfflineMaterialImageUploadRequest;
import com.yazuo.xiaoya.common.Identity;
import com.yazuo.xiaoya.common.json.NormalizerJSONString;
import com.yazuo.xiaoya.common.response.GenericResponse;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import java.nio.charset.Charset;
import java.util.Map;

/**
 * Created by jason.guan on 2017/10/17
 */
public class DefaultYaZuoAlipayClient implements YaZuoAlipayClient {
    private String serverUrl;
    private String appId;
    private String appSercet;

    public DefaultYaZuoAlipayClient(String serverUrl, String appId, String appSercet) {
        this.serverUrl = serverUrl;
        this.appId = appId;
        this.appSercet = appSercet;
    }

    @Override
    public <T extends AlipayResponse> GenericResponse execute(AlipayRequest<T> request, SerializerFeature... features) throws Exception {
        GenericResponse<T> genericResponse = new  GenericResponse<T> ();
        String methodName = request.getApiMethodName();
        Map<String, String> urlMaps = XiaoYaConstants.getUrlMap();
        String methodUrl = urlMaps.get(methodName);
        if (request instanceof AlipayUploadRequest) {
             if(request instanceof AlipayOfflineMaterialImageUploadRequest){
                 AlipayOfflineMaterialImageUploadRequest uploadRequest = (AlipayOfflineMaterialImageUploadRequest)request;
                 AlipayOfflineMaterialImageUploadModel model = (AlipayOfflineMaterialImageUploadModel)uploadRequest.getBizModel();
                 FileItem fileItem = model.getFileItem();
                 String fileName = fileItem.getFileName();
                 byte[] content = fileItem.getContent();
                 String result = upload(model.getIdentity(), fileName,serverUrl + methodUrl,content);
                 String respStr = new String(new NormalizerJSONString(result).getNormalizerData());
                 genericResponse = JSONObject.parseObject(respStr, new TypeReference<GenericResponse<T>>(request.getResponseClass()) { });
             }
        }else{
            String body = JSON.toJSONString(request.getBizModel());
            String result = execute(serverUrl + methodUrl, body);
            String respStr = new String(new NormalizerJSONString(result).getNormalizerData());
            genericResponse = JSONObject.parseObject(respStr, new TypeReference<GenericResponse<T>>(request.getResponseClass()) {});
        }
        return genericResponse;
    }

    private static String execute(String url, String body) throws Exception {
        HttpClient client = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(url);
        HttpEntity entity = new StringEntity(body, "utf-8");
        post.setEntity(entity);
        HttpResponse response = client.execute(post);
        if (response.getStatusLine().getStatusCode() == 200) {
            String resEntityStr = EntityUtils.toString(response.getEntity());
            return new String(resEntityStr.getBytes("utf-8"), "utf-8");
        } else if (response.getStatusLine().getStatusCode() == 404) {
            throw new Exception("404出错了");
        } else {
            throw new Exception();
        }
    }

    private static String upload(Identity identity,String fileName ,String url,byte[] content) throws Exception {
        HttpParams httpParameters = new BasicHttpParams();
        httpParameters.setParameter("charset", HTTP.UTF_8);
        HttpConnectionParams.setConnectionTimeout(httpParameters,10000);
        HttpConnectionParams.setSoTimeout(httpParameters, 15000);
        HttpClient httpClient = new DefaultHttpClient(httpParameters);
        HttpPost httpPost = new HttpPost(url);
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
        builder.setCharset(Charset.forName(HTTP.UTF_8));      //ContentType.create(type)
        builder.addBinaryBody("file", content,ContentType.DEFAULT_BINARY , fileName);
        builder.addTextBody("alipMerId", identity.getAlipMerId(), ContentType.create("text/plain", Charset.forName(HTTP.UTF_8)));
        if(!StringUtils.isEmpty(identity.getToken())){
            builder.addTextBody("token",identity.getToken() , ContentType.create("text/plain", Charset.forName(HTTP.UTF_8)));
        }
        builder.addTextBody("fileName", fileName, ContentType.create("text/plain", Charset.forName(HTTP.UTF_8)));
        HttpEntity httpEntity = builder.build();
        httpPost.setEntity(httpEntity);
        HttpResponse httpResponse = httpClient.execute(httpPost);
        if (httpResponse.getStatusLine().getStatusCode() == 200) {
            String resEntityStr = EntityUtils.toString(httpResponse.getEntity());
            return new String(resEntityStr.getBytes("utf-8"), "utf-8");
        } else if (httpResponse.getStatusLine().getStatusCode() == 404) {
            throw new Exception("404调用出错了");
        } else {
            throw new Exception();
        }
    }
}
