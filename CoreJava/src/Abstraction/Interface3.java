package Abstraction;

public class Interface3 implements Interface2 
{
     public int print()
     {
         return 40;
     }
     public int main()
     {
    	 return 50;
     }
    public void test()
     {
    	 System.out.println("Helllll0000");
     }
    public int text()
    {
        return 100;
    }
       public static void main(String[] args) 
	 {
		Interface2 In=new Interface3();
		System.out.println("print This:"+In.print());
		System.out.println("This Is:"+In.main());
		In.test();
		System.out.println("This Iss:"+In.text());

     }
	
	
}