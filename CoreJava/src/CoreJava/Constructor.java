package CoreJava;

public class Constructor {
    
	int id;
	String name;
	 String test;
	public static void run() {
		System.out.println("Start Run");
	}
	public Constructor(int id,String name,String test)  //A constructor in Java is a special method that is used to initialize objects. 
                         //The constructor is called when an object of a class is created.
	{
		 this.id=id;
		 this.name=name;
		 this.test=test;
		 run();
	}
	
	public static void main(String[] args) 
	{
		Constructor C1 = new Constructor(12," "+"Affan","rrr");
		Constructor C2 = new Constructor(11," "+"Duryodhan","tttt");
		System.out.println(C1.id +""+C1.name+C1.test);
		System.out.println(C2.id +""+C2.name+C2.test);
	}

}
