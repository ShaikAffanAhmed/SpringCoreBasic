package com.app.jdbc;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_Insert {

		public static void main(String[] args) 
		{
			try 
			{
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mindblenders");
	                                                   //(//API,DB,DRIVER,PERFORMING,PORTNO.ORACLE SERVICE,USERNAME,PASSWORD//)
	        PreparedStatement psmt= con.prepareStatement("insert into Student values(?,?,?,?)");
	         
	        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	        
	        while(true)
	        {
	        	System.out.println("Enter Student rollno.: ");
	        	int StdRNo = Integer.parseInt(br.readLine());
	        	
	        	System.out.println("Enter Student address : ");
	        	String Stdadd = br.readLine();
	        	
	        	System.out.println("Enter Student name : ");
	        	String Stdname = br.readLine();
	        	
	        	System.out.println("Enter Student Mob no.: ");
	        	int StdMno = Integer.parseInt(br.readLine());
	        	
	        	psmt.setInt(1,StdRNo);
	        	psmt.setString(2, Stdadd);
	        	psmt.setString(3, Stdname);
	        	psmt.setInt(4, StdMno);
	        	
	        	int count=psmt.executeUpdate();
	        	if(count>0)
	        		System.out.println(count+"Data inserted");	
	        	else
	        		System.out.println("No Data inserted");
	        	
	        	System.out.println("DO you want to insert more Data[Yes/No]");
	        	
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
