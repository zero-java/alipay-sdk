package com.alipay.api.fastjson.parser.deserializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer;
import com.alibaba.fastjson.util.FieldInfo;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

public class JsonStringFieldDeserializer extends DefaultFieldDeserializer {
    public JsonStringFieldDeserializer(ParserConfig mapping, Class<?> clazz, FieldInfo fieldInfo) {
        super(mapping, clazz, fieldInfo);
    }

    @Override
    public void parseField(DefaultJSONParser parser, Object object, Type objectType, Map<String, Object> fieldValues) {
        String json = parser.lexer.stringVal();

        Type fieldType = fieldInfo.fieldType;
        Object value = null ;
        if(!isEmpty(json)){
            if(fieldType instanceof ParameterizedType){
                value = JSONArray.parseArray(json,(Class<? extends Object>) ((ParameterizedType)fieldType).getActualTypeArguments()[0]);
            }else{
                value = JSON.parseObject(json,fieldType);
            }
        }
        setValue(object, value);
    }
     private boolean isEmpty(String json){
        return json==null||((json.length()==2)&&(isEmptyArray(json)||isEmptyObject(json)));

     }

     private boolean isEmptyObject(String obj){
         return obj.startsWith("{")&&obj.endsWith("}");
     }
    private boolean isEmptyArray(String array){
        return array.startsWith("[")&&array.endsWith("]");
    }

}
