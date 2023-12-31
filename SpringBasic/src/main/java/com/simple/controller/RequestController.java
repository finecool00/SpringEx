package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simple.command.Quiz01VO;
import com.simple.command.ReqVO;

//컨트롤러는 테이블별(주제별)로 하나씩 만들어진다!!!
@Controller
@RequestMapping("/request") //각 메서드의 공통분모
public class RequestController {

	//화면을 띄우는 
	//들어오는 경로와 나가는 경로는 별개다!!!!
	//@RequestMapping("/req_ex01") //실제로는 /request/req_ex01과 같음
	//public String ex01() {
		//return "request/req_ex01";
	//}
	@RequestMapping("/req_ex01") //실제로는 /request/req_ex01과 같음
	public void ex01_1() {
		//return "request/req_ex01"; //위의 경우와 같음!!!
	}
	
	//get요청만 허용
	//@RequestMapping(value = "/basic1", method = RequestMethod.GET) //기본으로 설정된 속성은 value, 여러개 적을 시 콤마로 구분
	@GetMapping("/basic1")
	public void basic1() {
		System.out.println("basic요청");
	}
	
	//Post요청만 허용
	//@RequestMapping(value = "/basic2" , method = RequestMethod.POST)
	@PostMapping("/basic2")
	public void basic2() {
		System.out.println("basic2요청");
	}
	
	//get, post 둘다 허용
	@RequestMapping(value = "/basic3")
	public void basic3() {
		System.out.println("basic3요청");
	}
	
	
	////////////////////////////////////////////////////////
	//파라미터 값 받기
	@RequestMapping("/req_ex02")
	public String ex02() {
		return "request/req_ex02";
	}
	
	//1. 전통적인 방법(request객체를 통해서!)
//	@RequestMapping("/param1")
//	public String param1(HttpServletRequest request) {
//		
//		String name = request.getParameter("name");
//		String age = request.getParameter("age");	
//		String[] inter = request.getParameterValues("inter");
//		
//		System.out.println(name);
//		
//		return "request/result";
//	}
	
	//2. @RequestParam(네임값) 어노테이션 사용방법 -반드시 필수로 값이 전달이 되어야 합니다!!(중요)
	//required = false는 반드시 필수가 아님
	//defaultValue - 값이 없을 때 기본값⭐
//	@RequestMapping("/param1")
//	public String param1(@RequestParam("name") String x, //문자열은 값이 없어도 공백으로 전달됨
//						 @RequestParam(value = "age", required = false , defaultValue = "0") int y,
//						 @RequestParam(value = "inter", required = false, defaultValue = "") ArrayList<String> z) {
//						 //어노테이션 뒤 변수는 내가 사용할 변수 타입 및 이름인 것
//						 //inter의 경우 값이 여러개 이므로 리스트나 배열로 하면 됨
//		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z.toString());
//		
//		
//		return "request/result";
//	}
	
	
	//3. 커맨드객체를 이용하는 방법
	@RequestMapping("/param1")
	public String param1(ReqVO vo) { //VO객체의 getter명과 매칭해서 값 가져온다!
		
		System.out.println(vo.toString());
		
		
		return "request/result"; //result페이지로!
	}
	
	
	
	///////////////////////////////////////////////////////
	//퀴즈
	
	//화면처리 
	@RequestMapping("/req_quiz01")
	public void quiz01() {}

	//로그인 요청(성공 및 실패페이지는 강제로 띄울 수 없음. 따로 화면에 출력하는 요청 내용이 있어야 함)

	//1번째 방법(전통적 방법)
//	@PostMapping("/login")
//	public String login(HttpServletRequest request) {
//		
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//		
//		if(id.equals("abc123") && pw.equals("xxx123")) {
//			return "/request/req_quiz01_ok";
//		} else {
//			return "/request/req_quiz01_no";
//		}	
//	}
	
	//2번째 방법(어노테이션 방법)
//	@PostMapping("/login")
//	public String login(@RequestParam("id") String id,
//						@RequestParam("pw") String pw) {
//		
//		if(id.equals("abc123")) {
//			if(pw.equals("xxx123")) {
//				return "/request/req_quiz01_ok";
//			}
//		} return "/request/req_quiz01_no";
//		
//	}
	
	//3번째 방법(VO객체 방법)
	@RequestMapping(value = "/login", method= RequestMethod.POST)
	public String login(Quiz01VO vo) {
		
		if(vo.getId().equals("abc123")) {
			if(vo.getPw().equals("xxx123")) {
				return "/request/req_quiz01_ok";
			}
		} return "/request/req_quiz01_no";
		
	}
	
}
