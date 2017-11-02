package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: koubei.marketing.campaign.intelligent.template.consult response.
 * 
 * @author auto create
 * @since 1.0, 2017-10-26 16:59:34
 */@ApiModel(description = " 模板咨询接口")
public class KoubeiMarketingCampaignIntelligentTemplateConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3793292612625435993L;

	/** 
	 * 营销模板的编号
GENERAL_EXPERIENCE：全场体验；
GENERAL_NORMAL：全场普通；
ITEM_EXPERIENCE：单品体验；
ITEM_NORMAL：单品普通
	 */@ApiModelProperty(notes = " 营销模板的编号GENERAL_EXPERIENCE：全场体验；GENERAL_NORMAL：全场普通；ITEM_EXPERIENCE：单品体验；ITEM_NORMAL：单品普通")
	@ApiListField("template_codes")
	@ApiField("string")
	private List<String> templateCodes;

	public void setTemplateCodes(List<String> templateCodes) {
		this.templateCodes = templateCodes;
	}
	public List<String> getTemplateCodes( ) {
		return this.templateCodes;
	}

}
