package com.lt.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    @Value("${client.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        System.out.println(this.hello);
        return this.hello;
    }
}