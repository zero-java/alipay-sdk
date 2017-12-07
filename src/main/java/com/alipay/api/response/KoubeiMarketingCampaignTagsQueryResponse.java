package com.alipay.api.response;

import com.alibaba.fastjson.annotation.JSONField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * ALIPAY API: koubei.marketing.campaign.tags.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-29 14:52:06
 */
public class KoubeiMarketingCampaignTagsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6222154675693465811L;

	/** 
	 * 查询成功时返回人群标签信息查询失败时为空
code:表示标签code
name:表示标签名称
valueRange：表示标签的取值范围
value:表示标签具体取值
label:描述信息
标签相关的详细信息参见附件。<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/tags%26usecase.zip">标签信息</a>
	 */
	/**
	 * 标签码
	 */
	@ApiModelProperty(notes = " 标签码")
	private KoubeiMarketingCampaignTagsQueryResponse.Tags tags;


	/**
	 *
	 */
	public static class Tags implements Serializable {

		/**
		 * 标签列表
		 */
		@ApiModelProperty(notes = " 标签列表")
		private List<KoubeiMarketingCampaignTagsQueryResponse.Categories> categories;                //标签码
		/**
		 * 标签code
		 */
		@ApiModelProperty(notes = " 标签code")
		private List<String> dimensions;

		public List<KoubeiMarketingCampaignTagsQueryResponse.Categories> getCategories() {
			return categories;
		}

		public void setCategories(List<KoubeiMarketingCampaignTagsQueryResponse.Categories> categories) {
			this.categories = categories;
		}

		public List<String> getDimensions() {
			return dimensions;
		}

		public void setDimensions(List<String> dimensions) {
			this.dimensions = dimensions;
		}
	}


	public static class Categories implements Serializable {

		/**
		 * 标签码
		 */
		@ApiModelProperty(notes = " 标签码")
		private List<KoubeiMarketingCampaignTagsQueryResponse.TagsDetail> tags;                //标签码

		/**
		 * 标题
		 */
		@ApiModelProperty(notes = " 标题")
		private String title;

		public List<KoubeiMarketingCampaignTagsQueryResponse.TagsDetail> getTags() {
			return tags;
		}

		public void setTags(List<KoubeiMarketingCampaignTagsQueryResponse.TagsDetail> tags) {
			this.tags = tags;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
	}

	/**
	 * 标签详情
	 */
	public static class TagsDetail implements Serializable {
		/**
		 * 操作符
		 */
		@ApiModelProperty(notes = " 操作符")
		private String op;
		/**
		 * 标签码
		 */
		@JSONField(name = "tag_code", alternateNames = "tagCode")
		@ApiModelProperty(notes = " 标签码")
		private String tag_code;
		/**
		 * 控件符
		 */
		@ApiModelProperty(notes = " 控件符")
		private String control;
		/**
		 * 标签主题
		 */
		@ApiModelProperty(notes = " 标签主题")
		private String title;
		/**
		 * 信息
		 */
		@ApiModelProperty(notes = " 信息")
		private List<KoubeiMarketingCampaignTagsQueryResponse.Sources> sources;

		public String getOp() {
			return op;
		}

		public void setOp(String op) {
			this.op = op;
		}

		public String getTag_code() {
			return tag_code;
		}

		public void setTag_code(String tag_code) {
			this.tag_code = tag_code;
		}

		public String getControl() {
			return control;
		}

		public void setControl(String control) {
			this.control = control;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public List<KoubeiMarketingCampaignTagsQueryResponse.Sources> getSources() {
			return sources;
		}

		public void setSources(List<KoubeiMarketingCampaignTagsQueryResponse.Sources> sources) {
			this.sources = sources;
		}
	}
	public static class Sources implements Serializable {
		/**
		 * 标签
		 */
		@ApiModelProperty(notes = " 标签")
		private String label;
		/**
		 * 标签值
		 */
		@ApiModelProperty(notes = " 标签值")
		private String value;

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public KoubeiMarketingCampaignTagsQueryResponse.Tags getTags() {
		return tags;
	}

	public void setTags(KoubeiMarketingCampaignTagsQueryResponse.Tags tags) {
		this.tags = tags;
	}
}
