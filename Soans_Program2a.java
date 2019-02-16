/***************************************************************
	* file: Soans_Program2.java
	* author: Raoul Soans
	* class: CS 140
	*
	* assignment: program 2a
	* date last modified: 4/16/17
	*
	* purpose: The purpose of this program is read data from input (keyboard) representing length
	* in miles, feet, and inches. THe program will convert this value into meters (3.3m = 1 ft)
	* and print out the new total value converted to the nearest tenth.
	*
	****************************************************************/ 
import java.util.Scanner;


public class Soans_Program2a {
	
	//method: main
	/*
	 * The purpose of this method is to run my program
	 * purpose: The purpose of this program is read data from input (keyboard) representing length
	 * in miles, feet, and inches. THe program will convert this value into meters (3.3m = 1 ft)
	 * and print out the new total value converted to the nearest tenth.
	 * 
	 * This method will run the whole program, and make sure it is formatted correctly as per the 
	 * Java Style Sheet
	 */
	public static void main(String[] args) {
		
		
		//I'm just declaring all the variables I need right now so I don't need to later.
		double miles;
		
		double feet;
		
		double inches;
		
		double meters; 
		
		//Here I am printing the prompt for the user to input values I will need to convert to meters
		System.out.println("Enter miles:");
				
			Scanner userInput = new Scanner (System.in);
			miles = userInput.nextDouble();
			
		
		System.out.println("Enter feet:");
		
			Scanner userInput2 = new Scanner (System.in);
			feet = userInput2.nextDouble();
			
			
		System.out.println("Enter inches:");
		
			Scanner userInput3 = new Scanner (System.in);
			inches = userInput3.nextDouble();
			
			
				/*this is where I am converting all my values to feet, which will then convert to
				 * meters.
				 * 
				 * I am declaring new variables to represent converted values and also
				 */
				double convertedMiles;
				convertedMiles = miles*5280;
			
				double convertedFeet;
				convertedFeet = feet*1;
			
				double convertedInches;
				convertedInches = inches/12;
				
		//this statement is where I add together all my converted values to reach my total in feet
		//and then I divide by 3.3 to get to my meters, as specified in the directions
		meters = (convertedMiles + convertedFeet + convertedInches)/3.3;
		
		//This statement declares a new variable that will convert from meters to a rounded version
		//so that I can have a variable that is rounded to the nearest tenth.
		double metersRounded = (double)Math.round((meters)*10)/10;
		
		
		
		System.out.println(miles + " mile(s), " + feet + " foot(or feet) " + inches + 
						   " inch(es) = " + metersRounded + " meter(s).");
		
		userInput.close();
		userInput2.close();
		userInput3.close();
		
		

	}

}