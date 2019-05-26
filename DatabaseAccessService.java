/**
 * 
 */
package com.milestone;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class DatabaseAccessService.
 *
 * @author Sashae
 */
public class DatabaseAccessService implements DataAccessService{
	
	private Logger logger;

	/**
	 * @param logger
	 */
	public DatabaseAccessService(Logger newLogger) {
		this.logger = newLogger;
	}


	@Override
	public ArrayList<BaseContact> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveAllContacts(ArrayList<BaseContact> contacts) {
		// TODO Auto-generated method stub
		
	}
	
}
