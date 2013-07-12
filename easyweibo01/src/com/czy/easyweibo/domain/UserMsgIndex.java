package com.czy.easyweibo.domain;

import java.io.Serializable;
import java.security.Timestamp;

public class UserMsgIndex implements Serializable {

	private static final long serialVersionUID = 5717398749155167281L;
	private Integer id;
	private User user;
	private MsgInfo msg;
	private Timestamp time;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public MsgInfo getMsg() {
		return msg;
	}

	public void setMsg(MsgInfo msg) {
		this.msg = msg;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

}
