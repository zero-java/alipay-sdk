package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板根节点
 *
 * @author auto create
 * @since 1.0, 2017-09-06 11:24:56
 */
public class InteligentpromoPlanRootTemplate extends AlipayObject {

	private static final long serialVersionUID = 6137625571733167937L;

	/**
	 * 子模板列表
	 */
	@ApiField("sub_templates")
	private InteligentpromoPlanTemplate subTemplates;

	/**
	 * 模板编号
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	public InteligentpromoPlanTemplate getSubTemplates() {
		return this.subTemplates;
	}
	public void setSubTemplates(InteligentpromoPlanTemplate subTemplates) {
		this.subTemplates = subTemplates;
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

}
