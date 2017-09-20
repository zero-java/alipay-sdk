package com.alipay.api.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 智能营销活动效果
 *
 * @author auto create
 * @since 1.0, 2017-09-15 17:46:18
 */@ApiModel(description = " 智能营销活动效果")
public class IntelligentPromoEffect extends AlipayObject {

	private static final long serialVersionUID = 4112286272669987292L;

	/**
	 * 平均客单价提升比例
	 */@JSONField(name = "avg_prize_increase", alternateNames = "avgPrizeIncrease")@ApiModelProperty(notes = " 平均客单价提升比例")
	private String avgPrizeIncrease;

	/**
	 * 成本
	 */@ApiModelProperty(notes = " 成本")
	private String cost;

	/**
	 * 当前效益
	 */@JSONField(name = "current_total_amount", alternateNames = "currentTotalAmount")@ApiModelProperty(notes = " 当前效益")
	private String currentTotalAmount;

	/**
	 * 营销活动的预期效果id
	 */@JSONField(name = "effect_id", alternateNames = "effectId")@ApiModelProperty(notes = " 营销活动的预期效果id")
	private String effectId;

	/**
	 * 时间范围左值
	 */@JSONField(name = "gmt_from", alternateNames = "gmtFrom",format = "yyyy-MM-dd HH:mm:ss")@ApiModelProperty(notes = " 时间范围左值")
	private Date gmtFrom;

	/**
	 * 时间范围右值
	 */@JSONField(name = "gmt_to", alternateNames = "gmtTo",format = "yyyy-MM-dd HH:mm:ss")@ApiModelProperty(notes = " 时间范围右值")
	private Date gmtTo;

	/**
	 * 成交额
	 */@ApiModelProperty(notes = " 成交额")
	private String gmv;

	/**
	 * 剩余库存数
	 */@JSONField(name = "remain_stock_num", alternateNames = "remainStockNum")@ApiModelProperty(notes = " 剩余库存数")
	private Long remainStockNum;

	/**
	 * 复购率提升比例
	 */@JSONField(name = "repay_rate_increase", alternateNames = "repayRateIncrease")@ApiModelProperty(notes = " 复购率提升比例")
	private String repayRateIncrease;

	/**
	 * 发券数量
	 */@JSONField(name = "take_count", alternateNames = "takeCount")@ApiModelProperty(notes = " 发券数量")
	private Long takeCount;

	/**
	 * 营销活动效果类型。FORECAST：预估；STATISTICS：统计
	 */@ApiModelProperty(notes = " 营销活动效果类型。FORECAST：预估；STATISTICS：统计")
	private String type;

	/**
	 * 核销量
	 */@JSONField(name = "use_count", alternateNames = "useCount")@ApiModelProperty(notes = " 核销量")
	private Long useCount;

	public String getAvgPrizeIncrease() {
		return this.avgPrizeIncrease;
	}
	public void setAvgPrizeIncrease(String avgPrizeIncrease) {
		this.avgPrizeIncrease = avgPrizeIncrease;
	}

	public String getCost() {
		return this.cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getCurrentTotalAmount() {
		return this.currentTotalAmount;
	}
	public void setCurrentTotalAmount(String currentTotalAmount) {
		this.currentTotalAmount = currentTotalAmount;
	}

	public String getEffectId() {
		return this.effectId;
	}
	public void setEffectId(String effectId) {
		this.effectId = effectId;
	}

	public Date getGmtFrom() {
		return this.gmtFrom;
	}
	public void setGmtFrom(Date gmtFrom) {
		this.gmtFrom = gmtFrom;
	}

	public Date getGmtTo() {
		return this.gmtTo;
	}
	public void setGmtTo(Date gmtTo) {
		this.gmtTo = gmtTo;
	}

	public String getGmv() {
		return this.gmv;
	}
	public void setGmv(String gmv) {
		this.gmv = gmv;
	}

	public Long getRemainStockNum() {
		return this.remainStockNum;
	}
	public void setRemainStockNum(Long remainStockNum) {
		this.remainStockNum = remainStockNum;
	}

	public String getRepayRateIncrease() {
		return this.repayRateIncrease;
	}
	public void setRepayRateIncrease(String repayRateIncrease) {
		this.repayRateIncrease = repayRateIncrease;
	}

	public Long getTakeCount() {
		return this.takeCount;
	}
	public void setTakeCount(Long takeCount) {
		this.takeCount = takeCount;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Long getUseCount() {
		return this.useCount;
	}
	public void setUseCount(Long useCount) {
		this.useCount = useCount;
	}

}
