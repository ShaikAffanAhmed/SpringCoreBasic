package StringsPrgs;

public class SubStrings {

	public static void main(String[] args) 
	{
		String str = "ABC";
		int length=str.length();
		int temp = 0;
		String[] sarr=new String[length*(length+1)/2];
		for(int x=0;x<length;x++)
		{
			for (int y=x;y<length;y++)
			{
				sarr[temp]=str.substring(x,y+1);
				temp++;
			}
		}
		for(int a=0;a<sarr.length;a++)
		{
			System.out.println(sarr[a]);
		}

	}

}
