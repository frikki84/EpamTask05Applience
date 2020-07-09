package by.epamtc.jwdmay2020.dziadkouskaya.task05.logic;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.request.UserRequest;abstract

//модификация запроса из стоки (массива строк) в объект класса UserRequest
public class RequestCreation {
	

	public static UserRequest createRequesFromList(List<String> requestList) {
		requestList = prepareStringList(requestList);
		
		String productName = requestList.get(0);
		
		HashMap<String, String> requstHashMap = createHashMapOfFeaturesAndValuesFromList(requestList);
		
		UserRequest request = new UserRequest(productName, requstHashMap);
			
		
		return request;
	}
	
	public static List<String> prepareStringList(List<String> requestList) {
		List<String> resultList = new ArrayList<>();
		
		for (String point : requestList) {
			String result = StringCorrection.modifyStringToCommonView(point);
			
			resultList.add(result);
		}
		
		return resultList;
	}
	
	public static HashMap<String, String> createHashMapOfFeaturesAndValuesFromList(List<String> requestList) {
		HashMap<String, String> resultHashMap = new HashMap<>();
		
		for (int i = 1; i < requestList.size() - 1; i += 2) {
			resultHashMap.put(requestList.get(i), requestList.get(i + 1));
		}
		
		
		return resultHashMap;
		
		
	}

}
