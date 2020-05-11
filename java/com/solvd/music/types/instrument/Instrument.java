package com.solvd.music.types.instrument;

import org.apache.log4j.Logger;

import com.solvd.music.types.WayOfExecution;

public class Instrument extends WayOfExecution {

	private int quantity;
	Instrument ins = new Instrument();
	private final static Logger LOGGER = Logger.getLogger(Instrument.class);

	public Instrument() {

	}

	public Instrument(int century, String era, String genre, String way, int quantity) {
		super(century, era, genre, way);

	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
		LOGGER.info(this.quantity);

	}

	public int getQuantity() {
		LOGGER.info(this.quantity);
		return this.quantity;
	}

	@Override
	public void printInfo() {
		LOGGER.info("Century: " + ins.getCentury());
		LOGGER.info("Music era: " + ins.getEra());
		LOGGER.info("Genre of music: " + ins.getGenre());
		LOGGER.info("Way of excecution the music: " + ins.getWay());
		LOGGER.info("Quantity of participants: " + ins.getQuantity());
	}

}
