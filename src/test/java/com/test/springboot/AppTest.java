package com.test.springboot;


import com.test.springboot.service.RequestInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class AppTest {
    @Autowired
    RequestInfoService requestInfoService;

    @Test
    public void test1(){
        requestInfoService.insert("cdscdsds", "user1", "10.242.86.251", "10.242.86.253", "api.lofter.com", "/path", "500", 1009, "abc", 1607481572L, 1607481572L).toString();
    }
    @Test
    public void test2(){
        String res = requestInfoService.queryByContidions("D8973316-CECE-46FF-9CAF-E5F43F22AD4C","","","","","","",0,"",0L,0L,10,0).toString();
        System.out.println(res);
    }
}
