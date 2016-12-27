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
public class UserNotificationController {

	/**
	 * @param id
	 * @return
	 */
	@HystrixCommand(fallbackMethod = "getUserFallBack")
	@RequestMapping("/notification")
	public String getUser(@RequestParam(value = "id", defaultValue = "1") int id) {

		RestTemplate restTemplate = new RestTemplate();
		UserView user = restTemplate.getForObject("http://localhost:8091/user?id=" + id, UserView.class);
		String response = "NOTIFICATIONS";
		int number = 1;
		for (String notification : user.getNotifications()) {
			response += "<BR> Notification number " + (number++) + ": " + notification;
		}
		return response;
	}
	
	/**
	 * @param id
	 * @return
	 */
	public String getUserFallBack(@RequestParam(value = "id", defaultValue = "1") int id) {
		
		
		return "NOTIFICATIONS:";
	}

}
