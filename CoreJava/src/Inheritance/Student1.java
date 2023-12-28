package Inheritance;

public class Student1 extends Student
{
       int id = 855;
	public static void main(String[] args) 
	{
        Student1 s1 =new Student1();
        System.out.println("Student Name is:"+s1.name);
        System.out.println("Student Id is:"+s1.id);
        System.out.println("Student Fee is:"+s1.fee);
        System.out.println("Student Section is:"+s1.section);
	}
}
