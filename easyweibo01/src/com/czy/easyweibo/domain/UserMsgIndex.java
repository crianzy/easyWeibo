package com.czy.easyweibo.domain;

import java.security.Timestamp;

public class UserMsgIndex {

	private Integer id;
	private Integer userId;
	private Integer Auther_id;
	private Integer Msg_id;
	private Timestamp time_t;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getAuther_id() {
		return Auther_id;
	}

	public void setAuther_id(Integer auther_id) {
		Auther_id = auther_id;
	}

	public Integer getMsg_id() {
		return Msg_id;
	}

	public void setMsg_id(Integer msg_id) {
		Msg_id = msg_id;
	}

	public Timestamp getTime_t() {
		return time_t;
	}

	public void setTime_t(Timestamp time_t) {
		this.time_t = time_t;
	}

}
