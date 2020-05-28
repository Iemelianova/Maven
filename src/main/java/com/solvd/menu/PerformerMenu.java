package com.solvd.menu;

import java.util.Scanner;

import org.apache.log4j.Logger;
import com.solvd.database.*;
import java.sql.*;

import com.solvd.exceptions.EmptyExc;
import com.solvd.exceptions.FutureCenturyExc;
import com.solvd.exceptions.PastCenturyExc;
import com.solvd.lists.PerformerSet;
import com.solvd.music.types.groups.Performer;

public class PerformerMenu {

	public PerformerMenu() {
	}
	
    static Connector connector = new Connector();
	static PerformerSet plist = new PerformerSet();
    static PreparedStatement preparedStatement = null;
    static PrepStatement prepst = new PrepStatement();
	private final static Logger LOGGER = Logger.getLogger(PerformerMenu.class);
	
	static Scanner scanp = new Scanner(System.in);
	static Scanner scanp1 = new Scanner(System.in);

	public static void openPerformerMenu() throws PastCenturyExc, FutureCenturyExc, EmptyExc {
     connector.getMyConnection();
		System.out.println("Let's try to add new performer. \n" + "Please, enter century (use numbers, please): \n");
		int performer1century = scanp.nextInt();

		if (performer1century < 14) {
			throw new PastCenturyExc(PastCenturyExc.printPastMessage());
		}

		if (performer1century > 21) {
			throw new FutureCenturyExc(FutureCenturyExc.printFutMessage());
		}

		System.out.println("Please, enter music era: \n");
		String performer1era = scanp1.nextLine();

		System.out.println("Please, enter music genre: \n");
		String performer1genre = scanp1.nextLine();

		System.out.println("Please, enter name of performer. \n");
		String performer1name = scanp1.nextLine();

		if (performer1name.isEmpty()) {
			throw new EmptyExc(EmptyExc.printEmpMessage());
		}

		Performer performer = new Performer(performer1century, performer1era, performer1genre, performer1name);

		
		prepst.insertInfoPrepared();
		try {
			preparedStatement.setInt(2, performer1century);
			preparedStatement.setString(3, performer1era);
			preparedStatement.setString(4, performer1genre);
			preparedStatement.setString(5, performer1name);
		} catch (SQLException e) {
			LOGGER.debug(e);
		}
		


		plist.setPerformer(performer);
		System.out.println("You added next information: ");
		prepst.showInfoPrepared();
		try {
			preparedStatement.setString(5, performer1name);
		} catch (SQLException e) {
			LOGGER.debug(e);
		}

		for (Performer pefrormer : plist.getSetOfPerformer()) {
			performer.printInfo();
		}
	}

	public static void removeFromPerformerMenu() {
		System.out.println("Please, enter music performer name: \n");
		String mperformerName = scanp.nextLine();
		plist.removePerformer(mperformerName);
		System.out.println("Music performer " + mperformerName + " was successfully removed.");
	}

}
