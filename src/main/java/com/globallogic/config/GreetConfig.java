package com.globallogic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.globallogic.dao.GoodDayGreeting;
import com.globallogic.dao.MorningGreeting;
import com.globallogic.service.GreeterService;

@Configuration
public class GreetConfig {

	@Bean
	public GoodDayGreeting goodDayGreeting() {

		return new GoodDayGreeting("Have a Good Day");
	}

	@Bean
	public MorningGreeting morningGreeting() {

		return new MorningGreeting("Good Morning");
	}
	
	@Bean
	public GreeterService greeterService() {
		
		return new GreeterService();
	}
}
