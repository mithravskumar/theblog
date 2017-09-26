package com.niit.chatonbackend.service;

import java.util.List;

import com.niit.chatonbackend.model.User;

public interface UserService {

	List<User> getAllUser();

	User getById(String id);
	User getByemailId(String emailId);

	boolean saveUser(User user);

	boolean updateUser(User user);
	
	User validate(User user);
}

