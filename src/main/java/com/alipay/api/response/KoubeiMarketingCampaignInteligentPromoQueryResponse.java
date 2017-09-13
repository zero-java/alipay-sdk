package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.Inteligentpromo;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: koubei.marketing.campaign.inteligent.promo.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-06 10:53:43
 */@ApiModel(description = " ALIPAY API: koubei.marketing.campaign.inteligent.promo.query response.")
public class KoubeiMarketingCampaignInteligentPromoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2362556991599388615L;

	/** 
	 * 查询返回的营销活动模型
	 */@ApiModelProperty(notes = " 查询返回的营销活动模型")
	@ApiField("promo")
	private Inteligentpromo promo;

	public void setPromo(Inteligentpromo promo) {
		this.promo = promo;
	}
	public Inteligentpromo getPromo( ) {
		return this.promo;
	}

}
