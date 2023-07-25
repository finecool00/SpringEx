package com.coding404.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trip")
public class TripController {

	//공지목록 화면
	
	@RequestMapping("/notice_list")
	public String list() {
		return "trip/notice_list";
	}

	//view
	@RequestMapping("/notice_view")
	public String view() {
		return "trip/notice_view";
	}
	
	//modify(수정화면)
	@RequestMapping("/notice_modify")
	public String modify() {
		return "trip/notice_modify";
	}
	
	//write(작성화면)
	@RequestMapping("/notice_write")
	public String write() {
		return "trip/notice_write";
	}
	
	
}
