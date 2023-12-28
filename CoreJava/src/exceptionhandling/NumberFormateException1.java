package exceptionhandling;

public class NumberFormateException1 {

	public static void main(String[] args) 
	{ 
         try 
         {
           	  System.out.println("Try Block Execute");
              System.out.println(15/0);
         }
         catch (ArithmeticException e)
         {
        	 System.out.println(20/5);
         }
 
	}

}
