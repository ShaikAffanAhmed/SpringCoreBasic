package com.practice;

public class Overloading {
	
		public static void Add()
		 { 
		System.out.println("No Parameter Method Called");
		 } 
		public void Add( int a,int b )
		 {
		    int add = a+b ;
		    System.out.println(add);			 
		}
		public void Add( float c,int a ) 
		{
		 float add = c + a;
		 System.out.println(add);	 
		}
		public static void main(String[] args)
		  {
			Overloading obj = new Overloading();
		    Add();
		    obj.Add(10,20);
		    obj.Add(5.0f,10);
		  }
	}


