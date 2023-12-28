package Abstraction;

//without extends keyword
//interface MultipleInheritance1 
//{
//   void text();  
//}

//with extends keyword
//interface MultipleInheritance1 extends MultipleInheritance
//{
//   void text();  
//}
  
class MultipleInheritance1 implements MultipleInheritance
{
	public void draw()
	{
		System.out.println("Racing");
		System.out.println("MultipleInheritance1.draw()");
	}
}