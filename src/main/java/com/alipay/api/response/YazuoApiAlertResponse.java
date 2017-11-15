package com.alipay.api.response;

import com.alipay.api.AlipayResponse;
import com.alipay.api.domain.YazuoApiAlert;

import java.util.List;

/**
 * Created by jason.guan on 2017/11/15
 */
public class YazuoApiAlertResponse extends AlipayResponse {
    List<YazuoApiAlert> apiAlertList;

    public List<YazuoApiAlert> getApiAlertList() {
        return apiAlertList;
    }

    public void setApiAlertList(List<YazuoApiAlert> apiAlertList) {
        this.apiAlertList = apiAlertList;
    }
}
