package com.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ScoreVO;
import com.simple.service.ScoreService;

@Controller
@RequestMapping("/service")
public class ScoreController {

	//1st
	//ScoreService service = new ScoreServiceImpl();

	//2nd - 직접 빈등록 자동주입
	//	@Autowired
	//	ScoreService service;

	//3rd
	@Autowired
	@Qualifier("scoreService") //동일한 인터페이스를 받는 구현체가 많을경우 에러가 발생할 수 있음 service 어노테이션을 달면서 이름을 지정해주어야 함
	ScoreService scoreService;
	
	//등록화면
	@RequestMapping("/scoreRegist")	
	public String regist() {
		return "service/scoreRegist";
	}

	//목록화면
	@RequestMapping("/scoreList")
	public String scoreList(Model model) {
		
		//데이터를 모델에 실어서 화면에 보내주는 작업
		model.addAttribute("list",scoreService.getScores());
		
		return "service/scoreList";
	}
	//결과화면
	@RequestMapping("/scoreResult")
	public String scoreResult() {
		return "service/scoreResult";
	}

	//등록요청
	@RequestMapping(value = "/scoreForm", method = RequestMethod.POST)
	public String scoreForm(ScoreVO vo) {

		scoreService.scoreRegist(vo);


		return "redirect:/service/scoreResult";
	}
	
	//삭제요청
	@RequestMapping("/scoreDelete")
	public String scoreDelete(@RequestParam("num") int index) {
		scoreService.scoreDelete(index);
		
		return "redirect:/service/scoreList"; //삭제하고 나면 컨트롤러의 List 띄우는 요청으로
	}
	
	
}
