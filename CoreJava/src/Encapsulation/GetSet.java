package Encapsulation;

//Encapsulation in Java is a process of wrapping code and data together into a single unit

//public class GetSet 
//{
//   private String name;
//   private int Salary;
//   
//   public String getName()
//   {
//	   return name;
//   }
//   public void setName(String name)
//   {
//	   this.name=name;
//   }
//   
//   public int getsalary()
//   {
//	   return Salary;
//   }
//   public void setSalary(int Salary)
//   {
//	   this.Salary=Salary;
//   }   
//}
// class GetSet1
//{
//	public static void main(String[] args) {		
//		GetSet gs=new GetSet();
//		gs.setName("Affan");
//		System.out.println("Emp Name is:"+gs.getName());
//		gs.setSalary(20000);
//		System.out.println("Emp Salary is:"+gs.getsalary());
//	}
//}

class single
{    
    private int value;
    
    public int getvalue()
    {
       return value;
    }
    
    public void setvalue(int value)
    {
        this.value=value;
    }
}

class single1
{
    public static void main(String[] args)
    {
        single S = new single();
        S.setvalue(100);
        System.out.println(S.getvalue());
    }
}