package com.czy.easyweibo.enviroment.test;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.czy.easyweibo.service.UserService;
import com.czy.easyweibo.view.action.IndexAction;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestSpring {
	private ApplicationContext ac = new ClassPathXmlApplicationContext(
			"applicationContext.xml");

	@Test
	public void testSessinoFactory() {
		SessionFactory sf = (SessionFactory) ac.getBean("sessionFactory");
		ComboPooledDataSource datasource = (ComboPooledDataSource) ac
				.getBean("dataSource");

		System.out.println(sf);
		System.out.println(datasource);
	}

	@Test
	public void testAction() {
		IndexAction indexAction = (IndexAction) ac.getBean("indexAction");
		System.out.println(indexAction);
	}

	@Test
	public void testUserService() {
		UserService userService = (UserService) ac.getBean("userServiceImpl");
		userService.add("chenas");
		System.out.println(userService);

	}
}
