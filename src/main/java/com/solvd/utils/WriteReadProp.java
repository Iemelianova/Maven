package com.solvd.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class WriteReadProp {

	public static String pathprop = "E:\\IRA\\solvd\\HW\\\\Path etc.properties";
	private final static Logger LOGGER = Logger.getLogger(WriteReadProp.class);

	public void setProps(String pathprop, String key, String value) {

		Properties prop = new Properties();

		try {
			FileOutputStream outp = new FileOutputStream(pathprop);
			prop.setProperty(key, value);
			prop.store(outp, "");
			outp.close();
		} catch (IOException exc) {
			LOGGER.info(exc);;
		}
	}

	public static String getProps(String path, String key) {

		Properties prop = new Properties();
		FileInputStream inp = null;
		try {
			inp = new FileInputStream(path);
			prop.load(inp);
			inp.close();
			return prop.getProperty(key);
		} catch (IOException exc) {
			LOGGER.error(exc);
		}

		return "";
	}

}
