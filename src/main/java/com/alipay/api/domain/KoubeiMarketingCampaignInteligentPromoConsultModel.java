package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 智能营销活动咨询推荐接口
 *
 * @author auto create
 * @since 1.0, 2017-09-06 19:32:28
 */
@ApiModel(description = " 智能营销活动咨询推荐接口")
public class KoubeiMarketingCampaignInteligentPromoConsultModel extends AlipayObject {

    private static final long serialVersionUID = 4544713768791752248L;

    /**
     * 商户和支付宝交互时，用于代表支付宝分配给商户ID
     */
    @NotBlank
    @ApiModelProperty(notes = " 商户和支付宝交互时，用于代表支付宝分配给商户ID")
    @JSONField(alternateNames = "partnerId", name = "partner_id")
    private String partnerId;

    /**
     * 智能营销方案ID
     */
    @NotBlank
    @ApiModelProperty(notes = " 智能营销方案ID")
    @JSONField(alternateNames = "planId", name = "plan_id")
    private String planId;

    /**
     * 营销模板id，全场级别的
     */
    @ApiModelProperty(notes = " 营销模板id，全场级别的")
    @JSONField(alternateNames = "templateId", name = "template_id")
    @NotBlank
    private String templateId;

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

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

}
