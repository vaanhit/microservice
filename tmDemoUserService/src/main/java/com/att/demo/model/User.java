package com.att.demo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rohit
 *
 */
public class User {

	private long id;
	private String fName;
	private String lName;
	private String organisation;
	private List<String> notifications;
	private int points;

	// Friends are deprecated and should not be used
	private List<String> friends;

	public User(int id, String fName, String lName, String organisation, List<String> notification, int points) {

		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.organisation = organisation;
		this.notifications = notification;
		this.points = points;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getOrganisation() {
		return organisation;
	}

	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}

	public List<String> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<String> notifications) {
		this.notifications = notifications;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

}
