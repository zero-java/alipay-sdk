package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: alipay.marketing.card.activateurl.apply response.
 *
 * @author auto create
 * @since 1.0, 2017-04-06 11:11:03
 */
@ApiModel(description = " ALIPAY API: alipay.marketing.card.activateurl.apply response.")
public class AlipayMarketingCardActivateurlApplyResponse extends AlipayResponse {

    private static final long serialVersionUID = 1652951395639537793L;

    /**
     * 会员卡领卡链接。商户获取此链接后可投放到服务窗消息、店铺二维码等。
     */
    @ApiModelProperty(notes = " 会员卡领卡链接。商户获取此链接后可投放到服务窗消息、店铺二维码等。")
    @ApiField("apply_card_url")
    private String applyCardUrl;

    public void setApplyCardUrl(String applyCardUrl) {
        this.applyCardUrl = applyCardUrl;
    }

    public String getApplyCardUrl() {
        return this.applyCardUrl;
    }

}
