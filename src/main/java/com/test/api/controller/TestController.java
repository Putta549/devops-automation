package com.test.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/welcome")
	public String sayHello() {
		System.out.println("Welcome to devops integration");
		return "Welcome to devops integration";
	}
}
