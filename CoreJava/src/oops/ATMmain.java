package oops;

import java.util.Scanner;

public class ATMmain {
        
	
	public static void main(String[] args) 
	{   
          Scanner scanner = new Scanner(System.in);
          ATM atm = new ATM();
          System.out.print("Enter initial balance: ");
          double initialBalance = scanner.nextDouble();
          atm.setAmount(initialBalance);
          
          
          while (true) {
              System.out.println("\nOptions:");
              System.out.println("1. Check Balance");
              System.out.println("2. Deposit");
              System.out.println("3. Withdraw");
              System.out.println("4. Exit");
              System.out.print("Enter your choice: ");
              
              int choice = scanner.nextInt();
              
              switch (choice) {
                  case 1:
                      System.out.println("Current balance: " + atm.getAmount());
                      break;
                  case 2:
                      System.out.print("Enter deposit amount: ");
                      double depositAmount = scanner.nextDouble();
                      atm.deposite(depositAmount);
                      break;
                  case 3:
                      System.out.print("Enter withdrawal amount: ");
                      double withdrawalAmount = scanner.nextDouble();
                      atm.withdraw(withdrawalAmount);
                      break;
                  case 4:
                      System.out.println("Exiting ATM system. Thank you!");
                      scanner.close();
                      System.exit(0);
                  default:
                      System.out.println("Invalid choice. Please enter a valid option.");
              }
          }
	}
}
