package com.app.affan;

import org.springframework.stereotype.Component;

@Component("pob")
public class ProcessImpl implements IProcess {

	@Override
	public void getProcessCode() {
		System.out.println("P1");
		
	}

}
