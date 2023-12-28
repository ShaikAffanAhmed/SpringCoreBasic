package exceptionhandling;

public class FinallyBlock {

	public static void main(String[] args) 
	{
          try
          {
        	  System.out.println("Hi Hm..");
        	  int num = 5/0;
          }
          catch(ArithmeticException e)
          {
        	  System.out.println("hmmm"); 
        	 // int num = 5/0;
          }
           finally
           {
        	   System.out.println("Finally block execute");
           }
	}

}
