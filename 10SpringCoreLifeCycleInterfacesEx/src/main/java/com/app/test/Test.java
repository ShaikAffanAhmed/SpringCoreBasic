package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	 ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	 Object ob = ac.getBean("eobj");
	 System.out.println(ob);
	 ac.close();
	}
}
