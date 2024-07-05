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
		System.out.println("List of Jets:");
		for (Jet jet : jets) {
			System.out.println("Model: " + jet.getModel());
			System.out.println("Speed: " + jet.getSpeed());
			System.out.println("Range: " + jet.getRange());
			System.out.println("Price: " + jet.getPrice());
			System.out.println("----------------------------------------");
		}
	}
}
