package com.app.affan;

public class Project {

	private String pcode;
	
	private Employee eob;

	public Project() {
		super();
		System.out.println("PROJECT OBJ");
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
		System.out.println("PROJECT.setEMPLOYEE");
	}

	public Employee getEob() {
		return eob;
	}

	public void setEob(Employee eob) {
		this.eob = eob;
	}
	
	@Override
	public String toString() {
		return "Project [pcode=" + pcode + ", eob=" + eob + "]";
	}
	
	
}
