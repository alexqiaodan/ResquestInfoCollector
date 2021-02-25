package com.test.springboot.controller;

import com.netease.loft.core.common.helper.JsonResponse;
import com.test.springboot.entity.RequestInfo;
import com.test.springboot.service.RequestInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.commons.lang.StringUtils.length;


@RestController
@RequestMapping("/qabackend")
public class UploadController {

    @Autowired
    RequestInfoService requestInfoService;

    /*
    todo curl 字段换衣被截断，数据库中数据出现了截断情况。
     */
    @RequestMapping(value = "/uploadAbnormalInfo",method = RequestMethod.POST)
    public JsonResponse uploadAbnormalInfo(HttpServletResponse response,
                                     @RequestParam(value = "clientIP", required = true) String clientIP,
                                     @RequestParam(value = "user", required = true) String user,
                                     @RequestParam(value = "hostIP", required = true) String hostIP,
                                     @RequestParam(value = "host", required = true) String host,
                                     @RequestParam(value = "curl", required = true) String curl ,
                                     @RequestParam(value = "responseCode", required = true) String responseCode,
                                     @RequestParam(value = "timeTake", required = true) int timeTake,
                                     @RequestParam(value = "requestUrl", required = true) String requestUrl,
                                     @RequestParam(value = "requestHeader", required = true) String requestHeader,
                                     @RequestParam(value = "requestInfo", required = true) String requestInfo,
                                     @RequestParam(value = "deviceId", required = true) String deviceId      ){

        try {
            if(length(clientIP) > 8){
                clientIP = clientIP.substring(7);
            }
            requestInfoService.insert(deviceId, user, clientIP, hostIP, host, requestUrl, responseCode, timeTake, curl, System.currentTimeMillis(), System.currentTimeMillis()).toString();
            Map<String, Object> data = new HashMap();
            data.put("msg","success");
            data.put("code",200);
            return JsonResponse.newSuccessResponse(data);
        } catch (Exception e){
            Map<String, Object> data = new HashMap();
            data.put("msg",e.getMessage());
            data.put("code",500);
            return JsonResponse.newSuccessResponse(data);

        }
    }

}
