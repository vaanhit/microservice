package com.att.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Rohit
 *
 */
@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long id;

	private String fName;
	private String lName;
	private String organisation;
	private ArrayList<String> notifications;
	private int points;

	/**
	 * @param id
	 * @param fName
	 * @param lName
	 * @param organisation
	 * @param notification
	 * @param points
	 */
	public User(String fName, String lName, String organisation, ArrayList<String> notification, int points) {

		this.fName = fName;
		this.lName = lName;
		this.organisation = organisation;
		this.notifications = notification;
		this.points = points;
	}

	public User() {

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

	public ArrayList<String> getNotifications() {
		return notifications;
	}

	public void setNotifications(ArrayList<String> notifications) {
		this.notifications = notifications;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
