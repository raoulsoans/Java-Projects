/***************************************************************
	* file: RaoulSoans_CIS3090_Assignment1.java
	* author: Raoul Soans
	* class: CIS 3090
	*
	* assignment: program 1
	* date last modified: 9/25/2018
	*
	* purpose: The Purpose is to take users input for name, gender, age, and BMI,
	* then use those numbers to calculate BFP using the given formulas for children
	* and gender differences, as well as return that information back to the user 
	*
	****************************************************************/ 

import java.util.Scanner;

public class RaoulSoans_CIS3090_Assignment1 { //start of class
	public static void main(String args[]){ //start of main method
		
		String name; //declaring the string for name 
		String gender; //declaring the string for gender
		int genderInt = 0; // declaring and initializing an integer assignment for gender
		int age; //declaring int for age
		double BMI; //declaring double for BMI
		double BFP_Child; //declaring double for BFP used in child formula
		double BFP_Adult; //declaring double for BFP used in Adult formula
		double BFP_Print = 0.0; //declaring the variable for BFP that will desplay to the user
		String ageGroup = "adult"; //declaring the string that displays what agegroup you beling to based on age
		String BFP_Category = "Average"; //declaring string that identifies the BFP category you belong to
		
		Scanner input = new Scanner(System.in); //introduces a scanner to take user input
		
		System.out.println("Please enter your name here: "); //prompts user for their name
		name = input.nextLine(); //scanner takes input and assigns it to 'name'
		
		System.out.println("Please enter your gender here (Male or Female): "); //prompts user for Gender 
		gender = input.nextLine(); //assigns input to string 'gender'
		
		System.out.println("Please enter your age (as a number): "); //prompts user for age
		age = input.nextInt(); //assigns input to int age
		
		System.out.println("Please enter your BMI (as a number with a decimal point): "); //prompts user for BMI
		BMI = input.nextDouble(); //assigns BMI to double BMI
		
		if (gender.equals("Male")||gender.equals("male")){ //this if statement says that if the string 'gender' is Male or male, their genderInt shall be 1
			
			genderInt = 1; //assigns genderInt to 1
			
		} else if (gender.equals("Female")||gender.equals("female")){ //this else if statement says that if the string 'gender' is Female or female, their genderInt shall be 0
			 
			genderInt = 0; //assigns genderInt to 0
		}
		

		
		BFP_Child = ((1.51*BMI) - (.7 * age) - (3.6*genderInt)-5.4); //assigns BFP_Child to the formula given for children
		BFP_Adult = ((1.20*BMI)+(.23*age)-(10.8*genderInt)-5.4); //assigns BFP_adult to the formula given for adults
		
		if (age <= 15){ //if age is less than or equal to 15, thier ageGroup is 'child'
			
			ageGroup = "child"; //assigns ageGroup to child
			
		} else if (age > 15){ //else if age is greater than 15, their ageGroup is adult
			
			ageGroup = "adult"; // assigns ageGroup to adult
		}
		
		if (ageGroup.equals("child")){ //if ageGroup is child, assign BFP_Child to BFP_Print
			
			BFP_Print = BFP_Child; //assigns BFP_Child to BFP_Print
			
		} else if (ageGroup.equals("adult")){ //if ageGroup is adult, assign BFP_adult to BFP_Print
			
			BFP_Print = BFP_Adult; //assign BFP_adult to BFP_Print
			
		}
		
		if(gender.equals("Male")||gender.equals("male")){ //if gender is Male, these are the BFP categroy assigments
			
			if(BFP_Print >= 2.0 && BFP_Print <=5.0){ //if BFP is >2 and <=5 its essential fat
				
				BFP_Category = "Essential Fat"; 
				
			} else if(BFP_Print > 5.0 && BFP_Print <= 13.0){ //if BFP >5 and <=13 its athlete
				
				BFP_Category = "Athlete";
				
			} else if(BFP_Print > 13.0 && BFP_Print <=17.0){ //if BFP >13 and <=17 it's fitness
				
				BFP_Category = "Fitness";
				
			} else if(BFP_Print > 17.0 && BFP_Print <= 24.0){ //if BFP is >17 <=24 its average
				
				BFP_Category = "Average";
				
			} else if(BFP_Print > 24.0){ //if BFP >24 its obese
				
				BFP_Category = "Obese";
				
			}
		} /*end of if else if block for males*/
		else if (gender.equals("Female")||gender.equals("female")){ //if gender is Female, these are the BFP categroy assigments
			
			if(BFP_Print >= 10.0 && BFP_Print <=13.0){ //uses the given number to assign categories to a range of numbers for females
				
				BFP_Category = "Essential Fat";
				
			} else if(BFP_Print > 13.0 && BFP_Print <= 20.0){ //uses the given number to assign categories to a range of numbers for females
				
				BFP_Category = "Athlete";
				
			} else if(BFP_Print > 20.0 && BFP_Print <=24.0){ //uses the given number to assign categories to a range of numbers for females
				
				BFP_Category = "Fitness";
				
			} else if(BFP_Print > 24.0 && BFP_Print <= 31.0){ //uses the given number to assign categories to a range of numbers for females
				
				BFP_Category = "Average";
				
			} else if(BFP_Print > 32.0){ //uses the given number to assign categories to a range of numbers for females
				
				BFP_Category = "Obese";
				
			}
			
		} //end of if else-if block for females
		
		
		System.out.println("\n\n\n"); //adds 4 blank lines at the beginning of printing info back to user
		System.out.println("What's up " + name + "!"); //prints name provided
		System.out.println("You are " + age +" years old."); //prints age provided
		System.out.println("You are a " + gender + " " + ageGroup + "."); //prints gender provided and the ageGroup that was determined based on age given
		System.out.println("Your BMI is " + BMI + "."); //prints BMI provided
		System.out.print("Your BFP is "); //prints string, prefacing BFP
		System.out.printf("%.02f", BFP_Print); //prints BFP_Print, which is formatted and rounded to two decimal points using the Printf method
		System.out.println("%.");//prints percent sign

		System.out.println("You are in the " + BFP_Category + " category for BFP(Body Fat Percentage)."); //prints the BFP category that was determined using the range of numbers in the if else-if blocks
		
		input.close(); //closes my 'input' Scanner
	} //end of main method

} //end of class
