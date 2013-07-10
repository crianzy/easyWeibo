package com.czy.easyweibo.enviroment.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import com.czy.easyweibo.util.HibernateUtil;

public class TestHibernate {

	@Test
	public void testDomain() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		// ------------------------------
		// ------------------------------
		session.getTransaction().commit();
		session.close();
	}

}
