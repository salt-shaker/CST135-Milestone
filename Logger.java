package com.milestone;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

	/***************
	 * Constructor *
	 ***************/
	public Logger() {
	}

	/**********************
	 * getDateTime Method *
	 **********************/
	private String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		Date date = new Date();
		return dateFormat.format(date);
	}

	/*********************
	 * logWritter Method *
	 *********************/
	private void logWritter(String logData) throws IOException {

		BufferedWriter writer = new BufferedWriter(new FileWriter("./samplefile.txt", true)); // Set true for append
																								// mode
		writer.newLine(); // Add new line
		writer.write(logData + " | " + getDateTime());
		writer.close();
	}

	public void log(String logData) {
		try {
			logWritter(logData);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
