package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
	   AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
	   ac.scan("com.app");
	   // ac.refresh();
	   //Object ob = ac.getBean("eobj");
//	   Object ob = ac.getBean("cob");
//     Object ob1 = ac.getBean("eobj");
	  // Object ob3 = ac.getBean("vr");
//	   System.out.println(ob1);
//	   System.out.println(ob);
	   System.out.println(ac);
	   
	}

}
