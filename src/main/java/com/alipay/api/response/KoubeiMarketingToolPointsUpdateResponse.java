package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: koubei.marketing.tool.points.update response.
 *
 * @author auto create
 * @since 1.0, 2016-11-15 18:49:47
 */
@ApiModel(description = " ALIPAY API: koubei.marketing.tool.points.update response.")
public class KoubeiMarketingToolPointsUpdateResponse extends AlipayResponse {

    private static final long serialVersionUID = 8776369833757652286L;

    /**
     * 集点变更流水号
     */
    @ApiModelProperty(notes = " 集点变更流水号")
    @ApiField("point_log_no")
    private String pointLogNo;

    public void setPointLogNo(String pointLogNo) {
        this.pointLogNo = pointLogNo;
    }

    public String getPointLogNo() {
        return this.pointLogNo;
    }

}
