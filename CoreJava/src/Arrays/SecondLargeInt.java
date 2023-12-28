package Arrays;

import java.util.Arrays;

public class SecondLargeInt 
{
	public static void main(String[] args) 
	{
		int array[] = {10,50,90,60};
		int size = array.length;
		System.out.println("Size of Array :"+size);
		
		Arrays.sort(array);
		System.out.println("Sorted Array :"+Arrays.toString(array));
		
		int res = array[size-2];
		System.out.println("Second Largest Array :"+res);		
	}
}
