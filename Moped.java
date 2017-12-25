package edu.cs.nyu.hsd262.hayley_daru;

public class Moped {
	
	//properties of a moped
	
	private int Street;
	private int Avenue;
	
	
	
	
	
	public static int maxStreets;
	public static int maxAvenue;
	private String orientation;
	
	
	private float gas; 
	
	
	//getter methods
	
	
	public int getStreet() {
		return Street;
	}
	
	public int getAvenue() {
		return Avenue;
	}
	
	public String getOrientation() {
		return orientation;
	}
	
	
	public int getMaxStreets() {
		return maxStreets;
	}
	
	
	public int getMaxAvenue() {
		return maxAvenue;
	}
	
	
	
	public float getGas() {
		return gas;
	}
	
	

	

	
	
	//setter methods
	
	
	
	public void setStreet(int Street) {
		this.Street = Street;
	}
	
	public void setAvenue(int Avenue) {
		this.Avenue = Avenue;
	}
	
	public void setMaxStreets(int maxStreets) {
		Moped.maxStreets = maxStreets;
	}
	
	
	public void setMaxAvenue(int maxAvenue) {
		Moped.maxAvenue = maxAvenue;
	} 
	
	
	public void setGas(float currentLevel) {
		this.gas = currentLevel; //measured in gallons
	}
	
	
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	
	
	
	
	
	// action methods
	
// ...............DIRECTIONS.........//

	
	
	public void goLeft(int currentStreet, int currentAve) {
		
		switch(orientation) {
		case "North":
			orientation = "West";
			currentAve++;
			this.setAvenue(currentAve);
			System.out.println("Now at " + Street + "th St. and " + Avenue + "th Ave.");
			break;
		case "South":
			orientation = "East";
			currentAve--;
			this.setAvenue(currentAve);
			System.out.println("Now at " + Street + "th St. and " + Avenue + "th Ave.");
			break;
		case "East":
			orientation = "North";
			currentStreet++;
			this.setStreet(currentStreet);
			System.out.println("Now at " + Street + "th St. and " + Avenue + "th Ave.");
			break;
		case "West":
			orientation = "South";
			currentStreet--;
			this.setStreet(currentStreet);
			System.out.println("Now at " + Street + "th St. and " + Avenue + "th Ave.");
			break;
			
		}

	}
	
	public void goRight(int currentStreet, int currentAve) {
		
		switch(orientation) {
		case "North":
			orientation = "East";
			currentAve--;
			this.setAvenue(currentAve);
			System.out.println("Now at " + Street + "th St. and " + Avenue + "th Ave.");
			break;
		case "South":
			orientation = "West";
			currentAve++;
			this.setAvenue(currentAve);
			System.out.println("Now at " + Street + "th St. and " + Avenue + "th Ave.");
			break;
		case "East":
			orientation = "South";
			currentStreet--;
			this.setStreet(currentStreet);
			System.out.println("Now at " + Street + "th St. and " + Avenue + "th Ave.");
			break;
		case "West":
			orientation = "North";
			currentStreet++;
			this.setStreet(currentStreet);
			System.out.println("Now at " + Street + "th St. and " + Avenue + "th Ave.");
			break;
		}
		
	}
	
	public void backUp(int currentStreet, int currentAve) {
		
		switch(orientation) {
		case "North":
			currentStreet--;
			this.setStreet(currentStreet);
			System.out.println("Now at " + Street + "th St. and " + Avenue + "th Ave.");
			break;
		case "South":
			currentStreet++;
			this.setStreet(currentStreet);
			System.out.println("Now at " + Street + "th St. and " + Avenue + "th Ave.");
			break;
		case "East":
			currentAve++;
			this.setAvenue(currentAve);
			System.out.println("Now at " + Street + "th St. and " + Avenue + "th Ave.");
			break;
		case "West":
			currentAve--;
			this.setAvenue(currentAve);
			System.out.println("Now at " + Street + "th St. and " + Avenue + "th Ave.");
			break;
			
			
		}
		
	}
	
	public void straightOn(int currentStreet, int currentAve) {
		
		
		
		switch(orientation) {
		case "North":
			currentStreet++;
			this.setStreet(currentStreet);
			System.out.println("Now at " + Street + "th St. and " + Avenue + "th Ave.");
			break;
		case "South":
			currentStreet--;
			this.setStreet(currentStreet);
			System.out.println("Now at " + Street + "th St. and " + Avenue + "th Ave.");
			break;
		case "East":
			currentAve--;
			this.setAvenue(currentAve);
			System.out.println("Now at " + Street + "th St. and " + Avenue + "th Ave.");
			break;
		case "West":
			currentAve++;
			this.setAvenue(currentAve);
			System.out.println("Now at " + Street + "th St. and " + Avenue + "th Ave.");
			break;
		default:
				break;
		}
		

		
	}
	
	
	public void homing(int currentStreet, int currentAve) {
		
		this.setStreet(currentStreet);
		this.setAvenue(currentAve);
		
		do {
			System.out.println("Driving to " + Street + "th St.");
			currentStreet++;
			this.setStreet(currentStreet);
		} while(currentStreet < 17);
		
		do {
			System.out.println("Driving to " + Street + "th St.");
			currentStreet--;
			this.setStreet(currentStreet);
		} while(currentStreet > 17);
		
		this.setStreet(17);
		this.setAvenue(6);
		System.out.println("Now at 17th St. and 6th Ave.");
		System.out.println("We have reached the Petite Abeille. Enjoy your moules-frites.");
		
	}
	
	
	
	
	//...............GAS LEVELS.............//
	
	public void fillGas() { 
		this.setGas(1);
		System.out.println("You now have a full tank of gas!");
	}
	
	
	public void calculateGas() { 
		float currentLevel = (float) (gas - .05); 
		this.setGas((float) currentLevel);
	}
	
	public void checkGas() {
		if (gas == 0) {
			System.out.println("You are out of gas. Cannot drive anymore.");
			System.exit(0);
			}
	}
	

	
	public void getHelp() { //GET HELP METHOD
		
			System.out.println("Please enter one of the following: ");
			System.out.println("go right, go left, back up, straight on, go to Petite Abeille, fill 'er up, how we doin'?");
		}

	
	
	//.............OUT OF BOUNDS.........//
	
	public void checkBounds(int currentStreet, int currentAve) {
		
		if (currentStreet > maxStreets || currentStreet == 0 || currentAve > maxAvenue || currentAve == 0) {
			System.out.println("Sorry, you're off the grid.");
			System.exit(0);
		}
	}
	
	
	
	//.............. ADVERTISEMENTS............//
	
	public void outputAds(int num1, int num2) { //ADVERTISEMENT METHOD
		
		if (num1 == 79 && num2 == 8) {
			System.out.println("Plan your next visit to the American Museum of Natural History! Save up to 50% off of admission with the NYC Explorer Pass!");
		}
		if (num1 == 74 && num2 == 1) {
			System.out.println("Cancer care is the only thing we do. At Memorial Sloan Kettering, our specialists treat every type of cancer, including the most important one: yours.");			
		}
		if (num1 == 12 && num2 == 4) {
			System.out.println("Welcome to Strand book store! New York City's legendary home of 18 Miles of new, used, and rare books!!");
		}
		else if (num1 == 3 && num2 == 6) {
			System.out.println("Come to Fay Da Bakery! Our goal is to set a future where we can bring people together the same way we can bring two cultures of food together.");
		}			
	}
	
} 
	
	
	
	
	
	
	
	
	


