/**
 * 
 */
package com.milestone;

import java.util.Scanner;

/**
 * @author Sashae
 *
 */
public class Console {

	/**
	 * @param args
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
