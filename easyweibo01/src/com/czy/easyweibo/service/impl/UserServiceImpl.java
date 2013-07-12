package com.czy.easyweibo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.czy.easyweibo.dao.UserDao;
import com.czy.easyweibo.domain.User;
import com.czy.easyweibo.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	@Override
	/**
	 *  return 1 表示 登陆成功； 0 表示登陆失败
	 */
	public int login(String username, String password) {
		if (userDao.checkLogin(username, password) != null) {
			return 1;
		}
		return 0;
	}

	@Override
	public boolean regist(String username, String password) {
		if(checkUsername(username)){
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			userDao.save(user);
			return true;
		}
		return false;
	}

	@Override
	public boolean checkUsername(String username) {
		if (username != null && username.length() > 4) {
			if(!userDao.checkUsernameIsRepect(username)){
				return true;
			}
		}
		return false;
	}

}
