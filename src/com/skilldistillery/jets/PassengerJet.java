package com.skilldistillery.jets;

public class PassengerJet extends Jet {
	public PassengerJet(String model, double speed, int range, long price) {
        super(model, speed, range, price);
    }
	@Override
	public void fly() {
		System.out.println("Passenger jet is flying.");
		System.out.println("Model: " + getModel());
		System.out.println("Speed: " + getSpeed());
		System.out.println("Range: " + getRange());
		System.out.println("Price: " + getPrice());
	}

}
