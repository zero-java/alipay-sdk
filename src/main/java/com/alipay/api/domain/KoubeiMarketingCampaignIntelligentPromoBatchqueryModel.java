package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 智能营销方案批量查询
 *
 * @author auto create
 * @since 1.0, 2017-09-20 10:26:13
 */@ApiModel(description = " 智能营销方案批量查询")
public class KoubeiMarketingCampaignIntelligentPromoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3759456224776383219L;

	/**
	 * 操作员上下文信息
	 */@JSONField(name = "operator_context", alternateNames = "operatorContext")@ApiModelProperty(notes = " 操作员上下文信息")
	private PromoOperatorInfo operatorContext;

	/**
	 * 活动拥有者信息
	 */@JSONField(name = "owner_info", alternateNames = "ownerInfo")@ApiModelProperty(notes = " 活动拥有者信息")
	private PromoOperatorInfo ownerInfo;

	/**
	 * 分页信息
	 */@JSONField(name = "page_info", alternateNames = "pageInfo")@ApiModelProperty(notes = " 分页信息")
	private PromoPageInfo pageInfo;

	/**
	 * 外部业务id，请保持足够复杂，方便排查数据来源
	 */@JSONField(name = "out_request_no", alternateNames = "outRequestNo")@ApiModelProperty(notes = "外部业务id，请保持足够复杂，方便排查数据来源")
	private String outRequestNo;

	public String getOutRequestNo() {
		return outRequestNo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public PromoOperatorInfo getOperatorContext() {
		return this.operatorContext;
	}
	public void setOperatorContext(PromoOperatorInfo operatorContext) {
		this.operatorContext = operatorContext;
	}

	public PromoOperatorInfo getOwnerInfo() {
		return this.ownerInfo;
	}
	public void setOwnerInfo(PromoOperatorInfo ownerInfo) {
		this.ownerInfo = ownerInfo;
	}

	public PromoPageInfo getPageInfo() {
		return this.pageInfo;
	}
	public void setPageInfo(PromoPageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

}
