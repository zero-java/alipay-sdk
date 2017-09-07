package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 智能营销方案修改
 *
 * @author auto create
 * @since 1.0, 2017-09-06 10:53:59
 */@ApiModel(description = " 智能营销方案修改")
public class KoubeiMarketingCampaignInteligentPromoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5166893446418586756L;

	/**
	 * 操作人员上下文
	 */@ApiModelProperty(notes = " 操作人员上下文")@JSONField(name = "operator_context", alternateNames = "operatorContext")
	private PromoOperatorInfo operatorContext;

	/**
	 * 方案信息
	 */@ApiModelProperty(notes = " 方案信息")
	private Inteligentpromo promo;

	public PromoOperatorInfo getOperatorContext() {
		return this.operatorContext;
	}
	public void setOperatorContext(PromoOperatorInfo operatorContext) {
		this.operatorContext = operatorContext;
	}

	public Inteligentpromo getPromo() {
		return this.promo;
	}
	public void setPromo(Inteligentpromo promo) {
		this.promo = promo;
	}

}
