package com.czy.easyweibo.view.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.czy.easyweibo.service.UserService;
import com.opensymphony.xwork2.ActionChainResult;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class UserAction extends ActionSupport {

	private static final long serialVersionUID = -8892673170541345743L;
	@Resource
	private UserService userService;

	private String username;
	private String password;
	private String passowrd_repect;

	@Override
	public String execute() throws Exception {
		return super.execute();
	}

	public String login() {
		if (userService.login(username, password) == 1) {
			return "loginSuccess";
		}
		ActionContext.getContext().put("loginError", "用户或密码不正确");
		return "toIndex";
	}

	public String regist() {
		if (userService.checkUsername(username)//
				&& password != null//
				&& password.equals(passowrd_repect)//
				&& userService.regist(username, password)) {
			return "registSuccess";
		}
		ActionContext.getContext().put("registError", "注册失败");
		return "toIndex";
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

	public String getPassowrd_repect() {
		return passowrd_repect;
	}

	public void setPassowrd_repect(String passowrd_repect) {
		this.passowrd_repect = passowrd_repect;
	}

}
