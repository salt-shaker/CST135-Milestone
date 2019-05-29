/**
 * 
 */
package com.milestone;

import java.util.ArrayList;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class PersonContact.
 *
 * @author Sashae
 */
public class PersonContact extends BaseContact {

	private String workPhone;
	private String hobby;

	/**
	 * Gets the work phone.
	 *
	 * @return the work phone
	 */
	public String getWorkPhone() {
		return workPhone;
	}

	/**
	 * Sets the work phone.
	 *
	 * @param workPhone the new work phone
	 */
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	/**
	 * Instantiates a new person contact.
	 */
	public PersonContact() {
		super();
		this.workPhone = "999-999-9999";
		this.hobby = "Being your contact";
	}

	/**
	 * Instantiates a new person contact.
	 *
	 * @param args the args
	 */
	// UID, fName, lName, phone, email, address, city, state, zipcode, country,
	// picture, workPhone, hobby
	public PersonContact(ArrayList<String> pAnswers) {
		super(pAnswers);
		this.workPhone = pAnswers.get(12);
		this.hobby = pAnswers.get(13);
	}

	public String toString() {
		return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", super.getUID(), super.getType(),
				super.getfName(), super.getlName(), super.getPhone(), super.getEmail(), super.getAddress(),
				super.getCity(), super.getState(), super.getZipcode(), super.getCountry(), super.getEncodedImage(),
				this.workPhone, this.hobby);
	}
	
	public void fOutput() {
		System.out.println(String.format(
				"\n UID: %-10s Type: %-10s \n First Name: %-10s Last Name: %-10s \n Phone: %-10s \n Email: %-20s \n Address: %-40s \n City: %-15s State: %-15s \n Zipcode: %-5s Country: %-10s \n Image: %-10s \n Work Phone: %-10s \n Hobby: %-20s",
				super.getUID(), super.getType(), super.getfName(), super.getlName(), super.getPhone(), super.getEmail(),
				super.getAddress(), super.getCity(), super.getState(), super.getZipcode(), super.getCountry(),
				super.getEncodedImage(), this.workPhone, this.hobby));
	}
	
	public boolean editiableFields(String input, Scanner scanner) {
		if (input.toLowerCase().equals("first name")) {
			System.out.println("Please enter the new First Name");
			super.setfName(sanatize(scanner.nextLine()));
			System.out.println("Successfully updated First Name");
			return true;
		} else if (input.toLowerCase().equals("last name")) {
			System.out.println("Please enter the new Last Name");
			super.setlName(sanatize(scanner.nextLine()));
			System.out.println("Successfully updated Last Name");
			return true;
		} else if (input.toLowerCase().equals("phone")) {
			System.out.println("Please enter the new Phone");
			super.setPhone(sanatize(scanner.nextLine()));
			System.out.println("Successfully updated Phone");
			return true;
		} else if (input.toLowerCase().equals("email")) {
			System.out.println("Please enter the new Email");
			super.setEmail(sanatize(scanner.nextLine()));
			System.out.println("Successfully updated Email");
			return true;
		} else if (input.toLowerCase().equals("address")) {
			System.out.println("Please enter the new Address");
			super.setAddress(sanatize(scanner.nextLine()));
			System.out.println("Successfully updated Address");
			return true;
		} else if (input.toLowerCase().equals("city")) {
			System.out.println("Please enter the new City");
			super.setCity(sanatize(scanner.nextLine()));
			System.out.println("Successfully updated City");
			return true;
		} else if (input.toLowerCase().equals("state")) {
			System.out.println("Please enter the new State");
			super.setState(sanatize(scanner.nextLine()));
			System.out.println("Successfully updated State");
			return true;
		} else if (input.toLowerCase().equals("zipcode")) {
			System.out.println("Please enter the new Zipcode");
			super.setZipcode(sanatize(scanner.nextLine()));
			System.out.println("Successfully updated Zipcode");
			return true;
		} else if (input.toLowerCase().equals("country")) {
			System.out.println("Please enter the new Country");
			super.setCountry(sanatize(scanner.nextLine()));
			System.out.println("Successfully updated Country");
			return true;
		} else if (input.toLowerCase().equals("work phone")) {
			System.out.println("Please enter the new Work Phone");
			this.workPhone = sanatize(scanner.nextLine());
			System.out.println("Successfully updated Work Phone");
			return true;
		} else if (input.toLowerCase().equals("hobby")) {
			System.out.println("Please enter the Hobby");
			this.hobby = sanatize(scanner.nextLine());
			System.out.println("Successfully updated Hobby");
			return true;
		} else {
			System.out.println("Invalid Selection");
		}
		return false;
	}
}
