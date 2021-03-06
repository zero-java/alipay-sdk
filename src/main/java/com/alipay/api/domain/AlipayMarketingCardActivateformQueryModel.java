package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 查询用户授权的开放表单信息
 *
 * @author auto create
 * @since 1.0, 2017-03-13 15:28:02
 */
@ApiModel(description = " 查询用户授权的开放表单信息")
public class AlipayMarketingCardActivateformQueryModel extends AlipayObject  {

    private static final long serialVersionUID = 6523926999912928548L;

    /**
     * 开放表单信息查询业务类型，可选类型如下：
     * MEMBER_CARD -- 会员卡开卡
     */
    @JSONField(alternateNames = "bizType", name = "biz_type")
    @ApiModelProperty(notes = " 开放表单信息查询业务类型，可选类型如下：MEMBER_CARD -- 会员卡开卡")
    private String bizType;

    /**
     * 查询用户表单提交信息的请求id，在用户授权表单确认提交后跳转商户页面url时返回此参数。
     */
    @JSONField(alternateNames = "requestId", name = "request_id")
    @ApiModelProperty(notes = " 查询用户表单提交信息的请求id，在用户授权表单确认提交后跳转商户页面url时返回此参数。")
    private String requestId;

    /**
     * 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果
     */
    @JSONField(alternateNames = "templateId", name = "template_id")
    @ApiModelProperty(notes = " 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果")
    private String templateId;

    public String getBizType() {
        return this.bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

}
