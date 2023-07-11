package Contact;
import java.util.Scanner;

public class Contact {
	private String firstName;
	private String lastName;

	public static void main(String[] args) {
		Scanner userRes = new Scanner(System.in); //Create a Scanner object
		
		System.out.println("Enter first name");
		String addFirstName = userRes.nextLine();
		
		System.out.println("Enter last name");
		String addLastName = userRes.nextLine();
		
		Contact andrew = new Contact();
		andrew.setFirstName(addFirstName);
		andrew.setLastName(addLastName);
		andrew.printContact();

	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}


	public void setFirstName(String addFirstName) {
		this.firstName = addFirstName;
	}
	
	public void setLastName(String addLastName) {
		this.lastName = addLastName;
	}
	
	public void printContact() {
		System.out.println("Congrats you created the following contact:");
		System.out.println("Fist Name: " + firstName);
		System.out.println("Last Name: " + lastName);
	}
	
}
