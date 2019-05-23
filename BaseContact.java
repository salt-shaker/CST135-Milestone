/**
 * 
 */
package com.milestone;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;
import javax.imageio.ImageIO;

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
		imageToString(args[10]);
	}

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
	
	public String setUID() {
		return address;
	}

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
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.picture = null;
		}

	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public BufferedImage getPicture() {
		return toBufferedImage();
	}

	public void setPicture(String imagePath) {
		imageToString(imagePath);
	}

}
