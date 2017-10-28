package com.alipay.api.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * 智能营销活动咨询推荐接口
 *
 * @author auto create
 * @since 1.0, 2017-09-20 10:25:24
 */
@ApiModel(description = " 智能营销活动咨询推荐接口")
public class KoubeiMarketingCampaignIntelligentPromoConsultModel extends AlipayObject {

    private static final long serialVersionUID = 5747635136283153579L;

    /**
     * 操作人信息
     */
    @JSONField(name = "operator_context", alternateNames = "operatorContext")
    @ApiModelProperty(notes = " 操作人信息")
    @NotNull
    @Valid
    private PromoOperatorInfo operatorContext;

    /**
     * 商户和支付宝交互时，用于代表支付宝分配给商户ID
     */
    @JSONField(name = "partner_id", alternateNames = "partnerId")
    @ApiModelProperty(notes = " 商户和支付宝交互时，用于代表支付宝分配给商户ID")
    @NotBlank
    private String partnerId;

    /**
     * 当全场普通和单品普通方案时必传，体验方案不用传
     */
    @JSONField(name = "shop_ids", alternateNames = "shopIds")
    @ApiModelProperty(notes = " 当全场普通和单品普通方案时必传，体验方案不用传")
    private List<String> shopIds;

    /**
     * 营销模板的编号，GENERAL_EXPERIENCE：全场体验；GENERAL_NORMAL：全场普通；ITEM_EXPERIENCE：单品体验；ITEM_NORMAL：单品普通
     */
    @JSONField(name = "template_code", alternateNames = "templateCode")
    @ApiModelProperty(notes = " 营销模板的编号，GENERAL_EXPERIENCE：全场体验；GENERAL_NORMAL：全场普通；ITEM_EXPERIENCE：单品体验；ITEM_NORMAL：单品普通")
    @EnumCheck(enums = {"GENERAL_EXPERIENCE","GENERAL_NORMAL","ITEM_EXPERIENCE","ITEM_NORMAL"})
    private String templateCode;

    /**
     * 外部业务id，请保持足够复杂，方便排查数据来源
     */@JSONField(name = "out_request_no", alternateNames = "outRequestNo")@ApiModelProperty(notes = "外部业务id，请保持足够复杂，方便排查数据来源")
    private String outRequestNo;

    public String getOutRequestNo() {
        return outRequestNo;
    }

    public void setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
    }

    public PromoOperatorInfo getOperatorContext() {
        return this.operatorContext;
    }

    public void setOperatorContext(PromoOperatorInfo operatorContext) {
        this.operatorContext = operatorContext;
    }

    public String getPartnerId() {
        return this.partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public List<String> getShopIds() {
        return this.shopIds;
    }

    public void setShopIds(List<String> shopIds) {
        this.shopIds = shopIds;
    }

    public String getTemplateCode() {
        return this.templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

}
