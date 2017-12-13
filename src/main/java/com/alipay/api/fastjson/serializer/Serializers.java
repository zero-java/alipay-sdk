package com.alipay.api.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.serializer.ContextValueFilter;
import com.alipay.api.fastjson.annotation.JSONString;

public class Serializers {
    public static final ContextValueFilter BEAN_TO_STRING = new ContextValueFilter(){
        public Object process(BeanContext context, Object object, String name, Object value) {
            return context.getField().getAnnotation(JSONString.class)!=null? JSON.toJSONString(value):value;
        }
    };
}
