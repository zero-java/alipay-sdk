package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.Inteligentpromo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.inteligent.promo.consult response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-06 19:36:18
 */
public class KoubeiMarketingCampaignInteligentPromoConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4297459113536244482L;

	/** 
	 * 智能营销方案咨询的模型
	 */
	@ApiField("promo")
	private Inteligentpromo promo;

	public void setPromo(Inteligentpromo promo) {
		this.promo = promo;
	}
	public Inteligentpromo getPromo( ) {
		return this.promo;
	}

}
