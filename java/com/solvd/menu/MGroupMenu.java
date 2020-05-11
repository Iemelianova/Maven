package com.solvd.menu;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.solvd.exceptions.EmptyExc;
import com.solvd.exceptions.FutureCenturyExc;
import com.solvd.exceptions.PastCenturyExc;
import com.solvd.lists.MGroupList;
import com.solvd.music.types.groups.MusicGroups;

public class MGroupMenu {

	public MGroupMenu() {
	}

	static MGroupList mlist = new MGroupList();
	private final static Logger LOGGER = Logger.getLogger(MGroupMenu.class);


	static Scanner scanm = new Scanner(System.in);
	static Scanner scanm1 = new Scanner(System.in);

	public static void openMGroupMenu() throws PastCenturyExc, FutureCenturyExc, EmptyExc {

		LOGGER.info("Let's try to add new music group. \n" + "Please, enter century (use numbers, please): \n");
		int group1century = scanm.nextInt();

		if (group1century < 14) {
			throw new PastCenturyExc(PastCenturyExc.printPastMessage());
		}

		if (group1century > 21) {
			throw new FutureCenturyExc(FutureCenturyExc.printFutMessage());
		}

		LOGGER.info("Please, enter music era: \n");
		String group1era = scanm1.nextLine();

		LOGGER.info("Please, enter music genre: \n");
		String group1genre = scanm1.nextLine();

		LOGGER.info("Please, enter name of music group. \n");
		String group1name = scanm1.nextLine();

		if (group1name.isEmpty()) {
			throw new EmptyExc(EmptyExc.printEmpMessage());
		}

		MusicGroups group = new MusicGroups(group1century, group1era, group1genre, group1name);

		mlist.setMusicGroups(group);
		LOGGER.info("You added next information: ");

		for (MusicGroups groups : mlist.getListMusicGroups()) {
			group.printInfo();
		}
	}

	public static void removeFromMGroupMenu() {
		System.out.println("Please, enter music group name: \n");
		String mgroupName = scanm.nextLine();
		mlist.removeGroup(mgroupName);
		LOGGER.info("Music group " + mgroupName + " was successfully removed.");
	}
}
