package com.alipay.api.response;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IntelligentPromo;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: koubei.marketing.campaign.intelligent.promo.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-15 17:53:18
 */@ApiModel(description = " ALIPAY API: koubei.marketing.campaign.intelligent.promo.query response.")
public class KoubeiMarketingCampaignIntelligentPromoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8445491823285627727L;

	/** 
	 * 查询返回的营销活动模型
	 */@ApiModelProperty(notes = " 查询返回的营销活动模型")
	private IntelligentPromo promo;

	public void setPromo(IntelligentPromo promo) {
		this.promo = promo;
	}
	public IntelligentPromo getPromo( ) {
		return this.promo;
	}

}
