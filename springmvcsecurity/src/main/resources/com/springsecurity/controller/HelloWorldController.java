package com.springsecurity.controller;


@Controller
public class HelloWorldController {

	@GetMapping("/helloWorld")
	public String helloWorld() {
		
		return "hello-world";
	}
	
	//@ResponseBody
	//2 more handlers
	
}
