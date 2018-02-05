import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FutureValueApp {

    public static void main(String[] args) {
        System.out.println("The Future Value Calculator\n");
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            System.out.print("Enter monthly investment:   ");
            double monthlyInvestment = sc.nextDouble();
           System.out.print("Enter yearly interest rate: ");
           // double interestRate = sc.nextDouble();
            System.out.print("Enter number of years:      ");
            int years = sc.nextInt();

            
            // convert yearly values to monthly values
            double mIR5 = 5.0 / 12.0 / 100.0 ;
            double mIR55 = 5.5 / 12.0 / 100.0;
            double mIR6 = 6.0 / 12.0 / 100.0;
            double mIR65 = 6.5 / 12.0 / 100.0;
            int months =  12;

            // use a for loop to calculate the future value
           // NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat numberFormatter = new DecimalFormat("$###,###.00");
            DecimalFormat df = new DecimalFormat("##.###%");
            String formattedPercent5 = df.format(.05);
            String formattedPercent55 = df.format(.055);
            String formattedPercent6 = df.format(.06);
            String formattedPercent65 = df.format(.065);
            double futureValue1 = 0.0;
            double futureValue2 = 0.0;
            double futureValue3 = 0.0;
            double futureValue4 = 0.0;
            
            System.out.println("Year " + formattedPercent5 + "\t \t \t"
            + formattedPercent55 + "\t \t"
            + formattedPercent6 + "\t \t"
            + formattedPercent65 + "\n");
            
            for (int x = 1; x <= years;x++) {
            for (int i = 1; i <= months; i++) {
                futureValue1 = (futureValue1 + monthlyInvestment) * 
                              (1 + mIR5);
                futureValue2 = (futureValue2 + monthlyInvestment) * 
                        (1 + mIR55);
                futureValue3 = (futureValue3 + monthlyInvestment) * 
                        (1 + mIR6);
                futureValue4 = (futureValue4 + monthlyInvestment) * 
                        (1 + mIR65);
            }
            System.out.print(x + "    " + numberFormatter.format(futureValue1) + "\t \t"
            + numberFormatter.format(futureValue2) + " \t"
            + numberFormatter.format(futureValue3) + "\t"
            + numberFormatter.format(futureValue4) + "\n" );
            }

            // format the result and display it to the user
       //     NumberFormat currency = NumberFormat.getCurrencyInstance();
       //     System.out.println("Future value:               "
       //             + currency.format(futureValue));
       //     System.out.println();

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        System.out.println("Bye!");
        sc.close();
    }
}