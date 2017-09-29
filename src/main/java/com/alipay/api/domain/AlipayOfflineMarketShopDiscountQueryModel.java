package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 基于门店id的优惠查询服务
 *
 * @author auto create
 * @since 1.0, 2016-10-31 11:21:25
 */@ApiModel(description = " 基于门店id的优惠查询服务")
public class AlipayOfflineMarketShopDiscountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4554258187455622189L;


	/**
	 * 门店id
	 */@JSONField(alternateNames = "shopId", name = "shop_id")@ApiModelProperty(notes = " 门店id")
	private String shopId;
	@JSONField(alternateNames = "queryType", name = "query_type")
	@ApiModelProperty(notes = "查询类型")
	private String queryType;

	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getQueryType() {
		return queryType;
	}
	//
	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
