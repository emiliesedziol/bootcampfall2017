package business;

public class Account implements Balanceable, Depositable, WithDrawable {
	
	protected double balance = 0.0;

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setBalance(double amount) {
		// TODO Auto-generated method stub

	}

}
