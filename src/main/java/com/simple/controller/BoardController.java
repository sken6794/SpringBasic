package com.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.BoardVO;
import com.simple.service.BoardService;

@Controller
@RequestMapping("/service")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	
	@RequestMapping("/boardRegister")
	public String boardPage() {
		
		return "service/boardRegister";
	}
	
	
	@RequestMapping("/boardForm")
	public String boardRegist(BoardVO vo, RedirectAttributes re) {
		if(vo.getName().equals("") || vo.getTitle().equals("") || vo.getContent().equals("")) {
			re.addFlashAttribute("msg","alert(\"빈 칸을 작성하세요\");");
			
			return "redirect:/service/boardRegister";
		}
			
			
		boardService.boardRegist(vo);
		
		return "service/boardResult";
	}
	
	@RequestMapping("/boardList")
	public String boardList(Model model) {
		
		model.addAttribute("list",boardService.getList());
		return "service/boardList";
	}
	
	@RequestMapping("/boardDelete")
	public String boardDelete(int num) {
		
		boardService.boardDelete(num);
		return "redirect:/service/boardList";
	}
	
	
}
