package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 智能营销活动下属子活动
 *
 * @author auto create
 * @since 1.0, 2017-09-06 10:43:44
 */
@ApiModel(description = " 智能营销活动下属子活动")
public class InteligentpromoDetail implements Serializable {


    /**
     * 活动预算
     */
    @ApiModelProperty(notes = " 活动预算")
    private BudgetInfo budget;

    /**
     * 活动限制信息
     */
    @ApiModelProperty(notes = " 活动限制信息")
    private ConstraintInfo constraint;

    /**
     * 智能营销活动的子活动
     */
    @ApiModelProperty(notes = " 智能营销活动的子活动")
    private String desc;

    /**
     * 活动扩展信息
     */
    @ApiModelProperty(notes = " 活动扩展信息")
    @JSONField(alternateNames = "extInfo", name = "ext_info")
    private String extInfo;

    /**
     * 营销活动预测效果
     */
    @ApiModelProperty(notes = " 营销活动预测效果")
    @JSONField(alternateNames = "forecastEffect", name = "forecast_effect")
    private InteligentpromoEffect forecastEffect;

    /**
     * 智能营销子活动的结束时间
     */
    @ApiModelProperty(notes = " 智能营销子活动的结束时间")
    @JSONField(alternateNames = "gmtEnd", name = "gmt_end")
    private String gmtEnd;

    /**
     * 智能营销子活动的开始时间
     */
    @ApiModelProperty(notes = " 智能营销子活动的开始时间")
    @JSONField(alternateNames = "gmtStart", name = "gmt_start", format = "")
    private Date gmtStart;

    /**
     * 自运营活动类型。DIRECT_SEND：直发奖；CONSUME_SEND：消费送
     */
    @ApiModelProperty(notes = " 自运营活动类型。DIRECT_SEND：直发奖；CONSUME_SEND：消费送")
    @JSONField(alternateNames = "merchantPromoType", name = "merchant_promo_type")
    private String merchantPromoType;

    /**
     * 子营销活动名称
     */
    @ApiModelProperty(notes = " 子营销活动名称")
    private String name;

    /**
     * 外部业务id，一般用于外部业务和营销方案子活动的对应关系
     */
    @ApiModelProperty(notes = " 外部业务id，一般用于外部业务和营销方案子活动的对应关系")
    @JSONField(alternateNames = "outBizId", name = "out_biz_id")
    private String outBizId;

    /**
     * 子营销活动的id
     */
    @ApiModelProperty(notes = " 子营销活动的id")
    @JSONField(alternateNames = "promoId", name = "promo_id")
    private String promoId;

    /**
     * 营销工具集合。主要是活动涉及到的奖品信息
     */
    @ApiModelProperty(notes = " 营销工具集合。主要是活动涉及到的奖品信息")
    @JSONField(alternateNames = "promoTools", name = "promo_tools")
    private List<PromoTool> promoTools;

    /**
     * 投放渠道信息
     */
    @ApiModelProperty(notes = " 投放渠道信息")
    @JSONField(alternateNames = "publishChannels", name = "publish_channels")
    private List<PublishChannel> publishChannels;

    /**
     * 智能方案实际效果
     */
    @ApiModelProperty(notes = " 智能方案实际效果")
    @JSONField(alternateNames = "realEffect", name = "real_effect")
    private InteligentpromoEffect realEffect;

    /**
     * 创建或修改时的请求幂等流水号
     */
    @ApiModelProperty(notes = " 创建或修改时的请求幂等流水号")
    @JSONField(alternateNames = "requestId", name = "request_id")
    private String requestId;

    /**
     * 子营销活动对应的模板id
     */
    @ApiModelProperty(notes = " 子营销活动对应的模板id")
    @JSONField(alternateNames = "templateId", name = "template_id")
    private String templateId;

    public BudgetInfo getBudget() {
        return this.budget;
    }

    public void setBudget(BudgetInfo budget) {
        this.budget = budget;
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

    public String getExtInfo() {
        return this.extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    public InteligentpromoEffect getForecastEffect() {
        return this.forecastEffect;
    }

    public void setForecastEffect(InteligentpromoEffect forecastEffect) {
        this.forecastEffect = forecastEffect;
    }

    public String getGmtEnd() {
        return this.gmtEnd;
    }

    public void setGmtEnd(String gmtEnd) {
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

    public String getOutBizId() {
        return this.outBizId;
    }

    public void setOutBizId(String outBizId) {
        this.outBizId = outBizId;
    }

    public String getPromoId() {
        return this.promoId;
    }

    public void setPromoId(String promoId) {
        this.promoId = promoId;
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

    public InteligentpromoEffect getRealEffect() {
        return this.realEffect;
    }

    public void setRealEffect(InteligentpromoEffect realEffect) {
        this.realEffect = realEffect;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

}
