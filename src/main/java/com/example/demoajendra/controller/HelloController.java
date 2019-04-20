package com.example.demoajendra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/helloUser")
	public String getHello() {
		return "Hello Mohit";
	}

}
