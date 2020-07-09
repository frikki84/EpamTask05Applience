package by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.applience;

public class TabletPC extends Applience {
	public static final String TABLET_PC_NAME = "tabletpc";

	private double battery_capacity;

	private int displayInch;

	private int memory_rom;

	private int flash_memory_capacity;

	private String color;

	{
		setApplienceName(TABLET_PC_NAME);
	}

	public TabletPC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TabletPC(double battery_capacity, int displayInch, int memory_rom, int flash_memory_capacity, String color) {
		super();
		this.battery_capacity = battery_capacity;
		this.displayInch = displayInch;
		this.memory_rom = memory_rom;
		this.flash_memory_capacity = flash_memory_capacity;
		this.color = color;
	}

	public double getBattery_capacity() {
		return battery_capacity;
	}

	public void setBattery_capacity(double battery_capacity) {
		this.battery_capacity = battery_capacity;
	}

	public int getDisplayInch() {
		return displayInch;
	}

	public void setDisplayInch(int displayInch) {
		this.displayInch = displayInch;
	}

	public int getMemory_rom() {
		return memory_rom;
	}

	public void setMemory_rom(int memory_rom) {
		this.memory_rom = memory_rom;
	}

	public int getFlash_memory_capacity() {
		return flash_memory_capacity;
	}

	public void setFlash_memory_capacity(int flash_memory_capacity) {
		this.flash_memory_capacity = flash_memory_capacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "TabletPC [battery_capacity=" + battery_capacity + ", displayInch=" + displayInch + ", memory_rom="
				+ memory_rom + ", flash_memory_capacity=" + flash_memory_capacity + ", color=" + color + "]";
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
