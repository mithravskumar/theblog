package com.niit.collaborate.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.collaborate.dao.UserDAO;
import com.niit.collaborate.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;

	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	public List<User> getAllUser() {

		return userDao.getAllUser();
	}

	public User getById(String id) {
		return userDao.getById(id);
	}
	
	public User getByemailId(String emailId){
		return userDao.getByemailId(emailId);
	}

	public boolean saveUser(User user) {
		return userDao.saveUser(user);
	}

	public boolean updateUser(User user) {
		 return userDao.updateUser(user);
	}

	public User validate(User user) {
		return userDao.validate(user);
	}

}
