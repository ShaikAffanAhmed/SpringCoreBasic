package oops;

public class Library 

{
   public static void main(String[] args) 
   {
	Book b1=new Book("The King", "Allen", "100"); 
	b1.DisplayInfo();
	System.out.println("");
	
	DVD d1=new DVD("Strangers Things", "Joseph", "402");
	d1.DisplayInfo();
}
}
