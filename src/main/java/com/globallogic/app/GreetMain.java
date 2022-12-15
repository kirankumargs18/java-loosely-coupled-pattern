package com.globallogic.app;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.globallogic.config.GreetConfig;
import com.globallogic.service.GreeterService;

public class GreetMain {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GreetConfig.class)) {

			GreeterService service = context.getBean(GreeterService.class);
			service.printGreeting();

		} catch (BeansException e) {

			e.printStackTrace();
		}

	}

}
