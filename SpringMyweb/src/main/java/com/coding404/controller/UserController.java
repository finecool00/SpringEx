package com.coding404.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	//회원가입
	@RequestMapping("/join")
	public String join() {
		return "user/join";
	}

	//로그인
	@RequestMapping("/login")
	public String login() {
		return "user/login";
	}
	
	//마이페이지
	@RequestMapping("/mypage")
	public String mypage() {
		return "user/mypage";
	}
	
}
