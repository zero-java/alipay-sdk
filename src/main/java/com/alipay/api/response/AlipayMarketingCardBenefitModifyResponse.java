package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: alipay.marketing.card.benefit.modify response.
 *
 * @author auto create
 * @since 1.0, 2017-06-23 09:40:45
 */
@ApiModel(description = " ALIPAY API: alipay.marketing.card.benefit.modify response.")
public class AlipayMarketingCardBenefitModifyResponse extends AlipayResponse {

    private static final long serialVersionUID = 4591285146347387355L;

    /**
     * 权益修改结果；true成功：false失败
     */
    @ApiModelProperty(notes = " 权益修改结果；true成功：false失败")
    @ApiField("result")
    private Boolean result;

    public void setResult(Boolean result) {
        this.result = result;
    }

    public Boolean getResult() {
        return this.result;
    }

}
