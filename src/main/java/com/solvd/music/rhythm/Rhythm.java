package com.solvd.music.rhythm;

import org.apache.log4j.Logger;

import com.solvd.music.MusicEras;

public class Rhythm extends MusicEras {

	private String kind ;
	private final static Logger LOGGER = Logger.getLogger(Rhythm.class);
	

	public Rhythm() {

	}

	public Rhythm(int century, String era, String kind) {
		super(century, era);
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;

	}
	
	public void printInfo() {
			LOGGER.info("Century: " + getCentury());
			LOGGER.info("Music era: " + getEra());
			LOGGER.info("Kind of music: " + getKind());
	}

	
}

