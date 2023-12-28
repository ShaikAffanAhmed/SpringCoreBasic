package oops;

public class Rectangle1 extends Shape1 {

	public double length;
	public double width;
	
	public Rectangle1(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public void calculateArea() {
		
		System.out.println("Aread of Rectangle : "+length*width);
	}
	

}
