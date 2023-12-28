package oops;

public class Car extends Vehicle
{
	public Car(String make, String model) 
	{
		super(make, model);	
	}
	
	@Override
	public void start() 
	{
	 System.out.println("Car Starting");
	}
    
	@Override
	public void stop() 
	{
		System.out.println("Car Stopping");
	}
}
