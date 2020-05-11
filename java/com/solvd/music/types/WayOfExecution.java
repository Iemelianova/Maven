package com.solvd.music.types;

import org.apache.log4j.Logger;

public class WayOfExecution extends Types {

	private String way;
	WayOfExecution w = new WayOfExecution();
	private final static Logger LOGGER = Logger.getLogger(WayOfExecution.class);

	public WayOfExecution() {

	}

	public WayOfExecution(int century, String era, String genre, String way) {
		super(century, era, genre);

	}

	public void setWay(String way) {
		this.way = way;
		LOGGER.info(this.way);

	}

	public String getWay() {
		LOGGER.info(this.way);
		return this.way;
	}
	
	@Override
	public void printInfo() {
		LOGGER.info("Century: " + w.getCentury());
		LOGGER.info("Music era: " + w.getEra());
		LOGGER.info("Genre of music: " + w.getGenre());
		LOGGER.info("Way of excecution the music: " + w.getWay());

	}
}
