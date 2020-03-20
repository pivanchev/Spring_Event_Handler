package com.pivanchev;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		context.start(); // start the event
		
		Example example = (Example)context.getBean("example");
		example.getMessage();
		
		context.stop(); // stop the event
		
		((ConfigurableApplicationContext)context).close();
		

	}

}
