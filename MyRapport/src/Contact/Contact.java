package Contact;

public class Contact {
	private String firstName;
	private String lastName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact andrew = new Contact();
		andrew.setFirstName("Andrija");
		andrew.setLastName("Jovanovic");
		andrew.printContact();

	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void printContact() {
		System.out.println("Congrats you created the following contact:");
		System.out.println("Fist Name: " + firstName);
		System.out.println("Last Name: " + lastName);
	}
	
}
