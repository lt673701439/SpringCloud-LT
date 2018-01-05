package com.lt.eurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProviderRibbon3Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderRibbon3Application.class, args);
	}
}
