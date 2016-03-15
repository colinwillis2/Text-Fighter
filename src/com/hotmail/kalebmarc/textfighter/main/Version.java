package com.hotmail.kalebmarc.textfighter.main;

class Version {
	private Version(){}
	
	private static final String VERSION = "4.7DEV";
	
	private static final String STAGE = "Alpha";
	
	private static final String DESC = ""
			+ "Text-Fighter is a Text-Based\n"
			+ "Fighter RPG game, completely\n"
			+ "written in Java. Text-Fighter\n"
			+ "is made by Kaleb Haslam\n\n"
			+ "Text-Fighter is currently in Alpha stage\n"
			+ "which means it's still in early development,\n"
			+ "and will contain lots of bugs and missing features.";
	
	private static final String CHANGE_LOG = ""
			+ "(Not compatible with previous saves)\n\n"
			
			+ "New Stuff:\n"
			+ "-\n"
			+ "-\n"
			+ "-\n"
			+ "-\n"
			+ "-\n\n"

			+ "Bug Fixes:\n"
			+ "-\n"
			+ " ";
	
	public static String get(){
		return VERSION;
	}
	public static String getStage(){
		return STAGE;
	}
	public static String getFull(){
		return STAGE + " " + VERSION;
	}
	public static String getDesc(){
		return DESC;
	}
	public static String getChange(){
		return CHANGE_LOG;
	}
}