package com.solvd.menu;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.solvd.exceptions.EmptyExc;
import com.solvd.exceptions.FutureCenturyExc;
import com.solvd.exceptions.PastCenturyExc;
import com.solvd.lists.ChoirMap;
import com.solvd.music.types.vocals.Choir;

public class ChoirMenu {

	public ChoirMenu() {
	}

	static ChoirMap clist = new ChoirMap();
	private final static Logger LOGGER = Logger.getLogger(ChoirMenu.class);


	static Scanner scanc = new Scanner(System.in);
	static Scanner scanc1 = new Scanner(System.in);

	public static void openChoirMenu() throws PastCenturyExc, FutureCenturyExc, EmptyExc {

		LOGGER.info("Let's try to add new ensemble. \n" + "Please, enter century (use numbers, please): \n");
		int choir1century = scanc.nextInt();

		if (choir1century < 14) {
			throw new PastCenturyExc(PastCenturyExc.printPastMessage());
		}

		if (choir1century > 21) {
			throw new FutureCenturyExc(FutureCenturyExc.printFutMessage());
		}

		LOGGER.info("Please, enter music era: \n");
		String choir1era = scanc1.nextLine();

		LOGGER.info("Please, enter music genre: \n");
		String choir1genre = scanc1.nextLine();

		LOGGER.info("Please, enter quantity of singers: \n");
		int choir1singers = scanc1.nextInt();

		LOGGER.info("Please, enter name of choir. \n");
		String choir1name = scanc1.nextLine();

		if (choir1name.isEmpty()) {
			throw new EmptyExc(EmptyExc.printEmpMessage());
		}

		Choir choir = new Choir(choir1century, choir1era, choir1genre, choir1singers, choir1name);

		clist.setChoir(choir);

		Choir choirFromList = clist.getChoir(choir.getChoirName());
		LOGGER.info("You added next information: ");
		LOGGER.info("Century: " + choirFromList.getCentury());
		LOGGER.info("Music era: " + choirFromList.getEra());
		LOGGER.info("Music genre: " + choirFromList.getGenre());
		LOGGER.info("Singers: " + choirFromList.getSingers());
		LOGGER.info("Choir's name: " + choirFromList.getChoirName());

	}

	public static void removeFromChoirMenu() {
		LOGGER.info("Please, enter music ensemble name: \n");
		String ensembleName = scanc.nextLine();
		clist.removeEnsemble(ensembleName);
		LOGGER.info("Music ensemble " + ensembleName + " was successfully removed.");
	}

}
