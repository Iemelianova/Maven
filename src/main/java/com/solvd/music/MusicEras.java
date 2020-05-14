package com.solvd.music;
import org.apache.log4j.Logger;


public class MusicEras {
	private final static Logger LOGGER = Logger.getLogger(MusicEras.class);

	private int century;
	private String era;

	public MusicEras() {
	}
	
	public MusicEras(int century, String era) {
		this.century = century;
		this.era = era;
	}

	public int getCentury() {
		return century;
	}

	public void setCentury(int century) {
		this.century = century;
	}

	public String getEra() {
		return era;
	}

	public void setEra(String era) {
		this.era = era;
	}

	public void printInfo() {
		
	}


}