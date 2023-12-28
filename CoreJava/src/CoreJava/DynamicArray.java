package CoreJava;
import java.util.Scanner;
public class DynamicArray {

	public static void main(String[] args) 
	{
    int size,i;
    Scanner V = new Scanner(System.in);
    System.out.println("Enter size of array:");
    size=V.nextInt();
    int a[]=new int[size];
    for(i=0;i<size;i++)
    {
    	a[i]=V.nextInt();
    }
    System.out.println("Print Array Element");
	
	for(i=0;i<size;i++)
    {
    	System.out.println(a[i]+" ");
    }
	}
}

