package basicPrograms;

import java.util.Scanner;

public class BankAccountMain {

    public static void main(String[] args) {
    	

      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter account number: ");
      String accountNumber = scanner.next();

      System.out.print("Enter initial balance: ");
      double initialBalance = scanner.nextDouble();

      BankAccount account = new BankAccount(accountNumber, initialBalance);

      System.out.println("Initial balance: " + account.getBalance());

      System.out.print("Enter deposit amount: ");
      double depositAmount = scanner.nextDouble();
      account.deposit(depositAmount);

      System.out.print("Enter withdrawal amount: ");
      double withdrawalAmount = scanner.nextDouble();
      account.withdraw(withdrawalAmount);

      System.out.println("Final balance: " + account.getBalance());

    }
}







