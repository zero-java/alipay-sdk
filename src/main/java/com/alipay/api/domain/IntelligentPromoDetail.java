package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.StringValueSerializing;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

/**
 * 智能营销活动下属子活动
 *
 * @author auto create
 * @since 1.0, 2017-09-15 17:50:11
 */@ApiModel(description = " 智能营销活动下属子活动")
public class IntelligentPromoDetail extends AlipayObject {

	private static final long serialVersionUID = 6131186855653935873L;

	/**
	 * 活动预算
	 */@ApiModelProperty(notes = " 活动预算")
	private BudgetInfo budget;

	/**
	 * 营销活动的id，也就是消费送的活动id
	 */@JSONField(name = "camp_id", alternateNames = "campId")@ApiModelProperty(notes = " 营销活动的id，也就是消费送的活动id")
	private String campId;

	/**
	 * 活动限制信息
	 */@ApiModelProperty(notes = " 活动限制信息")
	private ConstraintInfo constraint;

	/**
	 * 智能营销活动的子活动
	 */@ApiModelProperty(notes = " 智能营销活动的子活动")
	private String desc;

	/**
	 * 活动扩展信息
	 */@JSONField(name = "ext_info", alternateNames = "extInfo",serializeUsing = StringValueSerializing.class)@ApiModelProperty(notes = " 活动扩展信息")
	private JSONObject extInfo;

	/**
	 * 营销活动预测效果
	 */@JSONField(name = "forecast_effect", alternateNames = "forecastEffect")@ApiModelProperty(notes = " 营销活动预测效果")
	private IntelligentPromoEffect forecastEffect;

	/**
	 * 智能营销子活动的结束时间
	 */@JSONField(name = "gmt_end", alternateNames = "gmtEnd",format = "yyyy-MM-dd HH:mm:ss")@ApiModelProperty(notes = " 智能营销子活动的结束时间")
	private Date gmtEnd;

	/**
	 * 智能营销子活动的开始时间
	 */@JSONField(name = "gmt_start", alternateNames = "gmtStart",format = "yyyy-MM-dd HH:mm:ss")@ApiModelProperty(notes = " 智能营销子活动的开始时间")
	private Date gmtStart;

	/**
	 * 自运营活动类型。DIRECT_SEND：直发奖；CONSUME_SEND：消费送
	 */@JSONField(name = "merchant_promo_type", alternateNames = "merchantPromoType")@ApiModelProperty(notes = " 自运营活动类型。DIRECT_SEND：直发奖；CONSUME_SEND：消费送")
	private String merchantPromoType;

	/**
	 * 子营销活动名称
	 */@ApiModelProperty(notes = " 子营销活动名称")
	private String name;



	/**
	 * 营销工具集合。主要是活动涉及到的奖品信息
	 */@JSONField(name = "promo_tools", alternateNames = "promoTools")@ApiModelProperty(notes = " 营销工具集合。主要是活动涉及到的奖品信息")
	private List<PromoTool> promoTools;

	/**
	 * 投放渠道信息
	 */@JSONField(name = "publish_channels", alternateNames = "publishChannels")@ApiModelProperty(notes = " 投放渠道信息")
	private List<PublishChannel> publishChannels;

	/**
	 * 子营销活动对应的模板id
	 */@JSONField(name = "template_id", alternateNames = "templateId")@ApiModelProperty(notes = " 子营销活动对应的模板id")
	private String templateId;

	public BudgetInfo getBudget() {
		return this.budget;
	}
	public void setBudget(BudgetInfo budget) {
		this.budget = budget;
	}

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public ConstraintInfo getConstraint() {
		return this.constraint;
	}
	public void setConstraint(ConstraintInfo constraint) {
		this.constraint = constraint;
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

	public IntelligentPromoEffect getForecastEffect() {
		return this.forecastEffect;
	}
	public void setForecastEffect(IntelligentPromoEffect forecastEffect) {
		this.forecastEffect = forecastEffect;
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

	public String getMerchantPromoType() {
		return this.merchantPromoType;
	}
	public void setMerchantPromoType(String merchantPromoType) {
		this.merchantPromoType = merchantPromoType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public List<PromoTool> getPromoTools() {
		return this.promoTools;
	}
	public void setPromoTools(List<PromoTool> promoTools) {
		this.promoTools = promoTools;
	}

	public List<PublishChannel> getPublishChannels() {
		return this.publishChannels;
	}
	public void setPublishChannels(List<PublishChannel> publishChannels) {
		this.publishChannels = publishChannels;
	}



	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
