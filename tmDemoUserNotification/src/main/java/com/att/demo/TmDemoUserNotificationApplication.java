package com.att.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Rohit
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class TmDemoUserNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmDemoUserNotificationApplication.class, args);
	}
}
