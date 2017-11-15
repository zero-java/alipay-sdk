package com.alipay.api.domain;

import com.alipay.api.AlipayObject;

import java.util.Date;

/**
 * Created by jason.guan on 2017/11/15
 */
public class YazuoApiAlert extends AlipayObject {
    private Long id;

    /**
     * 预警名称
     */
    private String alertName;

    /**
     * 通知人手机号码
     */
    private String mobile;

    /**
     * 通知人邮箱号码
     */
    private String email;

    /**
     * 钉钉机器人access_token
     */
    private String token;


    private Date createTime;


    private Date updateTime;

    /**
     * 使用状态 默认0开放，1锁定
     */
    private Short status;

    /**
     * 单个接口失败率
     */
    private Double failRate;

    /**
     * 单个接口失败次数
     */
    private Integer failCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlertName() {
        return alertName;
    }

    public void setAlertName(String alertName) {
        this.alertName = alertName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Double getFailRate() {
        return failRate;
    }

    public void setFailRate(Double failRate) {
        this.failRate = failRate;
    }

    public Integer getFailCount() {
        return failCount;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }
}
