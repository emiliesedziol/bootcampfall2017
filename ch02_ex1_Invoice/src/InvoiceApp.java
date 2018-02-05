import java.util.Scanner;

public class InvoiceApp {

    public static void main(String[] args) {
        // welcome the user to the program
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        int totalInvoices = 0;         // 2-3
        double totalInvoiceAmt = 0.0;  // 2-3
        double totalDiscount = 0.0;    // 2-3

        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (!choice.equalsIgnoreCase("n")) {    // 2-3.2 only do if not 'n'
            // get the invoice subtotal from the user
            System.out.print("Enter subtotal:   ");
            double subtotal = sc.nextDouble();


            // calculate the discount amount and total
            double discountPercent;
            if (subtotal >= 500) {
            		discountPercent  = .25;
            } else if (subtotal >= 200) {
            		discountPercent = .2;
            } else if (subtotal >= 100) {
                discountPercent = .1;
            } else {
                discountPercent = 0.0;
            }
            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount; 
            totalDiscount = totalDiscount + discountAmount;  // 2-3
            totalInvoiceAmt = totalInvoiceAmt + total;       // 2-3
/*
 * exercise 1.5
 * '$1000'  nextDouble is expecting a number
 * 
 * exercise 1.6
 * subtotal = 20
 * nothing was entered for nextDouble so the discountAmount couldn't be calculated
 * total is 20 - 0 which is 20
 * 
 * exercise 1.7
 * 1000 is >= 200 so discount percent is .2
 * subtotal is 1000
 * sc.nextDouble() is 20
 * the subtotal * discount percent 1000 *.2 = 200
 *  
 */
            // display the discount amount and total
            String message = "Discount percent: " + discountPercent + "\n"
                           + "Discount amount:  " + discountAmount + "\n"
                           + "Invoice total:    " + total + "\n";            
            System.out.println(message);
            
            totalInvoices += 1;

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        double avgInvoices = totalInvoiceAmt / totalInvoices;
        double avgDiscount = totalDiscount / totalInvoices;
 //        System.out.println("avgInvoices " + avgInvoices);
 //        System.out.println("avgDiscount " + avgDiscount);
 //        System.out.println("totalInvoices " + totalInvoices);
 //        System.out.println("totalInvoiceAmt " + totalInvoiceAmt);
 //        System.out.println("totalDiscount" + totalDiscount);
        System.out.println("Number of Invoices " + totalInvoices);  // 2-3
        System.out.println("Average invoice    " + avgInvoices);    // 2-3
        System.out.println("Avgerage discount  " + avgDiscount);    // 2-3
    }
}