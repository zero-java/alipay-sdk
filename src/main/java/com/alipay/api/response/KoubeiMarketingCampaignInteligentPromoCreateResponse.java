package com.alipay.api.response;

import com.alipay.api.AlipayResponse;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ALIPAY API: koubei.marketing.campaign.inteligent.promo.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-06 14:25:21
 */
public class KoubeiMarketingCampaignInteligentPromoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5287246233493742849L;

	/** 
	 * 智能营销活动ID
	 */
	@ApiField("promo_id")
	private String promoId;

	public void setPromoId(String promoId) {
		this.promoId = promoId;
	}
	public String getPromoId( ) {
		return this.promoId;
	}

}
