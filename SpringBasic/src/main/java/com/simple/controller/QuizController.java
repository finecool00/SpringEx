package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	//quiz01 화면처리
	@RequestMapping("/quiz01")
	public String quiz01() {
		return "quiz/quiz01";
	}
	
	//quiz01 입력데이터처리
	@RequestMapping("/birthday")
	public String birthday(@RequestParam("year") String year,
						   @RequestParam("month") String month,
						   @RequestParam("day") String day,
						   Model model) {
		
		model.addAttribute("year", year);
		model.addAttribute("month", month);
		model.addAttribute("day", day);
		
		return "quiz/quiz01_ok";
	}
	
	//quiz02 화면처리
	@RequestMapping("/quiz02")
	public String quiz02() {
		return "quiz/quiz02";
	}
	
	//quiz02 데이터처리
	@RequestMapping("/join")
	public String join(@RequestParam("id") String id,
					   @RequestParam("pw") String pw,
					   @RequestParam("name") String name,
					   @RequestParam("email") String email,
					   Model model) {
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		
		return "quiz/quiz02_ok";
	}
	
	
	//quiz03 화면처리
	@RequestMapping("/quiz03")
	public String quiz03() {
		return "quiz/quiz03";
	}
	
	//quiz03 데이터처리
	@RequestMapping("/join2")
	public String join2(@RequestParam("id") String id,
					    @RequestParam("pw") String pw,
					    @RequestParam("pw_check") String pw_check,
					    RedirectAttributes ra) {
		
		
		
		
		if(id.equals("")) {
			ra.addFlashAttribute("msg1", "아이디를 입력하세요");
			return "redirect:/quiz/quiz03";
		} else if(!(pw.equals(pw_check))) {
			ra.addFlashAttribute("msg2", "비밀번호를 확인하세요");
			return "redirect:/quiz/quiz03";
		} else {
			if(pw.equals("")) {
				ra.addFlashAttribute("msg3", "비밀번호를 입력하세요");
				return "redirect:/quiz/quiz03";				
			} else {				
				return "quiz/quiz03_ok";
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
}
