package assignmentAbstraction;

public abstract class Employee {
	String name;
    int paymentPerHour;

    Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }
    abstract int calculateSalary();

}
