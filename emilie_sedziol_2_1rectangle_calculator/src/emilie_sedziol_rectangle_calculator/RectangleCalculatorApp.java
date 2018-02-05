package emilie_sedziol_rectangle_calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class RectangleCalculatorApp {
	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		BigDecimal subtotal = new BigDecimal("100.5");
		BigDecimal discountPercent = new BigDecimal(".1");
		final BigDecimal SALES_TAX_PCT = new BigDecimal(".05");
		BigDecimal discountAmount = subtotal.multiply(discountPercent);
		discountAmount = discountAmount.setScale(2, RoundingMode.HALF_UP);
		System.out.println("discountAmount " + discountAmount);
		
		String askContinue = "y";
		while (!askContinue.equalsIgnoreCase("n")) {
			System.out.println();
			System.out.println("Enter length:  ");
			System.out.println("Enter width:   ");
			
			
			double lenghtEntered = sc.nextDouble();
			double widthEntered = sc.nextDouble();
			
			double calArea = widthEntered * lenghtEntered;
			double calPerimeter = (2 * widthEntered) + (2 * lenghtEntered);
			
			System.out.println("Enter length:  " + lenghtEntered);
			System.out.println("Enter width:   " + widthEntered);
			System.out.println("Area:          " + calArea);
			System.out.println("Perimeter:     " + calPerimeter);
			
			System.out.println();
			System.out.println();
			
			System.out.println("Continue (y/n)");
			askContinue = sc.next();
			System.out.println();
			
		}
		System.out.println("exitout");
	}
}
