package by.epamtc.jwdmay2020.dziadkouskaya.task05.logic;

import java.util.ArrayList;
import java.util.List;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.bean.applience.Applience;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.bean.applience.Laptop;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.bean.applience.Oven;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.bean.applience.Refrigerator;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.bean.applience.Speakers;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.bean.applience.TabletPC;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.bean.applience.VacuumCleaner;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.catalog.Catallogue;

public class ApplienceListCreation {
	
	public static List<Applience> createListOfRequiredApplience(Catallogue catallogue) {
		Applience applience = null;

		List<Applience> applienceList = new ArrayList();

		for (String[] oneItem : catallogue.getCatalog()) {
			switch (catallogue.getCatalog().get(0)[0]) {
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
