package Arrays;

import java.util.Arrays;

public class nthSmallestElement {

	public static void main(String[] args) 
	{	    
		int array[] = {10,5,9,4,7,2,1,3}; 
		int min = array[0];
		
//	    Arrays.sort(array);
//		System.out.println("Sorted Array :"+Arrays.toString(array));
				 
		int size1 = array.length;
	    System.out.println("Size of Array :"+size1);
		
	    for(int i=0;i<=array.length-1;i++)
	    {
	         if(array[i] < min )
	         {
	        	 min = array[i];
	         }
	    }
	    System.out.println(min);		
	}
}
