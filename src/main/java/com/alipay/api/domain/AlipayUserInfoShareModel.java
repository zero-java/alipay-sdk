package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;
import io.swagger.annotations.ApiModel;

/**
 * Created by jason.guan on 2017/10/26
 */
@ApiModel(description = "用户信息")
public class AlipayUserInfoShareModel  extends AlipayObject {
    @ApiModelProperty(notes = "")
    @ApiField("token")
    private String token;

    @ApiModelProperty(notes = "")
    @ApiField("code")
    private String code;

    @ApiModelProperty(notes = "")
    @ApiField("grantType")
    private String grantType;

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
