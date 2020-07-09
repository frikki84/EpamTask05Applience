package by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.source;

import java.util.ArrayList;
import java.util.List;


//абстрактная сущность для источника информации для анализа
public abstract class InfoSourse {
	
	private List<String> infoContaiter;
	
	
	
	public InfoSourse() {
		super();
		infoContaiter = new ArrayList<String>();
	}



	public InfoSourse(List<String> infoContaiter) {
		super();
		this.infoContaiter = infoContaiter;
	}



	public abstract List<String> giveInfo(String string);



	public List<String> getInfoContaiter() {
		return infoContaiter;
	}



	public void setInfoContaiter(List<String> infoContaiter) {
		this.infoContaiter = infoContaiter;
	}



	@Override
	public String toString() {
		return "InfoSourse [infoContaiter=" + infoContaiter + "]";
	}
	
	
	
	

}
