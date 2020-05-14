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
		Performer perf = new Performer();
		LOGGER.info("Century: " + perf.getCentury());
		LOGGER.info("Music era: " + perf.getEra());
		LOGGER.info("Genre of music: " + perf.getGenre());
		LOGGER.info("Performer name: " + perf.performerName);
	}

	

}

