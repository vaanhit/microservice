package com.att.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Rohit
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class TmDemoUserDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmDemoUserDashboardApplication.class, args);
	}
}
