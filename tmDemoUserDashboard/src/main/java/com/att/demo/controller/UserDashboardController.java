package com.att.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import tmDemoClient.com.att.dto.UserView;

/**
 * Created by bartoszjedrzejewski on 09/06/2016.
 */
@RestController
public class UserDashboardController {

	@RequestMapping("/dashboard")
	public String getUser(@RequestParam(value = "id", defaultValue = "1") int id) {
		RestTemplate restTemplate = new RestTemplate();
		UserView user = restTemplate.getForObject("http://localhost:8091/user?id=" + id, UserView.class);
		return "USER DASHBOARD <br>" + "Welcome " + user.getfName() + " " + user.getlName() + "<br>" + "You have "
				+ user.getPoints() + " points! Good job!<br>" + "<br>" + "<br>" + user.getOrganisation();
	}

}
