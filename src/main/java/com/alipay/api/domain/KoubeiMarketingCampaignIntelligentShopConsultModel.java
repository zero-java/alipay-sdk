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

    /**
     * 外部业务id，请尽量保持足够的复杂，方便定位数据来源
     */@JSONField(name = "out_request_no", alternateNames = "outRequestNo")@ApiModelProperty(notes = " 外部业务id，请尽量保持足够的复杂，方便定位数据来源")
    private String outRequestNo;

    /**
     * 营销模板的编号，默认（不传值时）GENERAL_EXPERIENCE
     GENERAL_EXPERIENCE：全场体验；
     GENERAL_NORMAL：全场普通；
     GENERAL_20171212：全场2017双12版；
     CROWD_EXPERIENCE：人群体验；
     CROWD_NORMAL：人群普通；
     CROWD_20171212：人群2017双12版；
     */@JSONField(name = "template_code", alternateNames = "templateCode")@ApiModelProperty(notes = " 营销模板的编号，默认（不传值时）GENERAL_EXPERIENCEGENERAL_EXPERIENCE：全场体验；GENERAL_NORMAL：全场普通；GENERAL_20171212：全场2017双12版；CROWD_EXPERIENCE：人群体验；CROWD_NORMAL：人群普通；CROWD_20171212：人群2017双12版；")
    private String templateCode;

    public String getOutRequestNo() {
        return outRequestNo;
    }

    public void setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

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
