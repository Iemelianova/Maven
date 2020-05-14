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
		Rhythm r = new Rhythm();
			LOGGER.info("Century: " + r.getCentury());
			LOGGER.info("Music era: " + r.getEra());
			LOGGER.info("Kind of music: " + r.getKind());
	}

	
}

