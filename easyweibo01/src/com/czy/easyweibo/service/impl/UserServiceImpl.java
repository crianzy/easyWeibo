package com.czy.easyweibo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.czy.easyweibo.dao.UserDao;
import com.czy.easyweibo.domain.User;
import com.czy.easyweibo.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl implements UserService {

	@Resource
	private UserDao userdao;

	@Override
	public User login(String username, String password) {
		return null;
	}

	@Override
	public void add(String username) {
		User user = new User();
		user.setUsername(username);
		userdao.save(user);
	}


}
