package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * 奖品发放规则
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */
@ApiModel(description = " 奖品发放规则")
public class SendRule implements Serializable {


    /**
     * 是否允许重复发奖：
     * true代表允许，false代表不允许
     * 默认不设置，表明用户领取券后如果没有核销则不允许再次领取券
     * 如果设置为true，表明如果用户领取券后没有核销，还可以继续领取该券
     */
    @ApiModelProperty(notes = " 是否允许重复发奖： true代表允许，false代表不允许 默认不设置，表明用户领取券后如果没有核销则不允许再次领取券 如果设置为true，表明如果用户领取券后没有核销，还可以继续领取该券")
    @JSONField(name = "allow_repeat_send", alternateNames = "allowRepeatSend")
    private String allowRepeatSend;

    /**
     * 发券最低消费金额，单位元
     * 活动类型为消费送且不是消费送礼包时设置
     * 多营销工具之间不允许设置重复值
     */
    @ApiModelProperty(notes = " 发券最低消费金额，单位元 活动类型为消费送且不是消费送礼包时设置 多营销工具之间不允许设置重复值")
    @JSONField(name = "min_cost", alternateNames = "minCost")
    @Min(0)
    private String minCost;

    /**
     * 券的预算数量（仅对口令送随机抽奖有效，即当活动类型为GUESS_SEND，且营销工具PromoTool的个数大于1时，此字段必填，其余情况此字段必为空）
     */
    @ApiModelProperty(notes = " 券的预算数量（仅对口令送随机抽奖有效，即当活动类型为GUESS_SEND，且营销工具PromoTool的个数大于1时，此字段必填，其余情况此字段必为空）")
    @JSONField(name = "send_budget", alternateNames = "sendBudget")
    private String sendBudget;

    /**
     * 发券数目
     * 最少发1张券，最多发5张券
     */
    @ApiModelProperty(notes = " 发券数目 最少发1张券，最多发5张券")
    @JSONField(name = "send_num", alternateNames = "sendNum")
    @Min(0)
    private String sendNum;

    public String getAllowRepeatSend() {
        return this.allowRepeatSend;
    }

    public void setAllowRepeatSend(String allowRepeatSend) {
        this.allowRepeatSend = allowRepeatSend;
    }

    public String getMinCost() {
        return this.minCost;
    }

    public void setMinCost(String minCost) {
        this.minCost = minCost;
    }

    public String getSendBudget() {
        return this.sendBudget;
    }

    public void setSendBudget(String sendBudget) {
        this.sendBudget = sendBudget;
    }

    public String getSendNum() {
        return this.sendNum;
    }

    public void setSendNum(String sendNum) {
        this.sendNum = sendNum;
    }

}
