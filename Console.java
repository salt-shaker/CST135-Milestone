/**
 * 
 */
package com.milestone;

/**
 * The Class Console.
 * 
 * Entry point for the console application. It constructs the necessary classes
 * to get the application running.
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

		Logger logger = new Logger(); // Create logger
		Settings settings = new Settings(logger); // Get app config
		settings.appInfo(); // Output app info
		AddressBook app = new AddressBook(settings, logger); // Create address book
		app.load(); //Load Contacts

		// Main Loop
		while (true) {

			if (!app.controller())
				break;
		}

	}

}
