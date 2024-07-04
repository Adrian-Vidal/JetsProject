package com.skilldistillery.jets;

import java.util.ArrayList;

public class AirField {

	// THIS CLASS CANNOT HAVE ANY ADDITIONAL FIELDS

	private ArrayList<Jet> jets;

	public AirField() {
		jets = new ArrayList<>();

		// TODO create 5 different jet objects, add them to list

		jets.add(new CargoJet("C-130J Super Hercules", 417.0, 2417, 70_000_000L));
		jets.add(new CargoJet("C-5 Galaxy", 500.0, 5500, 268_000_000));
		jets.add(new FighterJet("A-10 Thunderbolt (Warthog)", 420, 800, 18_000_000));
		jets.add(new FighterJet("F-16", 1345, 500, 70_000_000));
		jets.add(new PassengerJet("C-21", 530, 2306, 3_100_000));

	}

	// DO NOT CREATE A getJets() method
	// add jet method that accepts an argument for a jet and adds it to the list

	public void addJet(Jet jet) {
		jets.add(jet);
	}
}
