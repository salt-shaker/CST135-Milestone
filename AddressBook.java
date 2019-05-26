/**
 * 
 */
package com.milestone;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Class AddressBook.
 * 
 * The central class to the address book. All other classes except the console
 * class associate with the address book class.
 *
 * @author Sashae
 */
public class AddressBook {

	private int curMenu;
	private MenuOptions menu;
	private Logger logger;
	private UserInput uInput;
	private Scanner scanner;
	private ArrayList<BaseContact> contacts = new ArrayList<BaseContact>();
	private BusinessService biz;

	/**
	 * Instantiates a new address book.
	 */
	public AddressBook(Logger newLogger) {
		this.curMenu = 0;
		this.logger = newLogger;
		this.menu = new MenuOptions(newLogger);
		this.uInput = new UserInput(newLogger);
		this.scanner = new Scanner(System.in);
		this.biz = new BusinessService(newLogger);
		logger.log("Address Book Created.");
	}

	/**
	 * Controller.
	 * 
	 * Check if for user input, if user selects "exit" on any menu, getInput()
	 * returns false.
	 *
	 * @return true, if successful
	 */
	// Main Logic for Address Book
	public boolean controller() {

		// Get Current Menu
		getMenu();
		
		this.contacts = biz.load();
		
		contacts.add(new BusinessContact());
		
		biz.save(this.contacts);

		for (BaseContact x : contacts) {
			System.out.println(x.toString());
		}

		//System.out.println(contacts.get(0).toString());

		// Get User Input
		if (!getInput())
			return false;

		// Default Value
		return true;
	}

	/**
	 * Gets the input.
	 *
	 * @return the input
	 */
	// Gets User input
	private boolean getInput() {

		// Get User Input
		String input = uInput.getInputString(scanner);

		// Get user action, return false if exit selected
		if (!getActions(input))
			return false;

		return true;
	}

	private void getMenu() {
		menu.getMenu(curMenu);
	}

	/**
	 * Gets the actions.
	 *
	 * @param input the input
	 * @return the actions
	 */
	// Current actions for appropriate menu
	private boolean getActions(String input) {
		switch (curMenu) {
		case 0:
			return menu0(input);
		case 1:
			return menu1(input);
		case 2:
			return menu2(input);
		case 3:
			return menu3(input);
		case 4:
			return menu4(input);
		case 5:
			return menu5(input);
		}
		return true;
	}

	/**
	 * Menu 0.
	 *
	 * @param input the input
	 * @return true, if successful
	 */
	// Main Menu
	private boolean menu0(String input) {
		// Check User Input
		switch (input.toLowerCase()) {
		case "view":
			curMenu = 1;
			break;
		case "search":
			curMenu = 2;
			break;
		case "create":
			curMenu = 3;
			break;
		case "update":
			curMenu = 4;
			break;
		case "delete":
			curMenu = 5;
			break;
		case "exit":
			return false;
		default:
			System.out.println("Input not valid!");
		}

		return true;
	}

	/**
	 * Menu 1.
	 *
	 * @param input the input
	 * @return true, if successful
	 */
	// View Menu
	private boolean menu1(String input) {
		// Check User Input
		switch (input.toLowerCase()) {

		case "exit":
			return false;
		default:
			System.out.println("Input not valid!");
		}
		return true;
	}

	/**
	 * Menu 2.
	 *
	 * @param input the input
	 * @return true, if successful
	 */
	// Search Menu
	private boolean menu2(String input) {
		// Check User Input
		switch (input.toLowerCase()) {

		case "exit":
			return false;
		default:
			System.out.println("Input not valid!");
		}
		return true;
	}

	/**
	 * Menu 3.
	 *
	 * @param input the input
	 * @return true, if successful
	 */
	// Create Menu
	private boolean menu3(String input) {
		// Check User Input
		switch (input.toLowerCase()) {

		case "exit":
			return false;
		default:
			System.out.println("Input not valid!");
		}
		return true;
	}

	/**
	 * Menu 4.
	 *
	 * @param input the input
	 * @return true, if successful
	 */
	// Update Menu
	private boolean menu4(String input) {
		// Check User Input
		switch (input.toLowerCase()) {

		case "exit":
			return false;
		default:
			System.out.println("Input not valid!");
		}
		return true;
	}

	/**
	 * Menu 5.
	 *
	 * @param input the input
	 * @return true, if successful
	 */
	// Delete Menu
	private boolean menu5(String input) {
		// Check User Input
		switch (input.toLowerCase()) {

		case "exit":
			return false;
		default:
			System.out.println("Input not valid!");
		}
		return true;
	}

	/**
	 * Adds the.
	 */
	// Add new Contact
	private void add() {
		// Person Contact - uid, fName, lName, phone, email, address, city, state,
		// zipcode, country, picture, workPhone
		// Business Contact - uid, fName, lName, phone, email, address, city, state,
		// zipcode, country, picture, businessPhone, openHour, closeHour, siteURL
	}

	/**
	 * Removes the.
	 */
	// Remove a contact
	private void remove() {

	}

	/**
	 * Display.
	 */
	// Display all contacts
	private void display() {

	}

	/**
	 * Sort by.
	 */
	// Display a sorted list of all contacts
	private void sortBy() {

	}

	/**
	 * Search.
	 */
	// Display contact matching search criteria
	private void search() {

		// Implement search method is base contact class that allows searching for match
		// in class
	}
}
