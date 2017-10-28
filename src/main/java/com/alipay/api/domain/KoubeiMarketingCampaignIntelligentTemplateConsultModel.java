package com.alipay.api.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

/**
 * 智能营销模板咨询
 *
 * @author auto create
 * @since 1.0, 2017-10-26 16:59:16
 */
@ApiModel(description = " 智能营销模板咨询")
public class KoubeiMarketingCampaignIntelligentTemplateConsultModel extends AlipayObject {

    private static final long serialVersionUID = 4315965945491493861L;

    /**
     * 操作上下文
     */
    @ApiModelProperty(notes = " 操作上下文")
    @JSONField(alternateNames = "operatorContext", name = "operator_context")
    private PromoOperatorInfo operatorContext;

    /**
     * 代表了一次请求，作为业务幂等性控制
     */
    @ApiModelProperty(notes = " 代表了一次请求，作为业务幂等性控制")
    @JSONField(alternateNames = "outRequestNo", name = "out_request_no")
    private String outRequestNo;

    /**
     * 商户和支付宝交互时，用于代表支付宝分配给商户ID
     */
    @ApiModelProperty(notes = " 商户和支付宝交互时，用于代表支付宝分配给商户ID")
    @JSONField(alternateNames = "partnerId", name = "partner_id")
    private String partnerId;

    /**
     * 默认(不传shop_ids)使用待体验门店匹配适用模板，指定shop_ids后根据入参匹配适用模板
     */
    @ApiModelProperty(notes = " 默认(不传shop_ids)使用待体验门店匹配适用模板，指定shop_ids后根据入参匹配适用模板")
    @JSONField(alternateNames = "shopIds", name = "shop_ids")
    private List<String> shopIds;

    public PromoOperatorInfo getOperatorContext() {
        return this.operatorContext;
    }

    public void setOperatorContext(PromoOperatorInfo operatorContext) {
        this.operatorContext = operatorContext;
    }

    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public void setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
    }

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

}
