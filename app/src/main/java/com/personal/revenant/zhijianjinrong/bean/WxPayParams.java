package com.personal.revenant.zhijianjinrong.bean;

/**
 * @author yjz
 * @date created at 2018/10/19 下午4:19
 */
public class WxPayParams {


    /**
     * prepayId : wx19161723276761f4485331b22077585774
     * sign : FF9CF5107008C5A1BD034169A4D92D6B
     * appId : wxb7736d72184c6833
     * timeStamp : 1539937014
     * nonceStr : 802a5fd4efb36391dfa8f1991fd0f849
     * packages : Sign=WXPay
     * partnerId : 1516491691
     */

    private String prepayId;
    private String sign;
    private String appId;
    private String timeStamp;
    private String nonceStr;
    private String packages;
    private String partnerId;

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getPackages() {
        return packages;
    }

    public void setPackages(String packages) {
        this.packages = packages;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }
}
