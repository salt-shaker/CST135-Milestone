/**
 * 
 */
package com.milestone;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class UserInput.
 *
 * @author Sashae
 */
public class UserInput {

	/**
	 * Gets the input string.
	 *
	 * @param scanner the scanner
	 * @return the input string
	 */
	public String getInputString(Scanner scanner) {

		boolean checker = false;
		String input = null;
		
		while (true) {
			try {
				checker = true;
				input = scanner.nextLine();
			} catch (java.util.InputMismatchException e) {
				checker = false;
				System.out.println("Input not valid!");
				scanner.nextLine();
			} finally {
				if(checker) return input;
			}
		}
	}

}
