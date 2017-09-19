package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 智能营销活动下架
 *
 * @author auto create
 * @since 1.0, 2017-09-15 17:39:12
 */@ApiModel(description = " 智能营销活动下架")
public class KoubeiMarketingCampaignIntelligentPromoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5162716874729999415L;

	/**
	 * 操作下架的操作人信息
	 */@JSONField(name = "operator_context", alternateNames = "operatorContext")@ApiModelProperty(notes = " 操作下架的操作人信息")
	private PromoOperatorInfo operatorContext;

	/**
	 * 智能营销活动的id
	 */@JSONField(name = "promo_id", alternateNames = "promoId")@ApiModelProperty(notes = " 智能营销活动的id")
	private String promoId;

	public PromoOperatorInfo getOperatorContext() {
		return this.operatorContext;
	}
	public void setOperatorContext(PromoOperatorInfo operatorContext) {
		this.operatorContext = operatorContext;
	}

	public String getPromoId() {
		return this.promoId;
	}
	public void setPromoId(String promoId) {
		this.promoId = promoId;
	}

}
