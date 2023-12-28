package com.practice;

 class Bank
{
    float rateofinterest()
    {
    	return 0;
    }
}
 
class SBI extends Bank
{
	float rateofinterest()
	{
		return 2.5f;
	}
}
 
class IOB extends Bank
{
   float rateofinterest()
   {
	   return 4.2f;
   }
}
 
class ICIC extends Bank
{
   float rateofinterest()
   {
	   return 6.8f;
   }
}

class Overriding
{
   public static void main(String[] args) 
   {
	   Bank b;
	   b= new SBI();
	   System.out.println("SBI Rate of Interest:"+b.rateofinterest());
	   
	   b = new IOB();
	   System.out.println("IOB Rate of Interest:"+b.rateofinterest());
	   
	   b = new ICIC();
	   System.out.println("ICIC Rate of Interest:"+b.rateofinterest());
}	
}
