package com.mteng.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		OutputHelper outputHelper = (OutputHelper) context.getBean("outputHelper");
		outputHelper.output();
	}
}
