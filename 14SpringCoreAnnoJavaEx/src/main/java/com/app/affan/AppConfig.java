package com.app.affan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@ComponentScan("com.app.affan")
@Configuration
public class AppConfig {

	 //1. Bean = 1 method
	 @Bean
	 @Scope("prototype")
	 public Token t1()
	 {
		 return new Token();
	 }
	 
}
