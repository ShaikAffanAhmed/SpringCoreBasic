package oops;

public class Circle1 extends Shape1
{
     public double radius;
     
	public Circle1(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		
		System.out.println("Area Of Circle : "+Math.PI*radius*radius);
	}
     
}
