package com.att.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.att.demo.model.User;

/**
 * @author Rohit
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

	/**
	 * @param fname
	 * @return
	 */
	public User findByfName(String fname);

}
