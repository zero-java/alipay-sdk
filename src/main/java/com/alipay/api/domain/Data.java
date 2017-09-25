package com.alipay.api.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

/**
 * 用于查询用户数据
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */@ApiModel(description = " 用于查询用户数据")
public class Data extends AlipayObject {

	private static final long serialVersionUID = 5127492774693757952L;

	/**
	 * 对应userIdList，标准Alipay UserId列表
	 */@JSONField(alternateNames = "alipayUserIdList", name = "alipay_user_id_list")@ApiModelProperty(notes = " 对应userIdList，标准Alipay UserId列表")
	private List<String> alipayUserIdList;

	/**
	 * 用户id列表
	 */@JSONField(alternateNames = "userIdList", name = "user_id_list")@ApiModelProperty(notes = " 用户id列表")
	private List<String> userIdList;

	public List<String> getAlipayUserIdList() {
		return this.alipayUserIdList;
	}
	public void setAlipayUserIdList(List<String> alipayUserIdList) {
		this.alipayUserIdList = alipayUserIdList;
	}

	public List<String> getUserIdList() {
		return this.userIdList;
	}
	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}

}
