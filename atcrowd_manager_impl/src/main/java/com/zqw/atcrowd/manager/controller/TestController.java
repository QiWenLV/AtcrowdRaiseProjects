package com.zqw.atcrowd.manager.controller;

import com.zqw.atcrowd.manager.service.TestService;
import com.zqw.atcrowd.manager.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public String test(){
        System.out.println("sssss");
        //testService = new TestServiceImpl();
        testService.insert();
        return "success";
    }
}
