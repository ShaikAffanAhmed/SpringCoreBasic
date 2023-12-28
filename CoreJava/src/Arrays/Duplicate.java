package Arrays;

public class Duplicate 
{
	public static boolean Duplicates(int[] array) 
	{
	  for (int i = 0; i < array.length - 1; i++) 
	  {
		  for (int j = i + 1; j < array.length; j++) 
		  {
		      if (array[i] == array[j]) 
		      {
		           return true; // Found a duplicate
	          }
		  }
      }
		        return false; // No duplicates found
    }

	 public static void main(String[] args) 
     {
		 int[] numbers = { 5, 2, 8, 1, 3, 6 }; // Example array with duplicates
	     boolean Duplicates = Duplicates(numbers);
		        
		        if (Duplicates) {
		            System.out.println("The array contains duplicate elements.");
		        } else {
		            System.out.println("The array does not contain duplicate elements.");
		        }
		    }
       }

	
