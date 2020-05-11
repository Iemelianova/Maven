package com.solvd.music.types.vocals;


import org.apache.log4j.Logger;

import com.solvd.music.types.WayOfExecution;

public class Vocals extends WayOfExecution {

	public String vocals;
	Vocals voc = new Vocals();
	private final static Logger LOGGER = Logger.getLogger(Vocals.class);

	public Vocals() {

	}

	public Vocals(int century, String era, String genre, String way, String vocals) {
		super(century, era, genre, way);
		this.vocals = vocals;
	}

	public String getVocals() {
		LOGGER.info(this.vocals);
		return vocals;
	}

	public void setVocals(String vocalist) {
		this.vocals = vocalist;
		LOGGER.info(this.vocals);

	}
	
	@Override
	public void printInfo() {
		LOGGER.info("Century: " + voc.getCentury());
		LOGGER.info("Music era: " + voc.getEra());
		LOGGER.info("Genre of music: " + voc.getGenre());
		LOGGER.info("Way of excecution the music: " + voc.getWay());
		LOGGER.info("Vocals: " + voc.getVocals());

	}

	
}

