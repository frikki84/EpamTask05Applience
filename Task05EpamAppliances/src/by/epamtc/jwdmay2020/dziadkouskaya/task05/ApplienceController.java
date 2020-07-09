package by.epamtc.jwdmay2020.dziadkouskaya.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.applience.Applience;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.catalog.Catallogue;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.request.UserRequest;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.source.InfoSourse;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.source.TextFileInfoSource;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.logic.ApplienceListCreation;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.logic.CatalogCreation;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.logic.RequestCreation;

public class ApplienceController {
	public static void main(String[] args) {

		List<String> requstlist = new ArrayList<>(Arrays.asList("Laptop", "MEMORY_ROM", "8000", "CPU", "2.2"));

		UserRequest request = RequestCreation.createRequesFromList(requstlist);

		String fileName = "d:\\Java\\epam\\tasks\\appliances_db.txt";

		InfoSourse source = new TextFileInfoSource(fileName);

		Catallogue catallogue = CatalogCreation.createCatalog(source, request);

		List<Applience> applienceList = ApplienceListCreation.createListOfRequiredApplience(catallogue);

		if (applienceList.size() == 0) {
			System.out.println("No results!!!");
		} else {

			for (Applience applience : applienceList) {
				System.out.println(applience);
			}
		}

	}

}
