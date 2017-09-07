package com.alipay.api.response;

import com.alipay.api.AlipayResponse;
import com.alipay.api.domain.InteligentpromoPlan;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ALIPAY API: koubei.marketing.campaign.inteligent.plan.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-06 11:13:58
 */
public class KoubeiMarketingCampaignInteligentPlanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8854863236136714773L;

	/** 
	 * 智能营销方案信息
	 */
	@ApiField("plan")
	private InteligentpromoPlan plan;

	public void setPlan(InteligentpromoPlan plan) {
		this.plan = plan;
	}
	public InteligentpromoPlan getPlan( ) {
		return this.plan;
	}

}
