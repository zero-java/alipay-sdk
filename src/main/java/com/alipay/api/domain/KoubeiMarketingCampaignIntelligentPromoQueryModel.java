package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 只能营销方案详情查询
 *
 * @author auto create
 * @since 1.0, 2017-09-20 10:27:51
 */@ApiModel(description = " 只能营销方案详情查询")
public class KoubeiMarketingCampaignIntelligentPromoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8621931113647995175L;

	/**
	 * 操作人员上下文
	 */@JSONField(name = "operator_context", alternateNames = "operatorContext")@ApiModelProperty(notes = " 操作人员上下文")
	private PromoOperatorInfo operatorContext;

	/**
	 * 智能营销活动id
	 */@JSONField(name = "promo_id", alternateNames = "promoId")@ApiModelProperty(notes = " 智能营销活动id")
	private String promoId;

	/**
	 * 外部业务id，请保持足够复杂
	 *主要为了定位数据来源
	 */
	@JSONField(name = "out_request_no", alternateNames = "outRequestNo")
	@ApiModelProperty(notes = " 代表了一次请求，作为业务幂等性控制")
	private String outRequestNo;

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

	public String getOutRequestNo() {
		return outRequestNo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
}
