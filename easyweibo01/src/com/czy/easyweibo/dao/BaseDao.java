package com.czy.easyweibo.dao;

import java.io.Serializable;

public interface BaseDao<T> {

	public void save(T t);

	public void updata(T t);

	public void delte(Serializable id);

	public T findById(Serializable id);
}
