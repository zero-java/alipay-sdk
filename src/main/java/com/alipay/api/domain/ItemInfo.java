package com.alipay.api.domain;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

/**
 * 券的单品信息
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */
@ApiModel(description = " 券的单品信息")
public class ItemInfo implements Serializable {


    /**
     * 券适用的单品码列表
     * 最少配置1个单品码
     * 最多配置500个单品码
     */
    @ApiModelProperty(notes = " 券适用的单品码列表 最少配置1个单品码 最多配置500个单品码")
    @JSONField(name = "item_ids", alternateNames = "itemIds")
    private List<String> itemIds;

    /**
     * 单品图片列表
     * 单品图片不能超过3张
     */
    @ApiModelProperty(notes = " 单品图片列表 单品图片不能超过3张")
    @JSONField(name = "item_imgs", alternateNames = "itemImgs")
    private List<String> itemImgs;

    /**
     * 单品券详细介绍跳转链接
     */
    @ApiModelProperty(notes = " 单品券详细介绍跳转链接")
    @JSONField(name = "item_link", alternateNames = "itemLink")
    private String itemLink;

    /**
     * 单品名称
     */
    @ApiModelProperty(notes = " 单品名称")
    @JSONField(name = "item_name", alternateNames = "itemName")
    private String itemName;

    /**
     * 单品券说明
     */
    @ApiModelProperty(notes = " 单品券说明")
    @JSONField(name = "item_text", alternateNames = "itemText")
    private String itemText;
    /**
     * 券适用SKU的最低消费金额门
     * 槛
     * 如券适用A,B两个SKU，该字
     * 段设置的值为100，则订单中
     * 购买A,B两个SKU的合计金额
     * 需大于100元才可用券
     */
    @ApiModelProperty(notes = " 券适用SKU的最低消费金额门槛如券适用A,B两个SKU，该字段设置的值为100，则订单中购买A,B两个SKU的合计金额需大于100元才可用券")
    @JSONField(alternateNames = "skuMinConsume", name = "sku_min_consume")
    private String skuMinConsume;

    /**
     * 最高优惠商品件数
     */
    @ApiModelProperty(notes = " 最高优惠商品件数")
    @JSONField(name = "max_discount_num", alternateNames = "maxDiscountNum")
    private String maxDiscountNum;

    /**
     * 最低购买商品件数
     */
    @ApiModelProperty(notes = " 最低购买商品件数")
    @JSONField(name = "min_consume_num", alternateNames = "minConsumeNum")
    private String minConsumeNum;

    /**
     * 单品的原价，单位元
     * 必须为合法金额类型字符串，如9.99
     */
    @ApiModelProperty(notes = " 单品的原价，单位元 必须为合法金额类型字符串，如9.99")
    @JSONField(name = "original_price", alternateNames = "originalPrice")
    private String originalPrice;

    public String getSkuMinConsume() {
        return skuMinConsume;
    }

    public void setSkuMinConsume(String skuMinConsume) {
        this.skuMinConsume = skuMinConsume;
    }

    public List<String> getItemIds() {
        return this.itemIds;
    }

    public void setItemIds(List<String> itemIds) {
        this.itemIds = itemIds;
    }

    public List<String> getItemImgs() {
        return this.itemImgs;
    }

    public void setItemImgs(List<String> itemImgs) {
        this.itemImgs = itemImgs;
    }

    public String getItemLink() {
        return this.itemLink;
    }

    public void setItemLink(String itemLink) {
        this.itemLink = itemLink;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemText() {
        return this.itemText;
    }

    public void setItemText(String itemText) {
        this.itemText = itemText;
    }

    public String getMaxDiscountNum() {
        return this.maxDiscountNum;
    }

    public void setMaxDiscountNum(String maxDiscountNum) {
        this.maxDiscountNum = maxDiscountNum;
    }

    public String getMinConsumeNum() {
        return this.minConsumeNum;
    }

    public void setMinConsumeNum(String minConsumeNum) {
        this.minConsumeNum = minConsumeNum;
    }

    public String getOriginalPrice() {
        return this.originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

}
