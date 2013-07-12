package com.czy.easyweibo.domain;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.HashSet;
import java.util.Set;

public class MsgInfo implements Serializable {

	private static final long serialVersionUID = 2200038711976723911L;

	private Integer id;
	private String content;

	/** 消息类型 0：原创；1：评论；2转发 */
	private Integer type;

	/** 评论过数量（只增不减，删除评论不影响此值，可以作为评论多页显示的页码） */
	private Integer commented_count;

	/** 保留的评论数量 */
	private Integer comment_count;

	/** 转发过数量（只增不减，删除转发不影响此值，可以作为转发多页显示的页码） */
	private Integer Transferred_count;

	/** 保留的转发数量 */
	private Integer Transfer_count;

	/** 发布时间 */
	private Timestamp time;

	private User auther;
	
	private Set<UserMsgIndex> userMsgIndexs = new HashSet<UserMsgIndex>(); 
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getCommented_count() {
		return commented_count;
	}

	public void setCommented_count(Integer commented_count) {
		this.commented_count = commented_count;
	}

	public Integer getComment_count() {
		return comment_count;
	}

	public void setComment_count(Integer comment_count) {
		this.comment_count = comment_count;
	}

	public Integer getTransferred_count() {
		return Transferred_count;
	}

	public void setTransferred_count(Integer transferred_count) {
		Transferred_count = transferred_count;
	}

	public Integer getTransfer_count() {
		return Transfer_count;
	}

	public void setTransfer_count(Integer transfer_count) {
		Transfer_count = transfer_count;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public User getAuther() {
		return auther;
	}

	public void setAuther(User auther) {
		this.auther = auther;
	}

	public Set<UserMsgIndex> getUserMsgIndexs() {
		return userMsgIndexs;
	}

	public void setUserMsgIndexs(Set<UserMsgIndex> userMsgIndexs) {
		this.userMsgIndexs = userMsgIndexs;
	}
	
	

}
