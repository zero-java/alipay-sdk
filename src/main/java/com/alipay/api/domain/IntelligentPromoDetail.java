package com.alipay.api.domain;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.*;
import com.alipay.api.fastjson.annotation.JSONString;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import com.yazuo.xiaoya.common.validate.Create;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * 智能营销活动下属子活动
 *
 * @author auto create
 * @since 1.0, 2017-09-19 18:01:55
 */
@ApiModel(description = " 智能营销活动下属子活动")
public class IntelligentPromoDetail implements Serializable {


    /**
     * 活动预算
     */
    @ApiModelProperty(notes = " 活动预算")
    @NotNull
    @Valid
    private BudgetInfo budget;

    /**
     * 营销活动的id，也就是消费送的活动id
     */
    @JSONField(name = "camp_id", alternateNames = "campId")
    @ApiModelProperty(notes = " 营销活动的id，也就是消费送的活动id")
    private String campId;

    /**
     * 活动限制信息
     */
    @ApiModelProperty(notes = " 活动限制信息")
    @NotNull
    @Valid
    private ConstraintInfo constraint;

    /**
     * 圈人限制条件
     */
    @ApiModelProperty(notes = " 圈人限制条件")
    @JSONField(name = "crowd_constraint", alternateNames = "crowdConstraint")
    private CrowdConstraintInfo crowdConstraint;

    /**
     * 智能营销活动的子活动
     */
    @ApiModelProperty(notes = " 智能营销活动的子活动")
    @NotBlank(groups = Create.class)
    private String desc;

    /**
     * 活动扩展信息
     */
    @JSONField(name = "ext_info", alternateNames = "extInfo")
    @ApiModelProperty(notes = " 活动扩展信息")
    @JSONString
    private JSONObject extInfo;

    /**
     * 营销活动预测效果
     */
    @JSONField(name = "forecast_effect", alternateNames = "forecastEffect")
    @ApiModelProperty(notes = " 营销活动预测效果")
    @Valid
    @Null(groups = Create.class)
    private IntelligentPromoEffect forecastEffect;

    /**
     * 自运营活动类型。DIRECT_SEND：直发奖；CONSUME_SEND：消费送
     */
    @JSONField(name = "merchant_promo_type", alternateNames = "merchantPromoType")
    @ApiModelProperty(notes = " 自运营活动类型。DIRECT_SEND：直发奖；CONSUME_SEND：消费送")
    @EnumCheck(enums = {"DIRECT_SEND", "CONSUME_SEND"})
    private String merchantPromoType;

    /**
     * 子营销活动名称
     */
    @ApiModelProperty(notes = " 子营销活动名称")
    @NotBlank(groups = Create.class)
    private String name;


    /**
     * 营销工具集合。主要是活动涉及到的奖品信息
     */
    @JSONField(name = "promo_tools", alternateNames = "promoTools")
    @ApiModelProperty(notes = " 营销工具集合。主要是活动涉及到的奖品信息")
    @NotEmpty
    @Valid
    private List<PromoTool> promoTools;

    /**
     * 投放渠道信息
     */
    @JSONField(name = "publish_channels", alternateNames = "publishChannels")
    @ApiModelProperty(notes = " 投放渠道信息")
    @Valid
    private List<PublishChannel> publishChannels;


    /**
     * 子营销活动对应的模板id
     */
    @JSONField(name = "template_id", alternateNames = "templateId")
    @ApiModelProperty(notes = " 子营销活动对应的模板id")
    @NotBlank
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

    public CrowdConstraintInfo getCrowdConstraint() {
        return crowdConstraint;
    }

    public void setCrowdConstraint(CrowdConstraintInfo crowdConstraint) {
        this.crowdConstraint = crowdConstraint;
    }
}
