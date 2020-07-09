package by.epamtc.jwdmay2020.dziadkouskaya.task05.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.catalog.Catallogue;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.request.UserRequest;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.source.InfoSourse;

public class CatalogCreation {
	
	public static Catallogue createCatalog(InfoSourse sourse, UserRequest request) {
		
		List<String[]> listOfRequiredProduct = findArraysWithRequiredProduct(sourse, request);

		List<String[]> resultList = findVariantSuitableForAllFeatures(request.getFeaturesAndValuesHashMap(),
				listOfRequiredProduct);

		Catallogue catallogue = new Catallogue(resultList);

		return catallogue;
	}

	//создание  ArrayList<String[]>, содержащий все товары, соответсвующие любому из запросов
	public static List<String[]> findArraysWithRequiredProduct(InfoSourse sourse, UserRequest request) {
		List<String[]> resultList = new ArrayList();

		for (String string : sourse.getInfoContaiter()) {

			String[] stringWords = ArrayCreation.splitStringToArray(string);

			
			if (stringWords[0].equals(request.getUsersProduct())) {
				
				for (Entry<String, String> entry : request.getFeaturesAndValuesHashMap().entrySet()) {

					for (int i = 1; i < stringWords.length; i++) {

						if (stringWords[i].equals(entry.getKey())) {

							if (stringWords[i + 1].equals(entry.getValue())) {

								resultList.add(stringWords);
							}
						}
					}
				}

			}

		}


		return resultList;
	}

	
	//создание  List<String[]>, содержащий товары, соответсвующие всем параметрам одновременно
	public static List<String[]> findVariantSuitableForAllFeatures(HashMap<String, String> featuresHashMap,
			List<String[]> list) {
		
		List<String[]> resultList = new ArrayList<>();

		int expectedCounterValue = featuresHashMap.size();

		int counter = 1;

		for (int i = 0; i < list.size(); i++) {

			String[] littleArray = list.get(i);

			for (int j = i + 1; j < list.size(); j++) {

				String[] littleArray2 = list.get(j);

				if (Arrays.equals(littleArray, littleArray2)) {
					counter += 1;
				}
			}

			if (counter == expectedCounterValue) {
				resultList.add(littleArray);
			}
			counter = 1;
		}

		return resultList;
	}

}
