package com.alipay.api.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.ASMClassLoader;
import com.alipay.api.*;
import com.alipay.api.fastjson.config.CustomerParseConfig;
import com.alipay.api.fastjson.parser.deserializer.CustomerASMDeserializerFactory;
import com.alipay.api.internal.mapping.Converter;
import com.alipay.api.internal.mapping.Converters;
import com.alipay.api.internal.mapping.Reader;
import com.alipay.api.internal.util.AlipayEncrypt;
import com.alipay.api.internal.util.StringUtils;
import com.alipay.api.internal.util.json.ExceptionErrorListener;
import com.alipay.api.internal.util.json.JSONReader;
import com.alipay.api.internal.util.json.JSONValidatingReader;
import com.alipay.api.response.KoubeiMarketingCampaignCrowdCountResponse;
import com.alipay.api.response.KoubeiMarketingCampaignTagsQueryResponse;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * fastjson转换器
 * Created by scvzerng on 2017/8/1.
 */
public class FastJSONConverter implements Converter {
   private static final String SUCCESS_KEY = "success";
   private static final String ERROR_KEY = "error";
   private static final String BIZ_ERROR = "40004";
  static {
      ParserConfig.global = new CustomerParseConfig(new CustomerASMDeserializerFactory(new ASMClassLoader()));

  }
    public static void main(String[] args) {
        String json = "{\"koubei_marketing_campaign_intelligent_promo_query_response\":{\"code\":\"10000\",\"msg\":\"Success\",\"promo\":{\"allow_auto_delay\":true,\"audit_status\":\"AUTO_PASS\",\"create_request_no\":\"28b6454bc5444a3ba50196f0912eb657\",\"creator_info\":{\"operator_id\":\"2088422692161322\",\"operator_type\":\"MER\"},\"ext_info\":\"{\\\"template\\\":\\\"CROWD\\\",\\\"NOTIFY_LDC_ID\\\":\\\"2017112210000000320006233149\\\",\\\"GMT_END_BEFORE_START\\\":\\\"2017-12-31 23:59:59\\\",\\\"LARGE_SCALE\\\":\\\"1212\\\",\\\"SMART_PROMO_SOURCE\\\":\\\"KOUBEI_APP\\\",\\\"PROMO_REC_LOG\\\":\\\"20171122000000002727206911009320\\\"}\",\"forecast_effect\":{\"avg_prize_increase\":\"0.049999999999999996\",\"cost\":182300,\"effect_id\":\"20171122000000000691042911007320\",\"gmt_from\":\"2017-11-22 00:00:00\",\"gmt_to\":\"2017-12-31 23:59:59\",\"gmv\":1417800,\"repay_rate_increase\":\"0.05\",\"send_count_increase\":\"0.05\",\"type\":\"FORECAST\",\"use_count\":113},\"gmt_enabled\":\"2017-11-22 16:46:49\",\"gmt_end\":\"2017-12-31 23:59:59\",\"gmt_start\":\"2017-11-22 00:00:00\",\"name\":\"收入月增计划-精准营销1122\",\"owner_info\":{\"operator_id\":\"2088422692161322\",\"operator_type\":\"MER\"},\"plan_id\":\"20170912000000000001001911001490\",\"promo_id\":\"20171122000000000454438911004320\",\"promos\":[{\"budget\":{\"budget_total\":\"9999999\",\"budget_type\":\"QUANTITY\"},\"camp_id\":\"20171122000000002118397000151323\",\"constraint\":{\"suit_shops\":[\"2017102600077000000046127515\",\"2017102600077000000046144170\",\"2017102600077000000046118705\",\"2017102600077000000046116265\",\"2017102600077000000046111036\"],\"user_win_count\":\"3\",\"user_win_frequency\":\"D||1\"},\"desc\":\"这是消费送活动的描述\",\"ext_info\":\"{\\\"smartPromoRecUuid\\\":\\\"58b73bc8f246407b845248aad57d4a7e\\\",\\\"yzActiveId\\\":\\\"872643\\\",\\\"SMART_PROMO_SOURCE_TYPE\\\":\\\"ISV\\\",\\\"SMART_PROMO_SOURCE_CHANNEL\\\":\\\"2088911724459604\\\"}\",\"forecast_effect\":{\"avg_prize_increase\":\"0.05\",\"cost\":90000,\"effect_id\":\"20171122000000000691050911007320\",\"gmt_from\":\"2017-11-22 00:00:00\",\"gmt_to\":\"2017-12-31 23:59:59\",\"gmv\":466600,\"repay_rate_increase\":\"0.05\",\"type\":\"FORECAST\",\"use_count\":50},\"merchant_promo_type\":\"CONSUME_SEND\",\"name\":\"消费送活动-收入月增计划【11月22日】\",\"promo_tools\":[{\"send_rule\":{\"min_cost\":\"0.01\"},\"voucher\":{\"brand_name\":\"测试电话\",\"delay_info\":{\"type\":\"BYDAY\",\"value\":\"1440\"},\"donate_flag\":\"true\",\"effect_type\":\"DELAY\",\"logo\":\"f6lX5w6eRvSjUmCbnOYZ1gAAACMAAQED\",\"max_amount\":\"18.00\",\"multi_use_mode\":\"NO_MULTI\",\"name\":\"消费即送18元代金券\",\"relative_time\":\"6\",\"type\":\"MONEY\",\"use_instructions\":[\"不限制\"],\"use_rule\":{\"limit_rule\":\"NOT_ALLOWED_USE\",\"min_consume\":\"90.00\",\"suit_shops\":[\"2017102600077000000046127515\",\"2017102600077000000046144170\",\"2017102600077000000046118705\",\"2017102600077000000046116265\",\"2017102600077000000046111036\"]},\"validate_type\":\"RELATIVE\",\"worth_value\":\"18.00\"},\"voucher_no\":\"65ca2f946cde43e5a9fa9027a73f8735\"}],\"template_id\":\"20171117000000000005700911002490\"},{\"budget\":{\"budget_total\":\"9999999\",\"budget_type\":\"QUANTITY\"},\"camp_id\":\"20171122101000001682946002000327\",\"constraint\":{\"suit_shops\":[\"2017102600077000000046127515\",\"2017102600077000000046144170\",\"2017102600077000000046118705\",\"2017102600077000000046116265\",\"2017102600077000000046111036\"],\"user_win_count\":\"30\",\"user_win_frequency\":\"D||2\"},\"crowd_constraint\":{\"crowd_name\":\"限首次到店消费的顾客\",\"crowd_restriction\":\"NEWCOMER\"},\"desc\":\"这是每满减活动的描述\",\"ext_info\":\"{\\\"smartPromoRecUuid\\\":\\\"32cf4bf32ab148c8b221c074abf60567\\\",\\\"yzActiveId\\\":\\\"872641\\\",\\\"SMART_PROMO_SOURCE_TYPE\\\":\\\"ISV\\\",\\\"SMART_PROMO_SOURCE_CHANNEL\\\":\\\"2088911724459604\\\"}\",\"forecast_effect\":{\"cost\":18000,\"effect_id\":\"20171122000000000691049911007320\",\"gmt_from\":\"2017-11-22 00:00:00\",\"gmt_to\":\"2017-12-31 23:59:59\",\"gmv\":107400,\"type\":\"FORECAST\",\"use_count\":12},\"merchant_promo_type\":\"DIRECT_SEND\",\"name\":\"新人满90减15元\",\"promo_tools\":[{\"send_rule\":{},\"voucher\":{\"brand_name\":\"测试电话\",\"donate_flag\":\"false\",\"effect_type\":\"IMMEDIATELY\",\"logo\":\"f6lX5w6eRvSjUmCbnOYZ1gAAACMAAQED\",\"max_amount\":\"15.00\",\"multi_use_mode\":\"NO_MULTI\",\"name\":\"新人满90减15元\",\"relative_time\":\"7\",\"type\":\"MONEY\",\"use_instructions\":[\"不限制\"],\"use_rule\":{\"limit_rule\":\"NOT_ALLOWED_USE\",\"min_consume\":\"90.00\",\"suit_shops\":[\"2017102600077000000046127515\",\"2017102600077000000046144170\",\"2017102600077000000046118705\",\"2017102600077000000046116265\",\"2017102600077000000046111036\"]},\"validate_type\":\"RELATIVE\",\"worth_value\":\"15.00\"},\"voucher_no\":\"619b1a318e734d6e8054647e0166ae62\"}],\"publish_channels\":[{\"config\":\"{\\\"ITEM_DISPLAY_CHANNEL\\\":\\\"QR_CODE,SHORT_LINK,SHOP_DETAIL,PAYMENT_RESULT\\\"}\",\"ext_info\":\"{\\\"QR_CODE\\\":\\\"https:\\/\\/mobilecodec.alipay.com\\/show.htm?code=kgx09561nv3e0lypysgmjf7\\\"}\",\"name\":\"二维码投放\",\"type\":\"QR_CODE\"},{\"config\":\"{\\\"$ref\\\":\\\"$.promoChannelInfoList[0].config\\\"}\",\"ext_info\":\"{\\\"SHORT_LINK\\\":\\\"https:\\/\\/m.alipay.com\\/utmk4Fi\\\"}\",\"name\":\"短连接投放\",\"type\":\"SHORT_LINK\"},{\"config\":\"{\\\"$ref\\\":\\\"$.promoChannelInfoList[0].config\\\"}\",\"ext_info\":\"{}\",\"name\":\"店铺页投放\",\"type\":\"SHOP_DETAIL\"},{\"config\":\"{\\\"$ref\\\":\\\"$.promoChannelInfoList[0].config\\\"}\",\"ext_info\":\"{}\",\"name\":\"支付成功页\",\"type\":\"PAYMENT_RESULT\"}],\"template_id\":\"20171117000000000005702911002490\"},{\"budget\":{\"budget_total\":\"9999999\",\"budget_type\":\"QUANTITY\"},\"camp_id\":\"20171122101000001684599002000320\",\"constraint\":{\"suit_shops\":[\"2017102600077000000046127515\",\"2017102600077000000046144170\",\"2017102600077000000046118705\",\"2017102600077000000046116265\",\"2017102600077000000046111036\"],\"user_win_frequency\":\"D||1\"},\"desc\":\"这是引流活动的描述\",\"ext_info\":\"{\\\"smartPromoRecUuid\\\":\\\"b86bc2fc28f8431a91957f77310d8b07\\\",\\\"yzActiveId\\\":\\\"872640\\\",\\\"SMART_PROMO_SOURCE_TYPE\\\":\\\"ISV\\\",\\\"SMART_PROMO_SOURCE_CHANNEL\\\":\\\"2088911724459604\\\"}\",\"forecast_effect\":{\"cost\":0,\"effect_id\":\"20171122000000000691048911007320\",\"gmt_from\":\"2017-11-22 00:00:00\",\"gmt_to\":\"2017-12-31 23:59:59\",\"gmv\":0,\"send_count_increase\":\"0.05\",\"type\":\"FORECAST\",\"use_count\":0},\"merchant_promo_type\":\"DIRECT_SEND\",\"name\":\"引流活动-收入月增计划【11月22日】\",\"promo_tools\":[{\"send_rule\":{},\"voucher\":{\"brand_name\":\"测试电话\",\"donate_flag\":\"true\",\"effect_type\":\"IMMEDIATELY\",\"logo\":\"f6lX5w6eRvSjUmCbnOYZ1gAAACMAAQED\",\"max_amount\":\"27.00\",\"multi_use_mode\":\"NO_MULTI\",\"name\":\"营销推广27元代金券\",\"relative_time\":\"7\",\"type\":\"MONEY\",\"use_instructions\":[\"不限制\"],\"use_rule\":{\"limit_rule\":\"NOT_ALLOWED_USE\",\"min_consume\":\"110.00\",\"suit_shops\":[\"2017102600077000000046127515\",\"2017102600077000000046144170\",\"2017102600077000000046118705\",\"2017102600077000000046116265\",\"2017102600077000000046111036\"]},\"validate_type\":\"RELATIVE\",\"worth_value\":\"27.00\"},\"voucher_no\":\"e1966c47573f4df4987b2d9ba550a71e\"}],\"publish_channels\":[{\"config\":\"{\\\"ITEM_DISPLAY_CHANNEL\\\":\\\"TRAFFIC_CHANNEL\\\"}\",\"ext_info\":\"{}\",\"name\":\"流量渠道\",\"type\":\"TRAFFIC_CHANNEL\"}],\"template_id\":\"20171117000000000005699911002490\"},{\"budget\":{\"budget_total\":\"9999999\",\"budget_type\":\"QUANTITY\"},\"camp_id\":\"20171122101000001682734002000327\",\"constraint\":{\"crowd_group_id\":\"20171122000000002155844000158322\",\"suit_shops\":[\"2017102600077000000046127515\",\"2017102600077000000046144170\",\"2017102600077000000046118705\",\"2017102600077000000046116265\",\"2017102600077000000046111036\"],\"user_win_count\":\"30\",\"user_win_frequency\":\"D||2\"},\"crowd_constraint\":{\"crowd_condition\":\"[{\\\"op\\\":\\\"BETWEEN\\\",\\\"tag_code\\\":\\\"pam_last_pay_amt\\\",\\\"value\\\":[\\\"20000\\\",\\\"999999999\\\"]}]\",\"crowd_name\":\"限笔单价200元以上老顾客\",\"crowd_restriction\":\"OFFLINE\"},\"desc\":\"这是每满减活动的描述\",\"ext_info\":\"{\\\"smartPromoRecUuid\\\":\\\"691f1312805745258c19397079c55484\\\",\\\"yzActiveId\\\":\\\"872635\\\",\\\"SMART_PROMO_SOURCE_TYPE\\\":\\\"ISV\\\",\\\"SMART_PROMO_SOURCE_CHANNEL\\\":\\\"2088911724459604\\\"}\",\"forecast_effect\":{\"cost\":33000,\"effect_id\":\"20171122000000000691047911007320\",\"gmt_from\":\"2017-11-22 00:00:00\",\"gmt_to\":\"2017-12-31 23:59:59\",\"gmv\":340200,\"type\":\"FORECAST\",\"use_count\":10},\"merchant_promo_type\":\"DIRECT_SEND\",\"name\":\"老顾客满329减33元\",\"promo_tools\":[{\"send_rule\":{},\"voucher\":{\"brand_name\":\"测试电话\",\"donate_flag\":\"false\",\"effect_type\":\"IMMEDIATELY\",\"logo\":\"f6lX5w6eRvSjUmCbnOYZ1gAAACMAAQED\",\"max_amount\":\"33.00\",\"multi_use_mode\":\"NO_MULTI\",\"name\":\"老顾客满329减33元\",\"relative_time\":\"7\",\"type\":\"MONEY\",\"use_instructions\":[\"不限制\"],\"use_rule\":{\"limit_rule\":\"NOT_ALLOWED_USE\",\"min_consume\":\"329.00\",\"suit_shops\":[\"2017102600077000000046127515\",\"2017102600077000000046144170\",\"2017102600077000000046118705\",\"2017102600077000000046116265\",\"2017102600077000000046111036\"]},\"validate_type\":\"RELATIVE\",\"worth_value\":\"33.00\"},\"voucher_no\":\"2d5c7dd505d24ad4b403b0dea4876232\"}],\"publish_channels\":[{\"config\":\"{\\\"ITEM_DISPLAY_CHANNEL\\\":\\\"QR_CODE,SHORT_LINK,SHOP_DETAIL,PAYMENT_RESULT\\\"}\",\"ext_info\":\"{\\\"QR_CODE\\\":\\\"https:\\/\\/mobilecodec.alipay.com\\/show.htm?code=kgx09323ruivshqqie8em76\\\"}\",\"name\":\"二维码投放\",\"type\":\"QR_CODE\"},{\"config\":\"{\\\"$ref\\\":\\\"$.promoChannelInfoList[0].config\\\"}\",\"ext_info\":\"{\\\"SHORT_LINK\\\":\\\"https:\\/\\/m.alipay.com\\/PYX5nQA\\\"}\",\"name\":\"短连接投放\",\"type\":\"SHORT_LINK\"},{\"config\":\"{\\\"$ref\\\":\\\"$.promoChannelInfoList[0].config\\\"}\",\"ext_info\":\"{}\",\"name\":\"店铺页投放\",\"type\":\"SHOP_DETAIL\"},{\"config\":\"{\\\"$ref\\\":\\\"$.promoChannelInfoList[0].config\\\"}\",\"ext_info\":\"{}\",\"name\":\"支付成功页\",\"type\":\"PAYMENT_RESULT\"}],\"template_id\":\"20171117000000000005701911002490\"},{\"budget\":{\"budget_total\":\"9999999\",\"budget_type\":\"QUANTITY\"},\"camp_id\":\"20171122101000001685742002000324\",\"constraint\":{\"crowd_group_id\":\"20171122000000002153835000158320\",\"suit_shops\":[\"2017102600077000000046127515\",\"2017102600077000000046144170\",\"2017102600077000000046118705\",\"2017102600077000000046116265\",\"2017102600077000000046111036\"],\"user_win_count\":\"30\",\"user_win_frequency\":\"D||2\"},\"crowd_constraint\":{\"crowd_condition\":\"[{\\\"op\\\":\\\"BETWEEN\\\",\\\"tag_code\\\":\\\"pam_last_pay_amt\\\",\\\"value\\\":[\\\"10000\\\",\\\"20000\\\"]}]\",\"crowd_name\":\"限笔单价100-200元老顾客\",\"crowd_restriction\":\"OFFLINE\"},\"desc\":\"这是每满减活动的描述\",\"ext_info\":\"{\\\"smartPromoRecUuid\\\":\\\"9ea12f7167624262aca217167bbe085b\\\",\\\"yzActiveId\\\":\\\"872639\\\",\\\"SMART_PROMO_SOURCE_TYPE\\\":\\\"ISV\\\",\\\"SMART_PROMO_SOURCE_CHANNEL\\\":\\\"2088911724459604\\\"}\",\"forecast_effect\":{\"cost\":21000,\"effect_id\":\"20171122000000000691046911007320\",\"gmt_from\":\"2017-11-22 00:00:00\",\"gmt_to\":\"2017-12-31 23:59:59\",\"gmv\":213200,\"type\":\"FORECAST\",\"use_count\":10},\"merchant_promo_type\":\"DIRECT_SEND\",\"name\":\"老顾客满205减21元\",\"promo_tools\":[{\"send_rule\":{},\"voucher\":{\"brand_name\":\"测试电话\",\"donate_flag\":\"false\",\"effect_type\":\"IMMEDIATELY\",\"logo\":\"f6lX5w6eRvSjUmCbnOYZ1gAAACMAAQED\",\"max_amount\":\"21.00\",\"multi_use_mode\":\"NO_MULTI\",\"name\":\"老顾客满205减21元\",\"relative_time\":\"7\",\"type\":\"MONEY\",\"use_instructions\":[\"不限制\"],\"use_rule\":{\"limit_rule\":\"NOT_ALLOWED_USE\",\"min_consume\":\"205.00\",\"suit_shops\":[\"2017102600077000000046127515\",\"2017102600077000000046144170\",\"2017102600077000000046118705\",\"2017102600077000000046116265\",\"2017102600077000000046111036\"]},\"validate_type\":\"RELATIVE\",\"worth_value\":\"21.00\"},\"voucher_no\":\"5bac76f358d94e508b881448be28533d\"}],\"publish_channels\":[{\"config\":\"{\\\"ITEM_DISPLAY_CHANNEL\\\":\\\"QR_CODE,SHORT_LINK,SHOP_DETAIL,PAYMENT_RESULT\\\"}\",\"ext_info\":\"{\\\"QR_CODE\\\":\\\"https:\\/\\/mobilecodec.alipay.com\\/show.htm?code=kgx020822uxafwmhlnlyyb3\\\"}\",\"name\":\"二维码投放\",\"type\":\"QR_CODE\"},{\"config\":\"{\\\"$ref\\\":\\\"$.promoChannelInfoList[0].config\\\"}\",\"ext_info\":\"{\\\"SHORT_LINK\\\":\\\"https:\\/\\/m.alipay.com\\/49g033F\\\"}\",\"name\":\"短连接投放\",\"type\":\"SHORT_LINK\"},{\"config\":\"{\\\"$ref\\\":\\\"$.promoChannelInfoList[0].config\\\"}\",\"ext_info\":\"{}\",\"name\":\"店铺页投放\",\"type\":\"SHOP_DETAIL\"},{\"config\":\"{\\\"$ref\\\":\\\"$.promoChannelInfoList[0].config\\\"}\",\"ext_info\":\"{}\",\"name\":\"支付成功页\",\"type\":\"PAYMENT_RESULT\"}],\"template_id\":\"20171117000000000005701911002490\"},{\"budget\":{\"budget_total\":\"9999999\",\"budget_type\":\"QUANTITY\"},\"camp_id\":\"20171122101000001686428002000326\",\"constraint\":{\"crowd_group_id\":\"20171122000000002245794000158320\",\"suit_shops\":[\"2017102600077000000046127515\",\"2017102600077000000046144170\",\"2017102600077000000046118705\",\"2017102600077000000046116265\",\"2017102600077000000046111036\"],\"user_win_count\":\"30\",\"user_win_frequency\":\"D||2\"},\"crowd_constraint\":{\"crowd_condition\":\"[{\\\"op\\\":\\\"BETWEEN\\\",\\\"tag_code\\\":\\\"pam_last_pay_amt\\\",\\\"value\\\":[\\\"5500\\\",\\\"10000\\\"]}]\",\"crowd_name\":\"限笔单价55-100元老顾客\",\"crowd_restriction\":\"OFFLINE\"},\"desc\":\"这是每满减活动的描述\",\"ext_info\":\"{\\\"smartPromoRecUuid\\\":\\\"f70ee49fe74d4cd7b5dda6006e567f25\\\",\\\"yzActiveId\\\":\\\"872638\\\",\\\"SMART_PROMO_SOURCE_TYPE\\\":\\\"ISV\\\",\\\"SMART_PROMO_SOURCE_CHANNEL\\\":\\\"2088911724459604\\\"}\",\"forecast_effect\":{\"cost\":11000,\"effect_id\":\"20171122000000000691045911007320\",\"gmt_from\":\"2017-11-22 00:00:00\",\"gmt_to\":\"2017-12-31 23:59:59\",\"gmv\":112200,\"type\":\"FORECAST\",\"use_count\":10},\"merchant_promo_type\":\"DIRECT_SEND\",\"name\":\"老顾客满108减11元\",\"promo_tools\":[{\"send_rule\":{},\"voucher\":{\"brand_name\":\"测试电话\",\"donate_flag\":\"false\",\"effect_type\":\"IMMEDIATELY\",\"logo\":\"f6lX5w6eRvSjUmCbnOYZ1gAAACMAAQED\",\"max_amount\":\"11.00\",\"multi_use_mode\":\"NO_MULTI\",\"name\":\"老顾客满108减11元\",\"relative_time\":\"7\",\"type\":\"MONEY\",\"use_instructions\":[\"不限制\"],\"use_rule\":{\"limit_rule\":\"NOT_ALLOWED_USE\",\"min_consume\":\"108.00\",\"suit_shops\":[\"2017102600077000000046127515\",\"2017102600077000000046144170\",\"2017102600077000000046118705\",\"2017102600077000000046116265\",\"2017102600077000000046111036\"]},\"validate_type\":\"RELATIVE\",\"worth_value\":\"11.00\"},\"voucher_no\":\"1d08b29cb92f4f1a91e5d453a0d35990\"}],\"publish_channels\":[{\"config\":\"{\\\"ITEM_DISPLAY_CHANNEL\\\":\\\"QR_CODE,SHORT_LINK,SHOP_DETAIL,PAYMENT_RESULT\\\"}\",\"ext_info\":\"{\\\"QR_CODE\\\":\\\"https:\\/\\/mobilecodec.alipay.com\\/show.htm?code=kgx045980eh5j94wdz9cf7a\\\"}\",\"name\":\"二维码投放\",\"type\":\"QR_CODE\"},{\"config\":\"{\\\"$ref\\\":\\\"$.promoChannelInfoList[0].config\\\"}\",\"ext_info\":\"{\\\"SHORT_LINK\\\":\\\"https:\\/\\/m.alipay.com\\/3LHayCn\\\"}\",\"name\":\"短连接投放\",\"type\":\"SHORT_LINK\"},{\"config\":\"{\\\"$ref\\\":\\\"$.promoChannelInfoList[0].config\\\"}\",\"ext_info\":\"{}\",\"name\":\"店铺页投放\",\"type\":\"SHOP_DETAIL\"},{\"config\":\"{\\\"$ref\\\":\\\"$.promoChannelInfoList[0].config\\\"}\",\"ext_info\":\"{}\",\"name\":\"支付成功页\",\"type\":\"PAYMENT_RESULT\"}],\"template_id\":\"20171117000000000005701911002490\"},{\"budget\":{\"budget_total\":\"9999999\",\"budget_type\":\"QUANTITY\"},\"camp_id\":\"20171122101000001685174002000324\",\"constraint\":{\"crowd_group_id\":\"20171122000000002172500000158321\",\"suit_shops\":[\"2017102600077000000046127515\",\"2017102600077000000046144170\",\"2017102600077000000046118705\",\"2017102600077000000046116265\",\"2017102600077000000046111036\"],\"user_win_count\":\"30\",\"user_win_frequency\":\"D||2\"},\"crowd_constraint\":{\"crowd_condition\":\"[{\\\"op\\\":\\\"BETWEEN\\\",\\\"tag_code\\\":\\\"pam_last_pay_amt\\\",\\\"value\\\":[\\\"2200\\\",\\\"5500\\\"]}]\",\"crowd_name\":\"限笔单价22-55元老顾客\",\"crowd_restriction\":\"OFFLINE\"},\"desc\":\"这是每满减活动的描述\",\"ext_info\":\"{\\\"smartPromoRecUuid\\\":\\\"8646f74d79064f8aa49c5766398a9d99\\\",\\\"yzActiveId\\\":\\\"872644\\\",\\\"SMART_PROMO_SOURCE_TYPE\\\":\\\"ISV\\\",\\\"SMART_PROMO_SOURCE_CHANNEL\\\":\\\"2088911724459604\\\"}\",\"forecast_effect\":{\"cost\":6000,\"effect_id\":\"20171122000000000691044911007320\",\"gmt_from\":\"2017-11-22 00:00:00\",\"gmt_to\":\"2017-12-31 23:59:59\",\"gmv\":85600,\"type\":\"FORECAST\",\"use_count\":10},\"merchant_promo_type\":\"DIRECT_SEND\",\"name\":\"老顾客满58减6元\",\"promo_tools\":[{\"send_rule\":{},\"voucher\":{\"brand_name\":\"测试电话\",\"donate_flag\":\"false\",\"effect_type\":\"IMMEDIATELY\",\"logo\":\"f6lX5w6eRvSjUmCbnOYZ1gAAACMAAQED\",\"max_amount\":\"6.00\",\"multi_use_mode\":\"NO_MULTI\",\"name\":\"老顾客满58减6元\",\"relative_time\":\"7\",\"type\":\"MONEY\",\"use_instructions\":[\"不限制\"],\"use_rule\":{\"limit_rule\":\"NOT_ALLOWED_USE\",\"min_consume\":\"58.00\",\"suit_shops\":[\"2017102600077000000046127515\",\"2017102600077000000046144170\",\"2017102600077000000046118705\",\"2017102600077000000046116265\",\"2017102600077000000046111036\"]},\"validate_type\":\"RELATIVE\",\"worth_value\":\"6.00\"},\"voucher_no\":\"5070a49e39604a439f04c3c8e78c7527\"}],\"publish_channels\":[{\"config\":\"{\\\"ITEM_DISPLAY_CHANNEL\\\":\\\"QR_CODE,SHORT_LINK,SHOP_DETAIL,PAYMENT_RESULT\\\"}\",\"ext_info\":\"{\\\"QR_CODE\\\":\\\"https:\\/\\/mobilecodec.alipay.com\\/show.htm?code=kgx02269086ptofvpvh5j95\\\"}\",\"name\":\"二维码投放\",\"type\":\"QR_CODE\"},{\"config\":\"{\\\"$ref\\\":\\\"$.promoChannelInfoList[0].config\\\"}\",\"ext_info\":\"{\\\"SHORT_LINK\\\":\\\"https:\\/\\/m.alipay.com\\/gY6HWdn\\\"}\",\"name\":\"短连接投放\",\"type\":\"SHORT_LINK\"},{\"config\":\"{\\\"$ref\\\":\\\"$.promoChannelInfoList[0].config\\\"}\",\"ext_info\":\"{}\",\"name\":\"店铺页投放\",\"type\":\"SHOP_DETAIL\"},{\"config\":\"{\\\"$ref\\\":\\\"$.promoChannelInfoList[0].config\\\"}\",\"ext_info\":\"{}\",\"name\":\"支付成功页\",\"type\":\"PAYMENT_RESULT\"}],\"template_id\":\"20171117000000000005701911002490\"},{\"budget\":{\"budget_total\":\"9999999\",\"budget_type\":\"QUANTITY\"},\"camp_id\":\"20171122101000001683918002000324\",\"constraint\":{\"crowd_group_id\":\"20171122000000002226268000158325\",\"suit_shops\":[\"2017102600077000000046127515\",\"2017102600077000000046144170\",\"2017102600077000000046118705\",\"2017102600077000000046116265\",\"2017102600077000000046111036\"],\"user_win_count\":\"30\",\"user_win_frequency\":\"D||2\"},\"crowd_constraint\":{\"crowd_condition\":\"[{\\\"op\\\":\\\"BETWEEN\\\",\\\"tag_code\\\":\\\"pam_last_pay_amt\\\",\\\"value\\\":[\\\"0\\\",\\\"2200\\\"]}]\",\"crowd_name\":\"限笔单价22元以下老顾客\",\"crowd_restriction\":\"OFFLINE\"},\"desc\":\"这是每满减活动的描述\",\"ext_info\":\"{\\\"smartPromoRecUuid\\\":\\\"b7cafee980154fdea510b63f678fe206\\\",\\\"yzActiveId\\\":\\\"872642\\\",\\\"SMART_PROMO_SOURCE_TYPE\\\":\\\"ISV\\\",\\\"SMART_PROMO_SOURCE_CHANNEL\\\":\\\"2088911724459604\\\"}\",\"forecast_effect\":{\"cost\":3300,\"effect_id\":\"20171122000000000691043911007320\",\"gmt_from\":\"2017-11-22 00:00:00\",\"gmt_to\":\"2017-12-31 23:59:59\",\"gmv\":92600,\"type\":\"FORECAST\",\"use_count\":11},\"merchant_promo_type\":\"DIRECT_SEND\",\"name\":\"老顾客满22减3元\",\"promo_tools\":[{\"send_rule\":{},\"voucher\":{\"brand_name\":\"测试电话\",\"donate_flag\":\"false\",\"effect_type\":\"IMMEDIATELY\",\"logo\":\"f6lX5w6eRvSjUmCbnOYZ1gAAACMAAQED\",\"max_amount\":\"3.00\",\"multi_use_mode\":\"NO_MULTI\",\"name\":\"老顾客满22减3元\",\"relative_time\":\"7\",\"type\":\"MONEY\",\"use_instructions\":[\"不限制\"],\"use_rule\":{\"limit_rule\":\"NOT_ALLOWED_USE\",\"min_consume\":\"22.00\",\"suit_shops\":[\"2017102600077000000046127515\",\"2017102600077000000046144170\",\"2017102600077000000046118705\",\"2017102600077000000046116265\",\"2017102600077000000046111036\"]},\"validate_type\":\"RELATIVE\",\"worth_value\":\"3.00\"},\"voucher_no\":\"79f2d553b0f24cd9b97dfe21f9e1af6b\"}],\"publish_channels\":[{\"config\":\"{\\\"ITEM_DISPLAY_CHANNEL\\\":\\\"QR_CODE,SHORT_LINK,SHOP_DETAIL,PAYMENT_RESULT\\\"}\",\"ext_info\":\"{\\\"QR_CODE\\\":\\\"https:\\/\\/mobilecodec.alipay.com\\/show.htm?code=kgx07331i2ht5uwtyyci0fa\\\"}\",\"name\":\"二维码投放\",\"type\":\"QR_CODE\"},{\"config\":\"{\\\"$ref\\\":\\\"$.promoChannelInfoList[0].config\\\"}\",\"ext_info\":\"{\\\"SHORT_LINK\\\":\\\"https:\\/\\/m.alipay.com\\/tXiLfsC\\\"}\",\"name\":\"短连接投放\",\"type\":\"SHORT_LINK\"},{\"config\":\"{\\\"$ref\\\":\\\"$.promoChannelInfoList[0].config\\\"}\",\"ext_info\":\"{}\",\"name\":\"店铺页投放\",\"type\":\"SHOP_DETAIL\"},{\"config\":\"{\\\"$ref\\\":\\\"$.promoChannelInfoList[0].config\\\"}\",\"ext_info\":\"{}\",\"name\":\"支付成功页\",\"type\":\"PAYMENT_RESULT\"}],\"template_id\":\"20171117000000000005701911002490\"}],\"status\":\"ENABLED\",\"sub_status\":\"ENABLED\",\"template_id\":\"20171117000000000005698911002490\",\"type\":\"RECOMMENDATION\"}},\"sign\":\"RTgg/4N/RH7MomgQwo1NFks/nU3EAL8LeSczlgxd/6KrIa9lsZ3CEd2+iVDfsJE/HR811kGTfExuk2w3OQ5Ff9iWFUHaRjSyx1DSBZmjz4RZS5/Ci/h1Vz5F+pNqxUn+wmoxDV4l8F9VrP+eEvyWXrpcTpzNaGlv8axSG37UciM=\"}";
        JSONObject object = JSON.parseObject(json).getJSONObject("koubei_marketing_campaign_intelligent_promo_query_response");
//        KoubeiMarketingCampaignIntelligentPromoQueryResponse response = JSON.parseObject(JSON.toJSONString(object), KoubeiMarketingCampaignIntelligentPromoQueryResponse.class);
//        System.out.println(response);

        String json1 = "{\"koubei_marketing_campaign_tags_query_response\":{\"code\":\"10000\",\"msg\":\"Success\",\"tags\":\"{\\\"categories\\\":[{\\\"title\\\":\\\"行业标签\\\",\\\"tags\\\":[{\\\"op\\\":\\\"IN\\\",\\\"tagCode\\\":\\\"pam_cate1\\\",\\\"sources\\\":[{\\\"label\\\":\\\"中餐\\\",\\\"value\\\":\\\"中餐\\\"},{\\\"label\\\":\\\"火锅\\\",\\\"value\\\":\\\"火锅\\\"},{\\\"label\\\":\\\"快餐\\\",\\\"value\\\":\\\"快餐\\\"},{\\\"label\\\":\\\"小吃\\\",\\\"value\\\":\\\"小吃\\\"},{\\\"label\\\":\\\"烧烤\\\",\\\"value\\\":\\\"烧烤\\\"},{\\\"label\\\":\\\"烘焙糕点\\\",\\\"value\\\":\\\"烘焙糕点\\\"}],\\\"control\\\":\\\"select-multiple\\\",\\\"title\\\":\\\"品类偏好\\\"}]},{\\\"title\\\":\\\"地理位置\\\",\\\"tags\\\":[{\\\"op\\\":\\\"IN\\\",\\\"tagCode\\\":\\\"pam_activity_time\\\",\\\"sources\\\":[{\\\"label\\\":\\\"白天\\\",\\\"value\\\":\\\"day\\\"},{\\\"label\\\":\\\"晚上\\\",\\\"value\\\":\\\"night\\\"},{\\\"label\\\":\\\"工作日\\\",\\\"value\\\":\\\"workday\\\"},{\\\"label\\\":\\\"休息日\\\",\\\"value\\\":\\\"restday\\\"}],\\\"control\\\":\\\"checkbox\\\",\\\"title\\\":\\\"出现时段\\\"},{\\\"op\\\":\\\"LBS\\\",\\\"tagCode\\\":\\\"pam_lbs\\\",\\\"control\\\":\\\"tree-select\\\",\\\"title\\\":\\\"适用门店\\\"},{\\\"op\\\":\\\"IN\\\",\\\"tagCode\\\":\\\"pam_range_shop_code\\\",\\\"control\\\":\\\"tree-select\\\",\\\"title\\\":\\\"用户出现店铺附近\\\"},{\\\"op\\\":\\\"GT,GTEQ,LT,LTEQ,BETWEEN\\\",\\\"tagCode\\\":\\\"pam_range_shop_dist\\\",\\\"sources\\\":[{\\\"label\\\":\\\"1公里\\\",\\\"value\\\":\\\"1000\\\"},{\\\"label\\\":\\\"2公里\\\",\\\"value\\\":\\\"2000\\\"},{\\\"label\\\":\\\"3公里\\\",\\\"value\\\":\\\"3000\\\"}],\\\"control\\\":\\\"radio-normal\\\",\\\"title\\\":\\\"出现范围距离\\\"},{\\\"op\\\":\\\"IN\\\",\\\"tagCode\\\":\\\"pam_range_shop_activity_time\\\",\\\"sources\\\":[{\\\"label\\\":\\\"白天\\\",\\\"value\\\":\\\"day\\\"},{\\\"label\\\":\\\"晚上\\\",\\\"value\\\":\\\"night\\\"},{\\\"label\\\":\\\"工作日\\\",\\\"value\\\":\\\"workday\\\"},{\\\"label\\\":\\\"休息日\\\",\\\"value\\\":\\\"restday\\\"}],\\\"control\\\":\\\"select-multiple\\\",\\\"title\\\":\\\"用户出现店铺时间段\\\"},{\\\"op\\\":\\\"IN\\\",\\\"tagCode\\\":\\\"pam_range_city_code\\\",\\\"control\\\":\\\"city-tree-select\\\",\\\"title\\\":\\\"用户出现城市附近\\\"},{\\\"op\\\":\\\"EQ,LT,LTEQ\\\",\\\"tagCode\\\":\\\"pam_range_city_dist\\\",\\\"sources\\\":[{\\\"label\\\":\\\"1公里\\\",\\\"value\\\":\\\"1000\\\"},{\\\"label\\\":\\\"2公里\\\",\\\"value\\\":\\\"2000\\\"},{\\\"label\\\":\\\"3公里\\\",\\\"value\\\":\\\"3000\\\"}],\\\"control\\\":\\\"radio-normal\\\",\\\"title\\\":\\\"用户城市出现范围\\\"},{\\\"op\\\":\\\"IN\\\",\\\"tagCode\\\":\\\"pam_range_city_activity_time\\\",\\\"sources\\\":[{\\\"label\\\":\\\"白天\\\",\\\"value\\\":\\\"day\\\"},{\\\"label\\\":\\\"晚上\\\",\\\"value\\\":\\\"night\\\"},{\\\"label\\\":\\\"工作日\\\",\\\"value\\\":\\\"workday\\\"},{\\\"label\\\":\\\"休息日\\\",\\\"value\\\":\\\"restday\\\"}],\\\"control\\\":\\\"select-multiple\\\",\\\"title\\\":\\\"用户城市出现时间段\\\"}]},{\\\"title\\\":\\\"消费行为\\\",\\\"tags\\\":[{\\\"op\\\":\\\"EQ\\\",\\\"tagCode\\\":\\\"pam_trade\\\",\\\"subTags\\\":[{\\\"op\\\":\\\"GT,GTEQ,LT,LTEQ,BETWEEN\\\",\\\"tagCode\\\":\\\"pam_trade_amt\\\",\\\"control\\\":\\\"interval\\\",\\\"title\\\":\\\"消费金额\\\"},{\\\"op\\\":\\\"GT,GTEQ,LT,LTEQ,BETWEEN\\\",\\\"tagCode\\\":\\\"pam_trade_cnt\\\",\\\"control\\\":\\\"interval\\\",\\\"title\\\":\\\"消费次数\\\"},{\\\"op\\\":\\\"GT,GTEQ,LT,LTEQ,BETWEEN\\\",\\\"tagCode\\\":\\\"pam_trade_pct_amt\\\",\\\"control\\\":\\\"interval\\\",\\\"title\\\":\\\"交易客单价\\\"},{\\\"op\\\":\\\"EQ,IN\\\",\\\"tagCode\\\":\\\"pam_trade_cycle\\\",\\\"sources\\\":[{\\\"label\\\":\\\"7天\\\",\\\"value\\\":\\\"7\\\"},{\\\"label\\\":\\\"30天\\\",\\\"value\\\":\\\"30\\\"},{\\\"label\\\":\\\"90天\\\",\\\"value\\\":\\\"90\\\"},{\\\"label\\\":\\\"180天\\\",\\\"value\\\":\\\"180\\\"}],\\\"control\\\":\\\"checkbox\\\",\\\"title\\\":\\\"消费周期\\\"}],\\\"control\\\":\\\"group\\\",\\\"title\\\":\\\"交易数据\\\"},{\\\"op\\\":\\\"GT,GTEQ,LT,LTEQ,BETWEEN\\\",\\\"tagCode\\\":\\\"pam_last_pay_amt\\\",\\\"control\\\":\\\"interval\\\",\\\"title\\\":\\\"最近一次交易金额\\\"}]},{\\\"title\\\":\\\"基本特征\\\",\\\"tags\\\":[{\\\"op\\\":\\\"EQ,IN\\\",\\\"tagCode\\\":\\\"pam_gender\\\",\\\"sources\\\":[{\\\"label\\\":\\\"男\\\",\\\"value\\\":\\\"1\\\"},{\\\"label\\\":\\\"女\\\",\\\"value\\\":\\\"2\\\"},{\\\"label\\\":\\\"未知\\\",\\\"value\\\":\\\"0\\\"}],\\\"control\\\":\\\"select-multiple\\\",\\\"title\\\":\\\"性别\\\"},{\\\"op\\\":\\\"IN\\\",\\\"tagCode\\\":\\\"pam_age\\\",\\\"sources\\\":[{\\\"label\\\":\\\"18岁以下\\\",\\\"value\\\":\\\"1\\\"},{\\\"label\\\":\\\"18-20\\\",\\\"value\\\":\\\"2\\\"},{\\\"label\\\":\\\"21-25\\\",\\\"value\\\":\\\"3\\\"},{\\\"label\\\":\\\"26-30\\\",\\\"value\\\":\\\"4\\\"},{\\\"label\\\":\\\"31-35\\\",\\\"value\\\":\\\"5\\\"},{\\\"label\\\":\\\"36-40\\\",\\\"value\\\":\\\"6\\\"},{\\\"label\\\":\\\"41-45\\\",\\\"value\\\":\\\"7\\\"},{\\\"label\\\":\\\"46-50\\\",\\\"value\\\":\\\"8\\\"},{\\\"label\\\":\\\"51-55\\\",\\\"value\\\":\\\"9\\\"},{\\\"label\\\":\\\"56-60\\\",\\\"value\\\":\\\"10\\\"},{\\\"label\\\":\\\"60以上\\\",\\\"value\\\":\\\"11\\\"}],\\\"control\\\":\\\"select-multiple\\\",\\\"title\\\":\\\"年龄\\\"},{\\\"op\\\":\\\"IN\\\",\\\"tagCode\\\":\\\"pam_birthday_mm\\\",\\\"sources\\\":[{\\\"label\\\":\\\"01\\\",\\\"value\\\":\\\"01\\\"},{\\\"label\\\":\\\"02\\\",\\\"value\\\":\\\"02\\\"},{\\\"label\\\":\\\"03\\\",\\\"value\\\":\\\"03\\\"},{\\\"label\\\":\\\"04\\\",\\\"value\\\":\\\"04\\\"},{\\\"label\\\":\\\"05\\\",\\\"value\\\":\\\"05\\\"},{\\\"label\\\":\\\"06\\\",\\\"value\\\":\\\"06\\\"},{\\\"label\\\":\\\"07\\\",\\\"value\\\":\\\"07\\\"},{\\\"label\\\":\\\"08\\\",\\\"value\\\":\\\"08\\\"},{\\\"label\\\":\\\"09\\\",\\\"value\\\":\\\"09\\\"},{\\\"label\\\":\\\"10\\\",\\\"value\\\":\\\"10\\\"},{\\\"label\\\":\\\"11\\\",\\\"value\\\":\\\"11\\\"},{\\\"label\\\":\\\"12\\\",\\\"value\\\":\\\"12\\\"}],\\\"control\\\":\\\"select-multiple\\\",\\\"title\\\":\\\"生日月份\\\"},{\\\"op\\\":\\\"IN\\\",\\\"tagCode\\\":\\\"pam_constellation\\\",\\\"sources\\\":[{\\\"label\\\":\\\"摩羯座\\\",\\\"value\\\":\\\"摩羯座\\\"},{\\\"label\\\":\\\"白羊座\\\",\\\"value\\\":\\\"白羊座\\\"},{\\\"label\\\":\\\"金牛座\\\",\\\"value\\\":\\\"金牛座\\\"},{\\\"label\\\":\\\"双子座\\\",\\\"value\\\":\\\"双子座\\\"},{\\\"label\\\":\\\"巨蟹座\\\",\\\"value\\\":\\\"巨蟹座\\\"},{\\\"label\\\":\\\"狮子座\\\",\\\"value\\\":\\\"狮子座\\\"},{\\\"label\\\":\\\"处女座\\\",\\\"value\\\":\\\"处女座\\\"},{\\\"label\\\":\\\"天秤座\\\",\\\"value\\\":\\\"天秤座\\\"},{\\\"label\\\":\\\"天蝎座\\\",\\\"value\\\":\\\"天蝎座\\\"},{\\\"label\\\":\\\"射手座\\\",\\\"value\\\":\\\"射手座\\\"},{\\\"label\\\":\\\"水瓶座\\\",\\\"value\\\":\\\"水瓶座\\\"},{\\\"label\\\":\\\"双鱼座\\\",\\\"value\\\":\\\"双鱼座\\\"}],\\\"control\\\":\\\"select-multiple\\\",\\\"title\\\":\\\"星座\\\"},{\\\"op\\\":\\\"IN\\\",\\\"tagCode\\\":\\\"pam_occupation\\\",\\\"sources\\\":[{\\\"label\\\":\\\"白领\\\",\\\"value\\\":\\\"白领\\\"},{\\\"label\\\":\\\"大学生\\\",\\\"value\\\":\\\"大学生\\\"}],\\\"control\\\":\\\"select-multiple\\\",\\\"title\\\":\\\"职业\\\"},{\\\"op\\\":\\\"IN\\\",\\\"tagCode\\\":\\\"pam_city_code\\\",\\\"control\\\":\\\"city-tree-select\\\",\\\"title\\\":\\\"常驻地\\\"},{\\\"op\\\":\\\"IN\\\",\\\"tagCode\\\":\\\"pam_hometown_code\\\",\\\"control\\\":\\\"city-tree-select\\\",\\\"title\\\":\\\"籍贯\\\"},{\\\"op\\\":\\\"EQ\\\",\\\"tagCode\\\":\\\"pam_have_baby\\\",\\\"sources\\\":[{\\\"label\\\":\\\"否\\\",\\\"value\\\":\\\"0\\\"},{\\\"label\\\":\\\"是\\\",\\\"value\\\":\\\"1\\\"}],\\\"control\\\":\\\"radio-normal\\\",\\\"title\\\":\\\"是否有小孩\\\"},{\\\"op\\\":\\\"EQ,IN\\\",\\\"tagCode\\\":\\\"pam_consume_level\\\",\\\"sources\\\":[{\\\"label\\\":\\\"低\\\",\\\"value\\\":\\\"低\\\"},{\\\"label\\\":\\\"中\\\",\\\"value\\\":\\\"中\\\"},{\\\"label\\\":\\\"高\\\",\\\"value\\\":\\\"高\\\"}],\\\"control\\\":\\\"select-multiple\\\",\\\"title\\\":\\\"消费能力\\\"},{\\\"op\\\":\\\"EQ,IN\\\",\\\"tagCode\\\":\\\"pam_member_grade\\\",\\\"sources\\\":[{\\\"label\\\":\\\"VIP\\\",\\\"value\\\":\\\"0\\\"},{\\\"label\\\":\\\"常客\\\",\\\"value\\\":\\\"1\\\"},{\\\"label\\\":\\\"新客\\\",\\\"value\\\":\\\"2\\\"},{\\\"label\\\":\\\"过客\\\",\\\"value\\\":\\\"3\\\"},{\\\"label\\\":\\\"流失客\\\",\\\"value\\\":\\\"4\\\"}],\\\"control\\\":\\\"select-multiple\\\",\\\"title\\\":\\\"会员分层\\\"},{\\\"op\\\":\\\"IN\\\",\\\"tagCode\\\":\\\"pam_member_type\\\",\\\"sources\\\":[{\\\"label\\\":\\\"支付会员\\\",\\\"value\\\":\\\"member_pay\\\"},{\\\"label\\\":\\\"服务窗粉丝\\\",\\\"value\\\":\\\"member_fwc\\\"},{\\\"label\\\":\\\"会员卡会员\\\",\\\"value\\\":\\\"member_card\\\"}],\\\"control\\\":\\\"select-multiple\\\",\\\"title\\\":\\\"会员类型\\\"}]}],\\\"dimensions\\\":[\\\"pam_age\\\",\\\"pam_gender\\\",\\\"pam_constellation\\\",\\\"pam_hometown_code\\\",\\\"pam_city_code\\\",\\\"pam_occupation\\\",\\\"pam_consume_level\\\",\\\"pam_have_baby\\\"]}\"},\"sign\":\"wp9yhiCPqZ9VRPUOK/2S7/PCw/nGO2LnqzHR8oIzEHWht3SyWbnlBdmKB0QV2VPFu3taB9SVHrVquhpl+huCWUGGauGEsVJecOCaHJYGaD/BXsAwLy0oS0U90iWtorcB+T2cel6qhygBi9M+VRQ+XZvQUYeArliqpGmsmTq+lK0=\"}";
        JSONObject object1 = JSON.parseObject(json1).getJSONObject("koubei_marketing_campaign_tags_query_response");
        KoubeiMarketingCampaignTagsQueryResponse response1 =  JSON.parseObject(JSON.toJSONString(object1), KoubeiMarketingCampaignTagsQueryResponse.class);
        System.out.println(response1);
    }
    public <T extends AlipayResponse> T toResponse(String rsp, Class<T> clazz)
            throws AlipayApiException {
//        NormalizerJSON normalizerJSON = clazz.getAnnotation(NormalizerJSON.class);
//        String json = normalizerJSON!=null&&!normalizerJSON.value()?rsp:new String(new NormalizerJSONString(rsp).getNormalizerData());
        JSONObject jsonObject = null;
            jsonObject = JSON.parseObject(rsp);
        for(Object value : jsonObject.values()){
            if(value instanceof JSON){
                return JSON.parseObject(JSONObject.toJSONString(value) ,clazz);
            }
        }

       if(jsonObject.containsKey(SUCCESS_KEY)&&jsonObject.containsKey(ERROR_KEY)){
            String error = jsonObject.getString(ERROR_KEY);
           jsonObject.put("code",BIZ_ERROR);
           jsonObject.put("message",error);
           jsonObject.put("subCode",error);
           jsonObject.put("subMsg",error);
           return JSON.toJavaObject(jsonObject,clazz);
       }
//        return JSON.parseObject(rsp,clazz);
//        JSONReader reader = new JSONValidatingReader(new ExceptionErrorListener());
//        Object rootObj = reader.read(rsp);
//        if (rootObj instanceof Map<?, ?>) {
//            Map<?, ?> rootJson = (Map<?, ?>) rootObj;
//            Collection<?> values = rootJson.values();
//            for (Object rspObj : values) {
//                if (rspObj instanceof Map<?, ?>) {
//                    Map<?, ?> rspJson = (Map<?, ?>) rspObj;
//                    return fromJson(rspJson, clazz);
//                }
//            }
//        }
        return null;
    }

