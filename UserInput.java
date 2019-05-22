/**
 * 
 */
package com.milestone;

import java.util.Scanner;

/**
 * @author Sashae
 *
 */
public class UserInput {

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
