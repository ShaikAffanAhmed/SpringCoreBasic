package oops;

public class VehicleMain {

	public static void main(String[] args)
	{
          Car car = new Car("Toyota", "Fortuner");
          System.out.println("Car: " + car.getMake() + " " + car.getModel());      
          car.start();
          car.stop();
          
          System.out.println(""); 
          
          MotorCycle motorcycle = new MotorCycle("Yamaha", "R15");
          System.out.println("MotorCycle: " +motorcycle.getMake() + " " + motorcycle.getModel());
          motorcycle.start();
          motorcycle.stop();
	}

}