    /**
     * 把JSON格式的数据转换为对象。
     *
     * @param <T> 泛型领域对象
     * @param json JSON格式的数据
     * @param clazz 泛型领域类型
     * @return 领域对象
     * @throws
     */
    public <T> T fromJson(final Map<?, ?> json, Class<T> clazz) throws AlipayApiException {
        return Converters.convert(clazz, new Reader() {
            public boolean hasReturnField(Object name) {
                return json.containsKey(name);
            }

            public Object getPrimitiveObject(Object name) {
                return json.get(name);
            }

            public Object getObject(Object name, Class<?> type) throws AlipayApiException {
                Object tmp = json.get(name);
                if(tmp instanceof String){
                    tmp = JSON.parseObject((String) tmp);
                }
                if (tmp instanceof Map<?, ?>) {
                    Map<?, ?> map = (Map<?, ?>) tmp;
                    return fromJson(map, type);
                } else {
                    return null;
                }
            }

            public List<?> getListObjects(Object listName, Object itemName, Class<?> subType)
                    throws AlipayApiException {
                List<Object> listObjs = null;

                Object listTmp = json.get(listName);
                if(listTmp instanceof String){
                    listTmp = JSON.parseArray((String) listTmp);
                }
                if (listTmp instanceof Map<?, ?>) {
                    Map<?, ?> jsonMap = (Map<?, ?>) listTmp;
                    Object itemTmp = jsonMap.get(itemName);
                    if (itemTmp == null && listName != null) {
                        String listNameStr = listName.toString();
                        itemTmp = jsonMap.get(listNameStr.substring(0, listNameStr.length() - 1));
                    }
                    if (itemTmp instanceof List<?>) {
                        listObjs = getListObjectsInner(subType, itemTmp);
                    }
                } else if (listTmp instanceof List<?>) {
                    listObjs = getListObjectsInner(subType, listTmp);
                }

                return listObjs;
            }

            private List<Object> getListObjectsInner(Class<?> subType, Object itemTmp)
                    throws AlipayApiException {
                List<Object> listObjs;
                listObjs = new ArrayList<Object>();
                List<?> tmpList = (List<?>) itemTmp;
                for (Object subTmp : tmpList) {
                    Object obj = null;
                    if (String.class.isAssignableFrom(subType)) {
                        obj = subTmp;
                    } else if (Long.class.isAssignableFrom(subType)) {
                        obj = subTmp;
                    } else if (Integer.class.isAssignableFrom(subType)) {
                        obj = subTmp;
                    } else if (Boolean.class.isAssignableFrom(subType)) {
                        obj = subTmp;
                    } else if (Date.class.isAssignableFrom(subType)) {
                        DateFormat format = new SimpleDateFormat(AlipayConstants.DATE_TIME_FORMAT);
                        try {
                            obj = format.parse(String.valueOf(subTmp));
                        } catch (ParseException e) {
                            throw new AlipayApiException(e);
                        }
                    } else if (subTmp instanceof Map<?, ?>) {// object
                        Map<?, ?> subMap = (Map<?, ?>) subTmp;
                        obj = fromJson(subMap, subType);
                    }

                    if (obj != null) {
                        listObjs.add(obj);
                    }
                }
                return listObjs;
            }

        });
    }

