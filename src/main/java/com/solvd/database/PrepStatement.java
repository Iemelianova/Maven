package com.solvd.database;

import java.sql.*;

import java.util.logging.*;

import org.apache.log4j.Logger;

/**
 * Precompiles queries which may contain input parameters
 */

public class PrepStatement {
	
	private final static Logger LOGGER = Logger.getLogger(PrepStatement.class);

	Connection connection = null;
    PreparedStatement preparedStatement = null;
    
    	
    public void showInfoPrepared() {
    try {
		preparedStatement = connection.prepareStatement(
		        "SELECT * FROM users where performer_name = ?");
	} catch (SQLException e1) {
		
		 LOGGER.info(e1.getMessage());
	}
   
    ResultSet result2 = null;
	try {
		result2 = preparedStatement.executeQuery();
	} catch (SQLException e1) {
		LOGGER.info(e1.getMessage());	}
 
    try {
		while (result2.next()) {
		    LOGGER.info(result2.getString("performer_name"));
		}
	} catch (SQLException e) {
		LOGGER.info(e.getMessage());	}
    
    	}
    	
    public void insertInfoPrepared() {
    try {
		preparedStatement = connection.prepareStatement(
		        "INSERT INTO performers VALUES(?)");
	} catch (SQLException e1) {
		LOGGER.info(e1.getMessage());	}
		
	}
}
    
    
    

   