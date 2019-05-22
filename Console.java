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

		// Output App Info
		appInfo();
		
		AddressBook app = new AddressBook();

		// Main Loop
		while (true) {

			if (!app.controller())
				break;
		}

	}

	/**
	 * App info.
	 */
	public static void appInfo() {
		System.out.println(" __________________________");
		System.out.println("|   CST135 Final Project   |");
		System.out.println("|      Contact Manager     |");
		System.out.println("|                          |");
		System.out.println("| @version  1.0            |");
		System.out.println("| @author   Sashae Owens   |");
		System.out.println("|__________________________|");
	}

}
