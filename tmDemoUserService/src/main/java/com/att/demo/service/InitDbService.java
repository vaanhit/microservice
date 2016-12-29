package com.att.demo.service;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.att.demo.model.User;
import com.att.demo.repository.UserRepository;

/**
 * @author Rohit
 *
 */
@Transactional
@Service
public class InitDbService {

	@Autowired
	private UserRepository userRepository;

	/**
	 * This method is for initial operations. This will call after all the beans
	 * got Construct.
	 */
	@PostConstruct
	public void init() {
		if (userRepository != null) {

			ArrayList<String> notification1 = new ArrayList<String>();
			notification1.add("You got Bravo!");
			notification1.add("You got advance salary");
			userRepository.save(new User("Rohit", "Bhatia", "TM", notification1, 10));

			ArrayList<String> notification2 = new ArrayList<String>();
			notification2.add("You got Start Performaer!");
			notification2.add("Happy BIrthday!");
			userRepository.save(new User("David", "Kumar", "TM", notification2, 20));

			ArrayList<String> notification3 = new ArrayList<String>();
			notification3.add("You got a Good feedback!");
			notification3.add("You got salary!");
			userRepository.save(new User("Rick", "Post", "TM", notification3, 30));

			ArrayList<String> notification4 = new ArrayList<String>();
			notification4.add("You are Brillant!");
			notification4.add("You got a star!");
			userRepository.save(new User("Rick", "Post", "TM", notification4, 40));

		}
	}
}
