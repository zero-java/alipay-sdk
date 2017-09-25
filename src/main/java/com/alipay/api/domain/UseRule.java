package com.alipay.api.domain;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 券的使用规则信息
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */
@ApiModel(description = " 券的使用规则信息")
public class UseRule implements Serializable {


    /**
     * 扩展属性，无需设置
     */
    @ApiModelProperty(notes = " 扩展属性，无需设置")
    @JSONField(name = "ext_info", alternateNames = "extInfo")
    private JSONObject extInfo;

    /**
     * 券的不可用时间
     */
    @ApiModelProperty(notes = " 券的不可用时间")
    @JSONField(name = "forbidden_time", alternateNames = "forbiddenTime")
    private ForbbidenTime forbiddenTime;
    /**
     * 优惠券的使用支付渠道限制规
     * 则，
     * 不受支付渠道限制
     * :USE_NO_LIMIT;
     * 仅限储值卡支付时可用
     * :USE_ON_CURRENT_PAY_C
     * HANNEL;
     * 储值卡支付时不可用
     * :NOT_ALLOWED_USE;
     * 【备注】
     * 支付渠道限制不允许修改
     */
    @ApiModelProperty(notes = " 优惠券的使用支付渠道限制规则，不受支付渠道限制:USE_NO_LIMIT;仅限储值卡支付时可用:USE_ON_CURRENT_PAY_CHANNEL;储值卡支付时不可用:NOT_ALLOWED_USE;【备注】支付渠道限制不允许修改")
    @JSONField(alternateNames = "limitRule", name = "limit_rule")
    @EnumCheck(enums = {"USE_NO_LIMIT","USE_ON_CURRENT_PAY_CHANNEL","NOT_ALLOWED_USE"},required = false)
    private String limitRule;

    /**
     * 券核销的最低消费门槛，单位元
     */
    @ApiModelProperty(notes = " 券核销的最低消费门槛，单位元")
    @JSONField(name = "min_consume", alternateNames = "minConsume")
    private String minConsume;

    /**
     * 券买单跳转链接
     */
    @ApiModelProperty(notes = " 券买单跳转链接")
    @JSONField(name = "pay_redirect_url", alternateNames = "payRedirectUrl")
    private String payRedirectUrl;

    /**
     * 券适用门店列表
     * 仅品牌商发起的招商活动可为空
     * 直发奖类型活动必须与活动适用门店一致
     * 最多支持10w家门店
     */
    @ApiModelProperty(notes = " 券适用门店列表仅品牌商发起的招商活动可为空直发奖类型活动必须与活动适用门店一致最多支持10w家门店")
    @JSONField(name = "suit_shops", alternateNames = "suitShops")
    @NotEmpty
    private List<String> suitShops;

    /**
     * 券可用时间段
     */
    @ApiModelProperty(notes = " 券可用时间段")
    @JSONField(name = "use_time", alternateNames = "useTime")
    private List<UseTime> useTime;

    public JSONObject getExtInfo() {
        return extInfo;
    }

    public String getLimitRule() {
        return limitRule;
    }

    public void setLimitRule(String limitRule) {
        this.limitRule = limitRule;
    }

    public void setExtInfo(JSONObject extInfo) {
        this.extInfo = extInfo;
    }

    public ForbbidenTime getForbiddenTime() {
        return this.forbiddenTime;
    }

    public void setForbiddenTime(ForbbidenTime forbiddenTime) {
        this.forbiddenTime = forbiddenTime;
    }

    public String getMinConsume() {
        return this.minConsume;
    }

    public void setMinConsume(String minConsume) {
        this.minConsume = minConsume;
    }

    public String getPayRedirectUrl() {
        return this.payRedirectUrl;
    }

    public void setPayRedirectUrl(String payRedirectUrl) {
        this.payRedirectUrl = payRedirectUrl;
    }

    public List<String> getSuitShops() {
        return this.suitShops;
    }

    public void setSuitShops(List<String> suitShops) {
        this.suitShops = suitShops;
    }

    public List<UseTime> getUseTime() {
        return this.useTime;
    }

    public void setUseTime(List<UseTime> useTime) {
        this.useTime = useTime;
    }

}
