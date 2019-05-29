/**
 * 
 */
package com.milestone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
	private int curContact;
	private MenuOptions menu;
	private Logger logger;
	private Settings settings;
	private UserInput uInput;
	private Scanner scanner;
	private ArrayList<BaseContact> contacts = new ArrayList<BaseContact>();
	private BusinessService biz;

	/**
	 * Instantiates a new address book.
	 * 
	 * @param settings
	 */
	public AddressBook(Settings newSettings, Logger newLogger) {
		this.curMenu = 0;
		this.logger = newLogger;
		this.settings = newSettings;
		this.menu = new MenuOptions(newLogger);
		this.uInput = new UserInput(newLogger);
		this.scanner = new Scanner(System.in);
		this.biz = new BusinessService(newLogger);
		logger.log("Address Book Created.");
	}

	public void load() {
		this.contacts = biz.load();
	}

	public void save() {
		biz.save(contacts);
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

		if (curMenu == 8) {
			contacts.get(curContact).fOutput();
		}

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
		this.menu.getMenu(this.curMenu);
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
		case 6:
			return menu6(input);
		case 7:
			return menu7(input);
		case 8:
			return menu8(input);
		case 9:
			return menu9(input);
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
		case "create":
			curMenu = 2;
			break;
		case "edit":
			curMenu = 3;
			break;
		case "delete":
			curMenu = 4;
			break;
		case "search":
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
		case "display":
			curMenu = 6;
			break;
		case "sort":
			curMenu = 7;
			break;
		case "back":
			this.curMenu = 0;
			break;
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
	// Create Menu
	private boolean menu2(String input) {
		// Check User Input
		switch (input.toLowerCase()) {
		case "back":
			curMenu = 0;
			break;
		case "exit":
			return false;
		default:
			// Need to track user input to display prompts and make sure fields are updated
			// correctly
			if (input.equals("")) {
				add();
				// Need to set prompt showing contact created successfully
				curMenu = 0;
			} else {
				System.out.println("Input not valid!");
			}
		}
		return true;
	}

	/**
	 * Menu 3.
	 *
	 * @param input the input
	 * @return true, if successful
	 */
	// Edit Menu
	private boolean menu3(String input) {
		// Check User Input
		switch (input.toLowerCase()) {
		case "back":
			curMenu = 0;
			break;
		case "exit":
			return false;
		default:
			if (userExist(input)) {
				search(input);
			} else {
				System.out.println("Input not valid!");
			}
		}
		return true;
	}

	/**
	 * Menu 4.
	 *
	 * @param input the input
	 * @return true, if successful
	 */
	// Delete Menu
	private boolean menu4(String input) {
		// Check User Input
		switch (input.toLowerCase()) {
		case "back":
			curMenu = 0;
			break;
		case "exit":
			return false;
		default:
			if (userExist(input)) {
				// verify user wanted to delete with second prompt
				// the remove contact from <list> and save contacts
				delete(input);
			} else {
				System.out.println("Input not valid!");
			}
		}
		return true;
	}

	/**
	 * Menu 5.
	 *
	 * @param input the input
	 * @return true, if successful
	 */
	// Search Menu
	private boolean menu5(String input) {
		// Check User Input
		switch (input.toLowerCase()) {
		case "back":
			curMenu = 0;
			break;
		case "exit":
			return false;
		default:
			if (userExist(input)) {
				// Get User and load contact menu
				// Shows contact info and options { Call, Text, Email, Go To Web Site, Edit,
				// Delete, back, exit}
				// add variable to track current contact being edited
				curContact = Integer.parseInt(input.toLowerCase());
				curMenu = 9;
				// search(input);
			} else {
				System.out.println("Input not valid!");
			}
		}
		return true;
	}

	/**
	 * Menu 6.
	 *
	 * @param input the input
	 * @return true, if successful
	 */
	// Display Menu
	private boolean menu6(String input) {
		// Check User Input

		switch (input.toLowerCase()) {
		case "back":
			curMenu = 0;
			break;
		case "exit":
			return false;
		case "":
			display();
			break;
		default:
			if (userExist(input)) {
				curContact = Integer.parseInt(input.toLowerCase());
				curMenu = 9;
			} else {
				System.out.println("Input not valid!");
			}
		}

		return true;
	}

	/**
	 * Menu 7.
	 *
	 * @param input the input
	 * @return true, if successful
	 */
	// Sort Menu
	private boolean menu7(String input) {
		// Check User Input
		switch (input.toLowerCase()) {
		case "uid ascending":
			/* Sorting based on UID */
			System.out.println("Contact UID ASC Sorting:");
			Collections.sort(contacts, BaseContact.uidComparatorDSC);

			for (BaseContact x : contacts) {
				System.out.println(x.toString());
			}
			break;
		case "uid descending":
			/* Sorting based on UID */
			System.out.println("Contact UID DSC Sorting:");
			Collections.sort(contacts, BaseContact.uidComparatorDSC);

			for (BaseContact x : contacts) {
				System.out.println(x.toString());
			}
			break;
		case "first name ascending":
			/* Sorting based on Contact Name */
			System.out.println("Contact First Name ASC Sorting:");
			Collections.sort(contacts, BaseContact.fNameComparatorASC);

			for (BaseContact x : contacts) {
				System.out.println(x.toString());
			}
			break;
		case "first name descending":
			/* Sorting based on Contact Name */
			System.out.println("Contact First Name DSC Sorting:");
			Collections.sort(contacts, BaseContact.fNameComparatorDSC);

			for (BaseContact x : contacts) {
				System.out.println(x.toString());
			}
			break;
		case "last name ascending":
			/* Sorting based on Contact Name */
			System.out.println("Contact Last Name DSC Sorting:");
			Collections.sort(contacts, BaseContact.lNameComparatorASC);

			for (BaseContact x : contacts) {
				System.out.println(x.toString());
			}
			break;
		case "last name descending":
			/* Sorting based on Contact Name */
			System.out.println("Contact Last Name DSC Sorting:");
			Collections.sort(contacts, BaseContact.lNameComparatorDSC);

			for (BaseContact x : contacts) {
				System.out.println(x.toString());
			}
			break;
		case "back":
			curMenu = 0;
			break;
		case "exit":
			return false;
		default:
			System.out.println("Input not valid!");
		}
		return true;
	}

	/**
	 * Menu 8.
	 *
	 * @param input the input
	 * @return true, if successful
	 */
	// Editing Menu
	private boolean menu8(String input) {
		// Check User Input
		switch (input.toLowerCase()) {
		case "back":
			curMenu = 0;
			break;
		case "exit":
			return false;
		default:
			if (contacts.get(curContact).editiableFields(input.toLowerCase(), scanner)) {
				// Get User and load contact menu
				// Shows contact info and options { Call, Text, Email, Go To Web Site, Edit,
				// Delete, back, exit}
				// add variable to track current contact being edited
				biz.save(contacts);
			} else {
				System.out.println("Input not valid!");
			}
		}
		return true;
	}

	/**
	 * Menu 9.
	 *
	 * @param input the input
	 * @return true, if successful
	 */
	// User Options Menu
	private boolean menu9(String input) {
		// Check User Input
		switch (input.toLowerCase()) {

		case "view":
			break;
		case "edit":
			break;
		case "delete":
			break;
		case "call":
			break;
		case "text":
			break;
		case "email":
			break;
		case "website":
			break;
		case "back":
			curMenu = 0;
			break;
		case "exit":
			return false;
		default:

		}
		return true;
	}

	/**
	 * Adds the.
	 */
	// Add new Contact
	private void add() {

		System.out.println("Is this a Personal or Business Contact");
		System.out.println("Enter P for personal");
		System.out.println("or B for Business");

		// Get User Input
		String input = uInput.getInputString(scanner);

		if (input.toLowerCase().equals("b")) {

			ArrayList<String> bQuestions = new ArrayList<String>();
			ArrayList<String> bAnswers = new ArrayList<String>();
			bAnswers.add(settings.getUidCoutner());
			bAnswers.add("Business");

			bQuestions.add("First Name: ");
			bQuestions.add("Last Name: ");
			bQuestions.add("Phone Number: ");
			bQuestions.add("Email: ");
			bQuestions.add("Address: ");
			bQuestions.add("City: ");
			bQuestions.add("State: ");
			bQuestions.add("Zipcode: ");
			bQuestions.add("Country: ");
			bQuestions.add("Picture: ");
			bQuestions.add("Business Phone: ");
			bQuestions.add("Open Hour: ");
			bQuestions.add("Close Hour: ");
			bQuestions.add("Site Url: ");

			System.out.println("Please enter the following infomation.");

			for (String x : bQuestions) {
				System.out.print(x);
				String y = uInput.getInputString(scanner);
				String z = y.replace(";", "");
				if (y.equals("")) {
					y = null;
				}
				bAnswers.add(z);
			}

			contacts.add(new BusinessContact(bAnswers));
			contacts.get(contacts.size() - 1).setUID(settings);

			biz.save(this.contacts);
		} else if (input.toLowerCase().equals("p")) {

			ArrayList<String> pQuestions = new ArrayList<String>();
			ArrayList<String> pAnswers = new ArrayList<String>();

			pAnswers.add(settings.getUidCoutner());
			pAnswers.add("Personal");

			pQuestions.add("First Name: ");
			pQuestions.add("Last Name: ");
			pQuestions.add("Phone Number: ");
			pQuestions.add("Email: ");
			pQuestions.add("Address: ");
			pQuestions.add("City: ");
			pQuestions.add("State: ");
			pQuestions.add("Zipcode: ");
			pQuestions.add("Country: ");
			pQuestions.add("Picture: ");
			pQuestions.add("Work Phone: ");
			pQuestions.add("Hobby: ");

			System.out.println("Please enter the following infomation.");

			for (String x : pQuestions) {
				System.out.print(x);
				String y = uInput.getInputString(scanner);
				String z = y.replace(";", "");
				if (y.equals("")) {
					y = null;
				}
				pAnswers.add(z);
			}

			contacts.add(new PersonContact(pAnswers));
			contacts.get(contacts.size() - 1).setUID(settings);

			biz.save(this.contacts);
		}

		settings.update();

	}

	/**
	 * Removes contact from contact list if match is found
	 */
	// Remove a contact
	private void delete(String input) {

		boolean match = false;
		// Get User Input

		Iterator<BaseContact> iter = contacts.iterator();

		while (iter.hasNext()) {
			BaseContact x = iter.next();
			if (input.toLowerCase().equals(x.getUID())) {
				System.out.println("User Found!");
				System.out.println("Are you sure you want to delete UID. y/n");
				System.out.println(x.toString());
				match = true;

				while (true) {
					String input2 = uInput.getInputString(scanner);
					if (input2.toLowerCase().equals("y")) {
						iter.remove();
						curMenu = 0;
						break;
					} else if (input2.toLowerCase().equals("n")) {
						curMenu = 0;
						break;
					} else if (!input2.toLowerCase().equals("y") && !input2.toLowerCase().equals("n")) {
						System.out.println("Invalid input. Try again.");
					}
				}

			}
		}
		if (match == false) {
			System.out.println("No Match Found");
		}
	}

	/**
	 * Display all contact to console in UID order
	 */
	// Display all contacts
	private void display() {
		for (BaseContact x : contacts) {
			System.out.println(x.toString());
		}
	}

	/**
	 * Sort the contacts list
	 * 
	 * @param input - specifies the type of sort to be done on contacts list
	 */
	// Display a sorted list of all contacts
	private void sortBy(String input) {

	}

	/**
	 * Search contacts for based search criteria
	 */
	// Display contact matching search criteria
	private void search(String input) {

		Iterator<BaseContact> iter = contacts.iterator();

		while (iter.hasNext()) {
			BaseContact x = iter.next();
			if (input.toLowerCase().equals(x.getUID())) {
				System.out.println("User Found!");
				curMenu = 8;
				curContact = contacts.indexOf(x);
				break;
			}
		}
	}

	/**
	 * @param string
	 * @return
	 */
	private boolean userExist(String input) {
		try {
			for (BaseContact x : contacts) {
				if (x.getUID().equals(input)) {
					return true;
				}
			}
		} catch (Exception e) {
			System.out.println("Something Went Wrong in UserExist()");
		}

		return false;
	}
}
