package com.alipay.api.request;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.domain.KoubeiMarketingCampaignIntelligentPromoBatchqueryModel;
import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.KoubeiMarketingCampaignIntelligentPromoBatchqueryResponse;
import com.alipay.api.AlipayObject;
import io.swagger.annotations.*;

/**
 * ALIPAY API: koubei.marketing.campaign.intelligent.promo.batchquery request
 * 
 * @author auto create
 * @since 1.0, 2017-09-15 17:52:50
 */@ApiModel(description = " ALIPAY API: koubei.marketing.campaign.intelligent.promo.batchquery request")
public class KoubeiMarketingCampaignIntelligentPromoBatchqueryRequest implements AlipayRequest<KoubeiMarketingCampaignIntelligentPromoBatchqueryResponse> {

	@JSONField(name = "udf_params", alternateNames = "udfParams")
	@ApiModelProperty(notes = "")
	private AlipayHashMap udfParams; // add user-defined text parameters
	@JSONField(name = "api_version", alternateNames = "apiVersion")
	@ApiModelProperty(notes = "")
	private String apiVersion="1.0";

	/** 
	* 智能营销方案批量查询
	 */@JSONField(name = "biz_content", alternateNames = "bizContent")@ApiModelProperty(notes = " 智能营销方案批量查询")
	private String bizContent;

	public void setBizContent(String bizContent) {
		this.bizContent = bizContent;
	}
	public String getBizContent() {
		return this.bizContent;
	}

	@JSONField(name = "terminal_type", alternateNames = "terminalType")
	@ApiModelProperty(notes = "")
	private String terminalType;
	@JSONField(name = "terminal_info", alternateNames = "terminalInfo")
	@ApiModelProperty(notes = "")
	private String terminalInfo;
	@JSONField(name = "prod_code", alternateNames = "prodCode")
	@ApiModelProperty(notes = "")
	private String prodCode;
	@JSONField(name = "notify_url", alternateNames = "notifyUrl")
	@ApiModelProperty(notes = "")
	private String notifyUrl;
	@JSONField(name = "return_url", alternateNames = "returnUrl")
	@ApiModelProperty(notes = "")
	private String returnUrl;
	@JSONField(name = "need_encrypt", alternateNames = "needEncrypt")
	@ApiModelProperty(notes = "")
	private boolean needEncrypt=false;
	@JSONField(name = "biz_model", alternateNames = "bizModel")
	@ApiModelProperty(notes = "")
	private AlipayObject bizModel=null;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}

    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }	

	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	public String getProdCode() {
		return this.prodCode; 
	}

	public String getApiMethodName() {
		return "koubei.marketing.campaign.intelligent.promo.batchquery";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_content", this.bizContent);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<KoubeiMarketingCampaignIntelligentPromoBatchqueryResponse> getResponseClass() {
		return KoubeiMarketingCampaignIntelligentPromoBatchqueryResponse.class;
	}
	

    public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}
