package emilie_sedziol_travel_time_calculator;

import java.util.Scanner;

public class travelTimeCalculatorApp {
	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		int enterMiles = 0;
		int enterMPH = 0;
		int hours = 0;
		int mph = 0;
		int displayHours = 0;
		int displayMinutes = 0;
		double displayRaw = 0;
		String askContinue = "y";
		String askC = "";
        while (askContinue.equalsIgnoreCase("y")) {
        	
        		System.out.println("Enter hours: ");
        		System.out.println("Enter miles per hours: ");
        		
        		hours = sc.nextInt();
        		mph = sc.nextInt();
        		
        		displayHours = hours / mph;
        		displayMinutes = hours % mph;
        		displayRaw = (double) hours / (double) mph;
        		
        		System.out.println("Estimated travel time");
        		System.out.println("---------------------");
        		System.out.println("Hours: " + displayHours + " display raw " + displayRaw);
        		System.out.println("Minutes " + displayMinutes);
        		
        		
        		System.out.print("Continue? (y/n): ");
            askC = sc.next();
        		askContinue = askC;
            if (askC == "y") askContinue = "y";
            if (askC == "Y") askContinue = "y";
            System.out.println();
            System.out.println("askC " + askC);
            System.out.println("askContinue " + askContinue);
        		
        }
		
	}
}
