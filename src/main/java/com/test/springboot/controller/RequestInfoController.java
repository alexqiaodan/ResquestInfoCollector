package com.test.springboot.controller;


import com.test.common.entity.Page;
import com.test.springboot.entity.RequestInfo;
import com.test.springboot.entity.SearchParam;
import com.test.springboot.service.RequestInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.expression.Maps;
import com.netease.loft.core.common.helper.JsonResponse;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/qabackend")
public class RequestInfoController {

    @Autowired
    RequestInfoService requestInfoService;

    @RequestMapping("/detail.html")
    public String getFirstPage(){
//
//        List<RequestInfo> requestInfos =  requestInfoService.queryByContidions(null,null,null,null,null,null,null,0,null,0L,0L,20,0);
//        model.addAttribute("requestInfos", requestInfos);
        return "redirect:queryByContidions";
    }

//    @RequestMapping("/queryByContidions")
//    public String queryByContidions(Model model, Page page,
//                                    @RequestParam(value = "deviceID",defaultValue = "null") String deviceID,
//                                    @RequestParam(value = "user",defaultValue = "null") String user,
//                                    @RequestParam(value = "clientIp",defaultValue = "null") String clientIp,
//                                    @RequestParam(value = "hostIp",defaultValue = "null") String hostIp,
//                                    @RequestParam(value = "host",defaultValue = "null") String host,
//                                    @RequestParam(value = "requestUrl",defaultValue = "null") String requestUrl,
//                                    @RequestParam(value = "responseCode",defaultValue = "null") String responseCode,
//                                    @RequestParam(value = "start", defaultValue = "1") int start,
//                                    @RequestParam(value = "size", defaultValue = "10") int limit,
//                                    @RequestParam(value = "uploadTimeStart", defaultValue = "0") Long uploadTimeStart,
//                                    @RequestParam(value = "uploadTimeEnd", defaultValue = "0") Long uploadTimeEnd,
//                                    @RequestParam(value = "timeCost", defaultValue = "0") int timeCost,
//                                    @RequestParam(value = "curl",defaultValue = "null") String curl
//                                    )  throws Exception {
//
//
//        int totalCount = requestInfoService.selectCount(deviceID,user,clientIp,hostIp,host,requestUrl,responseCode,timeCost,curl,uploadTimeStart,uploadTimeEnd);
//        page.setRows(totalCount);
//        page.setPath("/qabackend/queryByContidions");
//        List<RequestInfo> requestInfos =  requestInfoService.queryByContidions(deviceID,user,clientIp,hostIp,host,requestUrl,responseCode,timeCost,curl,uploadTimeStart,uploadTimeEnd,page.getLimit(),page.getOffset());
//        model.addAttribute("requestInfos", requestInfos);
////        model.addAttribute("page_now", start);
////        model.addAttribute("totalCount", totalCount);
//
//        if(!deviceID.equals("null")){model.addAttribute("deviceID", deviceID);}
//        if(!user.equals("null")){model.addAttribute("user", user);}
//        if(!hostIp.equals("null")){model.addAttribute("hostIp", hostIp);}
//        if(!clientIp.equals("null")){model.addAttribute("clientIp", clientIp);}
//        if(!host.equals("null")){model.addAttribute("host", host);}
//        if(!requestUrl.equals("null")){model.addAttribute("requestUrl", requestUrl);}
//        if(!responseCode.equals("null")){model.addAttribute("responseCode", responseCode);}
//
//        return "detail";
//    }



    @RequestMapping("/queryByContidions")
    public String queryByContidions(Model model, Page page,SearchParam searchParam)  throws Exception {


        int totalCount = requestInfoService.selectCount(searchParam.getDeviceID(),
                searchParam.getUser(),
                searchParam.getClientIp(),
                searchParam.getHostIp(),
                searchParam.getHost(),
                searchParam.getRequestUrl(),
                searchParam.getResponseCode(),
                searchParam.getTimeCost() == null ? 0 : searchParam.getTimeCost(),
                searchParam.getCurl(),
                searchParam.getUploadTimeStart() == null ? 0L : searchParam.getUploadTimeStart(),
                searchParam.getUploadTimeEnd() == null ? 0L : searchParam.getUploadTimeEnd());
        page.setRows(totalCount);
        page.setPath("/qabackend/queryByContidions");
        List<RequestInfo> requestInfos =  requestInfoService.queryByContidions(searchParam.getDeviceID(),
                searchParam.getUser(),
                searchParam.getClientIp(),
                searchParam.getHostIp(),
                searchParam.getHost(),
                searchParam.getRequestUrl(),
                searchParam.getResponseCode(),
                searchParam.getTimeCost() == null ? 0 : searchParam.getTimeCost(),
                searchParam.getCurl(),
                searchParam.getUploadTimeStart() == null ? 0L : searchParam.getUploadTimeStart(),
                searchParam.getUploadTimeEnd() == null ? 0L : searchParam.getUploadTimeEnd(),
                page.getLimit(),
                page.getOffset());

        model.addAttribute("requestInfos", requestInfos);
//        model.addAttribute("page_now", start);
//        model.addAttribute("totalCount", totalCount);

//        if(!searchParam.getDeviceID().equals("null")){model.addAttribute("deviceID", deviceID);}
//        if(!user.equals("null")){model.addAttribute("user", user);}
//        if(!hostIp.equals("null")){model.addAttribute("hostIp", hostIp);}
//        if(!clientIp.equals("null")){model.addAttribute("clientIp", clientIp);}
//        if(!host.equals("null")){model.addAttribute("host", host);}
//        if(!requestUrl.equals("null")){model.addAttribute("requestUrl", requestUrl);}
//        if(!responseCode.equals("null")){model.addAttribute("responseCode", responseCode);}

        return "detail";
    }


}
