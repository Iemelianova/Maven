package com.solvd.lists;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

import com.solvd.music.types.groups.MusicGroup;

public class MGroupList {
	List<MusicGroup> listMusicGroups;
	
	private final static Logger LOGGER = Logger.getLogger(MGroupList.class);

	
	public MGroupList() {
		listMusicGroups = new LinkedList<MusicGroup>();
	}
	
	/**
	 * Adding an object to the listMusicGroups
	 */
	public void setMusicGroups(MusicGroup group) {
		listMusicGroups.add(group);
		LOGGER.info(listMusicGroups);
	}

	/**
	 * Getting an object from the listMusicGroups
	 */
	public List<MusicGroup> getListMusicGroups() {
		return listMusicGroups;
	}

	/**
	 * The object is deleted if the input parameter of the method matches the given
	 * parameter
	 * 
	 * @param groupName - the input parameter of the method
	 */
	public void removeGroup(String mgrouprName) {
		for (MusicGroup group : listMusicGroups) {
			if (group.getGroupName().equals(mgrouprName))
				listMusicGroups.remove(group);
			LOGGER.info(listMusicGroups);
			break;
		}
	}
}
