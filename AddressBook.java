/**
 * 
 */
package com.milestone;

import java.util.Scanner; 

/**
 * @author Sashae
 *
 */
public class AddressBook {

	private int curMenu;
	private MenuOptions menu;

	public AddressBook() {
		this.curMenu = 0;
		this.menu = new MenuOptions();
	}

	// Main Logic for Address Book
	public boolean controller() {

		// Get Current Menu
		getMenu();

		// Get User Input
		if (!getInput())
			return false;

		// Default Value
		return true;
	}

	// Gets User input
	private boolean getInput() {

		// User Input Object
		UserInput uInput = new UserInput();

		// Scanner Object
		Scanner scanner = new Scanner(System.in);

		// Get User Input
		String input = uInput.getInputString(scanner);

		// Get user action, return false if exit selected
		if (!getActions(input))
			return false;

		return true;
	}

	// Get Menu for current app location
	private void getMenu() {

		switch (curMenu) {
		// Main Menu
		case 0:
			menu.main();
			break;
		case 1:
			menu.view();
			break;
		case 2:
			menu.create();
			break;
		case 3:
			menu.update();
			break;
		case 4:
			menu.delete();
			break;
		}
	}

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
}
