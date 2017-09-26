package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.StringValueSerializing;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.yazuo.xiaoya.common.annotation.validate.EndDate;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * 智能营销活动模型
 *
 * @author auto create
 * @since 1.0, 2017-09-19 19:00:51
 */
@ApiModel(description = " 智能营销活动模型")
public class IntelligentPromo extends AlipayObject {

    private static final long serialVersionUID = 7249628995217951694L;

    /**
     * 是否允许自动续期
     */
    @JSONField(name = "allow_auto_delay", alternateNames = "allowAutoDelay")
    @ApiModelProperty(notes = " 是否允许自动续期")
    @NotNull
    private Boolean allowAutoDelay;

    /**
     * 审批状态。APPROVING：审批中；REJECTED：已驳回；PASS：已通过；
     */
    @JSONField(name = "audit_status", alternateNames = "auditStatus")
    @ApiModelProperty(notes = " 审批状态。APPROVING：审批中；REJECTED：已驳回；PASS：已通过；")
    @EnumCheck(enums = {"APPROVING","REJECTED","PASS"},required = false)
    private String auditStatus;

    /**
     * 创建人信息
     */
    @JSONField(name = "creator_info", alternateNames = "creatorInfo")
    @ApiModelProperty(notes = " 创建人信息")
    @NotNull
    @Valid
    private PromoOperatorInfo creatorInfo;

    /**
     * 智能活动描述
     */
    @ApiModelProperty(notes = " 智能活动描述")
    @NotBlank
    private String desc;

    /**
     * 活动扩展信息。活动推荐会返回扩展信息，推荐完以后，这里的信息要在活动效果预测，创建接口中带回来
     */
    @JSONField(name = "ext_info", alternateNames = "extInfo", serializeUsing = StringValueSerializing.class)
    @ApiModelProperty(notes = " 活动扩展信息。活动推荐会返回扩展信息，推荐完以后，这里的信息要在活动效果预测，创建接口中带回来")
    @NotNull
    private JSONObject extInfo;

    /**
     * 方案级别的效果预测
     */
    @JSONField(name = "forecast_effect", alternateNames = "forecastEffect")
    @ApiModelProperty(notes = " 方案级别的效果预测")
    @Valid
    private IntelligentPromoEffect forecastEffect;

    /**
     * 活动关闭的时间
     */
    @JSONField(name = "gmt_closed", alternateNames = "gmtClosed", format = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(notes = " 活动关闭的时间")
    private Date gmtClosed;

    /**
     * 智能营销活动的生效时间
     */
    @JSONField(name = "gmt_enabled", alternateNames = "gmtEnabled", format = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(notes = " 智能营销活动的生效时间")
    private Date gmtEnabled;

    /**
     * 智能营销活动的结束时间
     */
    @JSONField(name = "gmt_end", alternateNames = "gmtEnd", format = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(notes = " 智能营销活动的结束时间")
    @EndDate(field = "gmtStart")
    private Date gmtEnd;

    /**
     * 智能营销活动开始时间
     */
    @JSONField(name = "gmt_start", alternateNames = "gmtStart", format = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(notes = " 智能营销活动开始时间")
    private Date gmtStart;

    /**
     * 智能营销活动对应的名称
     */
    @ApiModelProperty(notes = " 智能营销活动对应的名称")
    @NotBlank
    private String name;

    /**
     * 智能活动对应的归属人信息
     */
    @JSONField(name = "owner_info", alternateNames = "ownerInfo")
    @ApiModelProperty(notes = " 智能活动对应的归属人信息")
    @NotNull
    @Valid
    private PromoOperatorInfo ownerInfo;

    /**
     * 智能营销活动对应的方案编号
     */
    @JSONField(name = "plan_id", alternateNames = "planId")
    @ApiModelProperty(notes = " 智能营销活动对应的方案编号")
    @NotBlank
    private String planId;

    /**
     * 智能营销活动的id。创建接口中这个参数不用填，仅在查询接口中返回
     */
    @JSONField(name = "promo_id", alternateNames = "promoId")
    @ApiModelProperty(notes = " 智能营销活动的id。创建接口中这个参数不用填，仅在查询接口中返回")
    private String promoId;

    /**
     * 营销活动详情列表
     */
    @ApiModelProperty(notes = " 营销活动详情列表")
    @NotEmpty
    @Valid
    private List<IntelligentPromoDetail> promos;

    /**
     * 智能营销活动状态。CREATED：已创建；ENABLED：已生效；CLOSED：已关闭；FINISHED：已完结
     */
    @ApiModelProperty(notes = " 智能营销活动状态。CREATED：已创建；ENABLED：已生效；CLOSED：已关闭；FINISHED：已完结")
    @EnumCheck(enums = {"CREATED","ENABLED","CLOSED","FINISHED"},required = false)
    private String status;

    /**
     * 活动展示状态。已创建：CREATED；
     * REJECTED：创建被驳回；ENABLING：生效中；ONLINE_WAIT_CONFIRM：上架待确认；PUBLISHED：已发布（活动未到开始时间）；ENABLED：已发布已开始；OFFLINE_WAIT_CONFIRM：下架待确认；CLOSING：下架中；CLOSED：已下架（人为干预下架）；FINISHED：已结束（活动到期自然结束）
     */
    @JSONField(name = "sub_status", alternateNames = "subStatus")
    @ApiModelProperty(notes = " 活动展示状态。已创建：CREATED；REJECTED：创建被驳回；ENABLING：生效中；ONLINE_WAIT_CONFIRM：上架待确认；PUBLISHED：已发布（活动未到开始时间）；ENABLED：已发布已开始；OFFLINE_WAIT_CONFIRM：下架待确认；CLOSING：下架中；CLOSED：已下架（人为干预下架）；FINISHED：已结束（活动到期自然结束）")
    @EnumCheck(enums = {"CREATED","REJECTED","ENABLING","ONLINE_WAIT_CONFIRM","PUBLISHED","ENABLED","OFFLINE_WAIT_CONFIRM","CLOSING","CLOSED","FINISHED"},required = false)
    private String subStatus;

    /**
     * 智能营销活动对应的方案中的模板编号
     */
    @JSONField(name = "template_id", alternateNames = "templateId")
    @ApiModelProperty(notes = " 智能营销活动对应的方案中的模板编号")
    @NotBlank
    private String templateId;

    /**
     * 智能活动类型，值如下：RECOMMENDATION：系统推荐；REGISTRATION：报名
     */
    @ApiModelProperty(notes = " 智能活动类型，值如下：RECOMMENDATION：系统推荐；REGISTRATION：报名")
    @EnumCheck(enums = {"RECOMMENDATION","REGISTRATION"})
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
        return this.extInfo;
    }

    public void setExtInfo(JSONObject extInfo) {
        this.extInfo = extInfo;
    }

    public IntelligentPromoEffect getForecastEffect() {
        return this.forecastEffect;
    }

    public void setForecastEffect(IntelligentPromoEffect forecastEffect) {
        this.forecastEffect = forecastEffect;
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

    public List<IntelligentPromoDetail> getPromos() {
        return this.promos;
    }

    public void setPromos(List<IntelligentPromoDetail> promos) {
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
