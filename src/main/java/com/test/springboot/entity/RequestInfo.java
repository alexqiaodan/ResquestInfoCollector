package com.test.springboot.entity;

import java.io.Serializable;

public class RequestInfo implements Serializable {
    private Integer id;
    private String deviceID;
    private String user;
    private String clientIp;
    private String hostIp;
    private String host;
    private String requestUrl;
    private String responseCode;
    private Integer timeCost;
    private String curl;
    private Long uploadTime;
    private Long createTime;

    public RequestInfo() {
    }

    public RequestInfo(Integer id, String deviceID, String user, String clientIp, String hostIp, String host, String requestUrl, String responseCode, Integer timeCost, String curl, Long uploadTime, Long createTime) {
        this.id = id;
        this.deviceID = deviceID;
        this.user = user;
        this.clientIp = clientIp;
        this.hostIp = hostIp;
        this.host = host;
        this.requestUrl = requestUrl;
        this.responseCode = responseCode;
        this.timeCost = timeCost;
        this.curl = curl;
        this.uploadTime = uploadTime;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "RequestInfo{" +
                "id=" + id +
                ", deviceID='" + deviceID + '\'' +
                ", user='" + user + '\'' +
                ", clientIp='" + clientIp + '\'' +
                ", hostIp='" + hostIp + '\'' +
                ", host='" + host + '\'' +
                ", requestUrl='" + requestUrl + '\'' +
                ", responseCode='" + responseCode + '\'' +
                ", timeCost=" + timeCost +
                ", curl='" + curl + '\'' +
                ", uploadTime=" + uploadTime +
                ", createTime=" + createTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public Integer getTimeCost() {
        return timeCost;
    }

    public void setTimeCost(Integer timeCost) {
        this.timeCost = timeCost;
    }

    public String getCurl() {
        return curl;
    }

    public void setCurl(String curl) {
        this.curl = curl;
    }

    public Long getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Long uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
