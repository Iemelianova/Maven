package com.solvd.lists;


import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

import com.solvd.music.types.groups.Performer;

public class PerformerSet {
	Set<Performer> setOfPerformer;
	
	private final static Logger LOGGER = Logger.getLogger(PerformerSet.class);

	
	public PerformerSet() {
		setOfPerformer = new HashSet<Performer>();
	}

	/**
	 * Adding an object to the setOfPerformer
	 */
	public void setPerformer(Performer performer) {
		setOfPerformer.add(performer);
		LOGGER.debug(setOfPerformer);
	}

	/**
	 * Getting an object from the setOfPerformer
	 */
	public Set<Performer> getSetOfPerformer() {
		return setOfPerformer;
	}

	/**
	 * The object is deleted if the input parameter of the method matches the given
	 * parameter
	 * 
	 * @param performerName - the input parameter of the method
	 */
	public void removePerformer(String mperformerName) {
		for (Performer performer : setOfPerformer) {
			if (performer.getPerformerName().equals(mperformerName))
				setOfPerformer.remove(performer);
			LOGGER.debug(setOfPerformer);

			break;
		}
	}
}

