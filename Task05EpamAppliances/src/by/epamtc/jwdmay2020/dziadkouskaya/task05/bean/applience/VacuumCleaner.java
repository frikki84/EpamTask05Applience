package by.epamtc.jwdmay2020.dziadkouskaya.task05.bean.applience;

public class VacuumCleaner extends Applience {

	public static final String VACUUM_CLEANER_NAME = "vacuumcleaner";

	private int powerConsumption;

	private String filterType;

	private String bagType;

	private String wandType;

	private int motorSpeedRegulation;

	private int cleaningWidth;

	{
		setApplienceName(VACUUM_CLEANER_NAME);
	}

	public VacuumCleaner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType,
			int motorSpeedRegulation, int cleaningWidth) {
		super();
		this.powerConsumption = powerConsumption;
		this.filterType = filterType;
		this.bagType = bagType;
		this.wandType = wandType;
		this.motorSpeedRegulation = motorSpeedRegulation;
		this.cleaningWidth = cleaningWidth;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public String getBagType() {
		return bagType;
	}

	public void setBagType(String bagType) {
		this.bagType = bagType;
	}

	public String getWandType() {
		return wandType;
	}

	public void setWandType(String wandType) {
		this.wandType = wandType;
	}

	public int getMotorSpeedRegulation() {
		return motorSpeedRegulation;
	}

	public void setMotorSpeedRegulation(int motorSpeedRegulation) {
		this.motorSpeedRegulation = motorSpeedRegulation;
	}

	public int getCleaningWidth() {
		return cleaningWidth;
	}

	public void setCleaningWidth(int cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}

	@Override
	public String toString() {
		return "VacuumCleaner [powerConsumption=" + powerConsumption + ", filterType=" + filterType + ", bagType="
				+ bagType + ", wandType=" + wandType + ", motorSpeedRegulation=" + motorSpeedRegulation
				+ ", cleaningWidth=" + cleaningWidth + "]";
	}

	@Override
	public Applience createNewObject(String[] stringArray) {
		int power_consumption = Integer.parseInt(stringArray[2]);

		String filter_type = stringArray[4];

		String bag_type = stringArray[6];

		String wand_type = stringArray[8];

		int motor_speed_regulation = Integer.parseInt(stringArray[10]);

		int cleaning_width = Integer.parseInt(stringArray[12]);
		return new VacuumCleaner(power_consumption, filter_type, bag_type, wand_type, motor_speed_regulation,
				cleaning_width);
	}

}
