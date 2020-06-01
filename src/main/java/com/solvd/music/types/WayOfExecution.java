package com.solvd.music.types;

import org.apache.log4j.Logger;

import com.solvd.music.rhythm.Rhythm;

public class WayOfExecution extends Types {

	private final static Logger LOGGER = Logger.getLogger(WayOfExecution.class);

	public WayOfExecution() {

	}

	public WayOfExecution(int century, String era, String genre) {
		super(century, era, genre);

	}

	

	public void printInfo() {

	}
}
