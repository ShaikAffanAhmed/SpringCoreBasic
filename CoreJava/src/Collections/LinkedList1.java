package Collections;

import java.util.LinkedList;
public class LinkedList1 {

	public static void main(String[] args) 
	{
        LinkedList<String> Name= new LinkedList<String>();
        Name.add("Shaik");
        Name.add("Lokesh");
        Name.add("Chand");
        System.out.println(Name);
        
        for(String str:Name)  //for each loop
        {
        	System.out.println(str);
        }
        Name.addFirst("Yazdan");  //adding in first place
        
        Name.addLast("Praveen"); //adding in last place
        
        Name.add(2, "Gani");  //adding in middle
        
        Name.removeFirst();  //removing first place data
        
        Name.removeLast();  //removing last place data
        
	    System.out.println(Name);
	    
	    
	}

}