    /**
     * @see com.alipay.api.internal.mapping.Converter#getSignItem(com.alipay.api.AlipayRequest, String)
     */
    public SignItem getSignItem(AlipayRequest<?> request, String responseBody)
            throws AlipayApiException {

        // 响应为空则直接返回
        if (StringUtils.isEmpty(responseBody)) {

            return null;
        }

        SignItem signItem = new SignItem();

        // 获取签名
        String sign = getSign(responseBody);
        signItem.setSign(sign);

        // 签名源串
        String signSourceData = getSignSourceData(request, responseBody);
        signItem.setSignSourceDate(signSourceData);

        return signItem;
    }

    /**
     *
     * @param request
     * @param body
     * @return
     */
    private String getSignSourceData(AlipayRequest<?> request, String body) {

        // 加签源串起点
        String rootNode = request.getApiMethodName().replace('.', '_')
                + AlipayConstants.RESPONSE_SUFFIX;
        String errorRootNode = AlipayConstants.ERROR_RESPONSE;

        int indexOfRootNode = body.indexOf(rootNode);
        int indexOfErrorRoot = body.indexOf(errorRootNode);

        // 成功或者新版接口
        if (indexOfRootNode > 0) {

            return parseSignSourceData(body, rootNode, indexOfRootNode);

            // 老版本失败接口
        } else if (indexOfErrorRoot > 0) {

            return parseSignSourceData(body, errorRootNode, indexOfErrorRoot);
        } else {
            return null;
        }
    }

