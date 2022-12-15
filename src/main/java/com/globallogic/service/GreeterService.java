package com.globallogic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.globallogic.dao.Greeting;

public class GreeterService {

	@Qualifier("morningGreeting")
	@Autowired
	private Greeting greeting;

	public GreeterService() {
		super();
	}

	public GreeterService(Greeting greeting) {
		super();
		this.greeting = greeting;
	}

	public Greeting getGreeting() {
		return greeting;
	}

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}

	public void printGreeting() {

		System.out.println(greeting.greet());
	}

}
