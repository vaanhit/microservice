package com.att.demo.service;

import java.util.List;
import com.att.demo.model.User;

/**
 * @author Rohit
 *
 */
public interface UserService {

	/**
	 * @return
	 */
	public List<User> getusers();

	/**
	 * @param user
	 * @return
	 */
	public boolean isUserExist(User user);

	/**
	 * @param user
	 */
	public void saveUser(User user);

	/**
	 * @param id
	 * @return
	 */
	public User getUser(long id);
	
	/**
	 * @param id
	 * @return
	 */
	public void deleteUser(long id);
}
