package com.att.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import tmDemoClient.com.att.dto.UserView;

/**
 * @author Rohit
 *
 */
@RestController
public class UserDashboardController {

	/**
	 * @param id
	 * @return
	 */
	@HystrixCommand(fallbackMethod = "getUserFallBack")
	@RequestMapping("/dashboard")
	public String getUser(@RequestParam(value = "id", defaultValue = "1") int id) {
		RestTemplate restTemplate = new RestTemplate();
		UserView user = restTemplate.getForObject("http://localhost:8091/user?id=" + id, UserView.class);
		return "USER DASHBOARD " + "Welcome " + user.getfName() + " " + user.getlName() + "<br>" + "You have "
				+ user.getPoints() + " points! Good job!<br>" + "<br>" + "<br>" + user.getOrganisation();
	}

	/**
	 * @param id
	 * @return
	 */
	public String getUserFallBack(@RequestParam(value = "id", defaultValue = "1") int id) {
		return "USER DASHBOARD ";
	}

}
