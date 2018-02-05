package codeChallenge1;

import java.util.Scanner;

public class makeCocoaApp2 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Make Chocolate");
			System.out.println();
			System.out.println("small bar 1 kilo");
			System.out.println("big bar 5 kilos");
			System.out.println("Goal equals 1 large bar plus up to 4 small bars");
			System.out.println();
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
			
			System.out.println("Bye!");
			
		}
		
		public static void makeChocolate(int smallBar, int bigBar, int goal) {
			System.out.println();
			System.out.println("Goal: " + goal);
			int tmp = goal - (bigBar * 5);
			if (tmp == 0) {
				System.out.println("Only 1 large bar needed to reach goal");
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
	
	}
