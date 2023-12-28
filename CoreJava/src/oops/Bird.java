package oops;

public class Bird extends Animal 
{
	@Override
	public void sound() 
	{
		System.out.println("Bird Sound :"+" "+"Chien Chien");
	}

	@Override
	public void move() 
	{
		System.out.println("Bird Move :"+" "+"Flying");
	}
     
	public static void main(String[] args) 
	{
	   Bird b = new Bird();
	   b.sound();
	   b.move();
	   System.out.println(" ");
	   
	   Dog d = new Dog();
	   d.sound();
	   d.move();
	   System.out.println(" ");
	   
	   Cat c = new Cat();
	   c.sound();
	   c.move();
	}
}
