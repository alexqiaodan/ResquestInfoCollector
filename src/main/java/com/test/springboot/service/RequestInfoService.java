package com.test.springboot.service;

import com.test.springboot.entity.RequestInfo;
import com.test.springboot.mapper.RequestInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RequestInfoService {

    @Autowired
    RequestInfoMapper requestInfoMapper;

    public Integer insert(String deviceID, String user, String clientIp, String hostIp, String host, String requestUrl, String responseCode, int timeCost, String curl, Long uploadTime, Long createTime){
        return requestInfoMapper.insert(deviceID, user, clientIp, hostIp, host, requestUrl, responseCode, timeCost, curl, uploadTime, createTime);
    };

    public List<RequestInfo> queryByContidions(String deviceID, String user, String clientIp, String hostIp, String host, String requestUrl, String responseCode, int timeCost, String curl, Long uploadTimeStart, Long uploadTimeEnd,int limit, int offset){
        return  requestInfoMapper.queryByContidions(deviceID, user, clientIp, hostIp, host, requestUrl, responseCode, timeCost, curl, uploadTimeStart, uploadTimeEnd,limit,offset);
    };


    public int selectCount(String deviceID, String user, String clientIp, String hostIp, String host, String requestUrl, String responseCode, int timeCost, String curl, Long uploadTimeStart, Long uploadTimeEnd) {
        return requestInfoMapper.selectCount(deviceID, user, clientIp, hostIp, host, requestUrl, responseCode, timeCost, curl, uploadTimeStart, uploadTimeEnd);
    };
}
