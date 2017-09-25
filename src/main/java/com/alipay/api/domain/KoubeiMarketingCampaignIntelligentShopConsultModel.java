package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 智能营销门店咨询
 *
 * @author auto create
 * @since 1.0, 2017-09-22 11:45:15
 */
@ApiModel(description = " 智能营销门店咨询")
public class KoubeiMarketingCampaignIntelligentShopConsultModel extends AlipayObject {

    private static final long serialVersionUID = 4119553767132283235L;

    /**
     * 操作上下文
     */
    @ApiModelProperty(notes = " 操作上下文")
    @JSONField(alternateNames = "operatorContext", name = "operator_context")
    private PromoOperatorInfo operatorContext;

    /**
     * 商户和支付宝交互时，用于代表支付宝分配给商户ID
     */
    @ApiModelProperty(notes = " 商户和支付宝交互时，用于代表支付宝分配给商户ID")
    @JSONField(alternateNames = "partnerId", name = "partner_id")
    private String partnerId;

    /**
     * 智能营销方案的方案模板id
     */
    @ApiModelProperty(notes = " 智能营销方案的方案模板id")
    @JSONField(alternateNames = "planId", name = "plan_id")
    private String planId;

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

    public String getPlanId() {
        return this.planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

}
