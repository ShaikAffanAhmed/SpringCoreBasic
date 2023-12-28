//same object having different behavior is known as Polymorphism

package Polymorphism;

//If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

public class MethodOverLoading 
{
   static int add(int a,int b)
   {
  	 return(a+b);		 
   }
   static double add(int a ,int b,int c)
   {
  	 return(a+b+c);
   }
	
	   void sum(int a,int b)
	   {
		   System.out.println(a+b);
	   }
	   
	   void sum(int a,int b,int c)
	   {
		   System.out.println(a+b+c);
	   }
	   
	   public static void main(String[] args) 
		{
	          System.out.println(MethodOverLoading.add(10,10));    //direct calling the method
	          System.out.println(MethodOverLoading.add(10,10,10));
	          
			MethodOverLoading m1=new MethodOverLoading();   //through object creation
			m1.sum(11,11);
			m1.sum(10,10,10);
		}
}