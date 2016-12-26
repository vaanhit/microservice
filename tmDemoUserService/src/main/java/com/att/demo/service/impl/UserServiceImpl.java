package com.att.demo.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.att.demo.model.User;
import com.att.demo.repository.UserRepository;
import com.att.demo.service.UserService;

/**
 * @author Rohit
 *
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.att.demo.service.UserService#getusers()
	 */
	@Override
	public List<User> getusers() {
		List<User> users = userRepository.findAll();
		return users;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.att.demo.service.UserService#isUserExist(com.att.demo.model.User)
	 */
	@Override
	public boolean isUserExist(User user) {
		return userRepository.findByfName(user.getfName()) != null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.att.demo.service.UserService#saveUser(com.att.demo.model.User)
	 */
	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.att.demo.service.UserService#getUser(int)
	 */
	@Override
	public User getUser(long id) {
		return userRepository.findOne(id);
	}

	/* (non-Javadoc)
	 * @see com.att.demo.service.UserService#deleteUser(long)
	 */
	@Override
	public void deleteUser(long id) {
		userRepository.delete(id);
	}

}
