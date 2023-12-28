package oops;

public class Triangle1 extends Shape1 
{
	public double base;
	public double hight;

	public Triangle1(double base, double hight) {
		super();
		this.base = base;
		this.hight = hight;
	}

	@Override
	public void calculateArea() 
	{
	   System.out.println("Area Of Triangle :"+(base*hight)*1/2 );
	}
  
}
