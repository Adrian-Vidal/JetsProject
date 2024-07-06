package com.skilldistillery.jets;

public class CargoJet extends Jet implements CargoCarrier {
	public CargoJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void loadCargo() {
		System.out.println("\n============================================================================================\n\n"
				+ "Loading cargo on " + getModel() + ".");
	}

	@Override
	public void fly() {
		double flightTime = (getRange() / getSpeed());
		System.out.println("\nThe $" + getPrice() + " " + getModel() + " cargo jet is flying.\n" + "This jet flys at "
				+ getSpeed() + " MPH " + "with a maximum flight distance of " + getRange() + " miles.\n"
				+ "Dividing the range of " + getRange() + " miles by the speed of " + getSpeed() + " MPH "
				+ "gives the " + getModel() + " an estimated flight time of ");
		System.out.printf("%.2f", flightTime);
		System.out.print(" hours.\n");
	}

}
