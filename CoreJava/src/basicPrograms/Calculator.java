package basicPrograms;

public class Calculator 
{
	private int num1;
	private int num2; 
	int result;
	
	 //setters
		public void setNum1(int num1) {
			this.num1 = num1;
		}

		public void setNum2(int num2) {
			this.num2 = num2;
		}
		
	//getters
	
    public int getNum1() {
		return num1;
	}
    
    public int getNum2() {
		return num2;
	}

		int addition(int num1,int num2)
	   {
			result=num1+num2;
			System.out.println("Total is "+ result);
			return result;
	   }	  
	
	    int subtraction(int num1,int num2)
	   {
	    	result=num1-num2;
			System.out.println("Total is "+ result);
		    return result;
	   }
	    
	    int multiplication(int num1,int num2)
	   {
	    	result=num1*num2;
			System.out.println("Total is "+ result);
		    return result;
	   }
	    
	    int division(int num1,int num2)
	   {
	    	result=num1/num2;
			System.out.println("Total is "+ result);
            return result;
	   }
	   
	   }	
