/**
 * 
 */
package com.milestone;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Interface DataAccessService.
 *
 * @author Sashae
 */
public interface DataAccessService {
	
	/**
	 * Gets the all contacts.
	 *
	 * @return the all contacts
	 */
	public ArrayList<BaseContact> getAllContacts();

	/**
	 * @param contacts
	 */
	void saveAllContacts(ArrayList<BaseContact> contacts);
}
