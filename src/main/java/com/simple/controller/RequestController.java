package com.simple.controller;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.simple.command.ReqVO;
import com.simple.command.UserVO;

@Controller
@RequestMapping("/request") //해당 컨트롤러에 들어오는 모든 메소드 요청경로 앞에 공통적으로 붙는 경로
public class RequestController {
		@RequestMapping("/req_ex01")
		public String test(ModelAndView mv) {
			//System.out.println("일단 확인");
			return "request/req_ex01";
		}
		
		//get 요청만 허용
		//@RequestMapping(value = "/basic1",method = RequestMethod.GET)
		@GetMapping("/basic1") //@GetMapping => get만 허용하겠다. 
		public String test2(ModelAndView mv) {
			System.out.println("basic요청");
			return "request/req_ex01";
		}
		
		//@RequestMapping(value = "/basic2",method = RequestMethod.POST)
		@PostMapping("/basic2")
		public String test3(ModelAndView mv) { //Request method 'GET' not supported// Get으로 들어오면 에러
			System.out.println("basic요청");
			return "request/req_ex01";
		}
		
		@RequestMapping(value = "/basic3") 
		public String test4(ModelAndView mv) {// 메소드 방식을 안적으면 get, post 둘다 허용
			System.out.println("basic요청");
			return "request/req_ex01";
		}
		
		///////////////파라미터 값 받기/////////////////////
		@RequestMapping("/req_ex02")
		public String ex02() {
			return "request/req_ex2";
			
		}
		
		//전통적인 방법 ( Request객체 사용)
		/*
		@PostMapping("/param1")
		public String param1(HttpServletRequest request) {
			String name = request.getParameter("name");
			String age = request.getParameter("age");
			
			String[] inter = request.getParameterValues("inter");
			
			return "request/result";
		}
		*/
		
		
		//2번째 방법 @RequestParam(name) => 반드시 값이 전달되어야 한다. 없을시 400 에러
		//required = false는 해당 값이 필수가 아님을 뜻함.
		//defaultValue = 값이 없을 때 기본값
		/*
		@PostMapping("/param1")
		public String param1(
				@RequestParam("name") String name,
				@RequestParam(value =  "age",required = false, defaultValue = "0") int age,
				@RequestParam(value =  "inter", required = false, defaultValue = "") ArrayList<String> inter) {
			
			System.out.println(name);
			System.out.println(age);
			System.out.println(inter.toString());
			
			return "request/result";
		}
		*/
		
		//3. 커맨드객체를 이용하는 방법
		@PostMapping("/param1")
		public String param1(ReqVO vo) {
			
			System.out.println(vo.toString());
			return "request/result";	
		}
		
		@RequestMapping("/req_quiz01")
		public String login() {
			
			return "request/req_quiz01";
		}
		
		
		@PostMapping("/login")
		public String param2(UserVO vo) {
			if(vo.getId().equals("abc123") && vo.getPw().equals("xxx123")) {
				return "request/req_quiz01_ok";	
			}else {
				return "request/req_quiz01_no";
			}
			
		}
}
























