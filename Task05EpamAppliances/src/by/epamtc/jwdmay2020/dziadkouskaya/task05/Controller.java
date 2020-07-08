package by.epamtc.jwdmay2020.dziadkouskaya.task05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Applience;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Laptop;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Oven;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Refrigerator;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Speakers;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.TabletPC;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.VacuumCleaner;

public class Controller {
	public static void main(String[] args) {

		String fileName = "d:\\Java\\epam\\tasks\\appliances_db.txt";

		ArrayList<String> stringListFromFile = stringArrayListFromFile(fileName);

		String usersProduct = "Laptop".toLowerCase();

		String productFeature = "OS".toLowerCase();

		String featureValue = "Windows".toLowerCase();

		List<Applience> applienceList = findRequiredAppliences(usersProduct, productFeature, featureValue,
				stringListFromFile);

		if (applienceList.size() == 0) {

			System.out.println("No results!!!");

		} else {

			for (Applience applience : applienceList) {
				System.out.println(applience);
			}

		}

	}

	public static ArrayList<String> stringArrayListFromFile(String fileName) {

		ArrayList<String> resultList = new ArrayList<>();

		BufferedReader fileReader = null;

		try {
			fileReader = new BufferedReader(new FileReader(fileName));

			while (fileReader.ready()) {
				String point = fileReader.readLine();
				resultList.add(point);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resultList;
	}

	public static List<Applience> findRequiredAppliences(String usersProduct, String productFeature,
			String featureValue, ArrayList<String> stringListFromFile) {

		ArrayList<String[]> stringArraysList = findArraysWithRequiredProduct(usersProduct, productFeature, featureValue,
				stringListFromFile);

		List<Applience> applianceList = createListOfRequiredApplience(stringArraysList);

		return applianceList;

	}

	public static ArrayList<String[]> findArraysWithRequiredProduct(String usersProduct, String productFeature,
			String featureValue, ArrayList<String> stringListFromFile) {

		ArrayList<String[]> resultList = new ArrayList();

		for (String string : stringListFromFile) {

			String[] stringWords = splitStringToArray(string);

			if (stringWords[0].equals(usersProduct)) {

				for (int i = 1; i < stringWords.length; i++) {

					if (stringWords[i].equals(productFeature)) {

						if (stringWords[i + 1].equals(featureValue)) {

							resultList.add(stringWords);

						}
					}
				}

			}

		}

		return resultList;
	}

	public static String[] splitStringToArray(String string) {

		String regExForSplit = "[:=\\,;]";

		String[] stringToArray = string.split(regExForSplit);

		for (int i = 0; i < stringToArray.length; i++) {

			stringToArray[i] = stringToArray[i].toLowerCase().trim();

		}

		return stringToArray;

	}

	public static List<Applience> createListOfRequiredApplience(List<String[]> stringProductList) {
		Applience applience = null;

		List<Applience> applienceList = new ArrayList();

		for (String[] oneItem : stringProductList) {
			switch (stringProductList.get(0)[0]) {
			case ("oven"):
				applience = new Oven().createNewObject(oneItem);
				break;
			case ("laptop"):
				applience = new Laptop().createNewObject(oneItem);
				break;
			case ("refrigerator"):
				applience = new Refrigerator().createNewObject(oneItem);
				break;
			case ("speakers"):
				applience = new Speakers().createNewObject(oneItem);
				break;
			case ("tabletpc"):
				applience = new TabletPC().createNewObject(oneItem);
				break;
			case ("vacuumcleaner"):
				applience = new VacuumCleaner().createNewObject(oneItem);
				break;
			}

			applienceList.add(applience);

		}

		return applienceList;
	}

}
