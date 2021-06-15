package com.edwardim.dojoninja.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.edwardim.dojoninja.models.Dojo;
import com.edwardim.dojoninja.models.Ninja;
import com.edwardim.dojoninja.services.MainService;

@Controller
public class MainController {
	
	@Autowired
	private MainService mainServ;
	
	@GetMapping("")
	public String index() {
		return "redirect:/dojos/new";
	}
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojoObj")Dojo dojo) {
		return "index.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String createDojo(@Valid @ModelAttribute("dojoObj")Dojo dojo,BindingResult results) {
		if(results.hasErrors()) {
			return "index.jsp";
		}
		else {
			mainServ.createDojo(dojo);
			return "redirect:/ninjas/new";
		}
	}
	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninjaObj")Ninja ninja, Model model) {
		model.addAttribute("allDojos", mainServ.getAllDojos());
		return "newNinja.jsp";
	}
	@PostMapping("/ninjas/new")
	public String createDojo(@Valid @ModelAttribute("ninjaObj")Ninja ninja,BindingResult results, Model model) {
		if(results.hasErrors()) {
			model.addAttribute("allDojos", mainServ.getAllDojos());
			return "newNinja.jsp";
		}
		else {
			Ninja newNinja = mainServ.createNinja(ninja);
			Long id = newNinja.getDojo().getId();
			String str = String.format("redirect:/dojos/%s", id);
			return str;
		}
	}
	
	@GetMapping("/dojos/{id}")
	public String dojo(@PathVariable("id")Long id, Model model) {
		Dojo dojo = mainServ.getDojoById(id);
		List<Ninja> ninjas = mainServ.getNinjasNotInDojo(dojo);
		model.addAttribute("dojo", dojo);
		model.addAttribute("ninjas", ninjas);
		return "dojo.jsp";
	}
}
