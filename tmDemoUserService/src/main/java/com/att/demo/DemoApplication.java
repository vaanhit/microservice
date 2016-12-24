package com.att.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

/**
 * @author Rohit
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
// if do not want default configuration
// (exclude = SecurityAutoConfiguration.class)
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);

		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

	}
}
