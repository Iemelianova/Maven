package com.solvd.database;

import com.solvd.database.Connector;

import java.sql.*;
import java.util.logging.*;

import org.apache.log4j.Logger;

/**
 * Used for simple cases without parameters
 */
public class Statment { 
	private final static Logger LOGGER = Logger.getLogger(Statment.class);
	Connection connection = null;
	Statement statement = null;
    statement = connection.createStatement();
    
    public void showInfoStatment() {
    ResultSet result1 = statement.executeQuery(
            "SELECT * FROM performers ");
    
    while (result1.next()) {
        LOGGER.info("Data sampling number#" + result1.getRow()
                + "\t Data base number #" + result1.getInt("id_performer")
                + "\t" + result1.getString("performer_name"));
    }
    }
       
    public void insertInfoStatment() {
    statement.executeUpdate(
            "INSERT INTO performers(century, music_era, genre, performer_name) "
            + "VALUES (20, '80s', 'pop', 'Michael Jackson')");
    }
    }
	
    
    

   