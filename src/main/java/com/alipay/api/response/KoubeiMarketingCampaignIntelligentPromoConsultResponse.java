package com.alipay.api.response;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IntelligentPromo;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: koubei.marketing.campaign.intelligent.promo.consult response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-20 10:25:28
 */@ApiModel(description = " ALIPAY API: koubei.marketing.campaign.intelligent.promo.consult response.")
public class KoubeiMarketingCampaignIntelligentPromoConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3812695547496462255L;

	/** 
	 * 智能营销方案咨询的模型
	 */@ApiModelProperty(notes = " 智能营销方案咨询的模型")
	private IntelligentPromo promo;

	public void setPromo(IntelligentPromo promo) {
		this.promo = promo;
	}
	public IntelligentPromo getPromo( ) {
		return this.promo;
	}

}
