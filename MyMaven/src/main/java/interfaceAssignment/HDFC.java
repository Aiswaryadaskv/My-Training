package interfaceAssignment;

public class HDFC implements RBI {

	@Override
	public double recurringDeposit(double amount, int duration) {

		 return amount * (1 + INTEREST_RATE * duration);
	}

public static void main(String[] args) {
    HDFC hdfc = new HDFC();
    double amount = 10000; 
    int duration = 5; 
    double maturityAmount = hdfc.recurringDeposit(amount, duration);
    System.out.println("Maturity Amount " + maturityAmount);
}
}