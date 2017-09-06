package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 智能营销方案创建
 *
 * @author auto create
 * @since 1.0, 2017-09-06 10:53:16
 */
@ApiModel(description = " 智能营销方案创建")
public class KoubeiMarketingCampaignInteligentPromoCreateModel extends AlipayObject {

    private static final long serialVersionUID = 5188729639731874158L;

    /**
     * 创建营销方案的上下文信息
     */
    @ApiModelProperty(notes = " 创建营销方案的上下文信息")
    @JSONField(alternateNames = "operatorContext", name = "operator_context")
    private PromoOperatorInfo operatorContext;

    /**
     * 代表了一次请求，作为业务幂等性控制
     */
    @ApiModelProperty(notes = " 代表了一次请求，作为业务幂等性控制")
    @JSONField(alternateNames = "outRequestNo", name = "out_request_no")
    private String outRequestNo;

    /**
     * 智能营销活动信息
     */
    @ApiModelProperty(notes = " 智能营销活动信息")
    private Inteligentpromo promo;

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

    public Inteligentpromo getPromo() {
        return this.promo;
    }

    public void setPromo(Inteligentpromo promo) {
        this.promo = promo;
    }

}
