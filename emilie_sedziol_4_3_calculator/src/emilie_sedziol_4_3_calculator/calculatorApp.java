package emilie_sedziol_4_3_calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class calculatorApp {
	public static void main(String[] args) {
		System.out.println("Calculator");
        
        Scanner sc = new Scanner(System.in);
        String askContinue = "y";
		String askC = "";
		while (askContinue.equalsIgnoreCase("y")) {
			
			BigDecimal tipAmnt = new BigDecimal(0);
			BigDecimal totalAmnt = new BigDecimal(0);
			System.out.print("Cost of meal: ");
			BigDecimal mealCost = sc.nextBigDecimal();
			
			NumberFormat nf = new DecimalFormat("$###,###.00");
			
			BigDecimal a = new BigDecimal(".15");
			BigDecimal calcTip = mealCost.multiply(a).setScale(2, RoundingMode.HALF_UP);		
			System.out.println("calcTip " + calcTip);
			BigDecimal calcTotal = mealCost.add(calcTip).setScale(2, RoundingMode.HALF_UP);
			String formattedTip = nf.format(calcTip);
			String formattedTotal = nf.format(calcTotal);
			
			System.out.println("15%");
			System.out.println("Tip amount:          " + formattedTip);
			System.out.println("Total Amount         " + formattedTotal);

			BigDecimal b = new BigDecimal(".2");
			BigDecimal calcTip1 = mealCost.multiply(b).setScale(2, RoundingMode.HALF_UP);		
			System.out.println("calcTip " + calcTip1);
			BigDecimal calcTotal1 = mealCost.add(calcTip1).setScale(2, RoundingMode.HALF_UP);
			String formattedTip1 = nf.format(calcTip1);
			String formattedTotal1 = nf.format(calcTotal1);
			System.out.println();
			
			System.out.println("20%");
			System.out.println("Tip amount:          " + formattedTip1);
			System.out.println("Total Amount         " + formattedTotal1);
			System.out.println();
			
			BigDecimal c = new BigDecimal(".25");
			BigDecimal calcTip2 = mealCost.multiply(c).setScale(2, RoundingMode.HALF_UP);		
			System.out.println("calcTip2 " + calcTip2);
			BigDecimal calcTotal2 = mealCost.add(calcTip2).setScale(2, RoundingMode.HALF_UP);
			String formattedTip2 = nf.format(calcTip2);
			String formattedTotal2 = nf.format(calcTotal2);
			System.out.println();
			
			System.out.println("25%");
			System.out.println("Tip amount:          " + formattedTip2);
			System.out.println("Total Amount         " + formattedTotal2);
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

}
