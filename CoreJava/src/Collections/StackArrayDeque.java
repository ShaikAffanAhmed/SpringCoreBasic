package Collections;

import java.util.Stack;
import java.util.ArrayDeque;
public class StackArrayDeque {

	public static void main(String[] args) 
	{
           Stack<String> Name=new Stack<>();   //LIFO   LAST INN FIRST OUT
           
           Name.push("Ahmed");
           Name.push("Shubham");
           Name.push("Surya");
           System.out.println(Name);
            
           Name.pop();   //deleting the last place data 
           System.out.println(Name);
           
           ArrayDeque<String> City=new ArrayDeque<>();   //FIFO   FIRST INN FIRST OUT
          
           //when ever array will use we need to use add method     
           City.push("Hyd");
           City.push("Bidar");
           City.push("Vizag");
           System.out.println(City);
           
           City.pop();   //deleting the First place data 
           System.out.println(City);
                   
	}

}
