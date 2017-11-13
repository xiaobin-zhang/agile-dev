package com.agile.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	
	@RequestMapping("/")
	public String welcome(){
		System.out.println("Hellow ,Welcome to agile-dev,8098");
		return "Hellow ,Welcome to agile-dev,8098";
	}
	
}
