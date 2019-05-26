/**
 * 
 */
package com.milestone;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;
import javax.imageio.ImageIO;

// TODO: Auto-generated Javadoc
/**
 * The Class BaseContact.
 *
 * @author Sashae
 */
public class BaseContact {
	
	private String uid;
	private String fName;
	private String lName;
	private String phone;
	private String email;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String country;
	private String picture;

	// Person Contact - uid, fName, lName, phone, email, address, city, state, zipcode, country, picture, workPhone
	// Business Contact - uid, fName, lName, phone, email, address, city, state, zipcode, country, picture, businessPhone, openHour, closeHour, siteURL
	/**
	 * Instantiates a new base contact.
	 *
	 * @param args the args
	 */
	public BaseContact(String... args) {
		this.uid = args[0];
		this.fName = args[1];
		this.lName = args[2];
		this.phone = args[3];
		this.email = args[4];
		this.address = args[5];
		this.city = args[6];
		this.state = args[7];
		this.zipcode = args[8];
		this.country = args[9];
		this.picture = args[10];
	}

	/**
	 * Instantiates a new base contact.
	 */
	public BaseContact() {
		this.uid = setUID();
		this.fName = "First Name";
		this.lName = "Last Name";
		this.phone = "888-888-8888";
		this.email = "example@gmail.com";
		this.address = "45 Avenue St";
		this.city = "Townsville";
		this.state = "Oregon";
		this.zipcode = "44444";
		this.country = "Wakanda";
		this.picture = null;
	}
	
	/**
	 * Sets the UID.
	 *
	 * @return the string
	 */
	public String setUID() {
		return "1";
	}
	
	public String getUID() {
		return this.uid;
	}

	/**
	 * To buffered image.
	 *
	 * @return the buffered image
	 */
	private BufferedImage toBufferedImage() {

		// encode image to Base64 String
		try {
			// byte byteArray[] = new byte[(int)f.length()];

			// decode Base64 String to image
			byte byteArray[] = Base64.getDecoder().decode(this.picture);

			// create a buffered image
			BufferedImage image = null;
			ByteArrayInputStream bis = new ByteArrayInputStream(byteArray);
			image = ImageIO.read(bis);
			bis.close();
			return image;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * Image to string.
	 *
	 * @param imagePath the image path
	 */
	private void imageToString(String imagePath) {

		// encode image to Base64 String and update object
		// imagePath... maybe
		File f = new File(imagePath);
		FileInputStream fis;
		try {
			fis = new FileInputStream(f);
			byte byteArray[] = new byte[(int) f.length()];
			fis.read(byteArray);
			this.picture = Base64.getEncoder().encodeToString(byteArray);
			fis.close();
		} catch (IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			this.picture = null;
		} 

	}

	/**
	 * Gets the f name.
	 *
	 * @return the f name
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * Sets the f name.
	 *
	 * @param fName the new f name
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * Gets the l name.
	 *
	 * @return the l name
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * Sets the l name.
	 *
	 * @param lName the new l name
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * Gets the phone.
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets the phone.
	 *
	 * @param phone the new phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Gets the zipcode.
	 *
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * Sets the zipcode.
	 *
	 * @param zipcode the new zipcode
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Gets the picture.
	 *
	 * @return the picture
	 */
	public BufferedImage getDecodedPicture() {
		return toBufferedImage();
	}
	
	public String getEncodedImage() {
		return this.picture;
	}

	/**
	 * Sets the picture.
	 *
	 * @param imagePath the new picture
	 */
	public void setPicture(String imagePath) {
		imageToString(imagePath);
	}

}
