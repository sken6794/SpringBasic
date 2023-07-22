package com.simple.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.ReqVO;
import com.simple.command.UserVO;

@Controller
@RequestMapping("/response")
public class ResponseController {

	@RequestMapping("/res_ex01")
	public void res01() {
		//void로 작성하면 들어오는경로, 나가는 경로가 동일

	}

	//model 전달자
	@RequestMapping("/res_ex02")
	public String res02(Model model) {
		//void로 작성하면 들어오는경로, 나가는 경로가 동일
		model.addAttribute("name","홍길동");
		model.addAttribute("date", new Date());


		return "response/res_ex02";
	}

	//ModelAndView - 데이터와 화면 정보를 동시에 저장하는 객체
	@RequestMapping("/ex03")
	public ModelAndView res03() {
		ModelAndView mv= new ModelAndView();
		//매개변수에 넣어도 돌아감
		mv.addObject("servTime",new Date()); //데이터
		mv.setViewName("response/ex03"); //화면정보

		return mv; 
	}

	//@ModelAttribute(화면에서 넘어오는 key값)
	@RequestMapping("/ex04")
	public String res04(@ModelAttribute("id") String id) {//화면에서 넘어오는 값이 들어간다.

		System.out.println(id);


		return "response/ex04"; 
	}


	//ModelAttribute 객체타입 vo 받아서 xxx이름으로 변경해서 화면으로 전달
	@RequestMapping("/ex05")
	public String res05(@ModelAttribute("xxx") ReqVO vo) {//값자체는 vo에 맞춰서 들어옴
		//=> 다음화면으로 넘길 때 xxx라는 명칭으로 넘긴다.


		System.out.println(vo.toString());

		return "response/ex05"; 
	}

	/////////////////////////////////////////////
	//리디렉션과 리디렉션어트리뷰트
	//화면처리
	@RequestMapping("/join")
	public String join() {

		return "response/join";
	}

	//폼 요청
	@RequestMapping(value = "/joinForm", method = RequestMethod.POST)
	public String joinForm(ReqVO vo, RedirectAttributes re) {
		//joinfrom 정보로 가입처리 했다고 가정
		
		 
		//redirect시 사용하며, 1회성 데이터를 화면에 전달해 줄 수 있다.
		//redirect시 model은 사용할 수 없다.
		re.addFlashAttribute("msg","가입처리 됨");
		//addFlash ~ 는 일회성, 휘발 POST방식
		//addAttr~ GET 방식 새로고침해도 값이 유지됨
		//redirect:/주소(절대경로)
		return "redirect:/";
	}


	@RequestMapping("/res_quiz01")
	public String res_q2() {
		return "response/res_quiz01";
	}



	@RequestMapping(value = "/res_login", method = RequestMethod.POST)
	public String loginForm(UserVO vo, RedirectAttributes re,Model model) {
		
		if(vo.getId().equals("kim12") && vo.getPw().equals("1234")) {
			model.addAttribute("id", vo.getId());
			return "response/res_quiz02";
		} else {
			re.addFlashAttribute("msg",""
					+ "<script type=\"text/javascript\">\r\n"
					+ "		alert(\"아이디와 비밀번호 확인하세요\")\r\n"
					+ "	</script>	");
			return "redirect:/response/res_quiz01";
			
		}
		

		//redirect:/주소(절대경로)
	}

}
















