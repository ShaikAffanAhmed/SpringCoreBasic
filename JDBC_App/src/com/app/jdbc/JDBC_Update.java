package com.app.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Update {

	public static void main(String[] args)
	{
		  String Value;
		  int EmpId;
		  int Empno;
			try 
			{
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mindblenders");
	                                                   //(//API,DB,DRIVER,PERFORMING,PORTNO.ORACLE SERVICE,USERNAME,PASSWORD//)
	        Statement smt= con.createStatement();
	        
	        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	        
	        	System.out.println("Enter Emp Id : ");
	        	Value = br.readLine();
	        	EmpId = Integer.parseInt(Value);
	            
	        	System.out.println("Enter Emp new Number : ");
	        	Value = br.readLine();
	        	Empno = Integer.parseInt(Value);
	        	
	        	
	        	int count=smt.executeUpdate("update Emp set Empno="+Empno+" where EmpId="+EmpId);
	        	if(count>0)
	        		System.out.println(count+"Record Updated.");	
	        	else
	        		System.out.println("No record Found");
	         }
			catch(Exception e)
			{
				 System.out.println(e);
			}
		}
	}


