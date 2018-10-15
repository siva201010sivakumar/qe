package org.evoke.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CSVFileRead {

	public String fileName;
	private static final Logger log=LogManager.getLogger(CSVFileRead.class.getName());
	public void readCSVToMap() {
		try {
				log.info("Reading the csv file [" +fileName+ "]");
				
		} catch (Exception e) {
		
		}
	}
}
