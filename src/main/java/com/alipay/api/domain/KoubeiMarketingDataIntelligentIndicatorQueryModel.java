package com.alipay.api.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.AlipayResponse;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 智能营销方案维度的数据查询
 *
 * @author auto create
 * @since 1.0, 2017-09-28 14:59:21
 */
@ApiModel(description = " 智能营销方案维度的数据查询")
public class KoubeiMarketingDataIntelligentIndicatorQueryModel extends AlipayObject {

    private static final long serialVersionUID = 4568555736265893493L;

    /**
     * 业务类型。1.PlanQuery 智能方案效果查询；2.PlanQueryByStore 智能营销方案门店效果查询
     */
    @ApiModelProperty(notes = " 业务类型。1.PlanQuery 智能方案效果查询；2.PlanQueryByStore 智能营销方案门店效果查询")
    @JSONField(alternateNames = "bizType", name = "biz_type")
    private KoubeiMarketingDataIndicatorQueryModel.BizType bizType;

    /**
     * promo_id：为智能活动的id，当bizType= ‘PlanQuery'和bizType= ‘PlanQueryByStore'取这里的值；
     * sort_field：为排序指标KEY
     * sort_type：ASC表示升序,DESC表示降序
     * store_Ids：为门店ID，多个门店使用逗号分隔
     */
    @JSONField(name = "ext_info", alternateNames = "extInfo")
    @ApiModelProperty("拓展信息")
    private KoubeiMarketingDataIndicatorQueryModel.ExtInfo extInfo;

    /**
     * 操作人信息
     */
    @ApiModelProperty(notes = " 操作人信息")
    @JSONField(alternateNames = "operatorContext", name = "operator_context")
    private PromoOperatorInfo operatorContext;

    /**
     * 获取的报告时间,格式:yyyyMMdd
     */
    @ApiModelProperty(notes = " 获取的报告时间,格式:yyyyMMdd")
    @JSONField(alternateNames = "reportDate", name = "report_date", format = "yyyyMMdd")
    private Date reportDate;

    public KoubeiMarketingDataIndicatorQueryModel.BizType getBizType() {
        return bizType;
    }

    public void setBizType(KoubeiMarketingDataIndicatorQueryModel.BizType bizType) {
        this.bizType = bizType;
    }

    public KoubeiMarketingDataIndicatorQueryModel.ExtInfo getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(KoubeiMarketingDataIndicatorQueryModel.ExtInfo extInfo) {
        this.extInfo = extInfo;
    }

    public PromoOperatorInfo getOperatorContext() {
        return this.operatorContext;
    }

    public void setOperatorContext(PromoOperatorInfo operatorContext) {
        this.operatorContext = operatorContext;
    }

    public Date getReportDate() {
        return this.reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

}
