package com.skilldistillery.jets;

public class PassengerJet extends Jet {
	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		double flightTime = (getRange() / getSpeed());
		System.out.println("\nThe $" + getPrice() + " " + getModel() + " passenger jet is flying.\n"
				+ "This jet flys at " + getSpeed() + " MPH " + "with a maximum flight distance of " + getRange()
				+ " miles.\n" + "Dividing the range of " + getRange() + " miles by the speed of " + getSpeed() + " MPH "
				+ "gives the " + getModel() + " an estimated flight time of ");
		System.out.printf("%.2f", flightTime);
		System.out.print(" hours.\n");
	}

}
