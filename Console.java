/**
 * 
 */
package com.milestone;

// TODO: Auto-generated Javadoc
/**
 * The Class Console.
 *
 * @author Sashae
 */
public class Console {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Settings settings = new Settings();
		
		// Output App Info
		settings.appInfo();
		
		AddressBook app = new AddressBook();
		
		// Main Loop
		while (true) {

			if (!app.controller())
				break;
		}

	}

}
