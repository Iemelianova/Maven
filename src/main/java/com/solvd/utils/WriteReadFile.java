package com.solvd.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.solvd.music.rhythm.Author;
import com.solvd.music.types.vocals.Vocals;

public class WriteReadFile {

	Scanner scan;
	static String pathprop = "E:\\IRA\\solvd\\HW\\\\Path etc.properties";
	static String path = WriteReadProp.getProps(pathprop, "path to file");
	File file = new File(path);
	private final static Logger LOGGER = Logger.getLogger(WriteReadFile.class);


	public String readFromFile(String string) {

		try {

			scan = new Scanner(file);

			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}

		} catch (FileNotFoundException exc) {

			LOGGER.error("Sorry, file does not exist");

		} finally {
			scan.close();
		}

		return "";
	}

	public void writeToFile(String path, Collection<?> list) {

		File file = new File(path);
		try {
			PrintWriter printWriter = new PrintWriter(file);
			for (Object lists : list) {

				printWriter.println(list);

				printWriter.close();
			}
		} catch (FileNotFoundException ex) {
			LOGGER.error(path, ex);		
			}
	}

}

