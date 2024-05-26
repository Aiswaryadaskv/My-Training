package assignmentAbstraction;

public class FullTimeEmployee extends Employee {

	FullTimeEmployee(String name, int paymentPerHour) {
		super(name, paymentPerHour);
		
	}

	@Override
	int calculateSalary() {
    return paymentPerHour * 8;
	}
	 public static void main(String[] args) {
	       
	        Employee contractor = new Contractor("Anna", 50, 120); 
	        Employee fullTimeEmployee = new FullTimeEmployee("Aishu", 100); 

	        System.out.println("Anna's Salary "+ contractor.calculateSalary());
	        System.out.println("Aishus salary"+ fullTimeEmployee.calculateSalary());
	    }
	}

