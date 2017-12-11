package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: alipay.marketing.card.update response.
 *
 * @author auto create
 * @since 1.0, 2017-01-13 12:46:19
 */
@ApiModel(description = " ALIPAY API: alipay.marketing.card.update response.")
public class AlipayMarketingCardUpdateResponse extends AlipayResponse {

    private static final long serialVersionUID = 3199757341842825569L;

    /**
     * 二级错误处理结果（如果公用返回结果为false，则可以看这个接口判断明细原因）
     * 如果公用返回为true，则该字段为空
     */
    @ApiModelProperty(notes = " 二级错误处理结果（如果公用返回结果为false，则可以看这个接口判断明细原因）如果公用返回为true，则该字段为空")
    @ApiField("result_code")
    private String resultCode;

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultCode() {
        return this.resultCode;
    }

}
