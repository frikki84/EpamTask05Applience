package by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.request;

import java.util.HashMap;


//сущность для описания запроса пользователя: название товара и все характеристики
public class UserRequest {
	
	private String usersProduct;

	private HashMap<String, String> featuresAndValuesHashMap;
	

	public UserRequest() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserRequest(String usersProduct, HashMap<String, String> featuresAndValuesHashMap) {
		super();
		this.usersProduct = usersProduct;
		this.featuresAndValuesHashMap = featuresAndValuesHashMap;
	}


	public String getUsersProduct() {
		return usersProduct;
	}


	public void setUsersProduct(String usersProduct) {
		this.usersProduct = usersProduct;
	}


	public HashMap<String, String> getFeaturesAndValuesHashMap() {
		return featuresAndValuesHashMap;
	}


	public void setFeaturesAndValuesHashMap(HashMap<String, String> featuresAndValuesHashMap) {
		this.featuresAndValuesHashMap = featuresAndValuesHashMap;
	}


	@Override
	public String toString() {
		return "UserRequest [usersProduct=" + usersProduct + ", featuresAndValuesHashMap=" + featuresAndValuesHashMap
				+ "]";
	}

	

}
