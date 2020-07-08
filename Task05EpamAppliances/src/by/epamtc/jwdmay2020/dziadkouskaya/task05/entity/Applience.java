package by.epamtc.jwdmay2020.dziadkouskaya.task05.entity;

public abstract class Applience{
	private String applienceName;
	
	

	public Applience() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Applience(String applienceName) {
		super();
		this.applienceName = applienceName;
	}


	public String getApplienceName() {
		return applienceName;
	}


	public void setApplienceName(String applienceName) {
		this.applienceName = applienceName;
	}


	@Override
	public String toString() {
		return "Applience [applienceName=" + applienceName + "]";
	}
	
	public abstract Applience createNewObject(String [] stringArray);
	
	
	
	
	

}
