package com.example.DemoProject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoProjectApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context =SpringApplication.run(DemoProjectApplication.class, args);
		
		Alien a =context.getBean(Alien.class);
		a.show();
		
	
	}

}
