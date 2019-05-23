/**
 * 
 */
package com.milestone;

/**
 * The Class PersonContact.
 *
 * @author Sashae
 */
public class PersonContact extends BaseContact{
	
	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	private String workPhone;
	
	public PersonContact() {
		super();
		this.workPhone = "999-999-9999";
	}
	
	// fName, lName, phone, email, address, city, state, zipcode, country, picture, workPhone
	public PersonContact(String... args) {
		super(args);
		this.workPhone = args[10];
	}

}
