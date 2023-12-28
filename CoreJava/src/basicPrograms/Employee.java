package basicPrograms;

public class Employee 
{
	    private int employeeId;
	    private String employeeName;
	    private double employeesalary;
	    
	        
	        public Employee(String employeeName, int employeeId, double employeesalary) {
	            this.employeeName = employeeName;
	            this.employeeId = employeeId;
	            this.employeesalary = employeesalary;
	        }
	        
	        public void calculateBonus(double percentage) 
	        {
	            double bonusAmount = employeesalary * (percentage / 100);
	            employeesalary += bonusAmount;
	        }
	        
	        @Override
	        public String toString() {
	            return "Employee(name=" + employeeName + ", id=" + employeeId + ", salary=" + employeesalary + ")";
	        }
	    }
	


	

	    
	    

