package com.skilldistillery.jets;

public class CargoJet extends Jet implements CargoCarrier{

	public CargoJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	

	@Override
	public void loadCargo() {
		System.out.println("Loading cargo into cargo jet.");
	}

	@Override
	public void fly() {
		System.out.println("Cargo plane is flying slow.");
		
	}

}
