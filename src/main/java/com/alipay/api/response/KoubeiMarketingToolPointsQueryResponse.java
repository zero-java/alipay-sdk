package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: koubei.marketing.tool.points.query response.
 *
 * @author auto create
 * @since 1.0, 2016-10-09 11:45:18
 */
@ApiModel(description = " ALIPAY API: koubei.marketing.tool.points.query response.")
public class KoubeiMarketingToolPointsQueryResponse extends AlipayResponse {

    private static final long serialVersionUID = 6425617866537967147L;

    /**
     * 可用集点
     */
    @ApiModelProperty(notes = " 可用集点")
    @ApiField("available_points")
    private String availablePoints;

    /**
     * 冻结集点
     */
    @ApiModelProperty(notes = " 冻结集点")
    @ApiField("freezed_points")
    private String freezedPoints;

    /**
     * 累计集点
     */
    @ApiModelProperty(notes = " 累计集点")
    @ApiField("total_points")
    private String totalPoints;

    public void setAvailablePoints(String availablePoints) {
        this.availablePoints = availablePoints;
    }

    public String getAvailablePoints() {
        return this.availablePoints;
    }

    public void setFreezedPoints(String freezedPoints) {
        this.freezedPoints = freezedPoints;
    }

    public String getFreezedPoints() {
        return this.freezedPoints;
    }

    public void setTotalPoints(String totalPoints) {
        this.totalPoints = totalPoints;
    }

    public String getTotalPoints() {
        return this.totalPoints;
    }

}
