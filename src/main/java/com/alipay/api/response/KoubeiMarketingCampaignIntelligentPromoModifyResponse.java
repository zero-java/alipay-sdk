package com.alipay.api.response;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IntelligentPromo;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: koubei.marketing.campaign.intelligent.promo.modify response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-20 10:26:52
 */@ApiModel(description = " ALIPAY API: koubei.marketing.campaign.intelligent.promo.modify response.")
public class KoubeiMarketingCampaignIntelligentPromoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4435818913197444891L;

	/** 
	 * 修改后返回的智能活动模型
	 */@ApiModelProperty(notes = " 修改后返回的智能活动模型")
	private IntelligentPromo promo;

	public void setPromo(IntelligentPromo promo) {
		this.promo = promo;
	}
	public IntelligentPromo getPromo( ) {
		return this.promo;
	}

}
