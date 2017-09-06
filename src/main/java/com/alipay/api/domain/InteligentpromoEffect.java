package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 智能营销活动效果
 *
 * @author auto create
 * @since 1.0, 2017-09-06 10:43:33
 */
@ApiModel(description = " 智能营销活动效果")
public class InteligentpromoEffect implements Serializable {


    /**
     * 平均客单价
     */
    @ApiModelProperty(notes = " 平均客单价")
    @JSONField(alternateNames = "avgPrize", name = "avg_prize")
    private String avgPrize;

    /**
     * 成本
     */
    @ApiModelProperty(notes = " 成本")
    private String cost;

    /**
     * 当前效益
     */
    @ApiModelProperty(notes = " 当前效益")
    @JSONField(alternateNames = "currentTotalAmount", name = "current_total_amount")
    private String currentTotalAmount;

    /**
     * 营销活动的预期效果id
     */
    @ApiModelProperty(notes = " 营销活动的预期效果id")
    @JSONField(alternateNames = "effectId", name = "effect_id")
    private String effectId;

    /**
     * 时间范围左值
     */
    @ApiModelProperty(notes = " 时间范围左值")
    @JSONField(alternateNames = "gmtFrom", name = "gmt_from")
    private Date gmtFrom;

    /**
     * 时间范围右值
     */
    @ApiModelProperty(notes = " 时间范围右值")
    @JSONField(alternateNames = "gmtTo", name = "gmt_to")
    private Date gmtTo;

    /**
     * 成交额
     */
    @ApiModelProperty(notes = " 成交额")
    private String gmv;

    /**
     * 剩余库存数
     */
    @ApiModelProperty(notes = " 剩余库存数")
    @JSONField(alternateNames = "remainStockNum", name = "remain_stock_num")
    private Long remainStockNum;

    /**
     * 复购率
     */
    @ApiModelProperty(notes = " 复购率")
    @JSONField(alternateNames = "repayRate", name = "repay_rate")
    private Long repayRate;

    /**
     * 发券数量
     */
    @ApiModelProperty(notes = " 发券数量")
    @JSONField(alternateNames = "takeCount", name = "take_count")
    private Long takeCount;

    /**
     * 营销活动效果类型。FORECAST：预估；STATISTICS：统计
     */
    @ApiModelProperty(notes = " 营销活动效果类型。FORECAST：预估；STATISTICS：统计")
    private String type;

    /**
     * 核销量
     */
    @ApiModelProperty(notes = " 核销量")
    @JSONField(alternateNames = "useCount", name = "use_count")
    private Long useCount;

    public String getAvgPrize() {
        return this.avgPrize;
    }

    public void setAvgPrize(String avgPrize) {
        this.avgPrize = avgPrize;
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

    public Long getRepayRate() {
        return this.repayRate;
    }

    public void setRepayRate(Long repayRate) {
        this.repayRate = repayRate;
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
