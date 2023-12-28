package oops;

public class Triangle extends Shape 
{
	public double A,d,b,c,h;

	public Triangle(double a, double d, double b, double c, double h) {
		super();
		A = a;
		this.d = d;
		this.b = b;
		this.c = c;
		this.h = h;
	}

	@Override
	void calculateArea() 
	{
		double f = (b*h)*1/2; 
		System.out.println("Area Of Triangle :" + f);
	}

	@Override
	void calculatePerimeter() 
	{
		A=d+b+c;
		System.out.println("Perimeter Of Triangle :" + A);
	}
	
}
