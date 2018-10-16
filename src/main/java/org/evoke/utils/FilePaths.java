package org.evoke.utils;

import java.io.File;

public class FilePaths {
	private static final String _userDirPath = System.getProperty("user.dir");
	private static final String _srcPath = _userDirPath + File.separator + "src";
	private static final String _srcTestPath = _srcPath + File.separator + "test";
	private static final String _srcMainPath = _srcPath + File.separator + "main";
	private static final String _srcTestResourcesPath = _srcTestPath + File.separator + "resources";
	private static final String _srcMainResourcesPath = _srcMainPath + File.separator + "resources";
	private static final String _srcLocatorsPath = _srcTestResourcesPath + File.separator + "Locators";

	public static final String getTestResourcesPath() {
		return _srcTestResourcesPath;
	}

	public static final String getMainResourcesPath() {
		return _srcMainResourcesPath;
	}

	public static final String getLocatorsPath() {
		return _srcLocatorsPath;
	}

}
