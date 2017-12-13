package com.alipay.api.fastjson.parser.deserializer;

import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alipay.api.fastjson.annotation.JSONString;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class CustomerJavaBeanDeserializer extends JavaBeanDeserializer {
    public CustomerJavaBeanDeserializer(ParserConfig config, Class<?> clazz) {
        this(config, clazz, clazz);
    }

    public CustomerJavaBeanDeserializer(ParserConfig config, Class<?> clazz, Type type) {
        this(config //
                , JavaBeanInfo.build(clazz, type, config.propertyNamingStrategy, config.fieldBased, config.compatibleWithJavaBean)
        );
    }

    public CustomerJavaBeanDeserializer(ParserConfig config, JavaBeanInfo beanInfo) {
        super(config, beanInfo);
        Map<String, FieldDeserializer> alterNameFieldDeserializers = new HashMap<String, FieldDeserializer>();
        FieldDeserializer[] sortedFieldDeserializers = new FieldDeserializer[beanInfo.sortedFields.length];
        FieldDeserializer[] fieldDeserializers = new FieldDeserializer[beanInfo.fields.length];

        for (int i = 0, size = beanInfo.sortedFields.length; i < size; ++i) {
            FieldInfo fieldInfo = beanInfo.sortedFields[i];
            FieldDeserializer fieldDeserializer = config.createFieldDeserializer(config, beanInfo, fieldInfo);
            JSONString stringTag = fieldInfo.getAnnation(JSONString.class);
            if(stringTag!=null){
                fieldDeserializer =new JsonStringFieldDeserializer(config,beanInfo.clazz,fieldInfo);
            }
            sortedFieldDeserializers[i] = fieldDeserializer;

            for (String name : fieldInfo.alternateNames) {
                alterNameFieldDeserializers.put(name, fieldDeserializer);
            }
        }

        for (int i = 0, size = beanInfo.fields.length; i < size; ++i) {
            FieldInfo fieldInfo = beanInfo.fields[i];
            FieldDeserializer fieldDeserializer = getFieldDeserializer(fieldInfo.name);
            JSONString stringTag = fieldInfo.getAnnation(JSONString.class);
            if(stringTag!=null){
                fieldDeserializer =new JsonStringFieldDeserializer(config,beanInfo.clazz,fieldInfo);
            }
            fieldDeserializers[i] = fieldDeserializer;
        }

        Class clazz = getNativeJavaBeanClass(this.getClass());
        if(clazz!=null){
            try {
                acessFinalField(clazz,"alterNameFieldDeserializers",this,alterNameFieldDeserializers);
                acessFinalField(clazz,"sortedFieldDeserializers",this,sortedFieldDeserializers);
                acessFinalField(clazz,"fieldDeserializers",this,fieldDeserializers);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }


    }

  private void acessFinalField(Class clazz, String key, Object obj,Object value) throws NoSuchFieldException, IllegalAccessException {
        Field field = clazz.getDeclaredField(key);
        field.setAccessible(true);
        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        int modifiers = field.getModifiers();
        modifiersField.set(field,modifiers& ~Modifier.FINAL);
        field.set(obj,value);
        modifiersField.set(field,modifiers);
        modifiersField.setAccessible(false);
        field.setAccessible(false);
  }

  private Class getNativeJavaBeanClass(Class clazz){
        if(clazz==null||Object.class.getName().equals(clazz.getName())) return null;
        if(JavaBeanDeserializer.class.getName().equals(clazz.getName())) {
            return clazz;
        }else{
            return getNativeJavaBeanClass(clazz.getSuperclass());
        }
  }

}
