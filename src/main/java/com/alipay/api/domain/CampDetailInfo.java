package com.alipay.api.domain;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.fastjson.annotation.JSONString;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

import java.util.Date;

/**
 * 营销活动详情信息
 *
 * @author auto create
 * @since 1.0, 2017-08-07 20:34:11
 */
@ApiModel(description = " 营销活动详情信息")
public class CampDetailInfo extends AlipayObject {

    private static final long serialVersionUID = 5456954198993275312L;

    /**
     * 活动开始时间
     */
    @ApiModelProperty(notes = " 活动开始时间")
    @JSONField(alternateNames = "beginTime", name = "begin_time")
    private Date beginTime;

    /**
     * 业务id，与bizType 一一对应，如：biz_type为消费送，biz_id为消费送活动id
     */
    @ApiModelProperty(notes = " 业务id，与bizType 一一对应，如：biz_type为消费送，biz_id为消费送活动id")
    @JSONField(alternateNames = "bizId", name = "biz_id")
    private String bizId;

    /**
     * 业务类型：CONSUME_SEND：消费送；MRT_DISCOUNT:商户立减；OBTAIN:通用领券
     */
    @ApiModelProperty(notes = " 业务类型：CONSUME_SEND：消费送；MRT_DISCOUNT:商户立减；OBTAIN:通用领券")
    @JSONField(alternateNames = "bizType", name = "biz_type")
    private String bizType;

    /**
     * 活动描述
     */
    @ApiModelProperty(notes = " 活动描述")
    @JSONField(alternateNames = "campDesc", name = "camp_desc")
    private String campDesc;

    /**
     * 需要解析该json串，title为标题，details是描述，多个detail需要换行
     */
    @ApiModelProperty(notes = " 需要解析该json串，title为标题，details是描述，多个detail需要换行")
    @JSONField(alternateNames = "campGuide", name = "camp_guide")
    private String campGuide;

    /**
     * 活动结束时间
     */
    @ApiModelProperty(notes = " 活动结束时间")
    @JSONField(alternateNames = "endTime", name = "end_time")
    private Date endTime;

    /**
     * 扩展字段信息，用Map对象json串保存
     */
    @ApiModelProperty(notes = " 扩展字段信息，用Map对象json串保存")
    @JSONField(alternateNames = "extInfo", name = "ext_info")
    @JSONString
    private JSONObject extInfo;

    /**
     * 每人每日参与次数 -1为不限制
     */
    @ApiModelProperty(notes = " 每人每日参与次数 -1为不限制")
    @JSONField(alternateNames = "winLimitDaily", name = "win_limit_daily")
    private String winLimitDaily;

    /**
     * 每人总参与次数 -1 为不限制
     */
    @ApiModelProperty(notes = " 每人总参与次数 -1 为不限制")
    @JSONField(alternateNames = "winLimitLife", name = "win_limit_life")
    private String winLimitLife;


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

    public String getCampDesc() {
        return this.campDesc;
    }

    public void setCampDesc(String campDesc) {
        this.campDesc = campDesc;
    }

    public String getCampGuide() {
        return this.campGuide;
    }

    public void setCampGuide(String campGuide) {
        this.campGuide = campGuide;
    }


    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public JSONObject getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(JSONObject extInfo) {
        this.extInfo = extInfo;
    }

    public String getWinLimitDaily() {
        return this.winLimitDaily;
    }

    public void setWinLimitDaily(String winLimitDaily) {
        this.winLimitDaily = winLimitDaily;
    }

    public String getWinLimitLife() {
        return this.winLimitLife;
    }

    public void setWinLimitLife(String winLimitLife) {
        this.winLimitLife = winLimitLife;
    }

}
