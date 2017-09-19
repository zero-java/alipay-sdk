package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 智能营销方案修改
 *
 * @author auto create
 * @since 1.0, 2017-09-15 17:39:47
 */@ApiModel(description = " 智能营销方案修改")
public class KoubeiMarketingCampaignIntelligentPromoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3118652497314736915L;

	/**
	 * 操作人员上下文
	 */@JSONField(name = "operator_context", alternateNames = "operatorContext")@ApiModelProperty(notes = " 操作人员上下文")
	private PromoOperatorInfo operatorContext;

	/**
	 * 方案信息
	 */@ApiModelProperty(notes = " 方案信息")
	private IntelligentPromo promo;

	public PromoOperatorInfo getOperatorContext() {
		return this.operatorContext;
	}
	public void setOperatorContext(PromoOperatorInfo operatorContext) {
		this.operatorContext = operatorContext;
	}

	public IntelligentPromo getPromo() {
		return this.promo;
	}
	public void setPromo(IntelligentPromo promo) {
		this.promo = promo;
	}

}
