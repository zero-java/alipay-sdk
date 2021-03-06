package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: koubei.marketing.campaign.crowd.create response.
 *
 * @author auto create
 * @since 1.0, 2016-08-29 14:52:57
 */
@ApiModel(description = " ALIPAY API: koubei.marketing.campaign.crowd.create response.")
public class KoubeiMarketingCampaignCrowdCreateResponse extends AlipayResponse {

    private static final long serialVersionUID = 5211818811457195223L;

    /**
     * 返回的人群组的唯一标识
     */
    @ApiModelProperty(notes = " 返回的人群组的唯一标识")
//	@ApiField("crowd_group_id")
    private String crowdGroupId;

    public void setCrowdGroupId(String crowdGroupId) {
        this.crowdGroupId = crowdGroupId;
    }

    public String getCrowdGroupId() {
        return this.crowdGroupId;
    }

}
