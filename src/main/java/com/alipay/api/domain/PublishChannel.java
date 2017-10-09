package com.alipay.api.domain;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.StringValueSerializing;
import com.alipay.api.internal.mapping.ApiField;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * 投放渠道
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */
@ApiModel(description = " 投放渠道")
public class PublishChannel implements Serializable {


    /**
     * 当type为MERCHANT_CROWD时，config需填入口令送的密码和图片，样例如下："config":"{\"PASSWORD\":\"口令送密码\",\"BACKGROUND_LOGO\":\"1T8Pp00AT7eo9NoAJkMR3AAAACMAAQEC\"}"
     */
    @JSONField(name = "config", alternateNames = "config", serializeUsing = StringValueSerializing.class)
    @ApiModelProperty(notes = " 当type为MERCHANT_CROWD时，config需填入口令送的密码和图片，样例如下：\"config\":\"{\"PASSWORD\":\"口令送密码\",\"BACKGROUND_LOGO\":\"1T8Pp00AT7eo9NoAJkMR3AAAACMAAQEC\"}\"")
    private JSONObject config;

    /**
     * 扩展信息，无需配置
     */
    @ApiModelProperty(notes = " 扩展信息，无需配置")
    @JSONField(name = "ext_info", alternateNames = "extInfo", serializeUsing = StringValueSerializing.class)
    private JSONObject extInfo;

    /**
     * 渠道名称
     */
    @ApiModelProperty(notes = " 渠道名称")
    @NotBlank
    private String name;

    /**
     * 渠道类型，目前支持以下类型：
     * QR_CODE：二维码投放；
     * SHORT_LINK：短连接投放；
     * SHOP_DETAIL：店铺页投放；
     * PAYMENT_RESULT：支付成功页；
     * MERCHANT_CROWD：口令送；
     * EXTERNAL_MEDIA : 外部媒体
     * ISV_ENTERPRISE_BENIFIT :T:ISV企业福利,只有活动类型为DIRECT_SEND时才支持;
     * URL_WITH_TOKEN：外部发奖活动，只有活动类型为DIRECT_SEND时才支持；
     */
    @ApiModelProperty(notes = " 渠道类型，目前支持以下类型： QR_CODE：二维码投放； SHORT_LINK：短连接投放； SHOP_DETAIL：店铺页投放； PAYMENT_RESULT：支付成功页； MERCHANT_CROWD：口令送； URL_WITH_TOKEN：外部发奖活动，只有活动类型为DIRECT_SEND时才支持；ISV_ENTERPRISE_BENIFIT :T:ISV企业福利,只有活动类型为DIRECT_SEND时才支持")
    @EnumCheck(enums = {"QR_CODE", "SHORT_LINK", "SHOP_DETAIL", "PAYMENT_RESULT", "MERCHANT_CROWD", "URL_WITH_TOKEN", "ISV_ENTERPRISE_BENIFIT", "EXTERNAL_MEDIA"})
    private String type;

    public JSONObject getConfig() {
        return config;
    }

    public void setConfig(JSONObject config) {
        this.config = config;
    }

    public JSONObject getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(JSONObject extInfo) {
        this.extInfo = extInfo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
