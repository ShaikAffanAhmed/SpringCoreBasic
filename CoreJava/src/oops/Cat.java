package oops;

public class Cat extends Animal
{

	@Override
	public void sound() 
	{

      System.out.println("Cat Sound :"+" "+"Meo Meo");
	}

	@Override
	public void move() 
	{
		System.out.println("Cat Move :"+" "+"Walking");
	}
  
}
