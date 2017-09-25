package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * 智能营销方案创建
 *
 * @author auto create
 * @since 1.0, 2017-09-20 10:27:21
 */
@ApiModel(description = " 智能营销方案创建")
public class KoubeiMarketingCampaignIntelligentPromoCreateModel extends AlipayObject {

    private static final long serialVersionUID = 3659469843494664381L;

    /**
     * 创建营销方案的上下文信息
     */
    @JSONField(name = "operator_context", alternateNames = "operatorContext")
    @ApiModelProperty(notes = " 创建营销方案的上下文信息")
    @NotNull
    @Valid
    private PromoOperatorInfo operatorContext;

    /**
     * 代表了一次请求，作为业务幂等性控制
     */
    @JSONField(name = "out_request_no", alternateNames = "outRequestNo")
    @ApiModelProperty(notes = " 代表了一次请求，作为业务幂等性控制")
    @NotBlank
    private String outRequestNo;

    /**
     * 智能营销活动信息
     */
    @ApiModelProperty(notes = " 智能营销活动信息")
    @NotNull
    @Valid
    private IntelligentPromo promo;

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

    public IntelligentPromo getPromo() {
        return this.promo;
    }

    public void setPromo(IntelligentPromo promo) {
        this.promo = promo;
    }

}
