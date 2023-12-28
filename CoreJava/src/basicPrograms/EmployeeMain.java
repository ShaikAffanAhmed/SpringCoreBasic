package basicPrograms;

public class EmployeeMain {
	
    public static void main(String[] args) {
    Employee[] employees ={
    		new Employee("Shaik",1,50000),
    		new Employee("Affan",2,60000),
    		new Employee("Ahmed", 3,55000)};
            
        
        double bonusPercentage = 10.0;  // 10% bonus
        
        for (Employee emp : employees) {
            emp.calculateBonus(bonusPercentage);
            System.out.println(emp);
        }
    }
}