package com.solvd.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteReadProp {

	static String pathprop = "E:\\IRA\\solvd\\HW\\\\Path etc.properties";

	public void setProps(String pathprop, String key, String value) {

		Properties prop = new Properties();

		try {
			FileOutputStream outp = new FileOutputStream(pathprop);
			prop.setProperty(key, value);
			prop.store(outp, "");
			outp.close();
		} catch (IOException exc) {
			LOGGER.error();
		}
	}

	public static String getProps(String pathprop, String key) {

		Properties prop = new Properties();
		FileInputStream inp = null;
		try {
			inp = new FileInputStream(pathprop);
			prop.load(inp);
			inp.close();
			return prop.getProperty(key);
		} catch (IOException exc) {
			LOGGER.error();
		}

		return "";
	}

}
