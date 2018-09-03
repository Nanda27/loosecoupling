package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Mainapp {
public static void main(String[] args) {
	

	// TODO Auto-generated constructor stub
	ApplicationContext app=new ClassPathXmlApplicationContext("resource/spring.xml");
	/*flipkart f=(flipkart)app.getBean("f");
	f.purchase();*/
	/*car c=(car)app.getBean("c");
	c.display();*/
	/*flipkart2 f=(flipkart2) app.getBean("f");
	f.purchase();*/
	carrr c=(carrr) app.getBean("c");
	c.displaycarnames();
	c.displayenginenames();
	
	
}
}
