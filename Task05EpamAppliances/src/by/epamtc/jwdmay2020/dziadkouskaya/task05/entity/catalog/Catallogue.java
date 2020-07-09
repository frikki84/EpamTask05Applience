package by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.catalog;

import java.util.ArrayList;
import java.util.List;

public class Catallogue {
	
	private List<String[]> catalog;

	public Catallogue() {
		super();
		catalog = new ArrayList<>();
	}

	public Catallogue(List<String[]> catalog) {
		super();
		this.catalog = catalog;
	}

	public List<String[]> getCatalog() {
		return catalog;
	}

	public void setCatalog(List<String[]> catalog) {
		this.catalog = catalog;
	}

	@Override
	public String toString() {
		return "Catallogue [catalog=" + catalog + "]";
	}
	
	
	
	
	
	

}
