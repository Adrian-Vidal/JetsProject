package com.skilldistillery.jets;

public abstract class Jet {

	// TODO add fields model, speed, range, price
	private String model;
	private double speed;
	private int range;
	private long price;

	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public abstract void fly();

	public void getSpeedInMach() {
		System.out.println("Jet speed in Mach: " + (speed / 767.269));

	}

	public String getModel() {
		return model;
	}

	

	public double getSpeed() {
		return speed;
	}

	

	public int getRange() {
		return range;
	}

	

	public long getPrice() {
		return price;
	}

	

	@Override
	public String toString() {
		return "Model: " + model + ", Speed: " + speed + " mph, Range: " + range + " miles, Price: $" + price;
	}
	
}
