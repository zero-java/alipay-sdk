package com.alipay.api.response;

import com.alibaba.fastjson.JSON;
import com.alipay.api.domain.KoubeiMarketingDataIndicatorQueryModel;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

import java.util.List;

/**
 * ALIPAY API: koubei.marketing.data.intelligent.indicator.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-28 16:29:57
 */
@ApiModel(description = " 方案效果数据结果")
public class KoubeiMarketingDataIntelligentIndicatorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1595379638323515732L;

	/** 
	 * JSON格式数组，每个对象表示一个门店某个具体日期的指标信息，KEY为指标代码，VALUE为该指标对应的值,各biz_type入参以及返回值的详细信息参见<a href="https://doc.open.alipay.com/docs/doc.htm?spm=a219a.7629140.0.0.1AZ2QH&treeId=193&articleId=106028&docType=1">快速接入</a>
	 */
	@ApiModelProperty(notes = " JSON格式数组，每个对象表示一个门店某个具体日期的指标信息，KEY为指标代码，VALUE为该指标对应的值")
	@ApiField("indicator_infos")
	private String indicatorInfos;

	public void setIndicatorInfos(String indicatorInfos) {
		this.indicatorInfos = indicatorInfos;
	}
	/**
	 * 使用方法 可直接用返回类型的对应数据接收 接受类型 为KoubeiMarketingDataIndicatorQueryModel下的
	 * 内部类
	 * 例如
	 * 	KoubeiMarketingDataIndicatorQueryResponse.MemberQueryModel mqm = new KoubeiMarketingDataIndicatorQueryResponse().getIndicatorInfos()
	 * 返回值为对应class的list
	 * @param bizType
	 * @param <T>
	 * @return	List<T>
	 */
	public  <T> List<T> getIndicatorInfos(KoubeiMarketingDataIndicatorQueryModel.BizType bizType) {
		return (List<T>) JSON.parseArray(this.indicatorInfos,bizType.getClazz());

	}

}
