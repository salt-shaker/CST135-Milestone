/**
 * 
 */
package com.milestone;

/**
 * The Class BusinessService.
 *
 * @author Sashae
 */
public class BusinessService {
	
	private DatabaseAccessService DB;
	private FileAccessService FA;
	
	public BusinessService() {
		this.DB =  new DatabaseAccessService();
		this.FA = new FileAccessService();
	}
	
	public void saveContacts() {
		
	}
	
	public void loadContacts() {
		
	}
	
	// Verify that contacts in memory match save file
	public void verify() {
		
	}
	
	// Verify that contacts in memory match Database
	public void verifyDB() {
		
	}
	
	// Verify that DB and Save file match
	// Maybe allow comparison and overwrite
	// sorta hard to do from console output
	public void crossVerify() {
		
	}

}
