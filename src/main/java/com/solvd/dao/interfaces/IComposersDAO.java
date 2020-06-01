package com.solvd.dao.interfaces;

import java.util.List;

import com.solvd.model.Composers;

public interface IComposersDAO {
	
	Composers getComposersByName(String composer_name);
	
    List<Composers> getComposers();
	
	void insertComposers(Composers entity);
	
	void deleteComposers(Composers entity);
	
	void updateComposers(Composers entity);

	void deleteComposers(String authorName);
}


