package com.simple.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.Quiz01VO;
import com.simple.command.ReqVO;

@Controller
@RequestMapping("/response")
public class ResponseController {

	@RequestMapping("/res_ex01")
	public void ex01() {}
	
	//1. model전달자
	@RequestMapping("/ex02")
	public String ex02(Model model) {
		
		model.addAttribute("name", "홍길동"); //addAttribute는 매개변수로 키, 값이 들어감
		model.addAttribute("date", new Date());
		
		return "/response/ex02";
	}
	
	//ModelAndView - 데이터와 화면 정보를 동시에 저장하는 객체
	@RequestMapping("/ex03")
	public ModelAndView ex03(ModelAndView mv) { //객체생성 없이 매개변수로 넣어도 가능하다(참고)
		
//		ModelAndView mv = new ModelAndView();
		mv.addObject("serverTime", new Date()); //데이터
		mv.setViewName("response/ex03"); //화면정보
		
		return mv;
	}
	
	//@ModelAttribute(화면에서 넘어오는 키값)
	//화면에서 값을 가지고 넘어와서 컨트롤러를 관통해서 화면정보 출력하는 것!!!(그대로 받아서 넘긴다고 생각할 것)
	@RequestMapping("/ex04")
	public String ex04(@ModelAttribute("id") String id) {
	
		System.out.println("넘어온 값 : " + id);
		
		
		return "response/ex04";
	}
	
	//ModelAttribute객체타입 vo받아서 xxx이름으로 변경해서 화면으로 전달
	@RequestMapping("/ex05")
	public String ex05(@ModelAttribute("xxx") ReqVO vo) { //커맨드객체를 통해 값 가지고 온 상황
		
		System.out.println(vo.toString());
		
		return "response/ex05";
	}
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////
	//리디렉션과 리디렉션어트리뷰트
	
	//화면처리
	@RequestMapping("/join")
	public String join() {
		return "response/join";
	}
	
	//폼요청
	@RequestMapping(value="/joinForm", method=RequestMethod.POST)
	public String joinForm(ReqVO vo, RedirectAttributes ra) {
	
		//가입처리 했다고 가정
		
		//리다이렉트시에 사용하며, 1회성 데이터를 화면에 전달해줄 수 있습니다.(새로고침하면 사라짐)
		//리다이렉트시에 model은 사용할 수 없습니다.
		ra.addFlashAttribute("msg", "정상 처리되었습니다");
		
		return "redirect:/"; //mvc방식에서 리다이렉트는 다시!! 컨트롤러에 태워 보낸다!!!고 알고 있어라!
							 //redirect:/절대경로
							 //완전히 새로운 곳으로 갈아엎는 것이기 때문에 데이터를 옮길 수 없다 => redirectAttribute 사용
		
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	//퀴즈01
	
	@RequestMapping("/res_quiz01")
	public String quiz01() {
		return "response/res_quiz01";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("xxx") Quiz01VO vo, RedirectAttributes ra) {	
		if(vo.getId().equals("kim12") && vo.getPw().equals("1234")) { //로그인 성공 가정
			return "response/res_quiz02";
		} else {
			ra.addFlashAttribute("msg", "다시 로그인해주세요!!");
			return "redirect:/response/res_quiz01";
		}	
	}
	
	//선생님 풀이
//	@RequestMapping("/res_login")
//	public String login(@RequestParam("id") String id,
//						@RequestParam("pw") String pw,
//						Model model,
//						RedirectAttributes ra) {	
//		if(id.equals("kim12") && pw.equals("1234")) { //로그인 성공 가정	
//		
//			model.addAttribute("id", id); //forward방식 사용
//			return "response/res_quiz02";
//			
//		} else {
//			ra.addFlashAttribute("msg", "아이디, 비밀번호를 다시 확인하세요!!");
//			return "redirect:/response/res_quiz01";
//		}	
//	}
	
}