    /**
     *   获取签名源串内容
     *
     *
     * @param body
     * @param rootNode
     * @param indexOfRootNode
     * @return
     */
    private String parseSignSourceData(String body, String rootNode, int indexOfRootNode) {

        //  第一个字母+长度+引号和分号
        int signDataStartIndex = indexOfRootNode + rootNode.length() + 2;
        int indexOfSign = body.indexOf("\"" + AlipayConstants.SIGN + "\"");

        if (indexOfSign < 0) {

            return null;
        }

        // 签名前-逗号
        int signDataEndIndex = indexOfSign - 1;

        return body.substring(signDataStartIndex, signDataEndIndex);
    }

    /**
     * 获取签名
     *
     * @param body
     * @return
     */
    private String getSign(String body) {

        JSONReader reader = new JSONValidatingReader(new ExceptionErrorListener());
        Object rootObj = reader.read(body);
        Map<?, ?> rootJson = (Map<?, ?>) rootObj;

        return (String) rootJson.get(AlipayConstants.SIGN);
    }

    /**
     * @see com.alipay.api.internal.mapping.Converter#encryptSourceData(com.alipay.api.AlipayRequest, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public String encryptSourceData(AlipayRequest<?> request, String body, String format,
                                    String encryptType, String encryptKey, String charset)
            throws AlipayApiException {

        ResponseParseItem respSignSourceData = getJSONSignSourceData(request, body);

        String bodyIndexContent = body.substring(0, respSignSourceData.getStartIndex());
        String bodyEndContent = body.substring(respSignSourceData.getEndIndex());

        return bodyIndexContent
                + AlipayEncrypt.decryptContent(respSignSourceData.getEncryptContent(), encryptType,
                encryptKey, charset) + bodyEndContent;

    }

    /**
     *  获取JSON响应加签内容串
     *
     * @param request
     * @param body
     * @return
     */
    private ResponseParseItem getJSONSignSourceData(AlipayRequest<?> request, String body) {

        String rootNode = request.getApiMethodName().replace('.', '_')
                + AlipayConstants.RESPONSE_SUFFIX;
        String errorRootNode = AlipayConstants.ERROR_RESPONSE;

        int indexOfRootNode = body.indexOf(rootNode);
        int indexOfErrorRoot = body.indexOf(errorRootNode);

        if (indexOfRootNode > 0) {

            return parseJSONSignSourceData(body, rootNode, indexOfRootNode);

        } else if (indexOfErrorRoot > 0) {

            return parseJSONSignSourceData(body, errorRootNode, indexOfErrorRoot);
        } else {
            return null;
        }
    }

    /**
     *
     *
     * @param body
     * @param rootNode
     * @param indexOfRootNode
     * @return
     */
    private ResponseParseItem parseJSONSignSourceData(String body, String rootNode,
                                                      int indexOfRootNode) {

        int signDataStartIndex = indexOfRootNode + rootNode.length() + 2;
        int indexOfSign = body.indexOf("\"" + AlipayConstants.SIGN + "\"");

        if (indexOfSign < 0) {

            indexOfSign = body.length();
        }

        int signDataEndIndex = indexOfSign - 1;

        String encryptContent = body.substring(signDataStartIndex + 1, signDataEndIndex - 1);

        return new ResponseParseItem(signDataStartIndex, signDataEndIndex, encryptContent);
    }
}
