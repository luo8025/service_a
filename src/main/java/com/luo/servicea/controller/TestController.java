package com.luo.servicea.controller;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients
@RequestMapping("service-a")
public class TestController {

    @GetMapping("/test")
    public String Test(){
        return ("hello word");
    }

}
