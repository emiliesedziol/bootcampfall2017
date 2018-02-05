package business;

public class SavingsAccount extends Account {
	private double monthlyInterestRate = 0.0;
	private double monthlyInterestPayment = 0.0;
	
	public SavingsAccount(double inMonthlyInterestRate) {
		monthlyInterestRate = inMonthlyInterestRate;  // 'in' input into monthly interest rate
	}
	
	public void applyMonthlyInterestPayment() {
		monthlyInterestPayment = balance * monthlyInterestRate;
		balance -= monthlyInterestPayment;
	}

}
