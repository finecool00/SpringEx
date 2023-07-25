package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.BoardVO;
import com.simple.service.BoardService;

@Controller
@RequestMapping("/service")
public class BoardController {

	//컨트롤러 - 서비스 연결
	@Autowired
	@Qualifier("boardService")
	BoardService boardService;
	
	
	//목록화면
	@RequestMapping("/boardList")
	public void boardList(Model model) {
		
		ArrayList<BoardVO> list = boardService.getList();
		model.addAttribute("list", list);
		
	}
	
	//등록화면
	@RequestMapping("/boardRegister")
	public void boardRegister() {}
	
	//결과화면
	@RequestMapping("/boardResult")
	public void boardResult() {}
	
	
	//등록처리
	@RequestMapping("/boardForm")
	public String boardForm(BoardVO vo) {
		
		boardService.boardRegist(vo);
		
		return "redirect:/service/boardResult";
	}
	
	//삭제처리
	@RequestMapping("/boardDelete")
	public String boardDelete(@RequestParam("num") int num) {
		
		boardService.boardDelete(num);
		
		return "redirect:/service/boardList";
	}
	
	
}
