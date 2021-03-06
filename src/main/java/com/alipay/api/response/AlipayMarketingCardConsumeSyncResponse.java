package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: alipay.marketing.card.consume.sync response.
 *
 * @author auto create
 * @since 1.0, 2016-10-18 15:46:55
 */
@ApiModel(description = " ALIPAY API: alipay.marketing.card.consume.sync response.")
public class AlipayMarketingCardConsumeSyncResponse extends AlipayResponse {

    private static final long serialVersionUID = 1518179435861869423L;

    /**
     * 外部卡号
     */
    @ApiModelProperty(notes = " 外部卡号")
    @ApiField("external_card_no")
    private String externalCardNo;

    public void setExternalCardNo(String externalCardNo) {
        this.externalCardNo = externalCardNo;
    }

    public String getExternalCardNo() {
        return this.externalCardNo;
    }

}
