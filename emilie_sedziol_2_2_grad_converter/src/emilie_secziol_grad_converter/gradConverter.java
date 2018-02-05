package emilie_secziol_grad_converter;

import java.util.Scanner;

public class gradConverter {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Student Registration From");
		System.out.println();
	
		// create a Scanner object named sc
		Scanner sc = new Scanner(System.in);
		
		String askAgain = "y";
		
		while (!askAgain.equalsIgnoreCase("n")) {
			// get numeric grade
			System.out.println("Enter Numerical grade: ");
			int numericGrade = sc.nextInt();
			
			String letterGrade = "";
			if (numericGrade > 100) {
				letterGrade ="No letter grade assigned";
			}
			if (numericGrade >= 88) {
				if (numericGrade < 101) {
					letterGrade = "A";
				}
			}
			if (numericGrade >= 80) {
				if (numericGrade < 88) {
					letterGrade = "B";
				}
			}
			if (numericGrade >= 67) {
				if (numericGrade < 80) {
					letterGrade = "C";
				}
			}
			if (numericGrade >= 60) {
				if (numericGrade < 67) {
					letterGrade = "D";
				}
			}
			if (numericGrade < 60) {
				letterGrade = "F";
			}
			
			System.out.println("Letter grade: " + letterGrade);
			System.out.println();
			
			System.out.println("Continue (y/n) ");
			askAgain = sc.next();
		}
    
	}
}
