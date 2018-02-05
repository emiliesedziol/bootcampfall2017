package emilie_sedziol_7_1_contact_list;


public class contactListApp {

	public static void main(String[] args) {
		
	Console.printToConsole("Welcome to the Contact List Application");
        
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			String fName = Console.getString("Enter First Name ");
			String lName = Console.getString("Enter Last Name ");
			String email = Console.getString("Enter Email ");
			String phone = Console.getString("Enter Phone ");
			Contact contact = new Contact(fName, lName, email, phone);
			// the following is valid the above is another way to do it
//			contact.setFirstName(fName);
//			contact.setLastName(lName);
//			contact.setEmail(email);
//			contact.setPhone(phone);
			
			Console.printToConsole(contact.displayContact());
			
			choice = Console.getString("Continue? (y/n) ");
		}
		Console.printToConsole("Bye!");
        
	}
	
}
