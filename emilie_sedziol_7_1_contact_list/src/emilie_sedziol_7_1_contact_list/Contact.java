package emilie_sedziol_7_1_contact_list;


public class Contact {
	private String firstName = "";
	private String lastName = "";
	private String email = "";
	private String phone = "";

	public Contact() {
		firstName = "";
		lastName = "";
		email = "";
		phone = "";
	}
		// right click - source - create constructor
	public Contact(String firstName, String lastName, String email, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String first) {
		firstName = first;
	}
	
  	public String getLastName() {
		return lastName;
	}

	public void setLastName(String last) {
		lastName = last;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		phone = phone;
	}
	
	public String displayContact() {
		String str = "-------------------------------------------------\n" +
				"------ Current Contact --------------------------\n" +
				"-------------------------------------------------\n" +
				"Name: " + firstName + " " + firstName + "\n" +
				"Email Address: " + email + "\n|" +
				"Phone Number:  " + phone + "\n" + 
				"-------------------------------------------------\n";
		return str;
			
	}
	
}
// getFirstName is an instance variable
// setFirstName is an instance variable