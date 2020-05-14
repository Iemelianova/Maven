package com.solvd.music.types.vocals;


import org.apache.log4j.Logger;

import com.solvd.music.types.WayOfExecution;

public class Vocals extends WayOfExecution {

	
	private final static Logger LOGGER = Logger.getLogger(Vocals.class);

	public Vocals() {

	}

	public Vocals(int century, String era, String genre) {
		super(century, era, genre);

	}

	
	public void printInfo() {
		

	}

	
}

