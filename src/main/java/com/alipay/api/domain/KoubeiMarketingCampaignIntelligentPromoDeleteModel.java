package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 智能营销活动下架
 *
 * @author auto create
 * @since 1.0, 2017-09-20 10:28:45
 */@ApiModel(description = " 智能营销活动下架")
public class KoubeiMarketingCampaignIntelligentPromoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4328743347349619674L;

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
