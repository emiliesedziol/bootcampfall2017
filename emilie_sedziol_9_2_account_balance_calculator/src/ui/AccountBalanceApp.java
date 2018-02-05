package ui;

import java.text.NumberFormat;
// to install all business - 'import business.*' imports everything from business
import business.Account;
import business.CheckingAccount;
import business.SavingsAccount;
import util.Console;

public class AccountBalanceApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Account Balance Calculator");
		System.out.println("");
		System.out.println("Starting Balance: ");
		String choice = "y";
		
		SavingsAccount sa = new SavingsAccount(.015);
		CheckingAccount ca = new CheckingAccount(1);
		sa.setBalance(10000);
		ca.setBalance(1000);
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println("Checking: " + currency.format(sa.getBalance()));
		System.out.println("Savings:  " + currency.format(ca.getBalance()));
		System.out.println("");
		System.out.println("Enter the transactions for the month");
		
		while (choice.equalsIgnoreCase("y")) {
			String transType = Console.getString("Withidrawal or Deposit (w/d)?:", "w", "d");
			String acctType = Console.getString("Checking or Savings (c/s)?:", "c", "s");
			
			double amount = Console.getDouble("Amount?: ", 1, 1000);
			Account a = null;
			if (acctType.equals("c")) {
				a = ca;
			}
			else {
				a = sa;
			}
			if (transType.equalsIgnoreCase("w")) {
				a.withdraw(amount);
			}
			else {
				a.deposit(amount);
			}
			choice = Console.getString("Continue (y/n): ");
		}
		ca.subtractMonthlyFee();
		sa.applyMonthlyInterestPayment();
		System.out.println("Final Balances: ");
		System.out.println("Checking: " + currency.format(sa.getBalance()));
		System.out.println("Savings: " + currency.format(ca.getBalance()));
		System.out.println("");
		
		System.out.println("");

	}

}
