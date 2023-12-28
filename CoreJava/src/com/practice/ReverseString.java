package com.practice;

public class ReverseString {
 
//	public static boolean isPalindrome(String str)
//	{   
//		boolean ans=false;
//	
//		String rev = "";
//		for(int i=0;i<str.length();i++)
//        {
//			rev=str.charAt(i)+rev; 	
//        }
//		if(str.equals(rev)) 
//		{
//			ans=true;
//			System.out.println(" Is Palindrome");
//		}
//		else
//		{
//			System.out.println("Not Palindrome");
//		}
//		
//		return ans;
//	}
//	
//	public static void main(String[] args) 
//	{
//	         String str="Arava pratap";
//	         str=str.toLowerCase();     
//	         ReverseString ctc = new ReverseString();
//	         boolean A=ctc.isPalindrome(str);
//	            
//	         System.out.println(A);
//
//}
//}
	public static void isPalindrome(String str)
	{   
		//boolean ans=false;
	
		String rev = "";
		for(int i=0;i<str.length();i++)
        {
			rev=str.charAt(i)+rev; 	
        }
		if(str.equals(rev)) 
		{
		 //	ans=true;
			System.out.println(" Is Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		//return ans;
	}
	
	public static void main(String[] args) 
	{
	         //String str="Arava pratap";
	         String str="AffA";
	         str=str.toLowerCase();     
	         ReverseString ctc = new ReverseString();
	         ctc.isPalindrome(str);
	            
	         System.out.println(ctc);

}
}
