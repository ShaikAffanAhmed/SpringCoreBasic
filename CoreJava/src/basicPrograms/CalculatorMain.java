package basicPrograms;

import java.util.Scanner;

public class CalculatorMain 
{	
		 public static void main(String[] args)
		   {
		     
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Please Select Atleast One Option");
			 System.out.println("1 Option For Addition");
			 System.out.println("2 Option For subtraction");
			 System.out.println("3 Option For multiplication");
			 System.out.println("4 Option For division");
			 int num=sc.nextInt();
			 
			 switch(num) 
			 {
			 
			 case 1:{
				      System.out.println("Enter First Number");
				      int number1=sc.nextInt();
				      System.out.println("Enter Second Number");
				      int number2=sc.nextInt();
				      Calculator c1=new Calculator();
				      c1.addition(number1, number2);
				      break;
		        	}
			 
			 case 2:{
				      System.out.println("Enter First Number");
				      int number1=sc.nextInt();
				      System.out.println("Enter Second Number");
				      int number2=sc.nextInt();
				      Calculator c1=new Calculator();
				      c1.subtraction(number1, number2);
				      break;
			        }
			 
			 case 3:{
				      System.out.println("Enter First Number");
				      int number1=sc.nextInt();
				      System.out.println("Enter Second Number");
				      int number2=sc.nextInt();
				      Calculator c1=new Calculator();
				      c1.multiplication(number1, number2);
				      break;
			        }
			 
			 case 4:{
				      System.out.println("Enter First Number");
				      int number1=sc.nextInt();
				      System.out.println("Enter Second Number");
				      int number2=sc.nextInt();
				      Calculator c1=new Calculator();
				      c1.division(number1, number2);
				      break;
			        }
			 default:{
				       System.out.println("Please select correct option");
			         }
		   	 }		     
	      }
}
