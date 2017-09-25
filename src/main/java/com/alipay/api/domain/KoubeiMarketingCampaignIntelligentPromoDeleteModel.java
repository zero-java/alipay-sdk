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
 */
@ApiModel(description = " 智能营销活动下架")
public class KoubeiMarketingCampaignIntelligentPromoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2743237664764115648L;

	/**
	 * 操作下架的操作人信息
	 */
	@ApiModelProperty(notes = " 操作下架的操作人信息")
	@JSONField(alternateNames = "operatorContext", name = "operator_context")
	private PromoOperatorInfo operatorContext;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiModelProperty(notes = " 代表了一次请求，作为业务幂等性控制")
	@JSONField(alternateNames = "outRequestNo", name = "out_request_no")
	private String outRequestNo;

	/**
	 * 智能营销活动的id
	 */
	@ApiModelProperty(notes = " 智能营销活动的id")
	@JSONField(alternateNames = "promoId", name = "promo_id")
	private String promoId;

	public PromoOperatorInfo getOperatorContext() {
		return this.operatorContext;
	}
	public void setOperatorContext(PromoOperatorInfo operatorContext) {
		this.operatorContext = operatorContext;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPromoId() {
		return this.promoId;
	}
	public void setPromoId(String promoId) {
		this.promoId = promoId;
	}

}
