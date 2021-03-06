package com.surribas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JavaMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaMsApplication.class, args);
	}
}
