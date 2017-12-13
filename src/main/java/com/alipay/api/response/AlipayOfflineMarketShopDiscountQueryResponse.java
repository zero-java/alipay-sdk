package com.alipay.api.response;

import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.domain.CampDetailInfo;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopDiscountInfo;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: alipay.offline.market.shop.discount.query response.
 *
 * @author auto create
 * @since 1.0, 2016-10-31 11:21:25
 */
@ApiModel(description = " ALIPAY API: alipay.offline.market.shop.discount.query response.")
public class AlipayOfflineMarketShopDiscountQueryResponse extends AlipayResponse {

    private static final long serialVersionUID = 8612976231211538396L;

    /**
     * 优惠信息列表，最大20条，按生效时间排序
     */
    @ApiModelProperty(notes = " 优惠信息列表，最大20条，按生效时间排序")
    @JSONField(name = "discount_list", alternateNames = "discountList")
    private List<ShopDiscountInfo> discountList;

    /**
     * 商品列表，最大20条，按申领数量排序
     */
    @ApiModelProperty(notes = " 商品列表，最大20条，按申领数量排序")
    @JSONField(name = "item_list", alternateNames = "itemList")
    private List<ShopDiscountInfo> itemList;

    /**
     * 返回商户正在进行中的活动摘要列表数据，注意：如果入参query_type不传递或者传递错误值，该参数将不会返回。
     */
    @ApiModelProperty(notes = " 返回商户正在进行中的活动摘要列表数据，注意：如果入参query_type不传递或者传递错误值，该参数将不会返回。")
    @JSONField(name = "camp_list", alternateNames = "campList")
    private List<CampDetailInfo> campList;

    public void setDiscountList(List<ShopDiscountInfo> discountList) {
        this.discountList = discountList;
    }

    public List<ShopDiscountInfo> getDiscountList() {
        return this.discountList;
    }

    public void setItemList(List<ShopDiscountInfo> itemList) {
        this.itemList = itemList;
    }

    public List<ShopDiscountInfo> getItemList() {
        return this.itemList;
    }

    public List<CampDetailInfo> getCampList() {
        return campList;
    }

    public void setCampList(List<CampDetailInfo> campList) {
        this.campList = campList;
    }
}
