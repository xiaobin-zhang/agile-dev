package com.agile.demo.init;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Configuration;
@Configuration
public class Init {

	@PostConstruct
	public void init() {
		System.out.println("PostConstruct....");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("PreDestroy....");
	}
}
