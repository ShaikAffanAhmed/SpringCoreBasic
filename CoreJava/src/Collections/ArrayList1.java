package Collections;

import java.util.ArrayList;

public class ArrayList1 {

		public static void main(String[] args)
		
		{
	         ArrayList<String> Name = new ArrayList<String>();
	         
	         Name.add("Bhise");
	         Name.add("Bob");
	         Name.add("Shaik");
	         System.out.println(Name);
	         
	         Name.remove(0);  //removing zeroth position data, removing particular data 
	         System.out.println(Name);
	         
	         Name.set(0, "Bhise");  //replacing the zeroth position data  
	         System.out.println(Name);
	         
	         Name.add("Prem");// Adding In last position
	         System.out.println(Name);
	         
	         Name.add(1,"Gani");//adding in before Bob
	         System.out.println(Name);
	         
	         System.out.println(Name.get(2)); //only getting 2nd position data
	         
	         Name.clear();//clearing all data at a time in array
	         System.out.println(Name);
	         }

	}
