package com.brendan.login.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondaryController {

	@RequestMapping("/other")
	public String showSecondary() {
		return "This is a secondary route!";
	}

}
