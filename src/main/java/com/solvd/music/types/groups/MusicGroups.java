package com.solvd.music.types.groups;

import org.apache.log4j.Logger;

import com.solvd.music.types.Types;
import com.solvd.music.types.WayOfExecution;

public final class MusicGroups extends Types {
	
	private String groupName;
	MusicGroups mg = new MusicGroups();
	private final static Logger LOGGER = Logger.getLogger(MusicGroups.class);


	public MusicGroups() {

	}

	public MusicGroups(int century, String era, String genre, String groupName) {
		super(century, era, genre);
		this.groupName = groupName;
	}
	
	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	
	@Override
	public void printInfo() {
		LOGGER.info("Century: " + mg.getCentury());
		LOGGER.info("Music era: " + mg.getEra());
		LOGGER.info("Genre of music: " + mg.getGenre());
		LOGGER.info("Group name: " + mg.groupName);

	}

	
}
