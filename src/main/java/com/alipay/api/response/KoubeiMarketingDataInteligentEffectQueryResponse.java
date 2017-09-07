package com.alipay.api.response;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayResponse;
import com.alipay.api.domain.Inteligentpromo;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * ALIPAY API: koubei.marketing.data.inteligent.effect.query response.
 *
 * @author auto create
 * @since 1.0, 2017-09-06 10:55:23
 */
@ApiModel(description = " ALIPAY API: koubei.marketing.data.inteligent.effect.query response.")
public class KoubeiMarketingDataInteligentEffectQueryResponse extends AlipayResponse {

    private static final long serialVersionUID = 1834236853172772713L;

    /**
     * 咨询后返回的模型，包含活动本身的模型以及效果模型
     */
    @ApiModelProperty(notes = " 咨询后返回的模型，包含活动本身的模型以及效果模型")
    private Inteligentpromo promo;

    public void setPromo(Inteligentpromo promo) {
        this.promo = promo;
    }

    public Inteligentpromo getPromo() {
        return this.promo;
    }

}
