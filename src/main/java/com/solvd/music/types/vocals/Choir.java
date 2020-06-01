package com.solvd.music.types.vocals;

import org.apache.log4j.Logger;

import com.solvd.music.types.vocals.Vocals;
public class Choir extends Vocals {

	private String choirName;

	private int singers;
	
	
	private final static Logger LOGGER = Logger.getLogger(Choir.class);

	public Choir() {

	}

	public Choir(int century, String era, String genre, int singers, String choirName) {
		
		this.choirName = choirName;
		this.singers = singers;
	}

	public String getChoirName() {
		return choirName;
	}

	public void setChoirName(String choirName) {
		this.choirName = choirName;

	}

	public int getSingers() {
		return singers;
	}

	public void setSingers(int singers) {
		this.singers = singers;
	}
	
	@Override
	public void printInfo() {
		LOGGER.info("Century: " + getCentury());
		LOGGER.info("Music era: " + getEra());
		LOGGER.info("Genre of music: " + getGenre());
		LOGGER.info("Singers quantity: " + getSingers());
		LOGGER.info("Choir name: " + getChoirName());

	}

	
}
