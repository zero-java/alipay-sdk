package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 智能营销活动效果预测
 *
 * @author auto create
 * @since 1.0, 2017-09-06 10:55:23
 */
@ApiModel(description = " 智能营销活动效果预测")
public class KoubeiMarketingDataInteligentEffectQueryModel extends AlipayObject {

    private static final long serialVersionUID = 2793141636891128353L;

    /**
     * 操作人上下文信息
     */
    @JSONField(alternateNames = "operatorContext", name = "operator_context")
    @ApiModelProperty(notes = " 操作人上下文信息")
    private PromoOperatorInfo operatorContext;

    /**
     * 智能营销活动的详情，用于咨询的元数据
     */
    @ApiModelProperty(notes = " 智能营销活动的详情，用于咨询的元数据")
    private Inteligentpromo promo;

    public PromoOperatorInfo getOperatorContext() {
        return this.operatorContext;
    }

    public void setOperatorContext(PromoOperatorInfo operatorContext) {
        this.operatorContext = operatorContext;
    }

    public Inteligentpromo getPromo() {
        return this.promo;
    }

    public void setPromo(Inteligentpromo promo) {
        this.promo = promo;
    }

}