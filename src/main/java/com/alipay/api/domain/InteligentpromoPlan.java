package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销方案模型
 *
 * @author auto create
 * @since 1.0, 2017-09-06 11:24:44
 */
public class InteligentpromoPlan extends AlipayObject {

	private static final long serialVersionUID = 5383556697537734242L;

	/**
	 * 方案ID，创建时不用填，仅在查询时返回
	 */
	@ApiField("id")
	private String id;

	/**
	 * 方案的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 方案类型，是平台推荐的（PLATFORM）还是商户自己设置的（MERCHANT）
	 */
	@ApiField("type")
	private String type;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
