package com.wang.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class User {
	@RequestMapping("/test")
	public String test(){
		System.out.println("test");
		return "test";
	}
}
