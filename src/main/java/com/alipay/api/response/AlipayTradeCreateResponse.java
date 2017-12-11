package com.alipay.api.response;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: alipay.trade.create response.
 *
 * @author auto create
 * @since 1.0, 2017-02-15 14:03:02
 */
@ApiModel(description = " ALIPAY API: alipay.trade.create response.")
public class AlipayTradeCreateResponse extends AlipayResponse {

    private static final long serialVersionUID = 6828942694747189962L;

    /**
     * 商户订单号
     */
    @ApiModelProperty(notes = " 商户订单号")
    @JSONField(name = "out_trade_no", alternateNames = "outTradeNo")
    private String outTradeNo;

    /**
     * 支付宝交易号
     */
    @ApiModelProperty(notes = " 支付宝交易号")
    @JSONField(name = "trade_no", alternateNames = "tradeNo")
    private String tradeNo;

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getTradeNo() {
        return this.tradeNo;
    }

}
