package com.czy.easyweibo.dao.impl;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.czy.easyweibo.dao.UserDao;
import com.czy.easyweibo.domain.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	@Override
	public User checkLogin(String username, String password) {
		Session session = getSession();
		User user = null;
		user = (User) session
				.createQuery(
						"FROM User user WHERE user.username = ? AND user.password = ?")//
				.setParameter(0, username)//
				.setParameter(1, password)//
				.uniqueResult();
		return user;
	}

	@Override
	public User getUserByUsername(String username) {
		Session session = getSession();
		User user = null;
		user = (User) session
				.createQuery(
						"FROM User user WHERE user.username = ?")//
				.setParameter(0, username)//
				.uniqueResult();
		return user;
	}

	@Override
	public boolean checkUsernameIsRepect(String username) {
		Session session = getSession();
		String test = (String) session
				.createQuery(
						"SELECT username FROM User user WHERE user.username = ?")//
				.setParameter(0, username)//
				.uniqueResult();
		
		if(test==null||"".equals(test)){
			return false;
		}
		return true;
	}

}
