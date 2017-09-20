package com.alipay.api.response;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IntelligentPromo;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: koubei.marketing.data.intelligent.effect.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-20 10:28:15
 */@ApiModel(description = " ALIPAY API: koubei.marketing.data.intelligent.effect.query response.")
public class KoubeiMarketingDataIntelligentEffectQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7292359929227555457L;

	/** 
	 * 咨询后返回的模型，包含活动本身的模型以及效果模型
	 */@ApiModelProperty(notes = " 咨询后返回的模型，包含活动本身的模型以及效果模型")
	private IntelligentPromo promo;

	public void setPromo(IntelligentPromo promo) {
		this.promo = promo;
	}
	public IntelligentPromo getPromo( ) {
		return this.promo;
	}

}
