package by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.applience;

public class Refrigerator extends Applience {

	public static final String REFRIGERATOR_NAME = "refrigerator";

	private int power_consumption;

	private int weight;

	private int freezer_capacity;

	private int overal_capacity;

	private int height;

	private int width;

	{
		setApplienceName(REFRIGERATOR_NAME);
	}

	public Refrigerator() {
		super();

	}

	public Refrigerator(int power_consumption, int weight, int freezer_capacity, int overal_capacity, int height,
			int width) {
		super();
		this.power_consumption = power_consumption;
		this.weight = weight;
		this.freezer_capacity = freezer_capacity;
		this.overal_capacity = overal_capacity;
		this.height = height;
		this.width = width;
	}

	public int getPower_consumption() {
		return power_consumption;
	}

	public void setPower_consumption(int power_consumption) {
		this.power_consumption = power_consumption;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getFreezer_capacity() {
		return freezer_capacity;
	}

	public void setFreezer_capacity(int freezer_capacity) {
		this.freezer_capacity = freezer_capacity;
	}

	public int getOveral_capacity() {
		return overal_capacity;
	}

	public void setOveral_capacity(int overal_capacity) {
		this.overal_capacity = overal_capacity;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Refrigerator [power_consumption=" + power_consumption + ", weight=" + weight + ", freezer_capacity="
				+ freezer_capacity + ", overal_capacity=" + overal_capacity + ", height=" + height + ", width=" + width
				+ "]";
	}

	public Refrigerator(String applienceName) {
		super(applienceName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Applience createNewObject(String[] stringArray) {
		int power_consumption = Integer.parseInt(stringArray[2]);

		int weight = Integer.parseInt(stringArray[4]);

		int freezer_capacity = Integer.parseInt(stringArray[6]);

		int overal_capacity = Integer.parseInt(stringArray[8]);

		int height = Integer.parseInt(stringArray[10]);

		int width = Integer.parseInt(stringArray[12]);
		
		return new Refrigerator(power_consumption, weight, freezer_capacity, overal_capacity, height, width);
	}

}
