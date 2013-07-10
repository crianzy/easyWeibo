package com.czy.easyweibo.domain;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import com.czy.easyweibo.util.HibernateUtil;

public class UserTest {
	@Test
	public void testDomain() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		// ------------------------------
		User user1 = new User();
		user1.setUsername("user1");

		User user2 = new User();
		user2.setUsername("user2");

		User user3 = new User();
		user3.setUsername("user3");

		User user4 = new User();
		user4.setUsername("use4");

		user1.getFans().add(user2);
		user1.getFans().add(user3);
		user1.getFans().add(user4);
		
		user2.getFans().add(user1);
		user2.getFans().add(user3);
		
		
		session.save(user1);
		session.save(user2);
		session.save(user3);
		session.save(user4);

		// ------------------------------
		session.getTransaction().commit();
		session.close();
	}

	@Test
	public void testGetUser() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		// ------------------------------
		User user1 = (User) session.get(User.class, 1);
		Set<User> users1 = user1.getFans();
		for (User user : users1) {
			System.out.println(user.getId());
		}
		
		User user2 = (User) session.get(User.class, 3);
		Set<User> users2 = user2.getFollowers();
		System.out.println(user2.getUsername());
		for (User user : users2) {
			System.out.println(user.getId());
		}
		// ------------------------------
		session.getTransaction().commit();
		session.close();
	}
}
