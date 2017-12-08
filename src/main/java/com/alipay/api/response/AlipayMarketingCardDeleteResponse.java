package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: alipay.marketing.card.delete response.
 *
 * @author auto create
 * @since 1.0, 2017-01-13 13:10:44
 */
@ApiModel(description = " ALIPAY API: alipay.marketing.card.delete response.")
public class AlipayMarketingCardDeleteResponse extends AlipayResponse {

    private static final long serialVersionUID = 8313163176771249862L;

    /**
     * 支付宝端删卡业务流水号
     */
    @ApiModelProperty(notes = " 支付宝端删卡业务流水号")
    @ApiField("biz_serial_no")
    private String bizSerialNo;

    public void setBizSerialNo(String bizSerialNo) {
        this.bizSerialNo = bizSerialNo;
    }

    public String getBizSerialNo() {
        return this.bizSerialNo;
    }

}
