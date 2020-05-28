package com.solvd.database;
import java.sql.*;
import java.util.logging.*;

import org.apache.log4j.Logger;

import com.solvd.utils.WriteReadProp;

public class Connector {


        Connection connection = null;
        PreparedStatement preparedStatement = null;

    	private final static Logger LOGGER = Logger.getLogger(Connector.class);

        static String path = "E:\\IRA\\Maven_project\\src\\main\\java\\com\\solvd\\database\\\\Postgres.properties";
    	static String url = WriteReadProp.getProps(path, "url");
    	static String name = WriteReadProp.getProps(path, "name");
    	static String password = WriteReadProp.getProps(path, "password");

    	public Connection getMyConnection() {
            try {
				Class.forName("org.postgresql.Driver");
			
            LOGGER.debug("Driver is connected");

    		connection = DriverManager.getConnection(url, name, password);
    		LOGGER.debug("Connection established");
             } catch (ClassNotFoundException | SQLException e) {
				
				LOGGER.debug(e);;
			}
    		return connection;

    		}
    	
    	}

        
           