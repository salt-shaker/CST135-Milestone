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

	/**
	 * Gets the.
	 *
	 * @return the buffered reader
	 * @throws FileNotFoundException the file not found exception
	 */
	// Load file
	private BufferedReader get() throws FileNotFoundException {
		File file = new File("contacts.idb");
		BufferedReader br = new BufferedReader(new FileReader(file));
		return br;

	}

	/**
	 * Read.
	 *
	 * @param br the br
	 * @return 
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	// Read File
	private ArrayList<BaseContact> read(BufferedReader br) throws IOException {
		String st;
		ArrayList<BaseContact> contacts = new ArrayList<BaseContact>();
		while ((st = br.readLine()) != null) {
			String[] tmp = st.split(":-:");
			if(tmp[0].equals("person")) {
				contacts.add(new PersonContact(tmp[1],tmp[2],tmp[3],tmp[4],tmp[5],tmp[6],tmp[7],tmp[8],tmp[9],tmp[10],tmp[11]));
			} else if (tmp[0].equals("business")) {
				contacts.add(new BusinessContact(tmp[1],tmp[2],tmp[3],tmp[4],tmp[5],tmp[6],tmp[7],tmp[8],tmp[9],tmp[10],tmp[11],tmp[12],tmp[13],tmp[14]));
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
