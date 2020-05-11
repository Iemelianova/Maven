package com.solvd.exceptions;

import org.apache.log4j.Logger;

import com.solvd.Executor;

public class EmptyExc extends Exception {


	public EmptyExc(String empMessage) {

	}

	public static String printEmpMessage() {
		
		return "Sorry, you can't add emptiness.";
	}
}

