/**
 * 
 */
package com.milestone;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class BusinessService.
 *
 * @author Sashae
 */
public class BusinessService {

	private DatabaseAccessService DB;
	private FileAccessService FA;
	private Logger logger;

	/**
	 * Instantiates a new business service.
	 */
	public BusinessService(Logger newLogger) {
		this.DB = new DatabaseAccessService(newLogger);
		this.FA = new FileAccessService(newLogger);
		this.logger = newLogger;
		logger.log("Business Service Started Successfully.");
	}

	/**
	 * Save contacts.
	 */
	public void save(ArrayList<BaseContact> contacts) {
		FA.saveAllContacts(contacts);
	}

	/**
	 * Load contacts.
	 */
	public ArrayList<BaseContact> load() {
		return FA.getAllContacts();
	}

	/**
	 * Verify.
	 */
	// Verify that contacts in memory match save file
	public void verify() {

	}

	/**
	 * Verify DB.
	 */
	// Verify that contacts in memory match Database
	public void verifyDB() {

	}

	// Verify that DB and Save file match
	// Maybe allow comparison and overwrite
	/**
	 * Cross verify.
	 */
	// sorta hard to do from console output
	public void crossVerify() {

	}

}
