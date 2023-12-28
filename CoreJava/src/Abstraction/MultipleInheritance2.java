package Abstraction;

//with two interfaces
// class  MultipleInheritance2 implements MultipleInheritance,MultipleInheritance1
//{
//   public void print()
//    {
//    	System.out.println("Hiiii");
//    }
//   public void text()
//   {
//	   System.out.println("Welllll");
//   }
//	public static void main(String[] args) 
//	{
//		MultipleInheritance2 MI =new MultipleInheritance2();
//		MI.print();
//		MI.text();
//	}
	
	//with one interfaces
//	class  MultipleInheritance2 implements MultipleInheritance1
//	{
//	   public void print()
//	    {
//	    	System.out.println("Hiiii");
//	    }
//	   public void text()
//	   {
//		   System.out.println("Welllll");
//	   }
//		public static void main(String[] args) 
//		{
//			MultipleInheritance2 MI =new MultipleInheritance2();
//			MI.print();
//			MI.text();
//		}
class  MultipleInheritance2
{
  public static void main(String[] args) 
  {
	  MultipleInheritance mi= new MultipleInheritance1();
	  mi.draw();
	  mi.mesg();
}	
}

