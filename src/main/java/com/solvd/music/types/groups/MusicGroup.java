package com.solvd.music.types.groups;

import org.apache.log4j.Logger;

import com.solvd.music.types.Types;

public final class MusicGroup extends Types {
	
	private String groupName;
	
	private final static Logger LOGGER = Logger.getLogger(MusicGroup.class);


	public MusicGroup() {

	}

	public MusicGroup(int century, String era, String genre, String groupName) {
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
		LOGGER.info("Century: " + getCentury());
		LOGGER.info("Music era: " + getEra());
		LOGGER.info("Genre of music: " + getGenre());
		LOGGER.info("Group name: " + groupName);

	}

	
}
