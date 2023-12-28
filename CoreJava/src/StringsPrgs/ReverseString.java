package StringsPrgs;

public class ReverseString {

	public static void main(String[] args) {

      String str="Hello world How Are You";
     
      String [] arr=str.split("");
      StringBuilder sb=new StringBuilder();
      
      for(int a=arr.length-1;a>=0;a--)
      {
    	  sb.append(arr[a]+"");
    	      	 
      }
      System.out.println(sb);
	}

}
