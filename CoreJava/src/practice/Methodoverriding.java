package practice;

 class Bank 
 {
      float rateofinterest ()
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
 
 class ICIC extends Bank
 {
	 float rateofinterest()
	 {
		 return 4.2f;
	 }
 }
 
 class Methodoverriding
 {
	 public static void main(String[] args) 
	 {
	     Bank b;
	     b = new SBI();
	     System.out.println("SBI rate of interest " + b.rateofinterest());
	     
	     
	}
 }