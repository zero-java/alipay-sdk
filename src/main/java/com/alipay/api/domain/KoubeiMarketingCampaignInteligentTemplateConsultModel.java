package com.alipay.api.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

/**
 * 智能营销方案咨询
 *
 * @author auto create
 * @since 1.0, 2017-09-06 10:55:44
 */
@ApiModel(description = " 智能营销方案咨询")
public class KoubeiMarketingCampaignInteligentTemplateConsultModel extends AlipayObject {

    private static final long serialVersionUID = 1349717826548777389L;

    /**
     * 操作员上下文
     */
    @ApiModelProperty(notes = " 操作员上下文")
    @JSONField(alternateNames = "operatorContext", name = "operator_context")
    private PromoOperatorInfo operatorContext;

    /**
     * 商户和支付宝交互时，用于代表支付宝分配给商户ID
     */
    @ApiModelProperty(notes = " 商户和支付宝交互时，用于代表支付宝分配给商户ID")
    @JSONField(alternateNames = "partnerId", name = "partner_id")
    private String partnerId;

    /**
     * 方案id
     */
    @ApiModelProperty(notes = " 方案id")
    @JSONField(alternateNames = "planId", name = "plan_id")
    private List<String> planId;

    public PromoOperatorInfo getOperatorContext() {
        return this.operatorContext;
    }

    public void setOperatorContext(PromoOperatorInfo operatorContext) {
        this.operatorContext = operatorContext;
    }

    public String getPartnerId() {
        return this.partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public List<String> getPlanId() {
        return this.planId;
    }

    public void setPlanId(List<String> planId) {
        this.planId = planId;
    }

}
