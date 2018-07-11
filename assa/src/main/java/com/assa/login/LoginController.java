package com.assa.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("login.do")
	public String login(Model model) {
		model.addAttribute("success", "로그인 성공");
		return "/login/login";
	}
	
}
