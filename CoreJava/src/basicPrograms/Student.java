package basicPrograms;

/*Question 1:
Student Class: Create a Student class with attributes name, age, and grade. Implement methods to
set and get these attributes. Write a displayInfo() method to display the student's information.*/

 public class Student 
{
    private String name;
    private int age;
    private String grade;
    
    public String getname()
    {
    	return name;
    }
    
    public void setname(String name)
    {
    	this.name=name;
    }
    
    public int getage()
    {
    	return age;
    }
    
    public void setage(int age)
    {
    	this.age=age;
    }
    
    public String getgrade()
    {
    	return grade;
    }
    
    public void setgrade(String grade)
    {
    	this.grade=grade;
    }
  
    public Student(String name, int age, String grade) {
		
 			this.name = name;
 			this.age = age;
 			this.grade = grade;
 		}
}   
 
 
 

