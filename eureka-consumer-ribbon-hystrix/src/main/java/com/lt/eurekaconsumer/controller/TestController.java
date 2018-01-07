package com.lt.eurekaconsumer.controller;

import com.lt.eurekaconsumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    ConsumerService consumerService;

    @GetMapping("/test")
    public String test() {
        return consumerService.consumer();
    }

}

