package com.solvd.menu;

import java.util.*;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.solvd.exceptions.EmptyExc;
import com.solvd.exceptions.FutureCenturyExc;
import com.solvd.exceptions.PastCenturyExc;
import com.solvd.model.Composers;
import com.solvd.dao.ComposersDAO;
import com.solvd.dao.interfaces.IComposersDAO;
import com.solvd.lists.AuthorList;
import com.solvd.music.rhythm.Author;
import com.solvd.utils.WriteReadFile;

public class AuthorMenu {

	private final static Logger LOGGER = Logger.getLogger(AuthorMenu.class);


	public AuthorMenu() {
	}


	static Scanner scana = new Scanner(System.in);
	static Scanner scana1 = new Scanner(System.in);

	public static void openAuthorMenu() throws PastCenturyExc, FutureCenturyExc, EmptyExc {

		System.out.println("Let's try to add new composer. \n" + "Please, enter century (use numbers, please): \n");
		Integer author1century = scana.nextInt();

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

		Composers composer = new Composers(author1century, author1era, author1kind, author1composer);
		 IComposersDAO composersDAO = new ComposersDAO();
		 List<Composers> composers = composersDAO.getComposers();
		 composersDAO.insertComposers(composer);
		 

		System.out.println("You added next information: ");
		composersDAO.getComposersByName(author1composer);
    	composer.toString();
		}

		

	public static void removeFromAuthorMenu() {
		System.out.println("Please, enter composer name: \n");
		String authorName = scana.nextLine();
		IComposersDAO composersDAO = new ComposersDAO();
	
		composersDAO.deleteComposers(authorName);
		System.out.println("Composer " + authorName + " was successfully removed.");
	}
}
	