package com.solvd.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.music.types.groups.MusicGroup;
import com.solvd.utils.WriteReadProp;

import org.apache.log4j.Logger;


public class JsonConvert {
	
	private final static Logger LOGGER = Logger.getLogger(JsonConvert.class);
	

	/**
	 * Converting Java object of a class to JSON string
	 * 
	 * @return jsonString - JSON string, the output parameter of the method
	 */
	public String convertJavaToJsonStr(Object object) {

		String jsonString = "";

		try {
			jsonString = new ObjectMapper().writeValueAsString(object);
			LOGGER.info("Converted to string");

		} catch (JsonProcessingException ex) {
			LOGGER.info(ex);
		}

		return jsonString;
	}

	/**
	 * Converting Java object of a class to JSON file and write it down to file
	 */
	public void convertJavaToJsonFile(Object object, String pathJSON) {

		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(Paths.get(pathJSON).toFile(), object);
			LOGGER.info("Writed to file");

		} catch (JsonProcessingException ex) {
			LOGGER.info(ex);
		} catch (IOException ex) {
			LOGGER.info(ex);
		}
	}
	
	/**
	 * Converting JSON string to MusicGroups' object
	 * 
	 * @return mgroup - MusicGroups' object, the output parameter of the method
	 */
	public MusicGroup convertJsonStringToPOJO(String jsonString) {

		MusicGroup mgroup = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			mgroup  = mapper.readValue(jsonString, MusicGroup.class);
			LOGGER.info("Converted to POJO");

		} catch (JsonProcessingException ex) {
			LOGGER.info(ex);
		}

		return mgroup;
	}
	

}