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
 * The Class Settings.
 *
 * @author Sashae
 */
public class Settings {
	
	private Logger logger;
	private String appName;
	private String appVersion;
	private int uidCoutner;

	/**
	 * Instantiates a new settings.
	 */
	// Constructor
	public Settings(Logger newLogger) {
		this.logger = newLogger;
		
		// Get Config file
		try {
			String[] options = read(get());
			this.appName = options[0];
			this.appVersion = options[1];
			this.uidCoutner = Integer.parseInt(options[2]);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			this.appName = "Contact Manager";
			this.appVersion = "v1.0";
			this.uidCoutner = 0;
			update();
			logger.log("Unable to load config. Default config created.");
			// Not needed. If update fails then panic. // e.printStackTrace();
		} catch (IOException e) {
			// Something went wrong
			logger.log("Unable to load config. Unable to create default config.");
			//e.printStackTrace();
			System.exit(1);
		} finally {
			logger.log("Config loaded successfully.");
		}

	}

	/**
	 * Update.
	 */
	public void update() {
		// Try to create new save file
		try {
			write(String.format("%s:%s:%d", this.appName, this.appVersion, this.uidCoutner));
		} catch (IOException e1) {
			// Unable to create new save file
			e1.printStackTrace();
			System.exit(0);
		}
	}

	/**
	 * Gets the uid coutner.
	 *
	 * @return the uid coutner
	 */
	public String getUidCoutner() {
		addUID();
		return String.valueOf(uidCoutner);
	}

	/**
	 * Adds the UID.
	 */
	public void addUID() {
		this.uidCoutner++;
	}

	/**
	 * Gets the.
	 *
	 * @return the buffered reader
	 * @throws FileNotFoundException the file not found exception
	 */
	// Load file
	private BufferedReader get() throws FileNotFoundException {
		File file = new File("config.in");
		BufferedReader br = new BufferedReader(new FileReader(file));
		return br;

	}

	/**
	 * Read.
	 *
	 * @param br the br
	 * @return the string[]
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	// Read File
	private String[] read(BufferedReader br) throws IOException {
		String st;
		String[] arrOfStr = null;
		while ((st = br.readLine()) != null)
			arrOfStr = st.split(":");
		return arrOfStr;
	}

	/**
	 * Write.
	 *
	 * @param logData the log data
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private void write(String logData) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("config.in", false)); // Set true for append mode
		writer.write(logData);
		writer.close();
	}
	
	/**
	 * App info.
	 */
	public void appInfo() {
		System.out.println(" __________________________");
		System.out.println("|   CST135 Final Project   |");
		System.out.println("|      " + this.appName + "     |");
		System.out.println("|                          |");
		System.out.println("| @version  " + this.appVersion + "           |");
		System.out.println("| @author   Sashae Owens   |");
		System.out.println("|__________________________|");
	}
}
