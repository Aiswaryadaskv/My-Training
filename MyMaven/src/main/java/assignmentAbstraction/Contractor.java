package assignmentAbstraction;

public class Contractor extends Employee {
	int workingHours;

	Contractor(String name, int paymentPerHour, int workingHours) {
		super(name, paymentPerHour);
		this.workingHours = workingHours;
	}

	@Override
	int calculateSalary() {
	return paymentPerHour * workingHours;
	}

}
