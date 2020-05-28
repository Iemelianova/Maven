package com.solvd;

import java.sql.Statement;

import org.apache.log4j.Logger;
import com.solvd.database.*;
import java.sql.*;
import java.util.logging.*;

import com.solvd.exceptions.EmptyExc;
import com.solvd.exceptions.FutureCenturyExc;
import com.solvd.exceptions.PastCenturyExc;
import com.solvd.menu.Menu;

public class Executor {

	private final static Logger LOGGER = Logger.getLogger(Executor.class);
	
			public static void main(String[] args) throws PastCenturyExc, FutureCenturyExc, EmptyExc {
				Menu menu = new Menu();
				menu.openMenu();
				;
			}
		}

		
	