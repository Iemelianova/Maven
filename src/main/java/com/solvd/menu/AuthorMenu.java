package com.solvd.menu;

import java.util.*;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.solvd.exceptions.EmptyExc;
import com.solvd.exceptions.FutureCenturyExc;
import com.solvd.exceptions.PastCenturyExc;
import com.solvd.lists.AuthorList;
import com.solvd.music.rhythm.Author;
import com.solvd.utils.WriteReadFile;

public class AuthorMenu {

	private final static Logger LOGGER = Logger.getLogger(AuthorMenu.class);

	static String path = "E:\\IRA\\solvd\\HW\\\\HWData";

	public AuthorMenu() {
	}

  	static AuthorList alist = new AuthorList();

	static Scanner scana = new Scanner(System.in);
	static Scanner scana1 = new Scanner(System.in);

	public static void openAuthorMenu() throws PastCenturyExc, FutureCenturyExc, EmptyExc {

		System.out.println("Let's try to add new composer. \n" + "Please, enter century (use numbers, please): \n");
		int author1century = scana.nextInt();

		if (author1century < 14) {
			throw new PastCenturyExc(PastCenturyExc.printPastMessage());
		}

		if (author1century > 21) {
			throw new FutureCenturyExc(FutureCenturyExc.printFutMessage());
		}

		System.out.println("Please, enter music era: \n");
		String author1era = scana1.nextLine();

		System.out.println("Please, enter music kind(major, minor): \n");
		String author1kind = scana1.nextLine();

		System.out.println("Please, enter composer name. \n");
		String author1composer = scana1.nextLine();

		if (author1composer.isEmpty()) {
			throw new EmptyExc(EmptyExc.printEmpMessage());
		}

		Author author = new Author(author1century, author1era, author1kind, author1composer);

		alist.setAuthor(author);
		System.out.println("You added next information: ");
		for (Author authors : alist.getListAuthor()) {
			author.printInfo();
		}

	}

	public static void removeFromAuthorMenu() {
		System.out.println("Please, enter composer name: \n");
		String authorName = scana.nextLine();
		alist.removeAuthor(authorName);
		System.out.println("Composer " + authorName + " was successfully removed.");
	}

	public static void openAuthorMenuF() throws PastCenturyExc, FutureCenturyExc, EmptyExc {

		WriteReadFile note = new WriteReadFile();
		System.out.println("Let's try to add new composer. \n" + "Please, enter century (use numbers, please): \n");
		int author1century = scana.nextInt();

		if (author1century < 14) {
			throw new PastCenturyExc(PastCenturyExc.printPastMessage());
		}

		if (author1century > 21) {
			throw new FutureCenturyExc(FutureCenturyExc.printFutMessage());
		}
		String author1centuryy = String.valueOf(author1century);

		System.out.println("Please, enter music era: \n");
		String author1era = scana1.nextLine();

		System.out.println("Please, enter music kind(major, minor): \n");
		String author1kind = scana1.nextLine();

		System.out.println("Please, enter composer name. \n");
		String author1composer = scana1.nextLine();

		if (author1composer.isEmpty()) {
			throw new EmptyExc(EmptyExc.printEmpMessage());
		}

		Author author = new Author(author1century, author1era, author1kind, author1composer);

		
		alist.setAuthor(author);
		
		note.writeToFile(path, alist.getListAuthor());
		System.out.println("You added next information: ");
		note.readFromFile(path);

	}
}
