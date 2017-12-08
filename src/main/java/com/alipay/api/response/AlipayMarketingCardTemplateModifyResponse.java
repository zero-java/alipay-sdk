package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: alipay.marketing.card.template.modify response.
 *
 * @author auto create
 * @since 1.0, 2016-12-28 15:34:37
 */
@ApiModel(description = " ALIPAY API: alipay.marketing.card.template.modify response.")
public class AlipayMarketingCardTemplateModifyResponse extends AlipayResponse {

    private static final long serialVersionUID = 2551212798661257159L;

    /**
     * 模板ID
     */
    @ApiModelProperty(notes = " 模板ID")
    @ApiField("template_id")
    private String templateId;

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTemplateId() {
        return this.templateId;
    }

}
