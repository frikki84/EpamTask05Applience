package by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.catalog;

import java.util.ArrayList;

public class Catallogue {
	
	private ArrayList<String[]> catalog;

	public Catallogue() {
		super();
		catalog = new ArrayList<>();
	}

	public Catallogue(ArrayList<String[]> catalog) {
		super();
		this.catalog = catalog;
	}

	public ArrayList<String[]> getCatalog() {
		return catalog;
	}

	public void setCatalog(ArrayList<String[]> catalog) {
		this.catalog = catalog;
	}

	@Override
	public String toString() {
		return "Catallogue [catalog=" + catalog + "]";
	}
	
	
	
	
	
	

}
