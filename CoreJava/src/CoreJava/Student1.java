package CoreJava;

public class Student1 {

	  //main method out side the class
	public static void main(String[] args) 
	{
//          Student S1 =new Student();
//          System.out.println(S1.a);
//          System.out.println(S1.Name);
		
		    //1)initialization through reference
		    Student S1 = new Student();
		    Student S2 = new Student();
		    
		    S1.b=40;
		    S1.Data="City";
		    S2.b=50;
		    S2.Data="State";
		    System.out.println(S1.b+" "+S1.Data);
		    System.out.println(S2.b+" "+S2.Data);
	}

}