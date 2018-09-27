package com.yunda.feign;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("jltjApplication")
public interface DemoFeign {

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo();
}
