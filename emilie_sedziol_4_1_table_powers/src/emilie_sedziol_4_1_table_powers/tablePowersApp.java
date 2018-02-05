package emilie_sedziol_4_1_table_powers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tablePowersApp {
	public static void main(String[] args) {
		System.out.println("Welcom to the Squares and Cubes table");
        
        Scanner sc = new Scanner(System.in);
        String askContinue = "y";
		String askC = "";
		while (askContinue.equalsIgnoreCase("y")) {
			
			System.out.print("Enter an integer ");
			int squared = 1;
			int cubed = 0;
			int integerEntered = 0;
			integerEntered = sc.nextInt();
			
			for (int i = 1; i <= integerEntered; i++) {
				squared = (i) * (i);
				cubed = i * i * i;
				
				System.out.print(i + " \t" + squared + "\t" + cubed + "\n");
			}
			
			
			
			

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
