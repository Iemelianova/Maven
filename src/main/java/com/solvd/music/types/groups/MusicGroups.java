package com.solvd.music.types.groups;

import org.apache.log4j.Logger;

import com.solvd.music.types.Types;

public final class MusicGroups extends Types {
	
	private String groupName;
	
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
		MusicGroups mgroup = new MusicGroups();
		LOGGER.info("Century: " + mgroup.getCentury());
		LOGGER.info("Music era: " + mgroup.getEra());
		LOGGER.info("Genre of music: " + mgroup.getGenre());
		LOGGER.info("Group name: " + mgroup.groupName);

	}

	
}
