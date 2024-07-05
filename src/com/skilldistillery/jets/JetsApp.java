package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApp {

	// Two fields max

	private AirField airfield = new AirField();
	private Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApp ja = new JetsApp();
		ja.launchApp();
	}

	public void launchApp() {
		int userSelection;
		System.out.println("Welcome to the Jets App. Press the enter/return button to start.");
		keyboard.nextLine();
		System.out.println("The airfield is currently empty. First, please select number 7 from the menu to add a jet to the fleet:\n");
		do {
		System.out.println("1.) List Fleet\n"
				+ "2.) Fly all jets\n"
				+ "3.) View fastest jet\n"
				+ "4.) View jet with longest range\n"
				+ "5.) Load all Cargo Jets\n"
				+ "6.) Dogfight!"
				+ "7.) Add a jet to the fleet\n"
				+ "8.) Remove a jet from the fleet\n"
				+ "9.) Quit");
				userSelection = keyboard.nextInt();
				
				switch (userSelection) {
				case 1:
					AirField fleet = new AirField();
					fleet.listJets();
		
				
				}
				} while (userSelection != 9);
		
		
		
		}

}
