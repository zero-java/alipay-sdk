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
        //活动相关  /actives
        urlMaps.put(new KoubeiMarketingCampaignActivityQueryRequest().getApiMethodName(), "/gateway/actives/query");//活动查询  已实现
        urlMaps.put(new KoubeiMarketingCampaignActivityCreateRequest().getApiMethodName(), "/gateway/actives/create");////阿里商户ID创建活动  已实现
        urlMaps.put(new KoubeiMarketingCampaignActivityModifyRequest().getApiMethodName(), "/gateway/actives/update");//活动修改  已实现
        urlMaps.put(new KoubeiMarketingCampaignActivityBatchqueryRequest().getApiMethodName(), "/gateway/actives/list");//活动列表活动查询 已实现
        urlMaps.put(new KoubeiMarketingCampaignActivityOfflineRequest().getApiMethodName(), "/gateway/actives/offline");//活动下架  已实现
        urlMaps.put(new KoubeiMarketingCampaignBenefitSendRequest().getApiMethodName(), "/gateway/coupons/benefit");//口碑权益发放接口 已实现
        urlMaps.put(new AlipayOfflineMaterialImageUploadRequest().getApiMethodName(), "/gateway/file/upload");//上传口碑图片  已实现
        //智能营销活动  /intelligent
        urlMaps.put(new KoubeiMarketingCampaignIntelligentPromoCreateRequest().getApiMethodName(), "/gateway/intelligent/create");//智能营销活动创建
        urlMaps.put(new KoubeiMarketingCampaignIntelligentPromoDeleteRequest().getApiMethodName(), "/gateway/intelligent/delete");//智能营销活动下架
        urlMaps.put(new KoubeiMarketingCampaignIntelligentPromoConsultRequest().getApiMethodName(), "/gateway/intelligent/consult");//智能营销活动默认值获取
        urlMaps.put(new KoubeiMarketingCampaignIntelligentPromoQueryRequest().getApiMethodName(), "/gateway/intelligent/query");//智能营销活动详情查询
        urlMaps.put(new KoubeiMarketingCampaignIntelligentPromoModifyRequest().getApiMethodName(), "/gateway/intelligent/modify");//智能营销方案修改
        urlMaps.put(new KoubeiMarketingCampaignIntelligentPromoBatchqueryRequest().getApiMethodName(), "/gateway/intelligent/batchquery");//智能营销活动批量查询
        urlMaps.put(new KoubeiMarketingCampaignIntelligentShopConsultRequest().getApiMethodName(), "/gateway/intelligent/shopconsult");//智能营销活动门店咨询接口
        //分佣  /commission
        urlMaps.put(new KoubeiAdvertCommissionRoleQueryRequest().getApiMethodName(), "/gateway/commission/rolequery");//用户口碑客角色查询
        urlMaps.put(new KoubeiAdvertCommissionBillQueryRequest().getApiMethodName(), "/gateway/commission/billquery");//分佣账单接口
        urlMaps.put(new KoubeiAdvertCommissionMissionCreateRequest().getApiMethodName(), "/gateway/commission/create");//创建分佣
        urlMaps.put(new KoubeiAdvertCommissionMissionQueryRequest().getApiMethodName(), "/gateway/commission/query");//根据ID类型和ID列表查询分佣
        urlMaps.put(new KoubeiAdvertCommissionMissionPromoteRequest().getApiMethodName(), "/gateway/commission/promote");//分佣领取
        urlMaps.put(new KoubeiAdvertCommissionAdvertPurchaseRequest().getApiMethodName(), "/gateway/commission/purchase");//发券接口
        //创建人群  /crowd
        urlMaps.put(new KoubeiMarketingCampaignCrowdCreateRequest().getApiMethodName(), "/gateway/crowd/create");//创建人群标签组接口
        urlMaps.put(new KoubeiMarketingCampaignCrowdModifyRequest().getApiMethodName(), "/gateway/crowd/modify");//更新人群标签组接口
        urlMaps.put(new KoubeiMarketingCampaignCrowdCountRequest().getApiMethodName(), "/gateway/crowd/count");//查询人群分组数目
        urlMaps.put(new KoubeiMarketingCampaignCrowdDeleteRequest().getApiMethodName(), "/gateway/crowd/delete");//删除人群标签组接口
        urlMaps.put(new KoubeiMarketingCampaignCrowdDetailQueryRequest().getApiMethodName(), "/gateway/crowd/detailquery");//查询人群标签组信息接口
        urlMaps.put(new KoubeiMarketingCampaignCrowdBatchqueryRequest().getApiMethodName(), "/gateway/crowd/batchquery");//查询人群标签组规则详情信息接口
        //经营数据  /data
        urlMaps.put(new KoubeiMarketingDataIntelligentEffectQueryRequest().getApiMethodName(), "/gateway/data/intelligent/effectquery");//智能营销效果预测
        urlMaps.put(new KoubeiMarketingDataIntelligentIndicatorQueryRequest().getApiMethodName(), "/gateway/data/intelligent/indicatorquery");//莫干山口碑商户经营数据查询接口
        urlMaps.put(new KoubeiMarketingDataTradeHabbitQueryRequest().getApiMethodName(), "/gateway/data/habbitquery");//商户会员交易习惯查询接口
        urlMaps.put(new KoubeiMarketingDataAlisisReportBatchqueryRequest().getApiMethodName(), "/gateway/data/alisis/batchquery");//   报表列表查询
        urlMaps.put(new KoubeiMarketingDataAlisisReportQueryRequest().getApiMethodName(), "/gateway/data/alisis/reportQuery");//
        urlMaps.put(new KoubeiMarketingDataIndicatorQueryRequest().getApiMethodName(), "/gateway/data/indicatorQuery");//口碑商户经营数据查询接口
        urlMaps.put(new KoubeiMarketingDataActivityReportQueryRequest().getApiMethodName(), "/gateway/data/activityReportQuery");//莫干山口碑商户经营数据查询接口
        urlMaps.put(new KoubeiMarketingDataDishdiagnosetypeBatchqueryRequest().getApiMethodName(), "/gateway/data/dishdiagnosetype/batchquery");//菜品类型查询Service接口
        urlMaps.put(new KoubeiMarketingDataSmartmanagementDiagnoseRequest().getApiMethodName(), "/gateway/data/managementdiagnose");//商户诊断接口
        urlMaps.put(new KoubeiMarketingDataSmartactivityConfigRequest().getApiMethodName(), "/gateway/data/activityconfig");//商户获取智能活动配置方案接口
        urlMaps.put(new KoubeiMarketingDataSmartactivityForecastRequest().getApiMethodName(), "/gateway/data/activityforecast");//商户获取智能活动效果预测接口
        //集点卡  /points
        urlMaps.put(new KoubeiMarketingToolPointsQueryRequest().getApiMethodName(), "/gateway/points/query");//查询用户集点
        urlMaps.put(new KoubeiMarketingToolPointsUpdateRequest().getApiMethodName(), "/gateway/points/update");//更新集点卡上的集点
        urlMaps.put(new KoubeiMarketingToolPrizesendAuthRequest().getApiMethodName(), "/gateway/points/prizeauth");//发券授权返回token授权商户给用户发奖
        //门店信息  /store
        urlMaps.put(new AlipayOfflineMarketShopCategoryQueryRequest().getApiMethodName(), "/gateway/store/categoryquery");//根据门店类目配置查询
        urlMaps.put(new AlipayOfflineMarketShopQuerydetailRequest().getApiMethodName(), "/gateway/store/querydetail");//查询单个门店的详细信息
        urlMaps.put(new AlipayOfflineMarketShopBatchqueryRequest().getApiMethodName(), "/gateway/store/batchquery");//查询商户的门店编号列表
        urlMaps.put(new AlipayOfflineMarketShopCreateRequest().getApiMethodName(), "/gateway/store/create");//在口碑平台帮助商户创建门店信息
        urlMaps.put(new AlipayOfflineMarketShopModifyRequest().getApiMethodName(), "/gateway/store/modify");//在口碑平台帮助商户修改门店信息
        urlMaps.put(new AlipayOfflineMarketShopDiscountQueryRequest().getApiMethodName(), "/gateway/store/discountQuery");//查询门店优惠
        urlMaps.put(new AlipayOfflineMarketShopSummaryBatchqueryRequest().getApiMethodName(), "/gateway/store/summaryBatchquery");//门店摘要信息批量查询接口
        urlMaps.put(new AlipayOfflineMarketApplyorderBatchqueryRequest().getApiMethodName(), "/gateway/store/orderBatchquery");//分页查询Leads、门店、商品相关操作流水信息
        //会员卡  /card
        urlMaps.put(new AlipayMarketingCardOpenRequest().getApiMethodName(), "/gateway/card/open");//会员卡开卡接口
        urlMaps.put(new AlipayMarketingCardQueryRequest().getApiMethodName(), "/gateway/card/query");//会员卡查询接口
        urlMaps.put(new AlipayMarketingCardUpdateRequest().getApiMethodName(), "/gateway/card/update");//会员卡修改接口
        urlMaps.put(new AlipayMarketingCardDeleteRequest().getApiMethodName(), "/gateway/card/delete");//会员卡删除接口
        urlMaps.put(new AlipayMarketingCardConsumeSyncRequest().getApiMethodName(), "/gateway/card/consumesync");//会员卡消费记录同步接口
        urlMaps.put(new AlipayMarketingCardFormtemplateSetRequest().getApiMethodName(), "/gateway/card/formtemplate");//会员卡开卡表单模板配置
        urlMaps.put(new AlipayMarketingCardActivateformQueryRequest().getApiMethodName(), "/gateway/card/formquery");//查询用户提交的会员卡表单信息
        urlMaps.put(new AlipayMarketingCardActivateurlApplyRequest().getApiMethodName(), "/gateway/card/urlapply");//获取会员卡领卡投放链接
        urlMaps.put(new AlipayMarketingCardBenefitCreateRequest().getApiMethodName(), "/gateway/card/benefitcreate");//会员卡模板权益创建接口
        urlMaps.put(new AlipayMarketingCardBenefitQueryRequest().getApiMethodName(), "/gateway/card/benefitquery");//会员卡模板权益查询接口
        urlMaps.put(new AlipayMarketingCardBenefitModifyRequest().getApiMethodName(), "/gateway/card/benefitmodify");//会员卡模板权益修改接口
        urlMaps.put(new AlipayMarketingCardBenefitDeleteRequest().getApiMethodName(), "/gateway/card/benefitdelete");//会员卡模板权益删除接口
        urlMaps.put(new AlipayMarketingCardTemplateCreateRequest().getApiMethodName(), "/gateway/card/templatecreate");//口碑会员卡模板创建
        urlMaps.put(new AlipayMarketingCardTemplateModifyRequest().getApiMethodName(), "/gateway/card/templatemodify");//口碑会员卡模板修改
        urlMaps.put(new AlipayMarketingCardTemplateQueryRequest().getApiMethodName(), "/gateway/card/templatequery");//口碑会员卡模板查询
        //会员号  /publicaccount
        urlMaps.put(new AlipayOpenPublicAccountCreateRequest().getApiMethodName(), "/gateway/publicaccount/create");//添加绑定商户会员号接口
        urlMaps.put(new AlipayOpenPublicAccountDeleteRequest().getApiMethodName(), "/gateway/publicaccount/delete");//解除绑定商户会员号接口
        urlMaps.put(new AlipayOpenPublicAccountQueryRequest().getApiMethodName(), "/gateway/publicaccount/query");//查询绑定商户会员号接口
        urlMaps.put(new AlipayOpenPublicAccountResetRequest().getApiMethodName(), "/gateway/publicaccount/reset");//重新设置绑定商家会员号
        //菜单  /publicmenu
        urlMaps.put(new AlipayOpenPublicMenuCreateRequest().getApiMethodName(), "/gateway/publicmenu/create");//默认菜单创建接口接口
        urlMaps.put(new AlipayOpenPublicMenuModifyRequest().getApiMethodName(), "/gateway/publicmenu/modify");//默认菜单更新接口
        urlMaps.put(new AlipayOpenPublicMenuBatchqueryRequest().getApiMethodName(), "/gateway/publicmenu/batchquery");//菜单列表查询接口
        //服务窗  /public
        urlMaps.put(new AlipayOpenPublicTemplateMessageGetRequest().getApiMethodName(), "/gateway/public/templatemessage");//消息模板领取接口
        urlMaps.put(new AlipayOpenPublicQrcodeCreateRequest().getApiMethodName(), "/gateway/public/qrcodecreate");//带参推广二维码接口
        urlMaps.put(new AlipayOpenPublicContactFollowBatchqueryRequest().getApiMethodName(), "/gateway/public/contacbatchquery");//查询服务窗联系人关注列表
        urlMaps.put(new AlipayOpenPublicFollowBatchqueryRequest().getApiMethodName(), "/gateway/public/followbatchquery");//查询关注用户列表
        urlMaps.put(new AlipayOpenPublicTemplateMessageIndustryModifyRequest().getApiMethodName(), "/gateway/public/templatemodify");//修改模板行业
        urlMaps.put(new AlipayOpenPublicMessageSingleSendRequest().getApiMethodName(), "/gateway/public/messagesend");//单发模板消息
        urlMaps.put(new AlipayOpenPublicGisQueryRequest().getApiMethodName(), "/gateway/public/gisquery");//查询用户的地理位置
        urlMaps.put(new AlipayOpenServicemarketOrderQueryRequest().getApiMethodName(), "/gateway/public/orderquery");//服务订单订购查询接口
        //统一收单
        urlMaps.put(new AlipayTradeCreateRequest().getApiMethodName(), "/gateway/trades/create");//统一收单交易创建接口
        urlMaps.put(new AlipayTradeQueryRequest().getApiMethodName(), "/gateway/trades/query");//统一收单线下交易查询
        //授权
        urlMaps.put(new AlipayUserInfoAuthRequest().getApiMethodName(), "/gateway/token/userauth");//授权登陆
        urlMaps.put(new AlipayUserAccountUseridBatchqueryRequest().getApiMethodName(), "/gateway/token/useridbatch");//根据用户手机号查询用户信息
        urlMaps.put(new AlipayUserInfoShareRequest().getApiMethodName(), "/gateway/token/user");//查询用户信息  已实现
        urlMaps.put(new AlipayUserUserinfoShareRequest().getApiMethodName(),"/gateway/token/userinfo");//查询用户信息老接口
        urlMaps.put(new AlipayOpenAuthTokenAppQueryRequest().getApiMethodName(), "/gateway/token/appquery");//应用授权查询
        urlMaps.put(new AlipayOpenAuthTokenAppRequest().getApiMethodName(), "/gateway/token/query");//换取应用授权令牌  已实现
        urlMaps.put(new AlipaySystemOauthTokenRequest().getApiMethodName(), "/gateway/token/code");//auth_code换取access_token与user_id  已实现
        urlMaps.put(new AlipayOfflineProviderShopactionRecordRequest().getApiMethodName(),"/gateway/provider/shopAction");//回传的商户操作行为信息调用接口  已实现

    }

    public static Map<String, String> getUrlMap() {
        return urlMaps;
    }

    public static void main(String[] args) {
        String res = urlMaps.get("koubei.marketing.campaign.activity.query");
        System.out.println(res);
    }
}
