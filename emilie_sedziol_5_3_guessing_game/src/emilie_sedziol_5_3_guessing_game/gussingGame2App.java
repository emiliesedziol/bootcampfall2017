package emilie_sedziol_5_3_guessing_game;

import java.util.Scanner;

public class gussingGame2App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int min = 1;
		final int max = 100;
		int count = 1;
		String prompt = "Try Again (y/n";
		while (askToContinue(sc, prompt, count)) {
			
			System.out.println("I'm thinking of a number from 1 to 100");
			System.out.println("Try to guess it.");
			int number = (int)(Math.random()*100+1);
			count = 1;
			
			boolean correctGuess = false;
			while (!correctGuess) {
				int guess = getIntWithInRange(sc, "Enter Number: ", min, max);

				int diff = guess - number;
				if (diff != 0) {
					// incorrect guess
					displayIncorrectGuessMessage(diff);
					count++;
				} else {
					// correct
					displayCorrectGuessMessage(count);
					correctGuess = true;
				}
			}
		}

		sc.close();
		System.out.println("Bye!");
	}

	public static boolean askToContinue(Scanner sc, String prompt, int count) {
		boolean b = true;
		if (count>1) {
		while (true) {
			System.out.println(prompt);
			String askContinue = sc.next();
			if (askContinue.equalsIgnoreCase("y")) {
				b = true;
				System.out.print("\n \n \n");
				return b;
			} else if (askContinue.equalsIgnoreCase("n")) {
				b = false;
				return b;
			} else if (askContinue.equals("")) {
				System.out.println("Error! This entry is required. Try again.");
				b = false;
			} else {
				System.out.println("Error! This entry is reqired. Try again");
				b = false;
			}
		}
		} return true;
	}
	
	
	public static int getIntWithInRange(Scanner sc, String prompt, int min, int max) {
		int guess = 0;
		System.out.print(prompt);
		while (true) {
			if (sc.hasNextInt()) {
				guess = sc.nextInt();
				if (guess < min || guess > max) {
					System.out.print("Error... valid range is 1 to 100");
				}
				else {
					// user has entered a valid int within range
					sc.nextLine();
					break;
				}
			} 
			else {
				System.out.println("Error: enter an Integer ");
				sc.nextLine();
			}
		}
		return guess;
	}
	public static void displayIncorrectGuessMessage(int diff) {
		String msg = "";
		if (diff > 10) 
			msg = "Way too high";
		
		else if (diff < -10) 
			msg = "Way too low";
		
		else if (diff > 0) 
			msg = "Too high";
		
		else msg = "Too low";
		System.out.println(msg);
	}
	
	public static void displayCorrectGuessMessage(int count) {
		System.out.println("You got it in " + count + " tries");
		if (count < 3) 
			System.out.println("Great work!" );
		else if (count <= 7) 
			System.out.println("Not bad");
		else
			System.out.println("what");
		
	}
}
