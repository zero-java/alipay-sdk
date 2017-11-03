package com.alipay.api.xiaoya;

import com.alipay.api.request.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Request和URL 地址的映射
 * Created by jason.guan on 2017/10/17
 */
public class XiaoYaConstants {
    private static Map<String, String> urlMaps;

    static {
        urlMaps = new HashMap<String, String>();
        urlMaps.put(new KoubeiMarketingCampaignActivityQueryRequest().getApiMethodName(), "/gateway/actives/query");//活动查询
        urlMaps.put(new KoubeiMarketingCampaignActivityCreateRequest().getApiMethodName(), "/gateway/actives/create");////阿里商户ID创建活动
        urlMaps.put(new KoubeiMarketingCampaignActivityModifyRequest().getApiMethodName(), "/gateway/actives/update");//活动修改
        urlMaps.put(new KoubeiMarketingCampaignActivityBatchqueryRequest().getApiMethodName(), "/gateway/actives/list");//活动列表活动查询
        urlMaps.put(new KoubeiMarketingCampaignActivityOfflineRequest().getApiMethodName(), "/gateway/actives/offline");//活动下架
        urlMaps.put(new KoubeiMarketingCampaignBenefitSendRequest().getApiMethodName(), "/gateway/coupons/benefit");//口碑权益发放接口
        urlMaps.put(new AlipayOfflineMaterialImageUploadRequest().getApiMethodName(), "/gateway/file/upload");//上传口碑图片
        urlMaps.put(new AlipayOpenAuthTokenAppRequest().getApiMethodName(), "/gateway/token/query");//换取应用授权令牌
        urlMaps.put(new AlipaySystemOauthTokenRequest().getApiMethodName(), "/gateway/token/code");//auth_code换取access_token与user_id
        urlMaps.put(new AlipayUserInfoShareRequest().getApiMethodName(), "/gateway/token/user");//查询用户信息
        urlMaps.put(new AlipayOfflineProviderShopactionRecordRequest().getApiMethodName(),"/gateway/provider/shopAction");//回传的商户操作行为信息调用接口

        urlMaps.put(new KoubeiMarketingDataTradeHabbitQueryRequest().getApiMethodName(), "");//商户会员交易习惯查询接口
        urlMaps.put(new AlipayOfflineMarketShopQuerydetailRequest().getApiMethodName(), "");//查询商户的门店编号列表
        urlMaps.put(new AlipayOfflineMarketShopBatchqueryRequest().getApiMethodName(), "");//查询商户的门店编号列表
        urlMaps.put(new AlipayOfflineMarketShopCreateRequest().getApiMethodName(), "");//创建门店
        urlMaps.put(new AlipayOfflineMarketApplyorderBatchqueryRequest().getApiMethodName(), "");//业务流水批量查询接口
        urlMaps.put(new AlipayOfflineMarketShopModifyRequest().getApiMethodName(), "");//门店修改
        urlMaps.put(new AlipayOfflineMarketShopDiscountQueryRequest().getApiMethodName(), "");//查询门店优惠
        urlMaps.put(new AlipayOfflineMarketShopSummaryBatchqueryRequest().getApiMethodName(), "");//门店摘要信息批量查询
        urlMaps.put(new KoubeiMarketingDataIntelligentEffectQueryRequest().getApiMethodName(), "");//智能营销效果预测
        urlMaps.put(new KoubeiMarketingCampaignIntelligentPromoCreateRequest().getApiMethodName(), "");//智能营销活动创建
        urlMaps.put(new KoubeiMarketingCampaignIntelligentPromoDeleteRequest().getApiMethodName(), "");//智能营销活动下架
        urlMaps.put(new KoubeiMarketingCampaignIntelligentPromoConsultRequest().getApiMethodName(), "");//智能营销活动默认值获取
        urlMaps.put(new KoubeiMarketingCampaignIntelligentPromoQueryRequest().getApiMethodName(), "");//智能营销活动详情查询
        urlMaps.put(new KoubeiMarketingCampaignIntelligentPromoModifyRequest().getApiMethodName(), "");//智能营销方案修改
        urlMaps.put(new KoubeiMarketingCampaignIntelligentPromoBatchqueryRequest().getApiMethodName(), "");//智能营销活动批量查询
        urlMaps.put(new KoubeiMarketingCampaignIntelligentShopConsultRequest().getApiMethodName(), "");//智能营销活动门店咨询接口
        urlMaps.put(new AlipayMarketingCardOpenRequest().getApiMethodName(), "");//会员卡开卡接口
        urlMaps.put(new AlipayMarketingCardQueryRequest().getApiMethodName(), "");//会员卡查询接口
        urlMaps.put(new AlipayMarketingCardUpdateRequest().getApiMethodName(), "");//会员卡修改接口
        urlMaps.put(new AlipayMarketingCardDeleteRequest().getApiMethodName(), "");//会员卡删除接口
        urlMaps.put(new AlipayMarketingCardConsumeSyncRequest().getApiMethodName(), "");//会员卡消费记录同步接口
        urlMaps.put(new AlipayMarketingCardFormtemplateSetRequest().getApiMethodName(), "");//会员卡开卡表单模板配置
        urlMaps.put(new AlipayMarketingCardActivateformQueryRequest().getApiMethodName(), "");//查询用户提交的会员卡表单信息
        urlMaps.put(new AlipayMarketingCardActivateurlApplyRequest().getApiMethodName(), "");//获取会员卡领卡投放链接
        urlMaps.put(new AlipayMarketingCardBenefitCreateRequest().getApiMethodName(), "");//会员卡模板权益创建接口
        urlMaps.put(new AlipayMarketingCardBenefitQueryRequest().getApiMethodName(), "");//会员卡模板权益查询接口
        urlMaps.put(new AlipayMarketingCardBenefitModifyRequest().getApiMethodName(), "");//会员卡模板权益修改接口
        urlMaps.put(new AlipayMarketingCardBenefitDeleteRequest().getApiMethodName(), "");//会员卡模板权益删除接口
        urlMaps.put(new AlipayMarketingCardTemplateCreateRequest().getApiMethodName(), "");//口碑会员卡模板创建
        urlMaps.put(new AlipayMarketingCardTemplateModifyRequest().getApiMethodName(), "");//口碑会员卡模板修改
        urlMaps.put(new AlipayMarketingCardTemplateQueryRequest().getApiMethodName(), "");//口碑会员卡模板查询
        urlMaps.put(new KoubeiAdvertCommissionBillQueryRequest().getApiMethodName(), "");//分佣账单接口
        urlMaps.put(new KoubeiAdvertCommissionMissionCreateRequest().getApiMethodName(), "");//创建分佣
        urlMaps.put(new AlipayOfflineMarketShopCategoryQueryRequest().getApiMethodName(), "");//门店类目配置service查询接口
        urlMaps.put(new KoubeiAdvertCommissionMissionQueryRequest().getApiMethodName(), "");//根据ID类型和ID列表查询分佣
        urlMaps.put(new KoubeiAdvertCommissionMissionPromoteRequest().getApiMethodName(), "");//分佣领取
        urlMaps.put(new KoubeiAdvertCommissionAdvertPurchaseRequest().getApiMethodName(), "");//发券接口
        urlMaps.put(new KoubeiMarketingCampaignCrowdCreateRequest().getApiMethodName(), "");//创建人群标签组接口
        urlMaps.put(new KoubeiMarketingCampaignCrowdModifyRequest().getApiMethodName(), "");//更新人群标签组接口
        urlMaps.put(new KoubeiMarketingCampaignCrowdCountRequest().getApiMethodName(), "");//查询人群分组数目
        urlMaps.put(new KoubeiMarketingCampaignCrowdDeleteRequest().getApiMethodName(), "");//删除人群标签组接口
        urlMaps.put(new KoubeiMarketingCampaignCrowdDetailQueryRequest().getApiMethodName(), "");//查询人群标签组信息接口
        urlMaps.put(new KoubeiMarketingCampaignCrowdBatchqueryRequest().getApiMethodName(), "");//查询人群标签组规则详情信息接口
        urlMaps.put(new KoubeiMarketingDataAlisisReportBatchqueryRequest().getApiMethodName(), "");//   报表列表查询
        urlMaps.put(new KoubeiMarketingDataAlisisReportQueryRequest().getApiMethodName(), "");//
        urlMaps.put(new KoubeiMarketingDataIndicatorQueryRequest().getApiMethodName(), "");//口碑商户经营数据查询接口
        urlMaps.put(new KoubeiMarketingDataIntelligentIndicatorQueryRequest().getApiMethodName(), "");//莫干山口碑商户经营数据查询接口
        urlMaps.put(new KoubeiMarketingDataActivityReportQueryRequest().getApiMethodName(), "");//莫干山口碑商户经营数据查询接口
        urlMaps.put(new AlipayOfflineMarketShopCategoryQueryRequest().getApiMethodName(), "");//根据门店类目配置查询
        urlMaps.put(new KoubeiMarketingDataDishdiagnosetypeBatchqueryRequest().getApiMethodName(), "");//菜品类型查询Service接口
        urlMaps.put(new AlipayOpenPublicAccountCreateRequest().getApiMethodName(), "");//添加绑定商户会员号接口
        urlMaps.put(new AlipayOpenPublicAccountDeleteRequest().getApiMethodName(), "");//解除绑定商户会员号接口
        urlMaps.put(new AlipayOpenPublicAccountQueryRequest().getApiMethodName(), "");//查询绑定商户会员号接口
        urlMaps.put(new AlipayOpenPublicAccountResetRequest().getApiMethodName(), "");//重新设置绑定商家会员号
        urlMaps.put(new AlipayOpenPublicMenuCreateRequest().getApiMethodName(), "");//默认菜单创建接口接口
        urlMaps.put(new AlipayOpenPublicMenuModifyRequest().getApiMethodName(), "");//默认菜单更新接口
        urlMaps.put(new AlipayOpenPublicMenuBatchqueryRequest().getApiMethodName(), "");//菜单列表查询接口
        urlMaps.put(new AlipayOpenPublicTemplateMessageGetRequest().getApiMethodName(), "");//消息模板领取接口
        urlMaps.put(new AlipayOpenPublicQrcodeCreateRequest().getApiMethodName(), "");//带参推广二维码接口
        urlMaps.put(new AlipayOpenPublicContactFollowBatchqueryRequest().getApiMethodName(), "");//查询服务窗联系人关注列表
        urlMaps.put(new AlipayOpenPublicFollowBatchqueryRequest().getApiMethodName(), "");//查询关注用户列表
        urlMaps.put(new AlipayOpenPublicTemplateMessageIndustryModifyRequest().getApiMethodName(), "");//修改模板行业
        urlMaps.put(new AlipayOpenPublicMessageSingleSendRequest().getApiMethodName(), "");//单发模板消息
        urlMaps.put(new AlipayOpenPublicGisQueryRequest().getApiMethodName(), "");//查询用户的地理位置
        urlMaps.put(new KoubeiMarketingToolPointsQueryRequest().getApiMethodName(), "");//查询用户集点
        urlMaps.put(new KoubeiMarketingToolPointsUpdateRequest().getApiMethodName(), "");//更新集点卡上的集点
        urlMaps.put(new KoubeiMarketingToolPrizesendAuthRequest().getApiMethodName(), "");//发券授权返回token授权商户给用户发奖
        urlMaps.put(new AlipayOpenServicemarketOrderQueryRequest().getApiMethodName(), "");//服务订单订购查询接口
        urlMaps.put(new KoubeiMarketingDataSmartmanagementDiagnoseRequest().getApiMethodName(), "");//商户诊断接口
        urlMaps.put(new KoubeiMarketingDataSmartactivityConfigRequest().getApiMethodName(), "");//商户获取智能活动配置方案接口
        urlMaps.put(new KoubeiMarketingDataSmartactivityForecastRequest().getApiMethodName(), "");//商户获取智能活动效果预测接口
        urlMaps.put(new AlipayTradeCreateRequest().getApiMethodName(), "");//统一收单交易创建接口
        urlMaps.put(new AlipayTradeQueryRequest().getApiMethodName(), "");//统一收单线下交易查询
        urlMaps.put(new AlipayUserInfoAuthRequest().getApiMethodName(), "");//授权登陆
        urlMaps.put(new AlipayUserAccountUseridBatchqueryRequest().getApiMethodName(), "");//根据用户手机号查询用户信息
        urlMaps.put(new AlipayOpenAuthTokenAppQueryRequest().getApiMethodName(), "");//应用授权查询
        urlMaps.put(new KoubeiAdvertCommissionRoleQueryRequest().getApiMethodName(), "");//用户口碑客角色查询
    }

    public static Map<String, String> getUrlMap() {
        return urlMaps;
    }

    public static void main(String[] args) {
        String res = urlMaps.get("koubei.marketing.campaign.activity.query");
        System.out.println(res);
    }
}
