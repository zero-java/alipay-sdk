package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 分页查询后的结果
 *
 * @author auto create
 * @since 1.0, 2017-09-04 17:55:55
 */@ApiModel(description = " 分页查询后的结果")
public class PromoPageResult extends AlipayObject {

	private static final long serialVersionUID = 8487449358617265469L;

	/**
	 * 页码
	 */@JSONField(name = "page_num", alternateNames = "pageNum")@ApiModelProperty(notes = " 页码")
	private String pageNum;

	/**
	 * 每页多少条
	 */@JSONField(name = "page_size", alternateNames = "pageSize")@ApiModelProperty(notes = " 每页多少条")
	private String pageSize;

	/**
	 * 总条数
	 */@JSONField(name = "total_count", alternateNames = "totalCount")@ApiModelProperty(notes = " 总条数")
	private Long totalCount;

	/**
	 * 总共有多少页
	 */@JSONField(name = "total_pages", alternateNames = "totalPages")@ApiModelProperty(notes = " 总共有多少页")
	private String totalPages;

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getTotalPages() {
		return this.totalPages;
	}
	public void setTotalPages(String totalPages) {
		this.totalPages = totalPages;
	}

}
