package com.example.SampleProject.EmpEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Emp_Details")
public class EmpEn 
{
   @jakarta.persistence.Id
   @Column(name = "Emp_ID")
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer empId;

   @Column(name = "Emp_Name")
   private String empName;

   @Column(name = "Emp_Email")
   private String empEmail;

public Integer getEmpId() {
	return empId;
}

public void setEmpId(Integer empId) {
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public String getEmpEmail() {
	return empEmail;
}

public void setEmpEmail(String empEmail) {
	this.empEmail = empEmail;
}

@Override
public String toString() {
	return "EmpEn [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + "]";
}

   
}
