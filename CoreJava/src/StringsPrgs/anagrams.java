package StringsPrgs;

import java.util.Arrays;

public class anagrams 
{
public static void main(String[] args) 
{
	   String str1 = "Affan";
	   String str2 = "nffAa";
	   
	   str1 = str1.replaceAll("\\s", "").toLowerCase();
	   str2 = str2.replaceAll("\\s", "").toLowerCase();
	   
	   char[] ch1 = str1.toCharArray();
	   char[] ch2 = str2.toCharArray(); 
	   
	   Arrays.sort(ch2);
	   Arrays.sort(ch1);
	   
	   boolean res=Arrays.equals(ch1, ch2);
	   if(res==true)
	   {
		   System.out.println("Anagram");
	   }else
	   {
		   System.out.println("Not an Anagram");
	   }
}
}