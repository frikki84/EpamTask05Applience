package by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.applience;

import java.io.IOException;

public class Oven extends Applience {
	public static final String OVEN_NAME = "oven";

	private int power_consumptation;

	private int weight;

	private int capacity;

	private double depth;

	private double height;

	private double width;

	{
		setApplienceName(OVEN_NAME);
	}

	public Oven() {

	}

	public Oven(int powerConsumptation) {

		this.power_consumptation = powerConsumptation;

	}

	public Oven(int powerConsumptation, int weight, int capacity, double depth, double height, double width) {

		this.power_consumptation = powerConsumptation;
		this.weight = weight;
		this.capacity = capacity;
		this.depth = depth;
		this.height = height;
		this.width = width;
	}

	public int getPowerConsumptation() {
		return power_consumptation;
	}

	public void setPowerConsumptation(int powerConsumptation) {
		this.power_consumptation = powerConsumptation;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Oven [powerConsumptation=" + power_consumptation + ", weight=" + weight + ", capacity=" + capacity
				+ ", depth=" + depth + ", height=" + height + ", width=" + width + "]";
	}

	@Override
	public Applience createNewObject(String[] stringArray) {
		int power_consumptation = Integer.parseInt(stringArray[2]);

		int weight = Integer.parseInt(stringArray[4]);

		int capacity = Integer.parseInt(stringArray[6]);

		double depth = Double.parseDouble(stringArray[8]);

		double height = Double.parseDouble(stringArray[10]);

		double width = Double.parseDouble(stringArray[12]);

		return new Oven(power_consumptation, weight, capacity, depth, height, width);
	}

}
