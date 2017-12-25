package edu.cs.nyu.hsd262.hayley_daru;


import java.util.Scanner;

public class TestDrive {
	
	public static void main(String[] args) {
		
		


		Moped myMoped = new Moped();
		myMoped.setMaxStreets(200);
		myMoped.setMaxAvenue(10);
		myMoped.setGas(1);
		myMoped.setOrientation("South");
		
		myMoped.setStreet(10);
		myMoped.setAvenue(5);
				
		//int tempStreet = myMoped.getStreet();
		//int tempAve = myMoped.getAvenue();
		
		
		
		
		
		System.out.println("Thanks for jumping on the moped.");
		System.out.println("We're currently parked outside DDS' Office at " + myMoped.getStreet() + "th St. and " + myMoped.getAvenue() + "th Ave.");
		
		Scanner scan = new Scanner(System.in);
		String response = " ";

		while (!(response.equals("park"))) {
			
			System.out.println("What would you like to do? At any time, say 'help' for assistance.");
			response = scan.nextLine();
			
			
			if (response.equalsIgnoreCase("go left")) {
				myMoped.goLeft(myMoped.getStreet(), myMoped.getAvenue());
	
			}
			
			if (response.equalsIgnoreCase("go right")) {
				myMoped.goRight(myMoped.getStreet(), myMoped.getAvenue());
				
			}
			
			
			if (response.equalsIgnoreCase("straight on")) {
				myMoped.straightOn(myMoped.getStreet(), myMoped.getAvenue());
				
			}
			
			if (response.equalsIgnoreCase("back up")) {
				myMoped.backUp(myMoped.getStreet(), myMoped.getAvenue());
				
			}
			
			if (response.equalsIgnoreCase("fill 'er up")) {
				myMoped.fillGas();
				
			}
			
			if (response.equalsIgnoreCase("how we doin'?")) {
				float levels = myMoped.getGas();
				System.out.println("The gas tank is currently " + levels * 100 + "% full.");
					
			}
			
			if (response.equalsIgnoreCase("help")) {
				myMoped.getHelp();
			}
			
			else if (response.equalsIgnoreCase("go to Petite Abeille")) {
				myMoped.homing(myMoped.getStreet(), myMoped.getAvenue());
				
			}
			
			
			myMoped.calculateGas();
			myMoped.checkGas();
			myMoped.checkBounds(myMoped.getStreet(), myMoped.getAvenue());
			myMoped.outputAds(myMoped.getStreet(), myMoped.getAvenue());
		
		} 
			System.out.println("Your moped has been parked on the sidewalk. Goodbye!"); 
			System.exit(0);
	
		
	}

}
