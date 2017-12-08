package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

/**
 * 报表行对象
 *
 * @author auto create
 * @since 1.0, 2016-10-28 10:26:15
 */
@ApiModel(description = " 报表行对象")
public class AlisisReportRow extends AlipayObject {

    private static final long serialVersionUID = 8168456736554689616L;

    /**
     * 报表行信息，每个对象是一列的数据
     */
    @ApiModelProperty(notes = " 报表行信息，每个对象是一列的数据")
    @ApiListField("row_data")
    @ApiField("alisis_report_column")
    private List<AlisisReportColumn> rowData;

    public List<AlisisReportColumn> getRowData() {
        return this.rowData;
    }

    public void setRowData(List<AlisisReportColumn> rowData) {
        this.rowData = rowData;
    }

}
