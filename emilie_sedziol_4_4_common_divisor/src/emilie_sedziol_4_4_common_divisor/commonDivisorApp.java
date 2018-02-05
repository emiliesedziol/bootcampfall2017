package emilie_sedziol_4_4_common_divisor;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class commonDivisorApp {
	public static void main(String[] args) {
		System.out.println("The xxxx");
        
        Scanner sc = new Scanner(System.in);
        String askContinue = "y";
		String askC = "";
		while (askContinue.equalsIgnoreCase("y")) {
			
			
			System.out.println("Enter first number :  ");
			BigInteger x = sc.nextBigInteger();
			System.out.println("Enter first number :  ");
			BigInteger y = sc.nextBigInteger();
			
			BigInteger gcd = x.gcd(y);
			
			System.out.println("gcd " + gcd);
			

			System.out.println();
			System.out.println();
			try {
				System.out.print("Continue? (y/n): ");
				askC = sc.next();
			} catch (InputMismatchException e) {
				System.out.println("Error: not a valid entry at Continue");
				sc.nextLine(); // discard all data entered by user
				// if there are multiple prompts 'sc.next..' - the continue will start over
				// the user will be prompted to enter all prompts again
				continue;
			}
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
