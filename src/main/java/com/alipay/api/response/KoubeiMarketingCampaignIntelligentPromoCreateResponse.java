package com.alipay.api.response;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IntelligentPromo;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: koubei.marketing.campaign.intelligent.promo.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-15 17:55:22
 */@ApiModel(description = " ALIPAY API: koubei.marketing.campaign.intelligent.promo.create response.")
public class KoubeiMarketingCampaignIntelligentPromoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7863914721428433811L;

	/** 
	 * 智能营销活动信息
	 */@ApiModelProperty(notes = " 智能营销活动信息")
	private IntelligentPromo promo;

	public void setPromo(IntelligentPromo promo) {
		this.promo = promo;
	}
	public IntelligentPromo getPromo( ) {
		return this.promo;
	}

}
