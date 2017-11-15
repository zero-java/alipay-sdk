package com.alipay.api.request;

import com.alipay.api.AlipayObject;
import com.alipay.api.AlipayRequest;
import com.alipay.api.response.YazuoApiAlertResponse;

import java.util.Map;


/**
 * Created by jason.guan on 2017/11/15
 */
public class YazuoApiAlertRequest implements AlipayRequest<YazuoApiAlertResponse> {
    /**
     * 获取TOP的API名称。
     *
     * @return API名称
     */
    @Override
    public String getApiMethodName() {
        return "com.yazuo.xiaoya.api.alert";
    }

    /**
     * 获取所有的Key-Value形式的文本请求参数集合。其中：
     * <ul>
     * <li>Key: 请求参数名</li>
     * <li>Value: 请求参数值</li>
     * </ul>
     *
     * @return 文本请求参数集合
     */
    @Override
    public Map<String, String> getTextParams() {
        return null;
    }

    /**
     * 得到当前接口的版本
     *
     * @return API版本
     */
    @Override
    public String getApiVersion() {
        return null;
    }

    /**
     * 设置当前API的版本信息
     *
     * @param apiVersion API版本
     */
    @Override
    public void setApiVersion(String apiVersion) {

    }

    /**
     * 获取终端类型
     *
     * @return 终端类型
     */
    @Override
    public String getTerminalType() {
        return null;
    }

    /**
     * 设置终端类型
     *
     * @param terminalType 终端类型
     */
    @Override
    public void setTerminalType(String terminalType) {

    }

    /**
     * 获取终端信息
     *
     * @return 终端信息
     */
    @Override
    public String getTerminalInfo() {
        return null;
    }

    /**
     * 设置终端信息
     *
     * @param terminalInfo 终端信息
     */
    @Override
    public void setTerminalInfo(String terminalInfo) {

    }

    /**
     * 获取产品码
     *
     * @return 产品码
     */
    @Override
    public String getProdCode() {
        return null;
    }

    /**
     * 设置产品码
     *
     * @param prodCode 产品码
     */
    @Override
    public void setProdCode(String prodCode) {

    }

    /**
     * 返回通知地址
     *
     * @return
     */
    @Override
    public String getNotifyUrl() {
        return null;
    }

    /**
     * 设置通知地址
     *
     * @param notifyUrl
     */
    @Override
    public void setNotifyUrl(String notifyUrl) {

    }

    /**
     * 返回回跳地址
     *
     * @return
     */
    @Override
    public String getReturnUrl() {
        return null;
    }

    /**
     * 设置回跳地址
     *
     * @param returnUrl
     */
    @Override
    public void setReturnUrl(String returnUrl) {

    }

    /**
     * 得到当前API的响应结果类型
     *
     * @return 响应类型
     */
    @Override
    public Class<YazuoApiAlertResponse> getResponseClass() {
        return null;
    }

    /**
     * 判断是否需要加密
     *
     * @return
     */
    @Override
    public boolean isNeedEncrypt() {
        return false;
    }

    /**
     * 设置请求是否需要加密
     *
     * @param needEncrypt
     */
    @Override
    public void setNeedEncrypt(boolean needEncrypt) {

    }

    @Override
    public AlipayObject getBizModel() {
        return null;
    }

    /**
     * 设置业务实体，如需使用此方法，请勿直接设置biz_content
     *
     * @param bizModel
     */
    @Override
    public void setBizModel(AlipayObject bizModel) {

    }
}
