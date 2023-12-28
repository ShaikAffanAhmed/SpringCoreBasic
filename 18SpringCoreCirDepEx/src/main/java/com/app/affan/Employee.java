package com.app.affan;

public class Employee {
	
	private String name;
	
	private Project pob;

	
	public Employee() {
		super();
		System.out.println("EMPLOYEE OBJ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("EMPLOYEE.setPROJECT");
	}

	public Project getPob() {
		return pob;
	}

	public void setPob(Project pob) {
		this.pob = pob;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", pob=" + pob + "]";
	}
	
	

}
