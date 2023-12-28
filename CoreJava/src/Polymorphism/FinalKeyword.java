package Polymorphism;

public class FinalKeyword 
{
    final int a =10;
    
    void print()
    {   	
    	System.out.println(a);
    }
   
    public static void main(String[] args) 
    {
		FinalKeyword fk=new FinalKeyword();
		fk.print();
	}
}
