package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CampDetail;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: koubei.marketing.campaign.activity.query response.
 *
 * @author auto create
 * @since 1.0, 2017-02-27 11:23:15
 */
@ApiModel(description = " ALIPAY API: koubei.marketing.campaign.activity.query response.")
public class KoubeiMarketingCampaignActivityQueryResponse extends AlipayResponse {

    private static final long serialVersionUID = 8544119438272167696L;

    /**
     * 活动详情
     */
    @ApiModelProperty(notes = " 活动详情")
    @ApiField("camp_detail")
    private CampDetail campDetail;

    public void setCampDetail(CampDetail campDetail) {
        this.campDetail = campDetail;
    }

    public CampDetail getCampDetail() {
        return this.campDetail;
    }

}
