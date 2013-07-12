package com.czy.easyweibo.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
	private ApplicationContext ac = new ClassPathXmlApplicationContext(
			"applicationContext.xml");

	@Test
	public void testLogin() {
		String username = "";
		String password = "6203";
		UserService userService = (UserService) ac.getBean("userServiceImpl");
		System.out.println(userService.login(username, password));
	}

	@Test
	public void testRegist() {
		String username = "chasdasd";
		String password = "6203103";
		UserService userService = (UserService) ac.getBean("userServiceImpl");
		System.out.println(userService.regist(username, password));
	}

	@Test
	public void testCheckUsername() {
		String username = "chen123sa";
		UserService userService = (UserService) ac.getBean("userServiceImpl");
		System.out.println(userService.checkUsername(username));
	}

}
