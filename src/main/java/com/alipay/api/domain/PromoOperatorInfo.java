package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

import java.io.Serializable;

/**
 * 操作人信息
 *
 * @author auto create
 * @since 1.0, 2017-09-06 10:33:26
 */
@ApiModel(description = " 操作人信息")
public class PromoOperatorInfo implements Serializable {

    private static final long serialVersionUID = 4179532584924924463L;

    /**
     * 操作人id
     */
    @ApiModelProperty(notes = " 操作人id",example = "2088342364645765",reference = "32")
    @JSONField(alternateNames = "operatorId", name = "operator_id")
    private String operatorId;

    /**
     * 操作人类型
     */
    @ApiModelProperty(notes = " 操作人类型",example = "SALES：口碑内部小二；MER：商户；MER_OPERATOR：商户员工；PROVIDER：服务商；PROVIDER_STAFF：服务商员工；",reference = "100")
    @JSONField(alternateNames = "operatorType", name = "operator_type")
    private String operatorType;

    public String getOperatorId() {
        return this.operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorType() {
        return this.operatorType;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }

}
