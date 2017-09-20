package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销活动下架
 *
 * @author auto create
 * @since 1.0, 2017-09-20 10:28:45
 */
public class KoubeiMarketingCampaignIntelligentPromoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4328743347349619674L;

	/**
	 * 操作下架的操作人信息
	 */
	@ApiField("operator_context")
	private PromoOperatorInfo operatorContext;

	/**
	 * 智能营销活动的id
	 */
	@ApiField("promo_id")
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
