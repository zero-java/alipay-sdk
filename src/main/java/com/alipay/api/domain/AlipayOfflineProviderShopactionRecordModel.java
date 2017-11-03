package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

import javax.validation.constraints.NotNull;

/**
 * isv 回传的商户操作行为信息调用接口
 *
 * @author auto create
 * @since 1.0, 2017-03-31 13:28:32
 */@ApiModel(description = " isv 回传的商户操作行为信息调用接口")
public class AlipayOfflineProviderShopactionRecordModel extends AlipayObject {

	private static final long serialVersionUID = 6178972217488611278L;

	/**
	 * 详情设置会根据action_type字段类型不同而格式不同，请详细查看开放平台文案，会详细说明如果设置，整体是json结构。
	 */@JSONField(name = "action_detail", alternateNames = "actionDetail")@ApiModelProperty(notes = " 详情设置会根据action_type字段类型不同而格式不同，请详细查看开放平台文案，会详细说明如果设置，整体是json结构。")
	@NotNull
	private String actionDetail;

	/**
	 * 每次请求的唯一id，需开发者自行保证此参数值每次请求的唯一性。后续可以通过当前唯一id进行问题排查。
	 */@JSONField(name = "action_outer_id", alternateNames = "actionOuterId")@ApiModelProperty(notes = " 每次请求的唯一id，需开发者自行保证此参数值每次请求的唯一性。后续可以通过当前唯一id进行问题排查。")
	@NotNull
	private String actionOuterId;

	/**
	 * 支持的操作类型

1. insert_table(插入桌位)

2. update_table(更新桌位)

3. insert_dish(插入菜品)

4. delete_dish(删除菜品)

5. soldout_dish(估清菜品)

6. modify_dish(修改菜品)

7. modify_shop_status(店铺状态变更)
每一种操作行为对应的action_detail都不同，action_detail结构都是json串。
	 */@JSONField(name = "action_type", alternateNames = "actionType")@ApiModelProperty(notes = " 支持的操作类型1. insert_table(插入桌位)2. update_table(更新桌位)3. insert_dish(插入菜品)4. delete_dish(删除菜品)5. soldout_dish(估清菜品)6. modify_dish(修改菜品)7. modify_shop_status(店铺状态变更)每一种操作行为对应的action_detail都不同，action_detail结构都是json串。")
	@NotNull
	private String actionType;

	/**
	 * 商户行为发生时间 格式：yyyy-MM-dd HH:mm:ss
	 */@JSONField(name = "date_time", alternateNames = "dateTime")@ApiModelProperty(notes = " 商户行为发生时间 格式：yyyy-MM-dd HH:mm:ss")
	@NotNull
	private String dateTime;

	/**
	 * 支付宝账户ID，这里传入门店的商户id。如果获取不到支付宝账户ID，一定不能设置。如何获取支付宝账户ID,获取用户uid的接口调用文档：https://doc.open.alipay.com/docs/doc.htm?spm=a219a.7629140.0.0.jokL1V&treeId=193&articleId=105656&docType=1#s3
	 */@JSONField(name = "user_id", alternateNames = "userId")@ApiModelProperty(notes = " 支付宝账户ID，这里传入门店的商户id。如果获取不到支付宝账户ID，一定不能设置。")
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 参数值固定为shop，代表店铺行为
	 */@ApiModelProperty(notes = " 参数值固定为shop，代表店铺行为")
	@NotNull
	private String entity;

	/**
	 * 当action_type的参数值是 insert_table、update_table、insert_dish、delete_dish、soldout_dish、modify_dish、insert_dish时，此参数的值固定为：REPAST
	 */@ApiModelProperty(notes = " 当action_type的参数值是 insert_table、update_table、insert_dish、delete_dish、soldout_dish、modify_dish、insert_dish时，此参数的值固定为：REPAST")
	@NotNull
	private String industry;

	/**
	 * 从第三方平台进入开发者应用后产生的数据，传入第三方平台域名。比如是支付宝扫码后产生的，传入支付宝域名alipay.com，是微信打开后产生的，传入微信域名weixin.qq.com，如果数据不是从第三方平台进入后产生的，设置自己的域名即可，该字段内容不做强制校验。
	 */@ApiModelProperty(notes = " 从第三方平台进入开发者应用后产生的数据，传入第三方平台域名。比如是支付宝扫码后产生的，传入支付宝域名alipay.com，是微信打开后产生的，传入微信域名weixin.qq.com，如果数据不是从第三方平台进入后产生的，设置自己的域名即可，该字段内容不做强制校验。")
	private String source;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * 传入店铺关联关系。标记当前接口涉及到的店铺信息，同时如果传入的数据在口碑不存在，口碑会建立一条shop_id+ outer_id+ type的关联数据
	 */@JSONField(name = "outer_shop_do", alternateNames = "outerShopDo")@ApiModelProperty(notes = " 传入店铺关联关系。标记当前接口涉及到的店铺信息，同时如果传入的数据在口碑不存在，口碑会建立一条shop_id+ outer_id+ type的关联数据")
	@NotNull
	private OuterShopDO outerShopDo;

	public String getActionDetail() {
		return this.actionDetail;
	}
	public void setActionDetail(String actionDetail) {
		this.actionDetail = actionDetail;
	}

	public String getActionOuterId() {
		return this.actionOuterId;
	}
	public void setActionOuterId(String actionOuterId) {
		this.actionOuterId = actionOuterId;
	}

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getDateTime() {
		return this.dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getEntity() {
		return this.entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public OuterShopDO getOuterShopDo() {
		return this.outerShopDo;
	}
	public void setOuterShopDo(OuterShopDO outerShopDo) {
		this.outerShopDo = outerShopDo;
	}

}
