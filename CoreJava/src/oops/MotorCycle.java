package oops;

public class MotorCycle extends Vehicle 
{
	public MotorCycle(String make, String model) 
	{
		super(make, model);		
	}
 
	@Override
	public void start() 
	{		
	   System.out.println("MotorCycle Starting");
	}
	
	 @Override
	public void stop() 
	{
	   System.out.println("MotorCycle Stopping");	
	}
}
