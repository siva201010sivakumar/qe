package org.evoke.utils;

import java.io.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CSVFileRead {

	public String fileName;
	private static final Logger log = LogManager.getLogger(CSVFileRead.class.getName());
	public void readCSVToMap(String fileName) {
		try {
				this.fileName=fileName;
				String filePath=FilePaths.getLocatorsPath()+File.separator+fileName;
				if(!filePath.endsWith(".csv"))
					filePath=filePath+".csv";
			log.info("Reading the csv file [" +fileName+  " ] from the path [" +filePath+ "]");
				
				File file=new File(filePath);
				if(file.exists()) {
					
				}
				else
					throw new RuntimeException("File [" +filePath+ "] is NOT avilable to read.");
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}	
}
