package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 智能营销方案批量查询
 *
 * @author auto create
 * @since 1.0, 2017-09-06 11:38:25
 */@ApiModel(description = " 智能营销方案批量查询")
public class KoubeiMarketingCampaignInteligentPromoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2866236966781992673L;

	/**
	 * 操作员上下文信息
	 */@ApiModelProperty(notes = " 操作员上下文信息")@JSONField(name = "operator_context", alternateNames = "operatorContext")
	private PromoOperatorInfo operatorContext;

	/**
	 * 分页信息
	 */@ApiModelProperty(notes = " 分页信息")@JSONField(name = "page_info", alternateNames = "pageInfo")
	private PromoPageInfo pageInfo;

	public PromoOperatorInfo getOperatorContext() {
		return this.operatorContext;
	}
	public void setOperatorContext(PromoOperatorInfo operatorContext) {
		this.operatorContext = operatorContext;
	}

	public PromoPageInfo getPageInfo() {
		return this.pageInfo;
	}
	public void setPageInfo(PromoPageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

}
