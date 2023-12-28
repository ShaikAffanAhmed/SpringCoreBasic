package CoreJava;

public class Palindrome 
{
	 public static void main(String args[])  
	  
	 {  
	 String original, reverse = "";// Objects of String class  
	 original = "affan";
    int length = original.length();
    
    if(length>0)
    {
    int i=0;
    while(i<length-1) 
    {
       reverse = reverse + original.charAt(i); 
    }
    }
    if (original.equals(reverse))  {
       System.out.println("Entered string/number is a palindrome.");
    }
    else
    {
       System.out.println("Entered string/number isn't a palindrome.");   
 }  
}
}
   
    

