package emilie_sedziol_temporature_converter;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class temporatureConverterApp {
	public static void main(String[] args) {
		System.out.println("Welcome to Temporature Converter");
        System.out.println();  // print a blank line
        
		Scanner sc = new Scanner(System.in);
		
		double fahrenheit = 0;
		double calcCelsius = 0;
		String askContinue = "y";
		String askC = "";
        while (askContinue.equalsIgnoreCase("y")) {
        		System.out.println("askContinue " + askContinue);
        	
        		System.out.println("Enter degrees in Fahrenheit:");
        		fahrenheit = sc.nextDouble();
        		calcCelsius = (fahrenheit - 32) * 5/9;
        		System.out.println(" before " + calcCelsius);
        		NumberFormat numberFormatter = new DecimalFormat("###.00");
            String result = numberFormatter.format(calcCelsius);
        		System.out.println("Degrees in Celsius: " + result);
        		System.out.println();
        	
        		System.out.print("Continue? (y/n): ");
            askC = sc.next();
    			askContinue = askC;
            if (askC == "y") askContinue = "y";
            if (askC == "Y") askContinue = "y";
            System.out.println();
            System.out.println("askC " + askC);
            System.out.println("askContinue " + askContinue);
        }
		System.out.println("Done!!!");
	}
}
