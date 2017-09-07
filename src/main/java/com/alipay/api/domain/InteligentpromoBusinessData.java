package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智能营销模板对应业务数据
 *
 * @author auto create
 * @since 1.0, 2017-09-06 10:43:11
 */
public class InteligentpromoBusinessData extends AlipayObject {

	private static final long serialVersionUID = 3646213623752651559L;

	/**
	 * 折扣率，仅当折扣券时有效
	 */
	@ApiField("discount")
	private Long discount;

	/**
	 * pid白名单列表
	 */
	@ApiListField("partner_ids")
	@ApiField("string")
	private List<String> partnerIds;

	/**
	 * 活动类型，CONSUME_SEND：消费送
	 */
	@ApiField("promo_type")
	private String promoType;

	/**
	 * 二级类目id
	 */
	@ApiField("second_category")
	private String secondCategory;

	/**
	 * 子模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 智能方案子名称
	 */
	@ApiField("template_name")
	private String templateName;

	/**
	 * 券有效期（天）
	 */
	@ApiField("voucher_effective_days")
	private Long voucherEffectiveDays;

	/**
	 * 券预算（数量）
	 */
	@ApiField("voucher_quantity_budget")
	private String voucherQuantityBudget;

	/**
	 * 券类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public Long getDiscount() {
		return this.discount;
	}
	public void setDiscount(Long discount) {
		this.discount = discount;
	}

	public List<String> getPartnerIds() {
		return this.partnerIds;
	}
	public void setPartnerIds(List<String> partnerIds) {
		this.partnerIds = partnerIds;
	}

	public String getPromoType() {
		return this.promoType;
	}
	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}

	public String getSecondCategory() {
		return this.secondCategory;
	}
	public void setSecondCategory(String secondCategory) {
		this.secondCategory = secondCategory;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public Long getVoucherEffectiveDays() {
		return this.voucherEffectiveDays;
	}
	public void setVoucherEffectiveDays(Long voucherEffectiveDays) {
		this.voucherEffectiveDays = voucherEffectiveDays;
	}

	public String getVoucherQuantityBudget() {
		return this.voucherQuantityBudget;
	}
	public void setVoucherQuantityBudget(String voucherQuantityBudget) {
		this.voucherQuantityBudget = voucherQuantityBudget;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
