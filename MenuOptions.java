/**
 * 
 */
package com.milestone;

// TODO: Auto-generated Javadoc
/**
 * The Class MenuOptions.
 *
 * @author Sashae
 */
public class MenuOptions {
	
	private Logger logger;

	/**
	 * @param newLogger
	 */
	public MenuOptions(Logger newLogger) {
		this.logger = newLogger;
		logger.log("Menu options created.");
	}

	/**
	 * Main.
	 */
	private void main() {
		System.out.println(" __________________________");
		System.out.println("|        MAIN MENU         |");
		System.out.println("|                          |");
		System.out.println("| Options:                 |");
		System.out.println("|    1. View               |");
		System.out.println("|    2. Search             |");
		System.out.println("|    3. Create             |");
		System.out.println("|    4. Update             |");
		System.out.println("|    5. Delete             |");
		System.out.println("|    6. Exit               |");
		System.out.println("|                          |");
		System.out.println("|   Type 'help' for help   |");
		System.out.println("|__________________________|");
	}

	/**
	 * View.
	 */
	private void view() {
		
		System.out.println(" __________________________");
		System.out.println("|        VIEW MENU         |");
		System.out.println("|                          |");
		System.out.println("| Options:                 |");
		System.out.println("|    1. Display            |");
		System.out.println("|    2. Sort               |");
		System.out.println("|    3. Back               |");
		System.out.println("|    4. Exit               |");
		System.out.println("|                          |");
		System.out.println("|   Type 'help' for help   |");
		System.out.println("|__________________________|");
	}

	/**
	 * Creates the.
	 */
	private void create() {
		System.out.println(" __________________________");
		System.out.println("|       CREATE MENU        |");
		System.out.println("|                          |");
		System.out.println("|   Creating new contact!  |");
		System.out.println("|                          |");
		System.out.println("|   Answer questions in    |");
		System.out.println("|   console window then    |");
		System.out.println("|    press 'enter' key.    |");
		System.out.println("|                          |");
		System.out.println("|   Type 'help' for help   |");
		System.out.println("|__________________________|");
	}

	/**
	 * Edit.
	 */
	private void edit() {
		System.out.println(" __________________________");
		System.out.println("|        EDIT MENU         |");
		System.out.println("|                          |");
		System.out.println("|  Enter UID of contact/s  |");
		System.out.println("|      to be edited.       |");
		System.out.println("|                          |");
		System.out.println("|   Type 'help' for help   |");
		System.out.println("|__________________________|");
	}

	/**
	 * Delete.
	 */
	private void delete() {
		System.out.println(" __________________________");
		System.out.println("|       DELETE MENU        |");
		System.out.println("|                          |");
		System.out.println("|  Enter UID of contact/s  |");
		System.out.println("|      to be deleted.      |");
		System.out.println("|                          |");
		System.out.println("|   Type 'help' for help   |");
		System.out.println("|__________________________|");
	}
	
	/**
	 * Search.
	 */
	private void search() {
		System.out.println(" __________________________");
		System.out.println("|       SEARCH MENU        |");
		System.out.println("|                          |");
		System.out.println("| Enter UID to search for. |");
		System.out.println("|                          |");
		System.out.println("|   Type 'help' for help   |");
		System.out.println("|__________________________|");
	}

	/**
	 * Gets the menu.
	 *
	 * @return the menu
	 */
	// Get Menu for current app location
	public void getMenu(int curMenu) {

		switch (curMenu) {
		// Main Menu
		case 0:
			main();
			logger.log("@ Main Menu");
			break;
		case 1:
			view();
			logger.log("@ View Menu");
			break;
		case 2:
			create();
			logger.log("@ Create Menu");
			break;
		case 3:
			edit();
			logger.log("@ Edit Menu");
			break;
		case 4:
			delete();
			logger.log("@ Delete Menu");
			break;
		case 5:
			search();
			logger.log("@ Seache Menu");
			break;
		}
	}
}
