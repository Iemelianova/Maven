package com.solvd.menu;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.solvd.exceptions.EmptyExc;
import com.solvd.exceptions.FutureCenturyExc;
import com.solvd.exceptions.PastCenturyExc;
import com.solvd.lists.MGroupList;
import com.solvd.music.types.groups.MusicGroups;
import com.solvd.utils.JsonConvert;
import com.solvd.utils.WriteReadProp;

public class MGroupMenu {

	public MGroupMenu() {
	}

	static MGroupList mlist = new MGroupList();
	static String pathJSON = WriteReadProp.getProps(WriteReadProp.pathprop, "path to JSON");
	private final static Logger LOGGER = Logger.getLogger(MGroupMenu.class);


	static Scanner scanm = new Scanner(System.in);
	static Scanner scanm1 = new Scanner(System.in);

	public static void openMGroupMenu() throws PastCenturyExc, FutureCenturyExc, EmptyExc {

		System.out.println("Let's try to add new music group. \n" + "Please, enter century (use numbers, please): \n");
		int group1century = scanm.nextInt();

		if (group1century < 14) {
			throw new PastCenturyExc(PastCenturyExc.printPastMessage());
		}

		if (group1century > 21) {
			throw new FutureCenturyExc(FutureCenturyExc.printFutMessage());
		}

		System.out.println("Please, enter music era: \n");
		String group1era = scanm1.nextLine();

		System.out.println("Please, enter music genre: \n");
		String group1genre = scanm1.nextLine();

		System.out.println("Please, enter name of music group. \n");
		String group1name = scanm1.nextLine();

		if (group1name.isEmpty()) {
			throw new EmptyExc(EmptyExc.printEmpMessage());
		}

		MusicGroups mgroup = new MusicGroups(group1century, group1era, group1genre, group1name);

		mlist.setMusicGroups(mgroup);
		System.out.println("You added next information: ");

		for (MusicGroups groups : mlist.getListMusicGroups()) {
			mgroup.printInfo();
		}
	}

	public static void removeFromMGroupMenu() {
		System.out.println("Please, enter music group name: \n");
		String mgroupName = scanm.nextLine();
		mlist.removeGroup(mgroupName);
		System.out.println("Music group " + mgroupName + " was successfully removed.");
	}
	
	public static void openMGroupMenuJSON() throws PastCenturyExc, FutureCenturyExc, EmptyExc {

		System.out.println("Let's try to add new music group. \n" + "Please, enter century (use numbers, please): \n");
		int group1century = scanm.nextInt();

		if (group1century < 14) {
			throw new PastCenturyExc(PastCenturyExc.printPastMessage());
		}

		if (group1century > 21) {
			throw new FutureCenturyExc(FutureCenturyExc.printFutMessage());
		}

		System.out.println("Please, enter music era: \n");
		String group1era = scanm1.nextLine();

		System.out.println("Please, enter music genre: \n");
		String group1genre = scanm1.nextLine();

		System.out.println("Please, enter name of music group. \n");
		String group1name = scanm1.nextLine();

		if (group1name.isEmpty()) {
			throw new EmptyExc(EmptyExc.printEmpMessage());
		}

		MusicGroups mgroup = new MusicGroups(group1century, group1era, group1genre, group1name);
        JsonConvert jsonc = new JsonConvert();
        
        System.out.println("Enter new file name: ");
        String filename = scanm1.nextLine();
        
		mlist.setMusicGroups(mgroup);
		System.out.println("You added next information: ");
		String jsonSrtring = jsonc.convertJavaToJsonStr(mgroup);
		LOGGER.info(jsonSrtring);
		jsonc.convertJavaToJsonFile(mgroup, filename +".json");
//        String jsonStr = "{\"century\":20,\"era\":\"80s\",\"genre\":\"disco\",\"groupName\":\"ABBA\"}";
//		
//		MusicGroups mus = jsonc.convertJsonStringToPOJO(jsonStr);
//		
//		LOGGER.info("Century from POJO: " + mus.getCentury());
//		LOGGER.info("Era from POJO: " + mus.getEra());
//		LOGGER.info("Genre from POJO: " + mus.getGenre());
//		LOGGER.info("Name from POJO: " + mus.getGroupName());
		

	}
}

