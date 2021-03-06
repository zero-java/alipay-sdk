package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * 延迟生效信息
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */
@ApiModel(description = " 延迟生效信息")
public class DelayInfo implements Serializable {


    /**
     * 延迟类型，目前支持以下类型
     * ABSOLUTELY：按绝对值延迟
     * BYDAY：按天延迟
     */
    @ApiModelProperty(notes = " 延迟类型，目前支持以下类型 ABSOLUTELY：按绝对值延迟 BYDAY：按天延迟")
    @EnumCheck(enums = {"ABSOLUTELY","BYDAY"})
    private String type;

    /**
     * 延迟值，单位分钟
     * 按绝对值延迟延迟24*60 (1天)表示，当日08:00:00领到的券要到隔日的08:00:00才能使用
     * 按天延迟延迟24*60(1天)表示，当日08:00:00领到的券，隔日00:00:00点就可以用
     */
    @ApiModelProperty(notes = " 延迟值，单位分钟 按绝对值延迟延迟24*60 (1天)表示，当日08:00:00领到的券要到隔日的08:00:00才能使用 按天延迟延迟24*60(1天)表示，当日08:00:00领到的券，隔日00:00:00点就可以用")
    @NotBlank
    private String value;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
