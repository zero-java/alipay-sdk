package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.util.List;

/**
 * ALIPAY API: alipay.marketing.card.activateform.query response.
 *
 * @author auto create
 * @since 1.0, 2017-03-13 15:28:02
 */
@ApiModel(description = " ALIPAY API: alipay.marketing.card.activateform.query response.")
public class AlipayMarketingCardActivateformQueryResponse extends AlipayResponse {

    private static final long serialVersionUID = 2533716597163356214L;

    /**
     * 表单提交信息各个字段的值JSON数组
     * <p>
     * 默认通用表单字段名称可选值如下：
     * OPEN_FORM_FIELD_MOBILE – 手机号
     * OPEN_FORM_FIELD_GENDER – 性别
     * OPEN_FORM_FIELD_NAME – 姓名
     * OPEN_FORM_FIELD_BIRTHDAY – 生日
     * OPEN_FORM_FIELD_IDCARD – 身份证
     * OPEN_FORM_FIELD_EMAIL – 邮箱
     * OPEN_FORM_FIELD_ADDRESS – 地址
     */
    @ApiModelProperty(notes = " 表单提交信息各个字段的值JSON数组默认通用表单字段名称可选值如下：OPEN_FORM_FIELD_MOBILE – 手机号OPEN_FORM_FIELD_GENDER – 性别OPEN_FORM_FIELD_NAME – 姓名OPEN_FORM_FIELD_BIRTHDAY – 生日OPEN_FORM_FIELD_IDCARD – 身份证OPEN_FORM_FIELD_EMAIL – 邮箱OPEN_FORM_FIELD_ADDRESS – 地址")
    private List<Info> infos;

    public List<Info> getInfos() {
        return infos;
    }

    public void setInfos(List<Info> infos) {
        this.infos = infos;
    }

    @ApiModel

    public static class Info implements Serializable {
        @ApiModelProperty(notes = "")
        private String name;
        @ApiModelProperty(notes = "")
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

}
