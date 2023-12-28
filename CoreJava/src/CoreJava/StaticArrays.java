package CoreJava;

public class StaticArrays {

	public static void main(String[] args) 
	{
		 // int a[]= {10,2,36,23};
		  //static array
        int a[]=new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        
        for (int i=0;i<a.length;i++)
        	System.out.println(a[i]);
//		  for(int i:a)
//		  {
//			  System.out.println(i);
//		  }
	}

}
