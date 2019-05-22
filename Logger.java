package com.milestone;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class Logger.
 */
public class Logger {

	/**
	 * ********************
	 * getDateTime Method *
	 * ********************.
	 *
	 * @return the date time
	 */
	private String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		Date date = new Date();
		return dateFormat.format(date);
	}

	/**
	 * *******************
	 * logWritter Method *
	 * *******************.
	 *
	 * @param logData the log data
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private void logWritter(String logData) throws IOException {

		BufferedWriter writer = new BufferedWriter(new FileWriter("./log.txt", true)); // Set true for append mode
		writer.newLine(); // Add new line
		writer.write(logData + " | " + getDateTime());
		writer.close();
	}

	/**
	 * Log.
	 *
	 * @param logData the log data
	 */
	public void log(String logData) {
		try {
			logWritter(logData);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
