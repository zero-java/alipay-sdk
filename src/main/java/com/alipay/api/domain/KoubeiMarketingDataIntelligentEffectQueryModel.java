package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销活动效果预测
 *
 * @author auto create
 * @since 1.0, 2017-09-20 10:28:11
 */
public class KoubeiMarketingDataIntelligentEffectQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2791656685841485171L;

	/**
	 * 操作人上下文信息
	 */
	@ApiField("operator_context")
	private PromoOperatorInfo operatorContext;

	/**
	 * 智能营销活动的详情，用于咨询的元数据
	 */
	@ApiField("promo")
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
