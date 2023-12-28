package oops;

public class ATM 
{
   private double amount;

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}
    
public void deposite(double balance)
{
		amount = balance + amount;	
		System.out.println("deposite : " + amount);

}
   
public void withdraw(double balance)
{
	if(balance <= amount)
	{
		amount = amount-balance;	
		System.out.println("withdraw : " + amount);
	}
	else {
		System.err.println("Enterd Amount Exceed Current Balance");
	}
}

public void checkbalance(double balance)
{
	amount = balance;
}
}

    

