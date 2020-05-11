package com.solvd.music.types.vocals;

import org.apache.log4j.Logger;

import com.solvd.music.types.vocals.Vocals;
public class Choir extends Vocals {

	private String choirName;

	private int singers;
	
	Choir ch = new Choir();
	private final static Logger LOGGER = Logger.getLogger(Choir.class);

	public Choir() {

	}

	public Choir(int century, String era, String genre, int singers, String choirName) {
		
		this.choirName = choirName;
		this.singers = singers;
	}

	public String getChoirName() {
		LOGGER.info(this.choirName);
		return choirName;
	}

	public void setChoirName(String choirName) {
		this.choirName = choirName;
		LOGGER.info(this.choirName);

	}

	public int getSingers() {
		LOGGER.info(this.choirName);
		return singers;
	}

	public void setSingers(int singers) {
		this.singers = singers;
		LOGGER.info(this.choirName);

	}
	
	@Override
	public void printInfo() {
		LOGGER.info("Century: " + ch.getCentury());
		LOGGER.info("Music era: " + ch.getEra());
		LOGGER.info("Genre of music: " + ch.getGenre());
		LOGGER.info("Singers quantity: " + ch.getSingers());
		LOGGER.info("Choir name: " + ch.getChoirName());

	}

	
}
