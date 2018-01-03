package com.lt.eurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProviderRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderRibbonApplication.class, args);
	}
}
