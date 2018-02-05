package emilie_sedziol_3_3_interest_calculator;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class interestCalculatorApp {
	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		// double calcInterest = 0.0;
		String askContinue = "y";
		String askC = "";
		// double loanAmount;
		// double interestRate = 0.0;
		String pattern = "$##,###,###.00";
        while (askContinue.equalsIgnoreCase("y")) {
        	
        		System.out.print("Enter Loan amount:    ");
        		BigDecimal loanAmount = sc.nextBigDecimal();
        		System.out.print("Enter interest rate:  ");
        		BigDecimal interestRate = sc.nextBigDecimal();
        		
//        		BigDecimal bloanAmount = new BigDecimal(loanAmount);
//        		BigDecimal binterestRate = new BigDecimal(interestRate);
//        		BigDecimal interest = bloanAmount.divide(binterestRate, 2, RoundingMode.HALF_UP);
        		
        		// BigDecimal interest = loanAmount.multiply(interestRate).setScale(2, RoundingMode.HALF_UP);
        		
        		
        		System.out.println();
        		
        		NumberFormat numberFormatter = new DecimalFormat("$###,###.##");
        		String loanResult = numberFormatter.format(loanAmount);
        		DecimalFormat df = new DecimalFormat("##.###%");
			String formattedPercent = df.format(interestRate);
        		
			BigDecimal calcInterest = loanAmount.multiply(interestRate);
			String interestResult = numberFormatter.format(calcInterest);
        		
        		System.out.println("Loan Amount:         "  + loanResult);
        		System.out.println("Interest Rate        " + formattedPercent);
        		// System.out.println("Interest             " + interestResult);
        		System.out.println("Interest             " + interestResult);
        	
        		System.out.print("Continue? (y/n): ");
        		askC = sc.next();
        		askContinue = askC;
        		if (askC == "y") askContinue = "y";
        		if (askC == "Y") askContinue = "y";
            System.out.println();
        }
        sc.close();
	}

}
