package emilie_sedziol_4_2_fractorial_calculator;

import java.util.Scanner;

public class factorialCalculatorApp {
	public static void main(String[] args) {
		System.out.println("The Factorial Calculator");
        
        Scanner sc = new Scanner(System.in);
        String askContinue = "y";
		String askC = "";
		while (askContinue.equalsIgnoreCase("y")) {
			
			System.out.println("Enter an integer that's greater than 0 and less than: ");
			int integerEntered = sc.nextInt(); 
			long calcFactorial = 1;
			
			for (int i=1; i <= integerEntered; i++) {
				
				calcFactorial *= (i);
				// System.out.println("calcFactorial " + calcFactorial);
				
			}
			System.out.println("The factorial of " + integerEntered 
					+ " is " + calcFactorial);
			System.out.println();
			System.out.println();
			System.out.print("Continue? (y/n): ");
			askC = sc.next();
			askContinue = askC;
			if (askC == "y")
				askContinue = "y";
			if (askC == "Y")
				askContinue = "y";
        }
        System.out.println("Bye!");
        sc.close();
	}

}
