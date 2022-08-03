package com.example.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homecontroller {
	@GetMapping("/hello")
	public String helloApi()
	{
		return "hello spring rest API";
	}

}
