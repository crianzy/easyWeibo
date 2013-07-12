package com.czy.easyweibo.service;


public interface UserService {

	public int login(String username, String password);

	public boolean regist(String username, String password);
	
	/**
	 *  坚持用户名是否可用  可用则返回true 否则返回false
	 * @param username
	 * @return
	 */
	public boolean checkUsername(String username);
	
}
