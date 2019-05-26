/**
 * 
 */
package com.milestone;

// TODO: Auto-generated Javadoc
/**
 * The Class PersonContact.
 *
 * @author Sashae
 */
public class PersonContact extends BaseContact{
	
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
	// UID, fName, lName, phone, email, address, city, state, zipcode, country, picture, workPhone, hobby
	public PersonContact(String... args) {
		super(args);
		this.workPhone = args[11];
		this.hobby = args[12];
	}
	
	public String toString() {
		return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", "person", super.getUID(), super.getfName(), super.getlName(), super.getPhone(), super.getEmail(), super.getAddress(), super.getCity(), super.getState(), super.getZipcode(), super.getCountry(), super.getEncodedImage(), this.workPhone, this.hobby);
	}

}
