package com.brendan.login.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
	

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	
	@RequestMapping(path="/submit", method=RequestMethod.POST)
	public String process(@RequestParam(value="name") String name, HttpSession session) {
		session.setAttribute("name", name);
		return "redirect:/show";
	}
	
	
	@RequestMapping("/show")
	public String show(HttpSession session, Model model) {
		if(session.getAttribute("name") != null) {
			model.addAttribute("name", session.getAttribute("name"));
			session.removeAttribute("name");
			return "result.jsp";			
		}else {
			return "redirect:/test";
		}
	}
	
	@RequestMapping("/test")
	public String error() {
		return "error.jsp";
	}

}
