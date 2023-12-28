package CoreJava;

public class IfStatements {

	public static void main(String[] args) 
	{
	    
            int a = 10;
            int b = 20;
            int c = 30;

            //simple if
            if (a < b)
            {
                System.out.println("B is Greater");  //Ans
            }

            //if else
            if(a > b)
            {
                System.out.println("A is Greater");
            }
            else
            {
                System.out.println("B is Greater");  //Ans
            }

            //if else if
            if(a >= b)
            {
                System.out.println("A is Greater");
            }
            else if(b >= c)
            {
                System.out.println("B is Greater");
            }
            else
            {
                System.out.println("C is Greater");  //Ans
            }

            //Nested if
            String Place = "Hyd";
            String Place1 = "Bidar";
            String Place2 = "Vizag";
            String Place3 = "Dhule";
            if(Place == Place1)
            {
                System.out.println("Print Hyd");
            }
            if(Place1 == Place2)
            {
                System.out.println("Print Bidar");
            }
            else if(Place2 == Place3)
            {
                System.out.println("Print Vizag");
            }
            else
            {
                System.out.println("Print Dhule"); //Ans
            }

            //Switch Statement

            int Name = 4;
            switch(Name)
            {
            case 1:
            System.out.println("Shaik");
            break;

            case 2:
                System.out.println("surya");
                break;

            case 3:
                System.out.println("srinivas");
                break;

            case 4:
                System.out.println("sowrya");   //Ans
                break;

        }
	}
}
