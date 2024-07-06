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
		System.out.print("Welcome to the Jets App. Press the enter/return button to launch.");
		keyboard.nextLine();

		do {

			displayMenu();
			userSelection = keyboard.nextInt();

			switch (userSelection) {
			case 1:
				airfield.listJets();
				break;

			case 2:
				airfield.flyAllJets();
				break;

			case 3:
				Jet fastestJet = airfield.getFastestJet();
				if (fastestJet != null) {
					System.out.println("\n============================================================================================\n\n"
							+ "The fastest jet is: " + fastestJet);
				} else {
					System.out.println(
							"============================================================================================"
									+ "\n\nNo jets available in the airfield.");
				}
				break;

			case 4:
				Jet longestDistance = airfield.getLongestDistance();
				if (longestDistance != null) {
					System.out.println("\n============================================================================================\n\n"
							+ "The jet with the longest flight distance is " + longestDistance);
				} else {
					System.out.println(
							"============================================================================================"
									+ "\n\nNo jets available in the airfield.");
				}
				break;

			case 5:
				airfield.loadAllCargoJets();
				break;
				
			case 6:
				airfield.attackReady();
				break;

			case 7:
				System.out.println(
						"\n============================================================================================\n\nChoose which jet you would like to add: \n"
								+ "1.) Passenger jet\n2.) Cargo jet\n3.) Fighter jet");
				int jetSelection;
				jetSelection = keyboard.nextInt();

				if (jetSelection == 1) {
					System.out.println("Enter the model of the passenger jet:");
					keyboard.nextLine();
					String model = keyboard.nextLine();
					System.out.println("Enter the speed of the passenger jet (in mph):");
					double speed = keyboard.nextDouble();
					System.out.println("Enter the range of the passenger jet (in miles):");
					int range = keyboard.nextInt();
					System.out.println("Enter the price of the passenger jet (in USD):");
					long price = keyboard.nextLong();
					Jet newPassengerJet = new PassengerJet(model, speed, range, price);
					airfield.addJet(newPassengerJet);
					System.out.println("Passenger jet added successfully.");
					break;

				} else if (jetSelection == 2) {
					System.out.println("Enter the model of the cargo jet:");
					keyboard.nextLine();
					String model = keyboard.nextLine();
					System.out.println("Enter the speed of the cargo jet (in mph):");
					double speed = keyboard.nextDouble();
					System.out.println("Enter the range of the cargo jet (in miles):");
					int range = keyboard.nextInt();
					System.out.println("Enter the price of the cargo jet (in USD):");
					long price = keyboard.nextLong();
					Jet newCargoJet = new CargoJet(model, speed, range, price); // Use FighterJet instead of Jet
					airfield.addJet(newCargoJet);
					System.out.println("Cargo jet added successfully.");
					break;

				} else if (jetSelection == 3) {
					System.out.println("Enter the model of the fighter jet:");
					keyboard.nextLine();
					String model = keyboard.nextLine();
					System.out.println("Enter the speed of the fighter jet (in mph):");
					double speed = keyboard.nextDouble();
					System.out.println("Enter the range of the fighter jet (in miles):");
					int range = keyboard.nextInt();
					System.out.println("Enter the price of the fighter jet (in USD):");
					long price = keyboard.nextLong();
					Jet newFighterJet = new FighterJet(model, speed, range, price); // Use FighterJet instead of Jet
					airfield.addJet(newFighterJet);
					System.out.println("Fighter jet added successfully.");
					break;

				} else {
					System.out.println("Invalid selection. Returning to menu.");
					break;

				}
			case 8:

			case 9:
				System.out.println(
						"\n============================================================================================\n\n"
								+ "Exiting Jets App.");
				System.exit(0);
			
			default:
				System.out.println("Invalid selection. Please select a valid option.");
				break;
			}
		} while (userSelection != 9);

	}

	private void displayMenu() {
		System.out.println(
				"\n============================================================================================\n"
						+ "\nPlease make a selection from the menu:\n" + "1.) List fleet\n" + "2.) Fly all jets\n"
						+ "3.) View the fastest jet\n" + "4.) View the jet with the longest range\n" + "5.) Load all cargo jets\n"
						+ "6.) Fighter jets, attack!\n" + "7.) Add a jet to the fleet\n"
						+ "8.) Remove a jet from the fleet\n" + "9.) Quit");
	}

}
