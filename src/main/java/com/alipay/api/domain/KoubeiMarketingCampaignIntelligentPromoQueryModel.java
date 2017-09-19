package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 只能营销方案详情查询
 *
 * @author auto create
 * @since 1.0, 2017-09-15 17:40:09
 */@ApiModel(description = " 只能营销方案详情查询")
public class KoubeiMarketingCampaignIntelligentPromoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8172678735192382837L;

	/**
	 * 操作人员上下文
	 */@JSONField(name = "operator_context", alternateNames = "operatorContext")@ApiModelProperty(notes = " 操作人员上下文")
	private PromoOperatorInfo operatorContext;

	/**
	 * 智能营销活动id
	 */@JSONField(name = "promo_id", alternateNames = "promoId")@ApiModelProperty(notes = " 智能营销活动id")
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
