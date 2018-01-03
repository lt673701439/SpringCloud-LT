package com.lt.eurekaconsumer.controller;

import com.lt.eurekaconsumer.rest.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    FeignService feignService;

    @GetMapping("/test")
    public String test() {
        String result = feignService.test();
        System.err.println(result);
        return result;
    }

}
