package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: alipay.marketing.card.template.create response.
 *
 * @author auto create
 * @since 1.0, 2016-12-22 10:40:36
 */
@ApiModel(description = " ALIPAY API: alipay.marketing.card.template.create response.")
public class AlipayMarketingCardTemplateCreateResponse extends AlipayResponse {

    private static final long serialVersionUID = 8517244434351584435L;

    /**
     * 支付宝卡模板ID
     */
    @ApiModelProperty(notes = " 支付宝卡模板ID")
    @ApiField("template_id")
    private String templateId;

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTemplateId() {
        return this.templateId;
    }

}
