package com.att.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.att.demo.model.User;
import com.att.demo.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rohit
 *
 */
@RestController
public class UserController {

	@Autowired
	UserService userService;

	/**
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUser(@RequestParam(value = "id", defaultValue = "10") long id) {
		return userService.getUser(id);
	}

	/**
	 * @return
	 */
	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<User>> getUsers() {
		List<User> users = userService.getusers();
		if (users.isEmpty()) {
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

	/**
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/createuser", method = RequestMethod.POST)
	public ResponseEntity<Void> createUser(@RequestBody User user) {
		System.out.println("Creating User " + user.getfName());

		if (userService.isUserExist(user)) {
			System.out.println("User with name " + user.getfName() + " already exist");
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

		userService.saveUser(user);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	/**
	 * @param id
	 */
	@RequestMapping(value = "/delete/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}

}