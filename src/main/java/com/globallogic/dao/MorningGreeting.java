package com.globallogic.dao;

public class MorningGreeting implements Greeting {

	private String greeting;

	public MorningGreeting() {
		super();
	}

	public MorningGreeting(String greeting) {
		super();
		this.greeting = greeting;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public String greet() {

		return greeting;
	}

}
