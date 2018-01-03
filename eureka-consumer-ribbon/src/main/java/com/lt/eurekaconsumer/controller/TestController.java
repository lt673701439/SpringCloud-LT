package com.lt.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/test")
    public String test() {
        String result = restTemplate.getForObject("http://eureka-provider-ribbon/test", String.class);
        System.err.println("-----------" + result);
        return result;
    }
}
