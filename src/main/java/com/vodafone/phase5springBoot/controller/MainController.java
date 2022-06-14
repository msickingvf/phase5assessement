package com.vodafone.phase5springBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@GetMapping("/hello")
	public String greeting(Model model) {
		String text = "Phase 5 Spring Boot test application";
		model.addAttribute("text", text);
		return "greeting";
	}
}
