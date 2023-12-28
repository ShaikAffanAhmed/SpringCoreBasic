package exceptionhandling;

public class ArithmaticException1 
{
	public static void main(String[] args) 
	{      
		int a=10;
		int b=0;
		
	       try 	  
		  {
		 		System.out.println("Try Execute...");
	    	   System.out.println(a/b);
		  }
	       catch(ArithmeticException e)
	       {
	    	   System.out.println("Error Occur");
	    	   System.out.println(a/0);
	       }
		  
	  
}
}
