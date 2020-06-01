package com.solvd.dao.interfaces;

import com.solvd.model.Performers;

public interface IPerformersDAO {
	
	
	Performers getPerformersByName(String performer_name);
	
	void insertPerformers(Performers entity);
	
	void deletePerformers(Performers entity);
	
	void updatePerformers(Performers entity);
}
