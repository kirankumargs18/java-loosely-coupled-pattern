package com.globallogic.dao;

public class GoodDayGreeting implements Greeting {

	private String greeting = "Have a Good Day";

	public GoodDayGreeting() {
		super();
	}

	public GoodDayGreeting(String greeting) {
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
