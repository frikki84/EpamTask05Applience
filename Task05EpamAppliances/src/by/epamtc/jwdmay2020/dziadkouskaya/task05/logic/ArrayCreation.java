package by.epamtc.jwdmay2020.dziadkouskaya.task05.logic;

public class ArrayCreation {
	
	public static String[] splitStringToArray(String string) {

		String regExForSplit = "[:=\\,;]";

		String[] stringToArray = string.split(regExForSplit);

		for (int i = 0; i < stringToArray.length; i++) {

			stringToArray[i] = StringCorrection.modifyStringToCommonViewWithoutSpaces(stringToArray[i]);

		}

		return stringToArray;

	}

}
