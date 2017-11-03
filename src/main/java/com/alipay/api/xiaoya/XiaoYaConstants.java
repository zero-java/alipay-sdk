package com.alipay.api.xiaoya;

import com.alipay.api.request.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jason.guan on 2017/10/17
 */
public class XiaoYaConstants {
    private static Map<String,String> urlMaps ;

    static {
        urlMaps = new HashMap<String,String>();
        urlMaps.put(new KoubeiMarketingCampaignActivityQueryRequest().getApiMethodName(),"/gateway/actives/query");
        urlMaps.put(new KoubeiMarketingCampaignActivityCreateRequest().getApiMethodName(),"/gateway/actives/create");
        urlMaps.put(new KoubeiMarketingCampaignActivityModifyRequest().getApiMethodName(),"/gateway/actives/update");
        urlMaps.put(new KoubeiMarketingCampaignActivityBatchqueryRequest().getApiMethodName(),"/gateway/actives/list");
        urlMaps.put(new KoubeiMarketingCampaignActivityOfflineRequest().getApiMethodName(),"/gateway/actives/offline");
        urlMaps.put(new KoubeiMarketingCampaignBenefitSendRequest().getApiMethodName(),"/gateway/coupons/benefit");
        urlMaps.put(new AlipayOfflineMaterialImageUploadRequest().getApiMethodName(),"/gateway/file/upload");
        urlMaps.put(new AlipayOpenAuthTokenAppRequest().getApiMethodName(),"/gateway/token/query");
        urlMaps.put(new AlipaySystemOauthTokenRequest().getApiMethodName(),"/gateway/token/code");
        urlMaps.put(new AlipayUserInfoShareRequest().getApiMethodName(),"/gateway/token/user");
        urlMaps.put(new AlipayOfflineProviderShopactionRecordRequest().getApiMethodName(),"/gateway/provider/shopAction");
    }

    public static Map<String,String> getUrlMap(){
        return urlMaps;
    }

    public static void main(String[] args) {
        String res = urlMaps.get("koubei.marketing.campaign.activity.query");
        System.out.println(res);
    }
}
