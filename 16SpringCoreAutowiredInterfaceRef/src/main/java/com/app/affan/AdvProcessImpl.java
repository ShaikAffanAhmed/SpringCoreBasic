package com.app.affan;

import org.springframework.stereotype.Component;

@Component
public class AdvProcessImpl implements IProcess {

	@Override
	public void getProcessCode() {
		System.err.println("P2");
		
	}

}
