package practice;

public class Methodoverloading 
{
   static void add()
   {
	   System.out.println("No argument");
   }
   
   static void add(double a)
   {
	   System.out.println(a);
   }
   
   
   
   public static void main(String[] args) {
	
	   add();
	   add(10f);	 
	   
	   int a = 500;
	   System.out.println(a);
	   byte b = (byte)a;
	   System.out.println(b);
	   
}
}
