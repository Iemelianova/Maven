package com.solvd.music.types;

import org.apache.log4j.Logger;

import com.solvd.music.MusicEras;
import com.solvd.music.rhythm.Rhythm;

public class Types extends MusicEras {

	private String genre;
	Types t = new Types();
	private final static Logger LOGGER = Logger.getLogger(Types.class);


	public Types() {
	}

	public Types(int century, String era, String genre) {
		super(century, era);
		this.genre = genre;
	}

	public String getGenre() {
		LOGGER.info(this.genre);
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
		LOGGER.info(this.genre);

	}
	
	@Override
	public void printInfo() {
		LOGGER.info("Century: " + t.getCentury());
		LOGGER.info("Music era: " + t.getEra());
		LOGGER.info("Genre of music: " + t.getGenre());
	}

	
}
