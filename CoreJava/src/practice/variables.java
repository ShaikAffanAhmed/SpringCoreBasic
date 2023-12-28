package practice;

public class variables {
          
	static int b=10;  //static 
	 int c=30;  //instance
	public static void main(String[] args)
	{
	    	int a=10; //local
	    	System.out.println(a);
            System.out.println(b);
            variables v = new variables();
            System.out.println(v.c);

	}

}
