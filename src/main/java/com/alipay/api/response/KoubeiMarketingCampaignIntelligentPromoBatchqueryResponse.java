package com.alipay.api.response;

import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromoPageResult;
import com.alipay.api.domain.IntelligentPromo;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: koubei.marketing.campaign.intelligent.promo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-15 17:52:50
 */@ApiModel(description = " ALIPAY API: koubei.marketing.campaign.intelligent.promo.batchquery response.")
public class KoubeiMarketingCampaignIntelligentPromoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3116533775568482177L;

	/** 
	 * 查询后返回的分页信息
	 */@JSONField(name = "page_result", alternateNames = "pageResult")@ApiModelProperty(notes = " 查询后返回的分页信息")
	private PromoPageResult pageResult;

	/** 
	 * 查询返回的营销活动列表信息
	 */@ApiModelProperty(notes = " 查询返回的营销活动列表信息")
	private List<IntelligentPromo> promos;

	public void setPageResult(PromoPageResult pageResult) {
		this.pageResult = pageResult;
	}
	public PromoPageResult getPageResult( ) {
		return this.pageResult;
	}

	public void setPromos(List<IntelligentPromo> promos) {
		this.promos = promos;
	}
	public List<IntelligentPromo> getPromos( ) {
		return this.promos;
	}

}
