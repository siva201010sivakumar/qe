package org.evoke.utils;

import java.io.File;

public class FilePaths {
	private static String _userDirPath=System.getProperty("user.dir");
	private static String _srcPath=_userDirPath+File.separator+"src";
	private static String _srcTestPath=_srcPath+File.separator+"test";
	private static String _srcTestResourcesPath=_srcTestPath+File.separator+"resources";
	public static String getTestResourcesPath()
	{
		return _srcTestResourcesPath;
	}

}
