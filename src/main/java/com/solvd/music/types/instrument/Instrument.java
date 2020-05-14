package com.solvd.music.types.instrument;

import org.apache.log4j.Logger;

import com.solvd.music.types.WayOfExecution;

public class Instrument extends WayOfExecution {

	private final static Logger LOGGER = Logger.getLogger(Instrument.class);

	public Instrument() {

	}

	public Instrument(int century, String era, String genre) {
		super(century, era, genre);

	}

	
	public void printInfo() {
		
	}

}
