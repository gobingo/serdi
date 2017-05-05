package com.adobe.target;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SerdiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SerdiServerApplication.class, args);
	}
}
