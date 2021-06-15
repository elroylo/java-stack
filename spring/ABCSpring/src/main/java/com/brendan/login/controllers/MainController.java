package com.brendan.login.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/example")
	public String slash() {
		return "<h1>Hello world, welcome to my first Spring Boot!</h1>";
	}
	

	@RequestMapping("/index")
	public String index() {
		return "<h1>This is index!!</h1>";
	}
	
	
   @RequestMapping("/m/{track}/{module}/{lesson}")
    public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson){
    	return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
    }
   
   	@RequestMapping("/user/{id}")
   	public String showUser(@PathVariable("id") String id) {
   		
   		return "Hello world, this is user number " + id;
   	}
   	

}
