package com.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 
 public class JDBC_Connect {

	public static void main(String[] args) 
	{
		try 
		{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mindblenders");
                                                   //(//API,DB,DRIVER,PERFORMING,PORTNO.ORACLE SERVICE,USERNAME,PASSWORD//)
        Statement smt=con.createStatement();
        smt.executeUpdate("create table Student(StdRNo number,Stdadd varchar(20),Stdname varchar(12),StdMno number)");//creating table 
        
        System.out.println("Table Created Successfully");
        con.close(); 
		}
		catch(Exception e)
		{
			 System.out.println(e);
	    }  
	}

}

