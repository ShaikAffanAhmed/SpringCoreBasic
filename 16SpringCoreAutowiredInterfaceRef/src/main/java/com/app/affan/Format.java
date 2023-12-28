package com.app.affan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Format {
    @Autowired
	//@Autowired(required = false)
	private IProcess pob;
	
	public void PrintForamt() {
		pob.getProcessCode();
		System.out.println("FROM FORMAT");
	}
}
