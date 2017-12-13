package com.alipay.api.response;

import com.alipay.api.fastjson.annotation.JSONString;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

import java.io.Serializable;
import java.util.List;
import java.util.StringTokenizer;

/**
 * ALIPAY API: koubei.marketing.campaign.crowd.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2017-02-15 16:30:54
 */
public class KoubeiMarketingCampaignCrowdBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1173185832528182521L;

	public List<Crowd> getCrowdGroupSets() {
		return crowdGroupSets;
	}

	public void setCrowdGroupSets(List<Crowd> crowdGroupSets) {
		this.crowdGroupSets = crowdGroupSets;
	}

	/**
	 * 人群组的基本信息，id表示人群分组的ID，name表示人群分组的名称，status表示人群分组的状态，目前只有status=ENABLE有效状态才返回，已经删除的为DISABLE的不返回
	 */
	@ApiField("crowd_group_sets")
	@JSONString
	private List<Crowd> crowdGroupSets;

	/**
	 * 返回接记录的总条数
	 */
	@ApiField("total_number")
	private String totalNumber;



	public void setTotalNumber(String totalNumber) {
		this.totalNumber = totalNumber;
	}
	public String getTotalNumber( ) {
		return this.totalNumber;
	}

	public static class Crowd implements Serializable{
		private  String name;
		private  String id;

		public String getName() {
			return name;
		}

		public String getId() {
			return id;
		}

		public String getStatus() {
			return status;
		}

		private  String status;

		public void setName(String name) {
			this.name = name;
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setStatus(String status) {
			this.status = status;
		}



	}
}
