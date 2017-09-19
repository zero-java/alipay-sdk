package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

/**
 * 智能营销活动模型
 *
 * @author auto create
 * @since 1.0, 2017-09-15 17:50:48
 */@ApiModel(description = " 智能营销活动模型")
public class IntelligentPromo extends AlipayObject {

	private static final long serialVersionUID = 2634822629656162273L;

	/**
	 * 是否允许自动续期
	 */@JSONField(name = "allow_auto_delay", alternateNames = "allowAutoDelay")@ApiModelProperty(notes = " 是否允许自动续期")
	private Boolean allowAutoDelay;

	/**
	 * 审批状态。APPROVING：审批中；REJECTED：已驳回；PASS：已通过；
	 */@JSONField(name = "audit_status", alternateNames = "auditStatus")@ApiModelProperty(notes = " 审批状态。APPROVING：审批中；REJECTED：已驳回；PASS：已通过；")
	private String auditStatus;

	/**
	 * 创建人信息
	 */@JSONField(name = "creator_info", alternateNames = "creatorInfo")@ApiModelProperty(notes = " 创建人信息")
	private PromoOperatorInfo creatorInfo;

	/**
	 * 智能活动描述
	 */@ApiModelProperty(notes = " 智能活动描述")
	private String desc;

	/**
	 * 活动扩展信息
	 */@JSONField(name = "ext_info", alternateNames = "extInfo")@ApiModelProperty(notes = " 活动扩展信息")
	private String extInfo;

	/**
	 * 方案级别的效果预测
	 */@JSONField(name = "forecast_effect", alternateNames = "forecastEffect")@ApiModelProperty(notes = " 方案级别的效果预测")
	private IntelligentPromoEffect forecastEffect;

	/**
	 * 活动关闭的时间
	 */@JSONField(name = "gmt_closed", alternateNames = "gmtClosed" )@ApiModelProperty(notes = " 活动关闭的时间")
	private Date gmtClosed;

	/**
	 * 智能营销活动的生效时间
	 */@JSONField(name = "gmt_enabled", alternateNames = "gmtEnabled")@ApiModelProperty(notes = " 智能营销活动的生效时间")
	private Date gmtEnabled;

	/**
	 * 智能营销活动的结束时间
	 */@JSONField(name = "gmt_end", alternateNames = "gmtEnd")@ApiModelProperty(notes = " 智能营销活动的结束时间")
	private Date gmtEnd;

	/**
	 * 智能营销活动开始时间
	 */@JSONField(name = "gmt_start", alternateNames = "gmtStart")@ApiModelProperty(notes = " 智能营销活动开始时间")
	private Date gmtStart;

	/**
	 * 智能营销活动对应的名称
	 */@ApiModelProperty(notes = " 智能营销活动对应的名称")
	private String name;

	/**
	 * 智能活动对应的归属人信息
	 */@JSONField(name = "owner_info", alternateNames = "ownerInfo")@ApiModelProperty(notes = " 智能活动对应的归属人信息")
	private PromoOperatorInfo ownerInfo;

	/**
	 * 智能营销活动对应的方案编号
	 */@JSONField(name = "plan_id", alternateNames = "planId")@ApiModelProperty(notes = " 智能营销活动对应的方案编号")
	private String planId;

	/**
	 * 智能营销活动的id。创建接口中这个参数不用填，仅在查询接口中返回
	 */@JSONField(name = "promo_id", alternateNames = "promoId")@ApiModelProperty(notes = " 智能营销活动的id。创建接口中这个参数不用填，仅在查询接口中返回")
	private String promoId;

	/**
	 * 营销活动详情列表
	 */@ApiModelProperty(notes = " 营销活动详情列表")
	private List<IntelligentPromoDetail> promos;

	/**
	 * 智能营销活动状态。CREATED：已创建；ENABLED：已生效；CLOSED：已关闭；FINISHED：已完结
	 */@ApiModelProperty(notes = " 智能营销活动状态。CREATED：已创建；ENABLED：已生效；CLOSED：已关闭；FINISHED：已完结")
	private String status;

	/**
	 * 活动展示状态。已创建：CREATED；
REJECTED：创建被驳回；ENABLING：生效中；ONLINE_WAIT_CONFIRM：上架待确认；PUBLISHED：已发布（活动未到开始时间）；ENABLED：已发布已开始；OFFLINE_WAIT_CONFIRM：下架待确认；CLOSED：已下架（人为干预下架）；FINISHED：已结束（活动到期自然结束）
	 */@JSONField(name = "sub_status", alternateNames = "subStatus")@ApiModelProperty(notes = " 活动展示状态。已创建：CREATED；REJECTED：创建被驳回；ENABLING：生效中；ONLINE_WAIT_CONFIRM：上架待确认；PUBLISHED：已发布（活动未到开始时间）；ENABLED：已发布已开始；OFFLINE_WAIT_CONFIRM：下架待确认；CLOSED：已下架（人为干预下架）；FINISHED：已结束（活动到期自然结束）")
	private String subStatus;

	/**
	 * 智能营销活动对应的方案中的模板编号
	 */@JSONField(name = "template_id", alternateNames = "templateId")@ApiModelProperty(notes = " 智能营销活动对应的方案中的模板编号")
	private String templateId;

	/**
	 * 智能活动类型，值如下：RECOMMENDATION：系统推荐；REGISTRATION：报名
	 */@ApiModelProperty(notes = " 智能活动类型，值如下：RECOMMENDATION：系统推荐；REGISTRATION：报名")
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

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
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
