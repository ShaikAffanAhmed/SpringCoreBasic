package com.app.affan.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.affan.Config.AppConfig;
import com.app.affan.Service.Token;
import com.app.affan.Service.TokenService;

public class Test {

	public static void main1(String[] args) {
		 ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		 
		 //reading first time
         TokenService ts1 = ac.getBean("tokenService",TokenService.class);
         Token tk1 = ts1.getToken();
         System.out.println(tk1);
         
         //reading second time
         TokenService ts2 = ac.getBean("tokenService",TokenService.class);
         Token tk2 = ts2.getToken();
         System.out.println(tk2);
	
         //reading third time
         TokenService ts3 = ac.getBean("tokenService",TokenService.class);
         Token tk3 = ts3.getToken();
         System.out.println(tk3);
	}  
	   public static void main(String[] args) {
		 ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		 
	//reading first time
    TokenService ts1 = ac.getBean("tokenService",TokenService.class);
    Token tk1 = ts1.getToken();
    System.out.println(ts1.hashCode()+" "+tk1.hashCode());
    
	//reading second time
    TokenService ts2 = ac.getBean("tokenService",TokenService.class);
    Token tk2 = ts2.getToken();
    System.out.println(ts2.hashCode()+" "+tk2.hashCode());
    
	//reading third time
    TokenService ts3 = ac.getBean("tokenService",TokenService.class);
    Token tk3 = ts3.getToken();
    System.out.println(ts3.hashCode()+" "+tk3.hashCode());
	}
}
