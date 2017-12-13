package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.fastjson.annotation.JSONString;
import io.swagger.annotations.*;

import java.util.List;

/**
 * 圈人限制信息
 *
 * @author auto create
 * @since 1.0, 2017-10-26 13:58:31
 */
@ApiModel(description = " 圈人限制信息")
public class CrowdConstraintInfo extends AlipayObject {

    private static final long serialVersionUID = 4623768122362441989L;

    /**
     * 圈人的条件
     * op:表示操作符，目前支持EQ相等,GT大于,GTEQ大于等于,LT小于,LTEQ小于等于,NEQ不等,LIKE模糊匹配,IN在枚举范围内,NOTIN不在枚举范围内,BETWEEN范围比较,LEFTDAYS几天以内,RIGHTDAYS几天以外,LOCATE地理位置比较,LBS地图位置数据
     * tagCode:标签code，详细标签code参见附件。<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/tags%26usecase.zip">标签信息</a>
     * value:标签值
     */
    @ApiModelProperty(notes = " 圈人的条件 op:表示操作符，目前支持EQ相等,GT大于,GTEQ大于等于,LT小于,LTEQ小于等于,NEQ不等,LIKE模糊匹配,IN在枚举范围内,NOTIN不在枚举范围内,BETWEEN范围比较,LEFTDAYS几天以内,RIGHTDAYS几天以外,LOCATE地理位置比较,LBS地图位置数据 tagCode:标签code，使用方案参考crowd_condition使用说明")
    @JSONField(name = "crowd_condition", alternateNames = "crowdCondition")
    @JSONString
    private List<KoubeiMarketingCampaignCrowdCreateModel.CreateTags> crowdCondition;

    /**
     * 圈人名称 限笔单价30到50的老顾客
     */
    @ApiField("crowd_name")
    @JSONField(name = "crowd_name", alternateNames = "crowdName")
    private String crowdName;
    /**
     * 圈人约束，取值（NEW_MEMBER_PROMO：新客人群；OFFLINE：离线人群），OFFLINE离线人群，需要传递crowd_condition圈人条件，使用方案参考crowd_condition使用说明
     */
    @ApiModelProperty(notes = " 圈人约束，取值（NEW_MEMBER_PROMO：新客人群；OFFLINE：离线人群），OFFLINE离线人群，需要传递crowd_condition圈人条件，使用方案参考crowd_condition使用说明")
    @JSONField(name = "crowd_restriction", alternateNames = "crowdRestriction")
    private String crowdRestriction;

    public List<KoubeiMarketingCampaignCrowdCreateModel.CreateTags> getCrowdCondition() {
        return crowdCondition;
    }

    public void setCrowdCondition(List<KoubeiMarketingCampaignCrowdCreateModel.CreateTags> crowdCondition) {
        this.crowdCondition = crowdCondition;
    }

    public String getCrowdRestriction() {
        return this.crowdRestriction;
    }

    public void setCrowdRestriction(String crowdRestriction) {
        this.crowdRestriction = crowdRestriction;
    }

    public String getCrowdName() {
        return crowdName;
    }

    public void setCrowdName(String crowdName) {
        this.crowdName = crowdName;
    }
}
