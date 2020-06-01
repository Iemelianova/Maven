package com.solvd.music.types.vocals;

import org.apache.log4j.Logger;

import com.solvd.music.types.WayOfExecution;
import com.solvd.music.types.instrument.Instrument;
import com.solvd.music.types.vocals.Vocals;

public class Acapella extends Vocals implements ISoprano {

	private String singer;
	
	private final static Logger LOGGER = Logger.getLogger(Acapella.class);

	public Acapella() {

	}

	public Acapella(int century, String era, String genre, String singer, String vocals) {
   
	}

	public void setSinger(String singer) {
		this.singer = singer;

	}

	public String getSinger() {
		return this.singer;
	}

	@Override
	public void printInfo() {
		LOGGER.info("Century: " + getCentury());
		LOGGER.info("Music era: " + getEra());
		LOGGER.info("Genre of music: " + getGenre());
		LOGGER.info("Singer: " + getSinger());
	}

}

