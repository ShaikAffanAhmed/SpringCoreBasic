package CoreJava;

public class TypeCasting {
	
	public static void main(String[] args)
	{
		//Widening Casting (automatically) - converting a smaller type to a larger type size
		//Widening casting is done automatically when passing a smaller size type to a larger size type:
		int x=10;
		double y = x;
		System.out.println(y);
		
		
		//Narrowing Casting (manually) - converting a larger type to a smaller size type
		//Narrowing casting must be done manually by placing the type in parentheses in front of the value:
		
		double a = 20d;
		int b = (int)a;
		System.out.println(b);
		
	}
}


