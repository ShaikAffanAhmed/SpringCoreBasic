package oops;

public class ShapeMain {

	public static void main(String[] args) 
	{ 
	   Circle c1 = new Circle(20,10);
	   c1.calculateArea();
	   c1.calculatePerimeter();
	   System.out.println("");
	   
	   Triangle t1= new Triangle(20, 40, 30, 50, 10);
	   t1.calculateArea();
	   t1.calculatePerimeter();
	   System.out.println("");
	   
	   Rectangle r1 = new Rectangle(10, 10, 10, 10);
	   r1.calculateArea();
	   r1.calculatePerimeter();
	}
	
}


