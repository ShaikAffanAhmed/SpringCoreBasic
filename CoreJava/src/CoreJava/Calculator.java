package CoreJava;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Additin calculator");
    System.out.println("Please Enter First number");
    double input1=scan.nextDouble();
    System.out.println("Please Enter Second Number");
    double input2=scan.nextDouble();
    System.out.println("Adding Input1 Value : "+input1+" And : Input2 Value :"+input2+" = "+(input1+input2));
    
    		
	}

}
