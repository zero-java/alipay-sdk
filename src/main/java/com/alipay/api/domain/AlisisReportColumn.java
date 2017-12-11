package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 报表列对象
 *
 * @author auto create
 * @since 1.0, 2016-10-28 10:26:15
 */
@ApiModel(description = " 报表列对象")
public class AlisisReportColumn extends AlipayObject {

    private static final long serialVersionUID = 2562867834367955811L;

    /**
     * 列别名
     */
    @ApiModelProperty(notes = " 列别名")
    @ApiField("alias")
    private String alias;

    /**
     * 列值
     */
    @ApiModelProperty(notes = " 列值")
    @ApiField("data")
    private String data;

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
