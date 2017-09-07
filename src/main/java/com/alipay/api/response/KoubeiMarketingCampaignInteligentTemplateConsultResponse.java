package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InteligentpromoPlanRootTemplate;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.inteligent.template.consult response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-06 11:39:30
 */
public class KoubeiMarketingCampaignInteligentTemplateConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7423286147154344846L;

	/** 
	 * 咨询后返回的方案列表，一般为全场和单品
	 */
	@ApiListField("templates")
	@ApiField("inteligentpromo_plan_root_template")
	private List<InteligentpromoPlanRootTemplate> templates;

	public void setTemplates(List<InteligentpromoPlanRootTemplate> templates) {
		this.templates = templates;
	}
	public List<InteligentpromoPlanRootTemplate> getTemplates( ) {
		return this.templates;
	}

}
