package com.solvd.music.types.groups;

import org.apache.log4j.Logger;

import com.solvd.music.types.Types;

public class Performer extends Types {

	private String performerName;
	
	private final static Logger LOGGER = Logger.getLogger(Performer.class);

	public Performer() {

	}

	public Performer(int century, String era, String genre, String performerName) {
		super(century, era, genre);
		this.performerName = performerName;
	}
	
	public String getPerformerName() {
		return performerName;
	}

	public void setPerformerName(String performerName) {
		this.performerName = performerName;
	}

	@Override
	public void printInfo() {
		LOGGER.info("Century: " + getCentury());
		LOGGER.info("Music era: " + getEra());
		LOGGER.info("Genre of music: " + getGenre());
		LOGGER.info("Performer name: " + performerName);
	}

	

}

