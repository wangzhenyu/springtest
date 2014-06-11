package com.wang.web.action;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wang.entity.User;
import com.wang.service.IUserService;

@Controller
public class UserAction {
	@Autowired
	private IUserService userService;
	@RequestMapping("/test")
	public String test(HttpServletResponse response ) throws Exception{
		User user=new User();
		user.setName("test");
		userService.save(user);
		return "test";
	}
}
