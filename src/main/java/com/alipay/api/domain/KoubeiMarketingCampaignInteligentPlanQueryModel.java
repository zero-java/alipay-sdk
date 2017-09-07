package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 智能营销方案查询
 *
 * @author auto create
 * @since 1.0, 2017-09-06 11:12:58
 */
@ApiModel(description = " 智能营销方案查询")
public class KoubeiMarketingCampaignInteligentPlanQueryModel extends AlipayObject {

    private static final long serialVersionUID = 3678223873354982969L;

    /**
     * 操作人信息
     */
    @ApiModelProperty(notes = " 操作人信息")
    @JSONField(alternateNames = "operatorContext", name = "operator_context")
    private PromoOperatorInfo operatorContext;

    /**
     * 根据编号来获取对应的方案信息
     */
    @ApiModelProperty(notes = " 根据编号来获取对应的方案信息")
    @JSONField(alternateNames = "planCode", name = "plan_code")
    private String planCode;

    public PromoOperatorInfo getOperatorContext() {
        return this.operatorContext;
    }

    public void setOperatorContext(PromoOperatorInfo operatorContext) {
        this.operatorContext = operatorContext;
    }

    public String getPlanCode() {
        return this.planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

}
