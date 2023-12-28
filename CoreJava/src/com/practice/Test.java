package com.practice;

import java.util.Scanner;

 class Test implements Vehicle {

 
	   String name;
	   double salary;
	   
	   @Override
		public void Input() 
	    {
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter Your Name : ");
		    name=sc.next();
		    
		    System.out.println("Enter Your Salary");
		    salary=sc.nextDouble();	    
		}
	   
	   @Override
		public void Output() 
	   {
		System.out.println("Name :"+name+"    "+"Salary :"+salary);		
		}  
	   
	   public static void main(String[] args) 
	   {
		   Vehicle v = new Test();
		   v.Input();
		   v.Output();
	}
 }
