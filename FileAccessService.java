/**
 * 
 */
package com.milestone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// TODO: Auto-generated Javadoc
/**
 * The Class FileAccessService.
 *
 * @author Sashae
 */
public class FileAccessService implements DataAccessService {

	/**
	 * Gets the.
	 *
	 * @return the buffered reader
	 * @throws FileNotFoundException the file not found exception
	 */
	// Load file
	private BufferedReader get() throws FileNotFoundException {
		File file = new File("contacts.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		return br;

	}

	/**
	 * Read.
	 *
	 * @param br the br
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	// Read File
	private void read(BufferedReader br) throws IOException {
		String st;
		while ((st = br.readLine()) != null)
			System.out.println(st);
	}
	
	/**
	 * Write.
	 *
	 * @param logData the log data
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private void write(String logData) throws IOException {

		BufferedWriter writer = new BufferedWriter(new FileWriter("contacts.txt", true)); // Set true for append mode
		writer.newLine(); // Add new line
		writer.write(logData);
		writer.close();
	}

	/**
	 * Gets the all contacts.
	 *
	 * @return the all contacts
	 */
	@Override
	public void getAllContacts() {
		try {
			read(get());
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	/**
	 * Save all contacts.
	 */
	@Override
	public void saveAllContacts() {
		try {
			write("test");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
