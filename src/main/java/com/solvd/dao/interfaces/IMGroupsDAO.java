package com.solvd.dao.interfaces;

import com.solvd.model.MusicGroups;

public interface IMGroupsDAO {

    MusicGroups getMusicGroupsByName(String music_group_name);
	
	void insertMusicGroups(MusicGroups entity);
	
	void deleteMusicGroups(MusicGroups entity);
	
	void updateMusicGroups(MusicGroups entity);
}


