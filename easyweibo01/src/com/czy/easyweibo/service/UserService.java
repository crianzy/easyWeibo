package com.czy.easyweibo.service;


public interface UserService {

	public int login(String username, String password);

	public boolean regist(String username, String password);
	
	/**
	 *  ����û����Ƿ����  �����򷵻�true ���򷵻�false
	 * @param username
	 * @return
	 */
	public boolean checkUsername(String username);
	
}
