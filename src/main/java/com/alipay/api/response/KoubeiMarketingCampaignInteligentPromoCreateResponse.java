package com.alipay.api.response;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.Inteligentpromo;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: koubei.marketing.campaign.inteligent.promo.create response.
 *
 * @author auto create
 * @since 1.0, 2017-09-07 15:03:23
 */
@ApiModel(description = " ALIPAY API: koubei.marketing.campaign.inteligent.promo.create response.")
public class KoubeiMarketingCampaignInteligentPromoCreateResponse extends AlipayResponse {

    private static final long serialVersionUID = 5136473849842399285L;

    /**
     * 智能营销活动信息
     */
    @ApiModelProperty(notes = " 智能营销活动信息")
    private Inteligentpromo promo;

    public void setPromo(Inteligentpromo promo) {
        this.promo = promo;
    }

    public Inteligentpromo getPromo() {
        return this.promo;
    }

}
