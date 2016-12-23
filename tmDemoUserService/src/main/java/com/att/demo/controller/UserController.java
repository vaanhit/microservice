package com.att.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.att.demo.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rohit
 *
 */
@RestController
public class UserController {

	private List<User> users = new ArrayList<>();

	@RequestMapping("/user")
	public User getUser(@RequestParam(value = "id", defaultValue = "10") int id) {
		addUsers();
		return users.get(id - 1);
	}

	@RequestMapping("/users")
	public List<User> getUsers() {
		addUsers();
		return users;
	}

	private void addUsers() {

		List<String> notifications = new ArrayList();
		notifications.add("You Git Bravo!");
		notifications.add("You are employee of the Month.");

		User user_1 = new User(1, "User 1", "L User 1", "TM", notifications, 10);
		User user_2 = new User(2, "User 2", "L User 2", "TM", notifications, 20);
		User user_3 = new User(3, "User 3", "L User 3", "TM", notifications, 30);

		users.add(user_1);
		users.add(user_2);
		users.add(user_3);
	}

}