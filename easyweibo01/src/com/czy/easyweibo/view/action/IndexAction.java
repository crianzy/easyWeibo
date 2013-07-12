package com.czy.easyweibo.view.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.czy.easyweibo.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class IndexAction extends ActionSupport {

	private static final long serialVersionUID = -7536305674876065440L;

	@Resource
	private UserService userService;

	@Override
	public String execute() throws Exception {
		return super.execute();
	}

}
