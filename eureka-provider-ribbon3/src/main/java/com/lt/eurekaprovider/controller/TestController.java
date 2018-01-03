package com.lt.eurekaprovider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/test")
    public String test() {
        String services = "ribbon3 Services: " + discoveryClient.getServices();
        System.err.println(services);
        return services;
    }
}
