package emilie_sedziol_5_2_area_perimeter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class areaPerimeterApp {
	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator");
        
        Scanner sc = new Scanner(System.in);
        String prompt = "";
        int area = 0;
        int perimeter = 0;
        double lenght = 0.0;
        int width = 0;
        String askContinue = "y";
		String askC = "";
		while (askContinue.equalsIgnoreCase("y")) {
			
			prompt = "Enter Lenght: ";
			double lMin = 1.0;
			double lMax = 1000000.0;
			lenght = getDoubleWidthinRange (sc, prompt, lMin, lMax);
			
			prompt = "Enter width: ";
			int wMin = 0;
	        int wMax = 1000000;
			width = getIntWidthinRange(sc, prompt, wMin, wMax);
			
			System.out.println();
			System.out.println("Lenght: " + lenght);
			System.out.println("Width:  " + width);
			area = width * (int) lenght;
			perimeter = (2 * width) + (2 * (int) lenght);
			System.out.println("Area:      " + area);
			System.out.println("Perimeter: " + perimeter);
			

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
	public static double getDoubleWidthinRange (Scanner sc, String prompt,
			double lMin, double lMax) {
		double lenght = 0.0;
		double d = 0;
		boolean isValid = false;
		System.out.println(prompt);
		while (!isValid) {
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				if (d > lMin) {
					if (d < lMax) {
						isValid = true;
						lenght = d;
					} else {
						System.out.println("Error! Number must be less than 1000000.0");
						sc.nextLine();
					}
				} else {
					System.out.println("Error! Number must be greater than zero");
					sc.nextLine();
				}
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
				sc.nextLine();
			}
		}
		return lenght;
	}
	public static int getIntWidthinRange(Scanner sc, String prompt,
			int wMin, int wMax) {
		int width = 0;
		int b = 0;
		boolean isValid = false;
		System.out.println(prompt);
		while (!isValid) {
			if (sc.hasNextInt()) {
				b = sc.nextInt();
				if (b > wMin) {
					if (b < wMax) {
						isValid = true;
						width = b;
					} else {
						System.out.println("Error! Number must be less than 1000000");
						sc.nextLine();
					}
				} else {
					System.out.println("Error! Number must be greater than zero");
					sc.nextLine();
				}
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
				sc.nextLine();
			}
		}
		return width;
	}
}
