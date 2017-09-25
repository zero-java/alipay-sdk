package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * 智能营销活动效果预测
 *
 * @author auto create
 * @since 1.0, 2017-09-20 10:28:11
 */
@ApiModel(description = " 智能营销活动效果预测")
public class KoubeiMarketingDataIntelligentEffectQueryModel extends AlipayObject {

    private static final long serialVersionUID = 2791656685841485171L;

    /**
     * 操作人上下文信息
     */
    @JSONField(name = "operator_context", alternateNames = "operatorContext")
    @ApiModelProperty(notes = " 操作人上下文信息")
    @NotNull
    @Valid
    private PromoOperatorInfo operatorContext;

    /**
     * 智能营销活动的详情，用于咨询的元数据
     */
    @ApiModelProperty(notes = " 智能营销活动的详情，用于咨询的元数据")
    @NotNull
    @Valid
    private IntelligentPromo promo;

    public PromoOperatorInfo getOperatorContext() {
        return this.operatorContext;
    }

    public void setOperatorContext(PromoOperatorInfo operatorContext) {
        this.operatorContext = operatorContext;
    }

    public IntelligentPromo getPromo() {
        return this.promo;
    }

    public void setPromo(IntelligentPromo promo) {
        this.promo = promo;
    }

}
