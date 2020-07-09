package by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.applience;

public class TabletPC extends Applience {
	public static final String TABLET_PC_NAME = "tabletpc";

	private double batteryCapacity;

	private int displayInch;

	private int memoryRom;

	private int flashMemoryCapacity;

	private String color;

	{
		setApplienceName(TABLET_PC_NAME);
	}

	public TabletPC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TabletPC(double batteryCapacity, int displayInch, int memoryRom, int flashMemoryCapacity, String color) {
		super();
		this.batteryCapacity = batteryCapacity;
		this.displayInch = displayInch;
		this.memoryRom = memoryRom;
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.color = color;
	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getDisplayInch() {
		return displayInch;
	}

	public void setDisplayInch(int displayInch) {
		this.displayInch = displayInch;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public void setFlashMemoryCapacity(int flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "TabletPC [batteryCapacity=" + batteryCapacity + ", displayInch=" + displayInch + ", memoryRom="
				+ memoryRom + ", flashMemoryCapacity=" + flashMemoryCapacity + ", color=" + color + "]";
	}

	@Override
	public Applience createNewObject(String[] stringArray) {
		int battery_capacity = Integer.parseInt(stringArray[2]);

		int displayInch = Integer.parseInt(stringArray[4]);

		int memory_rom = Integer.parseInt(stringArray[6]);

		int flash_memory_capacity = Integer.parseInt(stringArray[8]);

		String color = stringArray[10];
		return new TabletPC(battery_capacity, displayInch, memory_rom, flash_memory_capacity, color);
	}

}
