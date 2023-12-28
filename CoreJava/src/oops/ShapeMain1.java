package oops;

public class ShapeMain1 {

	public static void main(String[] args) {
		
     Shape1[] s1= {new Circle1(25),new Rectangle1(20,30),new Triangle1(5,10)};
     for(int a=0;a<s1.length;a++)
     {
    	 s1[a].calculateArea();
     }
	}

}
