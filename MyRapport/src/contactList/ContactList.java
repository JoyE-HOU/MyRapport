package contactList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import contact.Contact;


public class ContactList {

	public static void main(String[] args) {
		List<Contact> contactlist = new ArrayList<>();

		Scanner input = new Scanner(System.in); //Create a Scanner object
		
		System.out.println("Enter first name");
		String addFirstName = input.nextLine();
		
		System.out.println("Enter last name");
		String addLastName = input.nextLine();
		
		Contact obj = new Contact(addLastName, addLastName);
		obj.setFirstName(addFirstName);
		obj.setLastName(addLastName);
		obj.printContact();
	
		contactlist.add(obj);
		System.out.println();
	}

}
