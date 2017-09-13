package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

import javax.validation.constraints.NotNull;

/**
 * 门店摘要信息批量查询接口
 *
 * @author auto create
 * @since 1.0, 2017-02-17 14:20:04
 */@ApiModel(description = " 门店摘要信息批量查询接口")
public class AlipayOfflineMarketShopSummaryBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5613482681761811493L;

	/**
	 * 表示接口业务的调用方身份：ISV、 服务商身份标识。传入ISV代表系统集成商身份。传入PROVIDER代表服务商。
	 */@JSONField(name = "op_role", alternateNames = "opRole")
	@ApiModelProperty(notes = " 表示接口业务的调用方身份：ISV、 服务商身份标识。传入ISV代表系统集成商身份。传入PROVIDER代表服务商。",required = true,example = "ISV、PROVIDER",reference = "16")
	@NotNull
	private String opRole;

	/**
	 * 页码，留空标示第一页，默认 20个结果为一页
	 */@JSONField(name = "page_no", alternateNames = "pageNo")
	@ApiModelProperty(notes = " 页码，留空标示第一页，默认 20个结果为一页",example = "1",reference = "9")
	private Long pageNo;

	/**
	 * 每页记录数，默认20，最大 100
	 */@JSONField(name = "page_size", alternateNames = "pageSize")
	@ApiModelProperty(notes = " 每页记录数，默认20，最大 100",example = "20",reference = "3")
	private Long pageSize;

	/**
	 * 门店数据查询类型，根据类型可以返回指定的门店数据，目前支持的类型如下：
	 BRAND_RELATION ： 品牌商关联店铺
	 MALL_SELF ：MALL自己的门店
	 MALL_RELATION：MALL关联下的门店
	 MERCHANT_SELF:商户自己的门店
	 KB_PROMOTER：口碑客推广者
	 */@JSONField(name = "query_type", alternateNames = "queryType")
	@ApiModelProperty(notes = " 门店数据查询类型，根据类型可以返回指定的门店数据，目前支持的类型如下：BRAND_RELATION ： 品牌商关联店铺MALL_SELF ：MALL自己的门店MALL_RELATION：MALL关联下的门店MERCHANT_SELF:商户自己的门店KB_PROMOTER：口碑客推广者",required = true,example = "BRAND_RELATION",reference = "20")
	@NotNull
	private String queryType;

	/**
	 * query_type查询类型下所关联的商户PID
	 */@JSONField(name = "related_partner_id", alternateNames = "relatedPartnerId")
	@ApiModelProperty(notes = " query_type查询类型下所关联的商户PID",example = "2088001969784501",reference = "16")
	private String relatedPartnerId;

	/**
	 * 门店ID
	 */@JSONField(name = "shop_id", alternateNames = "shopId")
	@ApiModelProperty(notes = " 门店ID",example = "2015062100077000000000120773",reference = "32")
	private String shopId;

	/**
	 * 门店状态，传入多个状态，多个状态使用英文逗号隔开，例如：PAUSED,OPEN
	 店铺状态：OPEN（营业）、PAUSED（暂停）、INIT（初始）、FREEZE（冻结）、CLOSED（关店）
	 */@JSONField(name = "shop_status", alternateNames = "shopStatus")
	@ApiModelProperty(notes = " 门店状态，传入多个状态，多个状态使用英文逗号隔开，例如：PAUSED,OPEN店铺状态：OPEN（营业）、PAUSED（暂停）、INIT（初始）、FREEZE（冻结）、CLOSED（关店）",example = "PAUSED",reference = "50")
	private String shopStatus;

	public String getOpRole() {
		return this.opRole;
	}
	public void setOpRole(String opRole) {
		this.opRole = opRole;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getRelatedPartnerId() {
		return this.relatedPartnerId;
	}
	public void setRelatedPartnerId(String relatedPartnerId) {
		this.relatedPartnerId = relatedPartnerId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopStatus() {
		return this.shopStatus;
	}
	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

}
