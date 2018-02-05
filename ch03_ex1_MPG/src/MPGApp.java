
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class MPGApp {

    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            double miles = sc.nextDouble();
            
            System.out.print("Enter gallons of gas used: ");
            double gallons = sc.nextDouble();
            
            // double mpg = miles/gallons;
            BigDecimal bMiles = new BigDecimal(miles);
            BigDecimal bGallons = new BigDecimal(gallons);
            BigDecimal mpgResult3 = bMiles.divide(bGallons, 2, RoundingMode.HALF_UP);
            
            System.out.println("Miles per gallon is " + mpgResult3 + ".");
            System.out.println(); 
            
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
    
}
