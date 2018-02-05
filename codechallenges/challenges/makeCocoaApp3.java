package codeChallenge1;

import java.util.Scanner;

public class makeCocoaApp3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
        		
        		System.out.println("Make Chocolate");
			System.out.println();
			
			int smallBar = 0;
			int bigBar = 0;
			int goal = 0;
			String prompt = "";
			
			prompt = "Number of small bars: ";
			smallBar = getInt(sc, prompt);
			
			prompt = "Number of large bars: ";
			bigBar = getInt(sc, prompt);
			
			prompt = "Goal: ";
			goal = getInt(sc, prompt);
			
			makeChocolate(smallBar, bigBar, goal);
			
	/**		System.out.println();
			System.out.println("Large bars: " + bigBar);
			System.out.println("Small bars: " + smallBar);
			System.out.println("Goal:       " + goal); **/
        	
			askToContinue(sc);
        }
		
		sc.close();
		System.out.println("Bye");
	}
	
	public static void makeChocolate(int smallBar, int bigBar, int goal) {
		System.out.println();
		System.out.println("Goal: " + goal);
		int tmp = goal - (bigBar * 5);
		System.out.println();
		if (tmp == 0) {
			System.out.println("Only large bars are needed to reach goal");
			System.out.println("");
		}
		else if (tmp < 0) {
			System.out.println("Goal is too small for a large bar");
			System.out.println();
		}
		else if (tmp > smallBar) {
			System.out.println("Not enough small bars");
			System.out.println();
		}
		else {
			System.out.println("Number of big bars weight " + (bigBar * 5));
			System.out.println("Small Bars:  " + tmp);
		}
		
	}
	
	public static int getInt(Scanner sc, String prompt) {
		int value = 0;
		boolean isValid = false;
		System.out.print(prompt);
		while (!isValid) {
			if (sc.hasNextInt()) {
				value = sc.nextInt();
				isValid = true;
			}
			else {
				System.out.println("Error: Enter an Integer");
				sc.nextLine();
			}
		}
		return value;
	}
	
	public static String askToContinue(Scanner sc) {
		String choice = "y";
		System.out.print("Continue? (y/n): ");
		choice = sc.next();
		sc.nextLine();  // discard any other data entered on the line
		System.out.println();
		return choice;
}

}
