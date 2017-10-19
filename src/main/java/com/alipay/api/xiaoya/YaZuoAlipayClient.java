package com.alipay.api.xiaoya;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayRequest;
import com.alipay.api.AlipayResponse;
import com.yazuo.xiaoya.common.response.GenericResponse;

/**
 * Created by jason.guan on 2017/10/17
 */
public interface YaZuoAlipayClient {
    public <T extends AlipayResponse> GenericResponse execute(AlipayRequest<T> request, SerializerFeature... features) throws Exception;
}
