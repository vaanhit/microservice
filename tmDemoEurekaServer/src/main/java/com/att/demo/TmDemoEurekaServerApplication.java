package com.att.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Rohit
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class TmDemoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmDemoEurekaServerApplication.class, args);
	}
}
