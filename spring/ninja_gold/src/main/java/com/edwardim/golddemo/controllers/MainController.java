package com.edwardim.golddemo.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@GetMapping("")
	public String index() {
		return "redirect:/gold";
	}
	
//	@RequestMapping("/gold")
	@GetMapping("/gold")
	public String gold(HttpSession session, Model model) {
		if( session.getAttribute("pouch") == null ) {
			session.setAttribute("pouch", 0);
			ArrayList<String> log = new ArrayList<String>();
			session.setAttribute("log", log);
		}
		
//		GRABBING THE CURRENT LOG FROM SESSION
		ArrayList<String> log = (ArrayList<String>) session.getAttribute("log");
//		PASSING THAT INFORMATION TO THE JSP
		model.addAttribute("log",log );
		return "index.jsp";
	}
	
//	@RequestMapping(value="/process_money", method=RequestMethod.POST)
	@PostMapping("/process_money")
	public String process(@RequestParam(value="place") String place, HttpSession session) {
		
//		1. GRAB CURRENT GOLD AND CURRENT LOG FROM INSIDE SESSION
		int currentGold = (int) session.getAttribute("pouch");
		ArrayList<String> log = (ArrayList<String>) session.getAttribute("log");
		
//		2. DETERMINE NEW AMOUNT OF GOLD TO BE ADDED AND ADD TO CURRENT GOLD SAME WITH
//		LOG
		if(place.equals("farm")) {
			int random_int = (int) ((Math.random() * (21 - 10)) + 10);
			currentGold += random_int;
			String act = "You've made " + random_int + " from farm";
			log.add(0, act);
		}
		else if(place.equals("cave")) {
			int random_int = (int) ((Math.random() * (11 - 5)) + 5);
			currentGold += random_int;
			String act = "You've made " + random_int + " from cave";
			log.add(0, act);
		}
		else if(place.equals("house")) {
			int random_int = (int) ((Math.random() * (6 - 2)) + 2);
			currentGold += random_int;
			String act = "You've made " + random_int + " from house";
			log.add(0, act);
		}
		else if(place.equals("casino")) {
			int random_int = (int) ((Math.random() * (51 - -50)) + -50);
			currentGold += random_int;
			String act = "You've made " + random_int + " from casino";
			log.add(0, act);
		}
		
//		3. TAKE NEW AMOUNT FOR CURRENT GOLD AND LOG THEN UPDATE SESSION
		session.setAttribute("pouch", currentGold);
		session.setAttribute("log", log);
		
//		4. REDIRECT BACK TO INDEX.JSP
		return "redirect:/gold";
	}
	
	
	@GetMapping("/destroy_session")
	public String clear(HttpSession session) {
		session.invalidate();
		return "redirect:/gold";
	}
}
