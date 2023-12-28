package CoreJava;

public class Methods {

	
//	   static void  Mymethod(int age)  //Static methods can be called without creating objects
//	 {
//		System.out.println(age);		 
//	 }
//	  public void  display()            //Public methods must be called by creating objects
//	 {
//		 System.out.println("Hi"+"han");
//	 }
//	  void Test()
//	{
//		System.out.println("Hmmm");
//	}
//	public static void main(String[] args) 
//	{
//		Methods d1=new Methods();
//	  
//	    Mymethod(10);  //Static methods can be called without creating objects
//	    d1.display();     //Public methods must be called by creating objects
//		d1.Test();
		
//	static String test( int c,int v)
//	{
//		
//		return 	c+v+"";
//	}
//	public static void main(String[] args) 
//	{
//		System.out.println(test('c','v'));	
//	}
	  
//Create a Car object named myCar. Call the carcolor() and carspeed() methods on the myCar object, and run the program: 
		
		public void carcolor()
		{
			System.out.println("Black");
		}
		
		public void carspeed(String maxSpeed)
		{
			System.out.println(maxSpeed);
		}
		
		public static void main(String[] args) 
		{
			Methods myCar = new Methods();
			myCar.carcolor();
			myCar.carspeed("200kmph");
			
		}
	}





