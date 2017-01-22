package com.att.demo;

import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rohit
 *
 */
@SpringBootApplication
@RestController
@EnableResourceServer
public class TmDemoResourceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmDemoResourceProviderApplication.class, args);
	}
	
	@RequestMapping("/")
	public String securedCall() {
		return "success (id: " + UUID.randomUUID().toString().toUpperCase() + ")";
	}
}
