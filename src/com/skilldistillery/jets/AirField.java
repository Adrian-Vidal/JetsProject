package com.skilldistillery.jets;

import java.util.ArrayList;

public class AirField {

	// THIS CLASS CANNOT HAVE ANY ADDITIONAL FIELDS

	private ArrayList<Jet> jets;

	public AirField() {
		jets = new ArrayList<>();
		// TODO create 5 different jet objects, add them to list
	}

	// DO NOT CREATE A getJets() method
	// add jet method that accepts an argument for a jet and adds it to the list
	public void addJet(Jet jet) {
		jets.add(jet);
	}

	public void listJets() {
		if (jets.isEmpty()) {
			System.out.println(
					"\n============================================================================================"
							+ "\n\nNo jets available in the airfield.");
		} else {
			System.out.println(
					"\n============================================================================================"
							+ "\n\nList of Jets:\n");
			for (Jet jet : jets) {
				System.out.println(jet);
			}
		}
	}

	public void flyAllJets() {
		if (jets.isEmpty()) {
			System.out.println(
					"\n============================================================================================"
							+ "\n\nNo jets available to fly.\n");
		} else {
			for (Jet jet : jets) {
				jet.fly();
			}
		}
	}

	public Jet getFastestJet() {
		if (jets.isEmpty()) {
			return null;
		}
		Jet fastestJet = jets.get(0);
		for (Jet jet : jets) {
			if (jet.getSpeed() > fastestJet.getSpeed()) {
				fastestJet = jet;
			}
		}
		return fastestJet;
	}

	public Jet getLongestDistance() {
		if (jets.isEmpty()) {
			return null;
		}
		Jet longestDistance = jets.get(0);
		for (Jet jet : jets) {
			if (jet.getRange() > longestDistance.getRange()) {
				longestDistance = jet;
			}
		}
		return longestDistance;
	}

	public void loadAllCargoJets() {
		boolean hasCargoJet = false;
		for (Jet jet : jets) {
			if (jet instanceof CargoJet) {
				((CargoJet) jet).loadCargo();
				hasCargoJet = true;
			}
		}
		if (!hasCargoJet) {
			System.out.println(
					"\n============================================================================================\n\n"
							+ "No cargo jets available to load.");
		}
	}

	public void attackReady() {
		boolean hasFighterJet = false;
		for (Jet jet : jets) {
			if (jet instanceof FighterJet) {
				((FighterJet) jet).fight();
				hasFighterJet = true;

			}
		}
		if (!hasFighterJet) {
			System.out.println(
					"\n============================================================================================\n\n"
							+ "No fighter jets to prepare for battle.");
		}
	}
}
