package contact;

public class Contact {
	private String firstName, lastName;

	public Contact(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}


	public void setFirstName(String addFirstName) {
		this.firstName = addFirstName;
	}
	
	public void setLastName(String addLastName) {
		this.lastName = addLastName;
	}
	
	public void printContact() {
		System.out.println("Congrats you created the following contact:");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
	}
	
}
