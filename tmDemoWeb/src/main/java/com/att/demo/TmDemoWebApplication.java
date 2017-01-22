package com.att.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Rohit
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class TmDemoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmDemoWebApplication.class, args);
	}
}
