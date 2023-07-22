package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.User2VO;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	@RequestMapping("/quiz01")
	public String quiz01() {
		
		return "/quiz/quiz01";
	}
	
	@RequestMapping("/birth")
	public String quiz01_1(@RequestParam("year") String year,
			@RequestParam("month") String month,
			@RequestParam("day") String day, Model model) {
		model.addAttribute("year", year);
		model.addAttribute("month", month);
		model.addAttribute("day", day);
		
		return "/quiz/quiz01_ok";
	}
	
	@RequestMapping("/quiz02")
	public String quiz02() {
		
		return "/quiz/quiz02";
	}

	@RequestMapping("/join")
	public String quiz02_1(User2VO vo, Model model) {
		model.addAttribute("user",vo);
		
		return "/quiz/quiz02_ok"; 
	}
	
	@RequestMapping("/quiz03")
	public String quiz03() {
		
		return "/quiz/quiz03";
	}
	
	@RequestMapping("/join2")
	public String quiz03_1(Model model,RedirectAttributes re, @RequestParam("id") String id,
			@RequestParam("pw") String pw, @RequestParam("pw_check") String pw_check) {
		
		if(id.equals("")) {
			re.addFlashAttribute("msg","아이디 입력하세요");
			return "redirect:/quiz/quiz03";
		} else if(!pw.equals(pw_check)) {
			re.addFlashAttribute("msg2","비밀번호가 다릅니다");
			return "redirect:/quiz/quiz03";
		} else {
			model.addAttribute("id",id);
			return "/quiz/quiz03_ok"; 
		}
	}
	
}
