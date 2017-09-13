package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromoPageResult;
import com.alipay.api.domain.Inteligentpromo;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: koubei.marketing.campaign.inteligent.promo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-06 11:38:25
 */@ApiModel(description = " ALIPAY API: koubei.marketing.campaign.inteligent.promo.batchquery response.")
public class KoubeiMarketingCampaignInteligentPromoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8596686257544521716L;

	/** 
	 * 查询后返回的分页信息
	 */@ApiModelProperty(notes = " 查询后返回的分页信息")
	@ApiField("page_result")
	private PromoPageResult pageResult;

	/** 
	 * 查询返回的营销活动列表信息
	 */@ApiModelProperty(notes = " 查询返回的营销活动列表信息")
	@ApiListField("plans")
	@ApiField("inteligentpromo")
	private List<Inteligentpromo> plans;

	public void setPageResult(PromoPageResult pageResult) {
		this.pageResult = pageResult;
	}
	public PromoPageResult getPageResult( ) {
		return this.pageResult;
	}

	public void setPlans(List<Inteligentpromo> plans) {
		this.plans = plans;
	}
	public List<Inteligentpromo> getPlans( ) {
		return this.plans;
	}

}
