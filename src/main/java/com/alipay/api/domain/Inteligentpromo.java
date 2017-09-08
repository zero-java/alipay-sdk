package com.alipay.api.domain;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 智能营销活动模型
 *
 * @author auto create
 * @since 1.0, 2017-09-06 10:43:56
 */
@ApiModel(description = " 智能营销活动模型")
public class Inteligentpromo implements Serializable {


    /**
     * 是否允许自动续期
     */
    @ApiModelProperty(notes = " 是否允许自动续期")
    @JSONField(alternateNames = "allowAutoDelay", name = "allow_auto_delay")
    private Boolean allowAutoDelay;

    /**
     * 审批状态。APPROVING：审批中；REJECTED：已驳回；PASS：已通过；
     */
    @ApiModelProperty(notes = " 审批状态。APPROVING：审批中；REJECTED：已驳回；PASS：已通过；")
    @JSONField(alternateNames = "auditStatus", name = "audit_status")
    private String auditStatus;

    /**
     * 创建人信息
     */
    @ApiModelProperty(notes = " 创建人信息")
    @JSONField(alternateNames = "creatorInfo", name = "creator_info")
    private PromoOperatorInfo creatorInfo;

    /**
     * 智能活动描述
     */
    @ApiModelProperty(notes = " 智能活动描述")
    private String desc;

    /**
     * 活动扩展信息
     */
    @ApiModelProperty(notes = " 活动扩展信息")
    @JSONField(alternateNames = "extInfo", name = "ext_info")
    private JSONObject extInfo;

    /**
     * 活动关闭的时间
     */
    @ApiModelProperty(notes = " 活动关闭的时间")
    @JSONField(alternateNames = "gmtClosed", name = "gmt_closed")
    private Date gmtClosed;

    /**
     * 智能营销活动的生效时间
     */
    @ApiModelProperty(notes = " 智能营销活动的生效时间")
    @JSONField(alternateNames = "gmtEnabled", name = "gmt_enabled")
    private Date gmtEnabled;

    /**
     * 智能营销活动的结束时间
     */
    @ApiModelProperty(notes = " 智能营销活动的结束时间")
    @JSONField(alternateNames = "gmtEnd", name = "gmt_end")
    private Date gmtEnd;

    /**
     * 智能营销活动开始时间
     */
    @ApiModelProperty(notes = " 智能营销活动开始时间")
    @JSONField(alternateNames = "gmtStart", name = "gmt_start")
    private Date gmtStart;

    /**
     * 智能营销活动对应的名称
     */
    @ApiModelProperty(notes = " 智能营销活动对应的名称")
    private String name;

    /**
     * 智能活动对应的归属人信息
     */
    @ApiModelProperty(notes = " 智能活动对应的归属人信息")
    @JSONField(alternateNames = "ownerInfo", name = "owner_info")
    private PromoOperatorInfo ownerInfo;

    /**
     * 智能营销活动对应的方案编号
     */
    @ApiModelProperty(notes = " 智能营销活动对应的方案编号")
    @JSONField(alternateNames = "planId", name = "plan_id")
    private String planId;

    /**
     * 智能营销活动的id。创建接口中这个参数不用填，仅在查询接口中返回
     */
    @ApiModelProperty(notes = " 智能营销活动的id。创建接口中这个参数不用填，仅在查询接口中返回")
    @JSONField(alternateNames = "promoId", name = "promo_id")
    private String promoId;

    /**
     * 营销活动详情列表
     */
    @ApiModelProperty(notes = " 营销活动详情列表")
    private List<InteligentpromoDetail> promos;

    /**
     * 智能营销活动状态。CREATED：已创建；ENABLED：已生效；CLOSED：已关闭；FINISHED：已完结
     */
    @ApiModelProperty(notes = " 智能营销活动状态。CREATED：已创建；ENABLED：已生效；CLOSED：已关闭；FINISHED：已完结")
    private String status;

    /**
     * 活动子状态。ENABLING：生效中；ONLINE_WAIT_CONFIRM：上架待确认；ENABLED：已发布；REJECTED：已驳回；OFFLINE_WAIT_CONFIRM：下架待确认；OFFLINE：已下架；FINISHED：已结束
     */
    @ApiModelProperty(notes = " 活动子状态。ENABLING：生效中；ONLINE_WAIT_CONFIRM：上架待确认；ENABLED：已发布；REJECTED：已驳回；OFFLINE_WAIT_CONFIRM：下架待确认；OFFLINE：已下架；FINISHED：已结束")
    @JSONField(alternateNames = "subStatus", name = "sub_status")
    private String subStatus;

    /**
     * 智能营销活动对应的方案中的模板编号
     */
    @ApiModelProperty(notes = " 智能营销活动对应的方案中的模板编号")
    @JSONField(alternateNames = "templateId", name = "template_id")
    private String templateId;

    /**
     * 智能活动类型，值如下：RECOMMENDATION：系统推荐；REGISTRATION：报名
     */
    @ApiModelProperty(notes = " 智能活动类型，值如下：RECOMMENDATION：系统推荐；REGISTRATION：报名")
    private String type;

    public Boolean getAllowAutoDelay() {
        return this.allowAutoDelay;
    }

    public void setAllowAutoDelay(Boolean allowAutoDelay) {
        this.allowAutoDelay = allowAutoDelay;
    }

    public String getAuditStatus() {
        return this.auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public PromoOperatorInfo getCreatorInfo() {
        return this.creatorInfo;
    }

    public void setCreatorInfo(PromoOperatorInfo creatorInfo) {
        this.creatorInfo = creatorInfo;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public JSONObject getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(JSONObject extInfo) {
        this.extInfo = extInfo;
    }

    public Date getGmtClosed() {
        return this.gmtClosed;
    }

    public void setGmtClosed(Date gmtClosed) {
        this.gmtClosed = gmtClosed;
    }

    public Date getGmtEnabled() {
        return this.gmtEnabled;
    }

    public void setGmtEnabled(Date gmtEnabled) {
        this.gmtEnabled = gmtEnabled;
    }

    public Date getGmtEnd() {
        return this.gmtEnd;
    }

    public void setGmtEnd(Date gmtEnd) {
        this.gmtEnd = gmtEnd;
    }

    public Date getGmtStart() {
        return this.gmtStart;
    }

    public void setGmtStart(Date gmtStart) {
        this.gmtStart = gmtStart;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PromoOperatorInfo getOwnerInfo() {
        return this.ownerInfo;
    }

    public void setOwnerInfo(PromoOperatorInfo ownerInfo) {
        this.ownerInfo = ownerInfo;
    }

    public String getPlanId() {
        return this.planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getPromoId() {
        return this.promoId;
    }

    public void setPromoId(String promoId) {
        this.promoId = promoId;
    }

    public List<InteligentpromoDetail> getPromos() {
        return this.promos;
    }

    public void setPromos(List<InteligentpromoDetail> promos) {
        this.promos = promos;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubStatus() {
        return this.subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
