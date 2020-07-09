package by.epamtc.jwdmay2020.dziadkouskaya.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.request.UserRequest;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.source.TextFileInfoSource;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.logic.RequestCreation;

public class ApplienceController {
	public static void main(String[] args) {
				
		List<String> requstlist = new ArrayList<>(Arrays.asList("VacuumCleaner", "WAND_TYPE", "all-in-one", "CLEANING_WIDTH", "40"));
		
		UserRequest request = RequestCreation.createRequesFromList(requstlist);
		
		System.out.println(request);
		
		String fileName = "d:\\Java\\epam\\tasks\\appliances_db.txt";
		
		TextFileInfoSource source = new TextFileInfoSource(fileName);
		
		System.out.println(source);
		
		
	}

}
