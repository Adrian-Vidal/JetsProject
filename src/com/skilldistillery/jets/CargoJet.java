package com.skilldistillery.jets;

public class CargoJet extends Jet implements CargoCarrier {
	public CargoJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void loadCargo() {
		System.out.println("Loading cargo into cargo jet.");
	}

	@Override
	public void fly() {
		System.out.println("Cargo plane is flying.");
		System.out.println("Model: " + getModel());
		System.out.println("Speed: " + getSpeed());
		System.out.println("Range: " + getRange());
		System.out.println("Price: " + getPrice());
	}

}
