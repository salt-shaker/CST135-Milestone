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
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class FileAccessService.
 *
 * @author Sashae
 */
public class FileAccessService implements DataAccessService {

	private Logger logger;

	/**
	 * @param logger
	 */
	public FileAccessService(Logger newLogger) {
		this.logger = newLogger;
	}

	/**
	 * Loads the contacts file info memory
	 *
	 * @return the buffered reader
	 * @throws FileNotFoundException the file not found exception
	 */
	private BufferedReader get() throws FileNotFoundException {
		File file = new File("contacts.in");
		BufferedReader br = new BufferedReader(new FileReader(file));
		return br;
	}

	/**
	 * Takes the loaded contact file and creates contact objects
	 *
	 * @param br the br
	 * @return the array list
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private ArrayList<BaseContact> read(BufferedReader br) throws IOException {
		
		// Create Variables
		String st;
		ArrayList<BaseContact> contacts = new ArrayList<BaseContact>();
		
		// Read Contents of file line by line
		while ((st = br.readLine()) != null) {

			// Convert from CSV to array object
			String[] x = st.split(";");
			for (String y : x) {
				
				String[] z = y.split(",");
				ArrayList<String> list = new ArrayList<String>();
				
				//Copy from array to arrayList
				for(String e : z) {
					list.add(e);
				}

				// Determine type of contact then create
				if (z[1].toLowerCase().equals("personal")) {
					contacts.add(new PersonContact(list));
				} else if (z[1].toLowerCase().equals("business")) {
					contacts.add(new BusinessContact(list));
				}
			}
		}

		return contacts;
	}

	/**
	 * Write.
	 *
	 * @param logData the log data
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private void write(StringBuilder saveData) throws IOException {

		BufferedWriter writer = new BufferedWriter(new FileWriter("contacts.in", false)); // Set true for append mode
		//writer.newLine(); // Add new line
		writer.write(saveData.toString());
		writer.close();

	}

	// Get all contacts and makes an array list. contact class has a toString()
	// method that output the object in CSV compatible string
	private StringBuilder send(ArrayList<BaseContact> contacts) {
		StringBuilder saveData = new StringBuilder();
		for (BaseContact x : contacts) {
			saveData.append(x.toString() + ";");
		}
		return saveData;
	}

	/**
	 * Gets the all contacts.
	 *
	 * @return the all contacts
	 */
	@Override
	public ArrayList<BaseContact> getAllContacts() {
		try {
			ArrayList<BaseContact> contacts = read(get());
			logger.log("Contacts retrieved from data file successfully.");
			return contacts;
		} catch (FileNotFoundException e) {
			logger.log("Contacts file not found.");
		} catch (IOException e) {
			logger.log("Unable to load contacts file.");
		}

		// Return empty array if nothing available
		return new ArrayList<BaseContact>();
	}

	/**
	 * Save all contacts.
	 */
	@Override
	public void saveAllContacts(ArrayList<BaseContact> contacts) {
		try {
			logger.log("Saving contacts to file...");
			write(send(contacts));
			logger.log("Contacts saved successfully.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
