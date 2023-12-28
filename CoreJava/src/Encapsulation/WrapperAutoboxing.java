package Encapsulation;

//The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.

public class WrapperAutoboxing
//The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing,
{
public static void main(String[] args) {
	
    int a= 20;
	Integer i=Integer.valueOf(a);
    Integer j=(a);
	System.out.println(a+" "+i+" "+j);
}
}

//public class WrapperUnboxing {
//
//	public static void main(String[] args) 
//	{
//			Integer a =new Integer(3);
//			int y=a.intValue();
//			int z=a;
//			System.out.println(a+" "+y+" "+z);
//
//		}
//	}
 
