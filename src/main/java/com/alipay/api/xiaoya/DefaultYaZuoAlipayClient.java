package com.alipay.api.xiaoya;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alipay.api.AlipayRequest;
import com.alipay.api.AlipayResponse;
import com.alipay.api.AlipayUploadRequest;
import com.yazuo.xiaoya.common.json.NormalizerJSONString;
import com.yazuo.xiaoya.common.response.GenericResponse;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

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
            System.out.println("upload");
        }else{
            String body = JSON.toJSONString(request.getBizModel());
            String result = execute(serverUrl + methodUrl, body);
            String respStr = new String(new NormalizerJSONString(result).getNormalizerData());
            genericResponse = JSONObject.parseObject(respStr, new TypeReference<GenericResponse<T>>(request.getResponseClass()) {
            });
        }
        return genericResponse;
    }

    private static String execute(String url, String body) throws Exception {
        System.out.println(url);
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
}
