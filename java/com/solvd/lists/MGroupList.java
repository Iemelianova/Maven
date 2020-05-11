package com.solvd.lists;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

import com.solvd.music.types.groups.MusicGroups;

public class MGroupList {
	List<MusicGroups> listMusicGroups;
	
	private final static Logger LOGGER = Logger.getLogger(MGroupList.class);

	
	public MGroupList() {
		listMusicGroups = new LinkedList<MusicGroups>();
	}
	
	/**
	 * Adding an object to the listMusicGroups
	 */
	public void setMusicGroups(MusicGroups group) {
		listMusicGroups.add(group);
		LOGGER.debug(listMusicGroups);
	}

	/**
	 * Getting an object from the listMusicGroups
	 */
	public List<MusicGroups> getListMusicGroups() {
		return listMusicGroups;
	}

	/**
	 * The object is deleted if the input parameter of the method matches the given
	 * parameter
	 * 
	 * @param groupName - the input parameter of the method
	 */
	public void removeGroup(String mgrouprName) {
		for (MusicGroups group : listMusicGroups) {
			if (group.groupName.equals(mgrouprName))
				listMusicGroups.remove(group);
			LOGGER.debug(listMusicGroups);
			break;
		}
	}
}
