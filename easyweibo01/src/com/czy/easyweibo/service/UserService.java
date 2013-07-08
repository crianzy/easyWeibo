package com.czy.easyweibo.service;

import com.czy.easyweibo.domain.User;

public interface UserService {

	public User login(String username, String password);

	public void add(String username);
}
