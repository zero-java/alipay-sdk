package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 营销分页信息
 *
 * @author auto create
 * @since 1.0, 2017-09-04 17:54:22
 */@ApiModel(description = " 营销分页信息")
public class PromoPageInfo extends AlipayObject {

	private static final long serialVersionUID = 4188433235379577663L;

	/**
	 * 页码
	 */@ApiModelProperty(notes = " 页码")@JSONField(name = "page_num", alternateNames = "pageNum")
	private Long pageNum;

	/**
	 * 每页大小
	 */@ApiModelProperty(notes = " 每页大小")@JSONField(name = "page_size", alternateNames = "pageSize")
	private String pageSize;

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
