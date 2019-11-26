package com.example.mindtree.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mindtree.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/get/{id}")
	@ResponseBody
	public User getUserById(@PathVariable String id) {
		User user1 = new User(1, "testuser1");
		User user2 = new User(2, "testuser2");
		User user3 = new User(3, "testuser3");
		if (id != null) {
			if (user1.getId() == Integer.parseInt(id)) {
				return user1;
			} else if (user2.getId() == Integer.parseInt(id)) {
				return user2;
			} else if (user3.getId() == Integer.parseInt(id)) {
				return user3;
			}
		}
		return null;
	}

	@GetMapping("/getAll")
	@ResponseBody
	public List<User> getUserById() {
		User user1 = new User(1, "testuser1");
		User user2 = new User(2, "testuser2");
		User user3 = new User(3, "testuser3");
		List<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		return users;
	}

	
}
