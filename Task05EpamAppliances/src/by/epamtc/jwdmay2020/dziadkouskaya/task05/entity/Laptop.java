package by.epamtc.jwdmay2020.dziadkouskaya.task05.entity;

public class Laptop extends Applience {
	public static final String LAPTOP_NAME = "laptop";

	private double powerCapacity;

	private String os;

	private int memoryRom;

	private int systemMemory;

	private double cpu;

	private int displayInch;

	{
		setApplienceName(LAPTOP_NAME);
	}

	public Laptop() {

	}

	public Laptop(double powerCapacity) {
		super();
		this.powerCapacity = powerCapacity;
	}

	public Laptop(double powerCapacity, String os, int memoryRom, int systemMemory, double cpu, int displayInch) {
		super();
		this.powerCapacity = powerCapacity;
		this.os = os;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
		this.displayInch = displayInch;
	}

	public double getPowerCapacity() {
		return powerCapacity;
	}

	public void setPowerCapacity(double powerCapacity) {
		this.powerCapacity = powerCapacity;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public double getCpu() {
		return cpu;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public int getDisplayInch() {
		return displayInch;
	}

	public void setDisplayInch(int displayInch) {
		this.displayInch = displayInch;
	}

	@Override
	public String toString() {
		return "Laptop [powerCapacity=" + powerCapacity + ", os=" + os + ", memoryRom=" + memoryRom + ", systemMemory="
				+ systemMemory + ", cpu=" + cpu + ", displayInch=" + displayInch + "]";
	}

	@Override
	public Applience createNewObject(String [] wordsList) {
		double powerCapacity = Double.parseDouble(wordsList[2]);

		String os = wordsList[4];

		int memoryRom = Integer.parseInt(wordsList[6]);

		int systemMemory = Integer.parseInt(wordsList[8]);

		double cpu = Double.parseDouble(wordsList[10]);

		int displayInch =  Integer.parseInt(wordsList[12]);
		
		return new Laptop(powerCapacity, os, memoryRom, systemMemory, cpu, displayInch);
	}

}
