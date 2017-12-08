package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: alipay.marketing.card.benefit.create response.
 *
 * @author auto create
 * @since 1.0, 2017-06-23 09:40:35
 */
@ApiModel(description = " ALIPAY API: alipay.marketing.card.benefit.create response.")
public class AlipayMarketingCardBenefitCreateResponse extends AlipayResponse {

    private static final long serialVersionUID = 8196565539485953339L;

    /**
     * 权益ID
     */
    @ApiModelProperty(notes = " 权益ID")
    @ApiField("benefit_id")
    private String benefitId;

    public void setBenefitId(String benefitId) {
        this.benefitId = benefitId;
    }

    public String getBenefitId() {
        return this.benefitId;
    }

}
