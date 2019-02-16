/***************************************************************
	* file: Soans_Program2.java
	* author: Raoul Soans
	* class: CS 140
	*
	* assignment: program 2b
	* date last modified: 4/16/17
	*
	* purpose: The purpose of this program is read data from input (keyboard) representing length
	* in meters. The program will convert this value into miles, feet, and inches, then
	* print out the values back to the user, also rounding the remaining inches value to a tenth.
	*
	****************************************************************/ 

import java.util.Scanner;

public class Soans_Program2b {
	
	/* Method: Main
	 * 
	 * purpose: The purpose of this program is read data from input (keyboard) representing length
	 * in meters. The program will convert this value into miles, feet, and inches, then
	 * print out the values back to the user also rounding the remaining inches value to a tenth.
	 */

	public static void main(String[] args) {
		
		//declare meters for out first variable
		int meters;
		
		//The first prompt to the user to enter their meters
		System.out.println("Enter meter(s):");
		
			Scanner userInput = new Scanner(System.in);
			meters = userInput.nextInt();
			
			

		//This is the direct conversion from meters to inches, using the variable convertedInches
		//I decided to use inches instead of feet because I thought it would be easier to use the lowest
		//units for the backwards conversion, unlike the forward conversion in Program 2a
			
		double convertedInches;
		convertedInches = (39.6 * meters);
		
		
			/*
			 * These variables are what will be printed out to the console when I run my program
			 * The inchesRemaining will be rounded later on so I can follow the assignment specifications
			 */
			int milesRemaining;
			milesRemaining = (int) (convertedInches / 63360);
        
        
			int feetRemaining;
			feetRemaining = (int) (convertedInches - milesRemaining * 63360) / 12;
        
        
			double inchesRemaining;
			inchesRemaining = convertedInches - (milesRemaining * 63360 + feetRemaining * 12);
			
			

			
			//This statement declares a new variable that will convert from the inches remaining
			//to a rounded version so that I can have a variable that is rounded to the nearest tenth.
			
			double inchesRemainingRounded = (double) Math.round(inchesRemaining*10)/10;
			
			
			System.out.println(meters + " meters will be converted into " + milesRemaining + " mile(s), " +
			feetRemaining + " foot(or feet), and " + inchesRemainingRounded + " inch(es).");
			
			
			//this method closes my scanner to prevent data leaking
			userInput.close();

			
			
			
			//this is the unused older program that I did not want to use because the test cases broke down
			//in this version of my program
			
			/**
			double convertedInches;
			convertedInches = (meters * 39.6);
			
			
				int milesRemaining;
				milesRemaining  = (int) (convertedInches / 63360);
			
			
				int feetRemaining;
				feetRemaining   = (int) (convertedInches - milesRemaining * 63360) / 12;
			
			
				double inchesRemaining;
				inchesRemaining = convertedInches - (milesRemaining * 63660 + feetRemaining * 12);
			
		*/
				
			
	}

}
