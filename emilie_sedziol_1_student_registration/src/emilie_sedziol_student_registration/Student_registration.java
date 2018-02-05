package emilie_sedziol_student_registration;

import java.util.Scanner;

public class Student_registration {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Student Registration From");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		System.out.println("Enter last name: ");
		System.out.println("Enter year of birth: ");
		
		String firstName = sc.next();
		
		String lastName = sc.next();
		
		String birthDate = sc.next();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Welcome " + firstName + " " + lastName);
		System.out.println("Your registration is Complete");
		System.out.println("Your temporary password is: " + firstName + "*" + birthDate);
		
				
		

		
	}

}
