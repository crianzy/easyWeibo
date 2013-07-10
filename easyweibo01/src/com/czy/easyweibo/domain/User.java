package com.czy.easyweibo.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class User implements Serializable {

	private static final long serialVersionUID = -1519888106990431641L;
	private Integer id;
	private String username;
	private String password;
	private Integer msg_count;
	private Integer fans_count;
	private Integer follow_count;
	private Integer isOnline;
	private Set<User> fans = new HashSet<User>();
	private Set<User> followers = new HashSet<User>();
	private Set<UserMsgIndex> msgIndex = new HashSet<UserMsgIndex>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getMsg_count() {
		return msg_count;
	}

	public void setMsg_count(Integer msg_count) {
		this.msg_count = msg_count;
	}

	public Integer getFans_count() {
		return fans_count;
	}

	public void setFans_count(Integer fans_count) {
		this.fans_count = fans_count;
	}

	public Integer getFollow_count() {
		return follow_count;
	}

	public void setFollow_count(Integer follow_count) {
		this.follow_count = follow_count;
	}

	public Integer getIsOnline() {
		return isOnline;
	}

	public void setIsOnline(Integer isOnline) {
		this.isOnline = isOnline;
	}

	public Set<User> getFollowers() {
		return followers;
	}

	public void setFollowers(Set<User> followers) {
		this.followers = followers;
	}

	public Set<User> getFans() {
		return fans;
	}

	public void setFans(Set<User> fans) {
		this.fans = fans;
	}

	public Set<UserMsgIndex> getMsgIndex() {
		return msgIndex;
	}

	public void setMsgIndex(Set<UserMsgIndex> msgIndex) {
		this.msgIndex = msgIndex;
	}

}
