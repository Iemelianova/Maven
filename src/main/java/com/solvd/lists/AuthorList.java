package com.solvd.lists;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.solvd.Executor;
import com.solvd.music.rhythm.Author;


public class AuthorList {
	List<Author> listAuthor;

	private final static Logger LOGGER = Logger.getLogger(AuthorList.class);

	public AuthorList() {
		listAuthor = new ArrayList<Author>();
	}

	/**
	 * Adding an object to the listAuthor
	 */
	public void setAuthor(Author author) {
		listAuthor.add(author);
		LOGGER.info(listAuthor);
	}

	/**
	 * Getting an object from the listAuthor
	 */
	public List<Author> getListAuthor() {
		
		return listAuthor;
		
	}

	/**
	 * The object is deleted if the input parameter of the method matches the given
	 * parameter
	 * 
	 * @param authorName - the input parameter of the method
	 */
	public void removeAuthor(String authorName) {
		for (Author author : listAuthor) {
			if (author.getComposer().equals(authorName))
				listAuthor.remove(author);
			LOGGER.info(listAuthor);
			break;
		}
	}
	
	
}

