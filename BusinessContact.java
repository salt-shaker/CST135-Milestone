/**
 * 
 */
package com.milestone;

import java.util.ArrayList;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class BusinessContact.
 *
 * @author Sashae
 */
public class BusinessContact extends BaseContact {

	/** The business phone. */
	private String businessPhone;

	/** The open hour. */
	private String openHour;

	/** The close hour. */
	private String closeHour;

	/** The site URL. */
	private String siteURL;

	/**
	 * Instantiates a new business contact.
	 */
	public BusinessContact() {
		super();
		this.businessPhone = "999-999-9999";
		this.openHour = "12:00 am";
		this.closeHour = "12:00 am";
		this.siteURL = "example.com";
	}

	// fName, lName, phone, email, address, city, state, zipcode, country, picture,
	// businessPhone, openHour, closeHour, siteURL

	public String toString() {
		return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", super.getUID(), super.getType(),
				super.getfName(), super.getlName(), super.getPhone(), super.getEmail(), super.getAddress(),
				super.getCity(), super.getState(), super.getZipcode(), super.getCountry(), super.getEncodedImage(),
				this.businessPhone, this.openHour, this.closeHour, this.siteURL);
	}

	/**
	 * Instantiates a new business contact.
	 *
	 * @param bAnswers the args
	 */
	/*
	 * "business", super.getUID(), super.getfName(), super.getlName(),
	 * super.getPhone(), super.getEmail(), super.getAddress(), super.getCity(),
	 * super.getState(), super.getZipcode(), super.getCountry(),
	 * super.getEncodedImage(), this.businessPhone, this.openHour, this.closeHour,
	 * this.siteURL
	 */

	public BusinessContact(ArrayList<String> bAnswers) {
		super(bAnswers);
		this.businessPhone = bAnswers.get(12);
		this.openHour = bAnswers.get(13);
		this.closeHour = bAnswers.get(14);
		this.siteURL = bAnswers.get(15);
	}

	/**
	 * Gets the business phone.
	 *
	 * @return the business phone
	 */
	public String getBusinessPhone() {
		return businessPhone;
	}

	public void fOutput() {
		System.out.println(String.format(
				" UID: %-10s Type: %-10s \n First Name: %-10s Last Name: %-10s \n Phone: %-10s \n Email: %-20s \n Address: %-40s \n City: %-15s State: %-15s \n Zipcode: %-5s Country: %-10s \n Image: %-10s \n Business Phone: %-10s \n Open: %-8s Close: %-8s \n Website: %-40s",
				super.getUID(), super.getType(), super.getfName(), super.getlName(), super.getPhone(), super.getEmail(),
				super.getAddress(), super.getCity(), super.getState(), super.getZipcode(), super.getCountry(),
				super.getEncodedImage(), this.businessPhone, this.openHour, this.closeHour, this.siteURL));
	}

	/**
	 * Sets the business phone.
	 *
	 * @param businessPhone the new business phone
	 */
	public void setBusinessPhone(String businessPhone) {
		this.businessPhone = businessPhone;
	}

	/**
	 * Gets the open hour.
	 *
	 * @return the open hour
	 */
	public String getOpenHour() {
		return openHour;
	}

	/**
	 * Sets the open hour.
	 *
	 * @param openHour the new open hour
	 */
	public void setOpenHour(String openHour) {
		this.openHour = openHour;
	}

	/**
	 * Gets the close hour.
	 *
	 * @return the close hour
	 */
	public String getCloseHour() {
		return closeHour;
	}

	/**
	 * Sets the close hour.
	 *
	 * @param closeHour the new close hour
	 */
	public void setCloseHour(String closeHour) {
		this.closeHour = closeHour;
	}

	/**
	 * Gets the site URL.
	 *
	 * @return the site URL
	 */
	public String getSiteURL() {
		return siteURL;
	}

	/**
	 * Sets the site URL.
	 *
	 * @param siteURL the new site URL
	 */
	public void setSiteURL(String siteURL) {
		this.siteURL = siteURL;
	}

	public boolean editiableFields(String input, Scanner scanner) {
		if (input.toLowerCase().equals("first name")) {
			System.out.println("Please enter the new First Name");
			super.setfName(scanner.nextLine());
			System.out.println("Successfully updated First Name");
			return true;
		} else if (input.toLowerCase().equals("last name")) {
			System.out.println("Please enter the new Last Name");
			super.setlName(scanner.nextLine());
			System.out.println("Successfully updated Last Name");
			return true;
		} else if (input.toLowerCase().equals("phone")) {
			System.out.println("Please enter the new Phone");
			super.setPhone(scanner.nextLine());
			System.out.println("Successfully updated Phone");
			return true;
		} else if (input.toLowerCase().equals("email")) {
			System.out.println("Please enter the new Email");
			super.setEmail(scanner.nextLine());
			System.out.println("Successfully updated Email");
			return true;
		} else if (input.toLowerCase().equals("address")) {
			System.out.println("Please enter the new Address");
			super.setAddress(scanner.nextLine());
			System.out.println("Successfully updated Address");
			return true;
		} else if (input.toLowerCase().equals("city")) {
			System.out.println("Please enter the new City");
			super.setCity(scanner.nextLine());
			System.out.println("Successfully updated City");
			return true;
		} else if (input.toLowerCase().equals("state")) {
			System.out.println("Please enter the new State");
			super.setState(scanner.nextLine());
			System.out.println("Successfully updated State");
			return true;
		} else if (input.toLowerCase().equals("zipcode")) {
			System.out.println("Please enter the new Zipcode");
			super.setZipcode(scanner.nextLine());
			System.out.println("Successfully updated Zipcode");
			return true;
		} else if (input.toLowerCase().equals("country")) {
			System.out.println("Please enter the new Country");
			super.setCountry(scanner.nextLine());
			System.out.println("Successfully updated Country");
			return true;
		} else if (input.toLowerCase().equals("business phone")) {
			System.out.println("Please enter the new Business Phone");
			this.businessPhone = scanner.nextLine();
			System.out.println("Successfully updated Business Phone");
			return true;
		} else if (input.toLowerCase().equals("open")) {
			System.out.println("Please enter the Open Hour");
			this.openHour = scanner.nextLine();
			System.out.println("Successfully updated Open Hour");
			return true;
		} else if (input.toLowerCase().equals("close")) {
			System.out.println("Please enter the new Close Hour");
			this.closeHour = scanner.nextLine();
			System.out.println("Successfully updated Close Hour");
			return true;
		} else if (input.toLowerCase().equals("website")) {
			System.out.println("Please enter the new Web Site");
			this.siteURL = scanner.nextLine();
			System.out.println("Successfully updated Web Site");
			return true;
		} else {
			System.out.println("Invalid Selection");
		}
		return false;
	}

}
