package com.jlu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jlu.dao.UserDao;
import com.jlu.model.User;
import com.jlu.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional()
	public String test() {
		// TODO Auto-generated method stub
		userDao.deleteUserTb();
		userDao.insertOneRow();
		userDao.insertAnotherOneRow();
		User user = userDao.findUserById("137094");
		return user.printUser();
	}
}
