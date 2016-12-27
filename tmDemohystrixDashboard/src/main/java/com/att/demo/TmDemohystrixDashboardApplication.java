package com.att.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class TmDemohystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmDemohystrixDashboardApplication.class, args);
	}
}
