package CoreJava;

public class MethodReturnType {
	public static int duryoAge() {
		int age=1450;
		return age;
	}
	public static int affanAge() {
		int age=1720;
		return age;
	}
	public static void diff(int age1,int age2)
	{
		System.out.println("Total Age Gap  : "+(age1-age2));
	}

	public static void main(String[] args) {
     int duryoAge=duryoAge();
     
     int ageaffanAge2=affanAge();
     diff(duryoAge,ageaffanAge2);
	}

}
