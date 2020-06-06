package io.nayan.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Book {
	
	@GetMapping
	public String defaultMethod()
	{
		return "Hello!! I am here !!!";
	}

}
