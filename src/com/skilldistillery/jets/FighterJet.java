package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fight() {
		System.out.println("Weapon systems activated, locking on target.");
	}

	@Override
	public void fly() {
		System.out.println("Fighter jet is flying at high speeds.");
		System.out.println("Model: " + getModel());
		System.out.println("Speed: " + getSpeed());
		System.out.println("Range: " + getRange());
		System.out.println("Price: " + getPrice());
	}

}
