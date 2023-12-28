package basicPrograms;

import oops.Student;

public class Studentinfo 
{
	public static void main(String[] args) 
	{
     	    Student S = new Student("Shaik",24,"A");
		    System.out.println("Student Name :"+S.getName()+"\r\n"+"Student Age :"+S.getAge()+"\r\n"+"Student Grade :"+S.getGrade());	
	}
}  