package com.mcnc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	public TestController() {
		System.out.println(1);
	}
	
	@GetMapping("/add")
	public String add() {
		System.out.println("I'm here");
		return "display.html";
	}

}
