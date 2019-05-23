/**
 * 
 */
package com.milestone;

/**
 * The Class BusinessContact.
 *
 * @author Sashae
 */
public class BusinessContact extends BaseContact{
	
	private String businessPhone;
	private String openHour;
	private String closeHour;
	private String siteURL;
	
	public BusinessContact() {
		super();
		this.businessPhone = "999-999-9999";
		this.openHour = "12:00 am";
		this.closeHour = "12:00 am";
		this.siteURL = "example.com";		
	}
	
	// fName, lName, phone, email, address, city, state, zipcode, country, picture, businessPhone, openHour, closeHour, siteURL
	
	public BusinessContact(String... args) {
		super(args);
		this.businessPhone = args[10];
		this.openHour = args[11];
		this.closeHour = args[12];
		this.siteURL = args[13];		
	}

	public String getBusinessPhone() {
		return businessPhone;
	}

	public void setBusinessPhone(String businessPhone) {
		this.businessPhone = businessPhone;
	}

	public String getOpenHour() {
		return openHour;
	}

	public void setOpenHour(String openHour) {
		this.openHour = openHour;
	}

	public String getCloseHour() {
		return closeHour;
	}

	public void setCloseHour(String closeHour) {
		this.closeHour = closeHour;
	}

	public String getSiteURL() {
		return siteURL;
	}

	public void setSiteURL(String siteURL) {
		this.siteURL = siteURL;
	}

}
