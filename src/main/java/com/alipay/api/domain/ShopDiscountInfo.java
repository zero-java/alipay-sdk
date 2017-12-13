package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 店铺优惠信息查询
 *
 * @author auto create
 * @since 1.0, 2016-10-31 11:21:25
 */
@ApiModel(description = " 店铺优惠信息查询")
public class ShopDiscountInfo extends AlipayObject {

    private static final long serialVersionUID = 3518558188427879485L;

    /**
     * 图片url
     */
    @ApiModelProperty(notes = " 图片url")
    private String cover;

    /**
     * 优惠信息描述
     */
    @ApiModelProperty(notes = " 优惠信息描述")
    private String description;

    /**
     * 是否全场。
     * 全场：Y，单品：N
     */
    @JSONField(name = "is_all", alternateNames = "isAll")
    @ApiModelProperty(notes = " 是否全场。全场：Y，单品：N")
    private String isAll;

    /**
     * 支付宝商品id
     */
    @JSONField(name = "item_id", alternateNames = "itemId")
    @ApiModelProperty(notes = " 支付宝商品id")
    private String itemId;

    /**
     * 子类型
     */
    @JSONField(name = "promo_sub_type", alternateNames = "promoSubType")
    @ApiModelProperty(notes = " 子类型")
    private String promoSubType;

    /**
     * 优惠类型。
     * 优惠：discount
     * 商品：item
     */
    @JSONField(name = "promotion_type", alternateNames = "promotionType")
    @ApiModelProperty(notes = " 优惠类型。优惠：discount商品：item")
    private String promotionType;

    /**
     * 领用模式。自动领用：AUTO_OBTAIN。手动领用：OBTAIN
     */
    @JSONField(name = "purchase_mode", alternateNames = "purchaseMode")
    @ApiModelProperty(notes = " 领用模式。自动领用：AUTO_OBTAIN。手动领用：OBTAIN")
    private String purchaseMode;

    /**
     * 已用数量
     */
    @JSONField(name = "sales_quantity", alternateNames = "salesQuantity")
    @ApiModelProperty(notes = " 已用数量")
    private String salesQuantity;

    /**
     * 优惠信息标题
     */
    @ApiModelProperty(notes = " 优惠信息标题")
    private String subject;

    public String getCover() {
        return this.cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsAll() {
        return this.isAll;
    }

    public void setIsAll(String isAll) {
        this.isAll = isAll;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getPromoSubType() {
        return this.promoSubType;
    }

    public void setPromoSubType(String promoSubType) {
        this.promoSubType = promoSubType;
    }

    public String getPromotionType() {
        return this.promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    public String getPurchaseMode() {
        return this.purchaseMode;
    }

    public void setPurchaseMode(String purchaseMode) {
        this.purchaseMode = purchaseMode;
    }

    public String getSalesQuantity() {
        return this.salesQuantity;
    }

    public void setSalesQuantity(String salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
