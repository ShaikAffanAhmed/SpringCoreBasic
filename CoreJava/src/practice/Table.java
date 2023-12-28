package practice;

class tableM 
{
     int x;
     int result;
     
     void set(int x)
     {
    	 this.x=x;
     }
     
     void table()
     {
       for(int i=1;i<=20;i++){
    	   result=x*i;
    	   System.out.println(x+"*"+i+"="+result);
     }
     }
}

class Table
{
  public static void main(String[] args) 
  {
	  tableM t = new tableM();
	  t.set(20000);
	  t.table();
}

}
