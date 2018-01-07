package com.lt.eurekaconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer() {
        String result = restTemplate.getForObject("http://eureka-provider/test", String.class);
        System.err.println("-----------" + result);
        return result;
    }

    public String fallback() {
        return "sorry your request is fallback";
    }

}
