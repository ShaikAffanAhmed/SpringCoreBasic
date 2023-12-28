package oops;

public class Rectangle extends Shape 
{
    public double a,r,w,l;
    
    
	public Rectangle(double a, double r, double w, double l) {
		super();
		this.a = a;
		this.r = r;
		this.w = w;
		this.l = l;
	}

	@Override
	void calculateArea() 
	{
		a= w*l;
		System.out.println("Area Of Rectangle :" + a);
	}

	@Override
	void calculatePerimeter() 
	{
		a=2*(l+w);
		System.out.println("Perimeter Of Rectangle :" + a);
	}

}
