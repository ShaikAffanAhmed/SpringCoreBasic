package CoreJava;

public class TestEmployee {
//
	public static void main(String[] args) 
	{
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        
        e1.insert(99,"Surya",16413);
        e2.insert(100,"Shaik",18420);
        e3.insert(101,"Bob",20852);
        
        e1.display();
        e2.display();
        e3.display();
	}
	
//	int id;
//	String name;
//	
//	TestEmployee(int i,String n)
//	{
//		id=i;
//		name=n;
//	}
//		void display()
//		{
//			System.out.println(id+" "+name);
//		}
//		
//		public static void main(String[] agrs)
//		{
//			TestEmployee t1 =new TestEmployee(855,"Shaik");
//			TestEmployee t2 =new TestEmployee(860,"Shubham");
//			t1.display();
//			t2.display();
//		}
	}
	


