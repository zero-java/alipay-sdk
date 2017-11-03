package com.alipay.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jason.guan on 2017/11/1
 */
public class ArrayValueSerializing implements ObjectSerializer {
    @Override
    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {
        if(object==null) object = new ArrayList();
        if(!(object instanceof List)){
            throw new IllegalArgumentException("无法为非List对象序列化fieldName:"+fieldName);
        }
        List list = (List) object;
        if(list.size()==0){
            serializer.write("\"\"");
        } else{
            String res = JSON.toJSONString(list);
//            res = res.replaceAll("\"","\\\"");
            serializer.write(res);
        }
    }


}