package com.lt.eurekaconsumer.rest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-provider")
public interface FeignService {

    @GetMapping("/test")
    String test();
}
