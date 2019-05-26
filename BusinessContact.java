/**
 * 
 */
package com.milestone;

// TODO: Auto-generated Javadoc
/**
 * The Class BusinessContact.
 *
 * @author Sashae
 */
public class BusinessContact extends BaseContact{
	
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
	
	// fName, lName, phone, email, address, city, state, zipcode, country, picture, businessPhone, openHour, closeHour, siteURL
	
	public String toString() {
		return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", "business", super.getUID(), super.getfName(), super.getlName(), super.getPhone(), super.getEmail(), super.getAddress(), super.getCity(), super.getState(), super.getZipcode(), super.getCountry(), super.getEncodedImage(), this.businessPhone, this.openHour, this.closeHour, this.siteURL);
	}
	
	/**
	 * Instantiates a new business contact.
	 *
	 * @param args the args
	 */
	public BusinessContact(String... args) {
		super(args);
		this.businessPhone = args[11];
		this.openHour = args[12];
		this.closeHour = args[13];
		this.siteURL = args[14];		
	}

	/**
	 * Gets the business phone.
	 *
	 * @return the business phone
	 */
	public String getBusinessPhone() {
		return businessPhone;
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

}
