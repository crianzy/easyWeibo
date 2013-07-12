package com.czy.easyweibo.dao;

import com.czy.easyweibo.domain.User;

public interface UserDao extends BaseDao<User> {

	public User checkLogin(String username, String password);

	public User getUserByUsername(String username);

	public boolean checkUsernameIsRepect(String username);
}
