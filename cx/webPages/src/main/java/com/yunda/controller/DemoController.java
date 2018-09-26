package com.yunda.controller;


import com.yunda.feign.DemoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoFeign demoFeign;
    @RequestMapping("/demo")
    public String demo(){
        return demoFeign.demo() + "sdsdfaf";
    }
}
