package com.app.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Delete {

	public static void main(String[] args) 
	{
      
		try 
		{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mindblenders");
                                                   //(//API,DB,DRIVER,PERFORMING,PORTNO.ORACLE SERVICE,USERNAME,PASSWORD//)
        Statement smt= con.createStatement();
         
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        while(true)
        {
        	System.out.println("Enter Delete Emp Number : ");
        	int Empno = Integer.parseInt(br.readLine());
        	
        	
        	int count=smt.executeUpdate("delete from EMP where Empno="+Empno);
        	if(count==1)
        		System.out.println(count+"rows deleted");	
        	else
        		System.out.println("No rows deleted");
        	
        	System.out.println("DO you want to insert more records[Yes/No]");
        	
        	String ch=br.readLine();
        	if(ch.equalsIgnoreCase("No"))
        	break;
        }
         }
		catch(Exception e)
		{
			 System.out.println(e);
		}
	}
	}

