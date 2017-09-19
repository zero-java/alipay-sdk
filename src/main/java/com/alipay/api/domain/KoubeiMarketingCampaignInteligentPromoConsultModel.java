package com.alipay.api.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

/**
 * 智能营销活动咨询推荐接口
 *
 * @author auto create
 * @since 1.0, 2017-09-08 14:40:38
 */
@ApiModel(description = " 智能营销活动咨询推荐接口")
public class KoubeiMarketingCampaignInteligentPromoConsultModel extends AlipayObject {

    private static final long serialVersionUID = 3389223641924739762L;

    /**
     * 商户和支付宝交互时，用于代表支付宝分配给商户ID
     */
    @ApiModelProperty(notes = " 商户和支付宝交互时，用于代表支付宝分配给商户ID")
    @JSONField(alternateNames = "partnerId", name = "partner_id")
    private String partnerId;

    /**
     * 当全场普通和单品普通方案时必传，体验方案不用传
     */
    @ApiModelProperty(notes = " 当全场普通和单品普通方案时必传，体验方案不用传")
    @JSONField(alternateNames = "shopIds", name = "shop_ids")
    private List<String> shopIds;

    /**
     * 操作人信息
     */
    @ApiModelProperty(notes = " 操作人信息")
    @JSONField(alternateNames = "operatorContext", name = "operator_context")
    private PromoOperatorInfo operatorContext;
    /**
     * 营销模板的编号，GENERAL_EXPERIENCE：全场体验；GENERAL_NORMAL：全场普通；ITEM_EXPERIENCE：单品体验；ITEM_NORMAL：单品普通
     */
    @ApiModelProperty(notes = " 营销模板的编号，GENERAL_EXPERIENCE：全场体验；GENERAL_NORMAL：全场普通；ITEM_EXPERIENCE：单品体验；ITEM_NORMAL：单品普通")
    @JSONField(alternateNames = "templateCode", name = "template_code")
    private String templateCode;

    public String getPartnerId() {
        return this.partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public List<String> getShopIds() {
        return this.shopIds;
    }

    public void setShopIds(List<String> shopIds) {
        this.shopIds = shopIds;
    }

    public String getTemplateCode() {
        return this.templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

}
