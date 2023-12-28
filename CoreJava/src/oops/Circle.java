package oops;

public class Circle extends Shape
{
    public double a,r;
    
	public Circle(double a, double r) {
		super();
		this.a = a;
		this.r = r;
	}

	@Override
	void calculateArea()
	{
		a=(3.14* (r*r));
		System.out.println("Area Of Circle :" + a);
	}

	@Override
	void calculatePerimeter()
	{	
		a=(2*3.14*r);
		System.out.println("Perimeter Of Circle :" + a);
	}

}
