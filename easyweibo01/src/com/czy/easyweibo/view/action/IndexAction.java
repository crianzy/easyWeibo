package com.czy.easyweibo.view.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.czy.easyweibo.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class IndexAction extends ActionSupport {

	private static final long serialVersionUID = -7536305674876065440L;

	@Autowired
	private UserService userService;

	private String username;

	@Override
	public String execute() throws Exception {
		userService.add(username);
		return super.execute();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
