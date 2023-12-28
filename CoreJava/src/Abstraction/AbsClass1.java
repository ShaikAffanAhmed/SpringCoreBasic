package Abstraction;

public class AbsClass1 extends AbsClass 
{
         void run()
         {
        	 System.out.println("Hi");
         }
     	public static void main(String[] args) 
     	{
     		AbsClass ac=new AbsClass1();
     		ac.run();
         }

}
