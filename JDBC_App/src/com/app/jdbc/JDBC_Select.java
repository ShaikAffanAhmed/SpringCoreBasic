package com.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Select {

	public static void main(String[] args) 
	{

		try 
		{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mindblenders");
                                                   //(//API,DB,DRIVER,PERFORMING,PORTNO.ORACLE SERVICE,USERNAME,PASSWORD//)
        Statement smt=con.createStatement();
        ResultSet rs =smt.executeQuery("select * from Student");
        
        while(rs.next())
        {
        	int StdRNo =rs.getInt(1);
        	String Stdadd =rs.getString(2);
        	String Stdname =rs.getString(3);
        	int StdMno =rs.getInt(1);

        	System.out.println("Student Rollno:"+StdRNo);
        	System.out.println("Student Address:"+Stdadd);
        	System.out.println("Student Name:"+Stdname);
        	System.out.println("Student Mobno:"+StdMno);
        	System.out.print("\n ");
        }
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
	}
	}

