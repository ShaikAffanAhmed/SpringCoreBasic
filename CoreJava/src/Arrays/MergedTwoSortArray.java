package Arrays;

import java.util.Arrays;

public class MergedTwoSortArray
{
	public static void main(String[] args)
	{
	    int arrayA[] = {2,6,1,4,3,5};
	    int arrayB[] = {10,40,20,60,30,50};
	    
//	    int size1 = arrayA.length;
//	    System.out.println("Size of Array1 :"+size1);
//	    
//	    int size2 = arrayB.length;
//	    System.out.println("Size of Array2 :"+size2);
	    
	    Arrays.sort(arrayA);
	    System.out.println("Sorted Array1 :"+Arrays.toString(arrayA));
	    
	    Arrays.sort(arrayB);
	    System.out.println("Sorted Array2 :"+Arrays.toString(arrayB));   
	    
	    int[] mergedArray = new int[arrayA.length + arrayB.length];

        for (int i = 0; i < arrayA.length; i++) 
        {
            mergedArray[i] = arrayA[i];
        }

        for (int i = 0; i < arrayB.length; i++) {
            mergedArray[arrayB.length + i] = arrayB[i];
        }

        System.out.println("Merged Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
	   	    
	}

}
		
		 