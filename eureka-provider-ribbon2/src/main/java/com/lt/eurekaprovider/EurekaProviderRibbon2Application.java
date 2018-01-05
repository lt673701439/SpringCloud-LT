package com.lt.eurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProviderRibbon2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderRibbon2Application.class, args);
	}
}
