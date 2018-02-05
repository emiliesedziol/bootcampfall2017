package emilie_sedziol_5_1_dics_roller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class diceRollerApp {
	public static void main(String[] args) {
		System.out.println("Dice Roller");
        
        Scanner sc = new Scanner(System.in);
        String askContinue = "y";
		String askC = "";
		while (askContinue.equalsIgnoreCase("y")) {
			
			int a = getRandomInt();
			
			int b = getRandomInt();

			displayResults(a, b);
			
			System.out.println();
			System.out.println();
			try {
				System.out.print("Roll again? (y/n): ");
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
	public static int getRandomInt() {
        int randomInt = (int) (Math.random() * ((5 - 0) + 1) + 0);
        randomInt++;                        // int is >= 1 and <= limit
        return randomInt;
    }
	
	private static void displayResults(int a, int b) {
        int total = 0;
		System.out.println("Dice: 1 \t \t" + a);
		System.out.println("Dice: 2 \t \t" + b);
		total = a + b;
		System.out.println("Total: \t \t" + total);
		if (a == 1) {
			if (b==1) {
				System.out.println("Snake eyes");
			}
		} else {
			if (a == 6) {
				if (b == 6) {
					System.out.println("Box cars");
				}
			}
		}
	}
}
