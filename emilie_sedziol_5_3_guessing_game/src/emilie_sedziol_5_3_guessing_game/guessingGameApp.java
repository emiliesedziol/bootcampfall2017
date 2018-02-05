package emilie_sedziol_5_3_guessing_game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class guessingGameApp {

	public static void main(String[] args) {
		final int LIMIT = 100;

		displayWelcome(LIMIT);					// public
		int number = getRandomInt(LIMIT);		// public

		Scanner sc = new Scanner(System.in); 
System.out.println("scanner");
		boolean askContinue = true;
		while (!askContinue) {
System.out.println("inside askContine");
			int count = 1;
			int guess = 0; // had to be set to zero for the code below the !isValid to work
			// or the guess wouldn't been seen as assigned
			boolean isValid = true;
			while (!isValid) {
System.out.println("inside isvalid");
				guess = getGuess(sc);

				// boolean checkGuess = checkNumber(sc, isValid); 

				if (guess < 1 || guess > LIMIT) {
					System.out.println("Invalid guess. Try again.");
					continue;
				}

				if (guess < number) {
					System.out.println("Too low.");
				} else if (guess > number) {
					System.out.println("Too high.");
				} else {
					System.out.println("You guessed it in " + 
							count + " tries.\n");
					if (count == 1) {
						System.out.println("Great Work");
					}
					break;
				}            
				count++;

				System.out.println();
				System.out.println();
				Boolean isValidContinue = false;
				while (!isValidContinue) {
					try {
						System.out.print("Try Again (y/n): ");
						Boolean askC = sc.hasNext();
						if (askC) {
							String ask = String.valueOf(askC);
							if (ask == "y") {
								isValidContinue = true;
								sc.nextLine();
								askContinue = true;
							} else {
								if (ask =="N") {
									isValidContinue = true;
									sc.nextLine();
								}
							}

						}
					} catch (InputMismatchException e) {
						System.out.println("Error: not a valid entry at Continue");
						sc.nextLine(); // discard all data entered by user
						// if there are multiple prompts 'sc.next..' - the continue will start over
						// the user will be prompted to enter all prompts again
						continue;
					}
					if (askContinue) number = getRandomInt(LIMIT);
				}
			}
			System.out.println("askContinue " + askContinue);
		}
		System.out.println("askContinue " + askContinue);
		System.out.println("Bye!");
		sc.close();
	}

	private static void displayWelcome(int limit) {
		System.out.println("Guess the number!");
		System.out.println("I'm thinking of a number from 1 to " + limit);
		System.out.println();
	}

	public static int getRandomInt(int limit) {
		double d = Math.random() * limit;   // d is >= 0.0 and < limit
		int randomInt = (int) d;            // convert double to int
		randomInt++;                        // int is >= 1 and <= limit
		return randomInt;
	}

	public static int getGuess(Scanner sc) {
		int guess = 0;
		System.out.print("Your guess: ");
		if (sc.hasNextInt()) {
			guess = sc.nextInt();
			// sc.nextLine();
		} else {
			System.out.println("Error: enter an Integer ");
		}
		sc.nextLine();
		return guess;
	}

}
