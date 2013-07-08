package com.czy.easyweibo.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.czy.easyweibo.dao.BaseDao;

@SuppressWarnings("unchecked")
public class BaseDaoImpl<T> implements BaseDao<T> {

	@Resource
	private SessionFactory sessionFactory;

	private Class<T> clazz;

	public BaseDaoImpl() {
		// 通过反射获取泛型的具体类型
		ParameterizedType pt = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0];
	}

	@Override
	public void save(T t) {
		getSession().save(t);
	}

	@Override
	public void updata(T t) {
		getSession().update(t);
	}

	@Override
	public void delte(Serializable id) {
		Session session = getSession();
		T t = (T) session.get(clazz, id);
		session.delete(t);
	}

	@Override
	public T findById(Serializable id) {
		T t = (T) getSession().get(clazz, id);
		return t;
	}

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

}
