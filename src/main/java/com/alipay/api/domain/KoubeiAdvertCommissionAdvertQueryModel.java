package com.alipay.api.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

/**
 * 分佣推广信息查询接口
 *
 * @author auto create
 * @since 1.0, 2017-02-21 17:15:47
 */
@ApiModel(description = " 分佣推广信息查询接口")
public class KoubeiAdvertCommissionAdvertQueryModel extends AlipayObject {

    private static final long serialVersionUID = 4329883625376268295L;

    /**
     * 查询主键列表
     * identify_type=advert所有值都必须是推广ID
     * identify_type=mission所有值都必须是分佣任务ID
     * identify_type=voucher所有值都必须是券ID
     */
    @ApiModelProperty(notes = " 查询主键列表identify_type=advert所有值都必须是推广IDidentify_type=mission所有值都必须是分佣任务IDidentify_type=voucher所有值都必须是券ID")
    private List<String> identifies;

    /**
     * 查询主键类型(枚举值key对应于请求对象中查询主键列表的key)
     * advert-推广
     * mission-分佣任务
     * voucher-券
     */
    @ApiModelProperty(notes = " 查询主键类型(枚举值key对应于请求对象中查询主键列表的key)advert-推广mission-分佣任务voucher-券")
    @JSONField(alternateNames = "identifyType", name = "identify_type")
    private String identifyType;

    public List<String> getIdentifies() {
        return this.identifies;
    }

    public void setIdentifies(List<String> identifies) {
        this.identifies = identifies;
    }

    public String getIdentifyType() {
        return this.identifyType;
    }

    public void setIdentifyType(String identifyType) {
        this.identifyType = identifyType;
    }

}
