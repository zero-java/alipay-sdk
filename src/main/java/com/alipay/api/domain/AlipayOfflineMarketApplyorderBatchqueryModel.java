package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

import javax.validation.constraints.NotNull;

/**
 * 分页查询Leads、门店、商品相关操作流水信息
 *
 * @author auto create
 * @since 1.0, 2017-02-07 16:46:17
 */@ApiModel(description = " 分页查询Leads、门店、商品相关操作流水信息")
public class AlipayOfflineMarketApplyorderBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4326116918274686312L;

	/**
	 * 操作动作
	 */@ApiModelProperty(notes = " 操作动作")
	private String action;

	/**
	 * 支付宝流水ID列表，最大不超过100个
	 */@JSONField(name = "apply_ids", alternateNames = "applyIds")@ApiModelProperty(notes = " 支付宝流水ID列表，最大不超过100个")
	private List<String> applyIds;

	/**
	 * 业务主体ID。根据biz_type不同可能对应shop_id或item_id。
	 */@JSONField(name = "biz_id", alternateNames = "bizId")@ApiModelProperty(notes = " 业务主体ID。根据biz_type不同可能对应shop_id或item_id。")
	private String bizId;

	/**
	 * 业务类型：SHOP-店铺，ITEM-商品。
	 */@JSONField(name = "biz_type", alternateNames = "bizType")@ApiModelProperty(notes = " 业务类型：SHOP-店铺，ITEM-商品。")
	@NotNull
	private String bizType;

	/**
	 * 查询的流水创建时间最后值。格式：yyyy-MM-dd HH:mm:ss
	 */@JSONField(name = "end_time", alternateNames = "endTime")@ApiModelProperty(notes = " 查询的流水创建时间最后值。格式：yyyy-MM-dd HH:mm:ss")
	private Date endTime;

	/**
	 * 操作用户的支付账号id
	 */@JSONField(name = "op_id", alternateNames = "opId")@ApiModelProperty(notes = " 操作用户的支付账号id")
	private String opId;

	/**
	 * 系统集成商统一传入ISV
	 */@JSONField(name = "op_role", alternateNames = "opRole")@ApiModelProperty(notes = " 系统集成商统一传入ISV")
	@NotNull
	private String opRole;

	/**
	 * 页码，留空标示第一页，默认20个结果为一页
	 */@JSONField(name = "page_no", alternateNames = "pageNo")@ApiModelProperty(notes = " 页码，留空标示第一页，默认20个结果为一页")
	private Long pageNo;

	/**
	 * 每页记录数。默认20，最大100。
	 */@JSONField(name = "page_size", alternateNames = "pageSize")@ApiModelProperty(notes = " 每页记录数。默认20，最大100。")
	private Long pageSize;

	/**
	 * 请求ID列表，最大不超过100个。
注意：暂时不支持此字段查询。
	 */@JSONField(name = "request_ids", alternateNames = "requestIds")@ApiModelProperty(notes = " 请求ID列表，最大不超过100个。注意：暂时不支持此字段查询。")
	private List<String> requestIds;

	/**
	 * 查询的流水创建时间起始值，只能查询近3个月数据。格式：yyyy-MM-dd HH:mm:ss
	 */@JSONField(name = "start_time", alternateNames = "startTime")@ApiModelProperty(notes = " 查询的流水创建时间起始值，只能查询近3个月数据。格式：yyyy-MM-dd HH:mm:ss")
	private Date startTime;

	/**
	 * 流水状态：INIT-初始，PROCESS-处理中，SUCCESS-成功，FAIL-失败。
	 */@ApiModelProperty(notes = " 流水状态：INIT-初始，PROCESS-处理中，SUCCESS-成功，FAIL-失败。")
	private String status;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public List<String> getApplyIds() {
		return this.applyIds;
	}
	public void setApplyIds(List<String> applyIds) {
		this.applyIds = applyIds;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getOpId() {
		return this.opId;
	}
	public void setOpId(String opId) {
		this.opId = opId;
	}

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

	public List<String> getRequestIds() {
		return this.requestIds;
	}
	public void setRequestIds(List<String> requestIds) {
		this.requestIds = requestIds;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
