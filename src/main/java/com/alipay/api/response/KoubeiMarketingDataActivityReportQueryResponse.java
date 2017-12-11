package com.alipay.api.response;

import com.alipay.api.fastjson.NormalizerJSON;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: koubei.marketing.data.activity.report.query response.
 *
 * @author auto create
 * @since 1.0, 2016-09-20 14:23:46
 */
@ApiModel(description = " ALIPAY API: koubei.marketing.data.activity.report.query response.")
@NormalizerJSON(false)
public class KoubeiMarketingDataActivityReportQueryResponse extends AlipayResponse {

    private static final long serialVersionUID = 6375587989166711144L;

    /**
     * 报表
     */
    @ApiModelProperty(notes = " 报表")
    @ApiField("report_data")
    private String reportData;

    public void setReportData(String reportData) {
        this.reportData = reportData;
    }

    public String getReportData() {
        return this.reportData;
    }

}
