package org.evoke.utils;

import java.io.File;
import java.nio.file.Paths;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CSVFileRead {

	public String fileName;
	private static final Logger log=LogManager.getLogger(CSVFileRead.class.getName());
	public void readCSVToMap() {
		try {
				String filePath=System.getProperty("user.dir")+File.separator;
				
				log.info("Reading the csv file [" +fileName+ "]");
				//File file=new File(Fi)
				
		} catch (Exception e) {
			
		}
	}
}
