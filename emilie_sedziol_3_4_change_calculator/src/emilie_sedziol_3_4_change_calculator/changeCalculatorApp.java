package emilie_sedziol_3_4_change_calculator;

import java.util.Scanner;

public class changeCalculatorApp {
	public static void main(String[] args) {
		System.out.println("Welcome to the Change Calculator");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int cents = 0;
		int centsLeft = 0;
		String askContinue = "y";
		String askC = "";
		while (askContinue.equalsIgnoreCase("y")) {

			System.out.print("Enter number of cents:  ");
			cents = sc.nextInt();
			centsLeft = cents;
			int quarters = 0;
			int dimes = 0;
			int nickels = 0;
			int pennies = 0;
			quarters = cents / 25;
			System.out.println(" quarters " + quarters);
			if (quarters > 0) {
				centsLeft -= (quarters * 25);
			}

			if (centsLeft > 0) {
				dimes = centsLeft / 10;
				if (dimes != 0) {
					int totalDimes = dimes * 10;
					centsLeft -= totalDimes;
				}
			}
			if (centsLeft > 0) {
				nickels = centsLeft / 5;
				if (nickels != 0) {
					int totalNickels = nickels * 5;
					centsLeft -= totalNickels;
				}
			}
			if (centsLeft > 0) {
				pennies = centsLeft;
			}

			System.out.println("Quarters:  " + quarters);
			System.out.println("Dimes:     " + dimes);
			System.out.println("Nickels:   " + nickels);
			System.out.println("Pennies:   " + pennies);
			System.out.println("Total -    " + cents);

			System.out.print("Continue? (y/n): ");
			askC = sc.next();
			askContinue = askC;
			if (askC == "y")
				askContinue = "y";
			if (askC == "Y")
				askContinue = "y";
			System.out.println();
		}
		sc.close();
		System.out.println("Done!");
	}
}
