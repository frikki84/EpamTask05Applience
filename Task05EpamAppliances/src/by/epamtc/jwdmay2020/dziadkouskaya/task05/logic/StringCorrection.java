package by.epamtc.jwdmay2020.dziadkouskaya.task05.logic;


public class StringCorrection {
	
	public static String modifyStringToCommonView (String string) {
		
		String regExForSplit = "[:=\\,; _]";
		
		string = string.replaceAll(regExForSplit, " ").toLowerCase();
	
		return string;
	}

}
