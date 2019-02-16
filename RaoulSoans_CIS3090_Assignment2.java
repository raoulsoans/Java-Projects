/***************************************************************
	* file: RaoulSoans_CIS3090_Assignment2.java
	* author: Raoul Soans
	* class: CIS 3090
	*
	* assignment: program 2
	* date last modified: 10/22/2018
	*
	* purpose: The Purpose is to take users input for name, gender, age, and BMI, within
	* different methods, return those values to the main method, pass it into 
	* then use those numbers to calculate BFP using the given formulas for children
	* and gender differences, as well as return that information back to the user, then store 
	* BFP's in an array, then take an average after all BFP's have been entered.
	*
	****************************************************************/ 
import java.util.Scanner;
public class RaoulSoans_CIS3090_Assignment2 { //start of class

	public static void main(String[] args) { //start of main method
		
		
		
		Scanner input = new Scanner(System.in); //declaring scanner named 'input'
		
		/*
		 * These statements will give me the total number of BFP's I want to take, which will help
		 * with creating loops, and taking the average of all BFP's provided, at the end.
		 */
		System.out.println("Please enter the number of BFP's you want to calculate(# of persons): ");
		int numOfBFP = input.nextInt();
		
		/*
		 * Here is just a bunch of declarations for variables I will need for the program.
		 */
		double[] bfpArray = new double[numOfBFP];
		int genderInt = 0;
		int age = 0;
		double BMI = 0.0;
		double BFP = 0.0;
		String gender = "female";
		
		for(int i=1; i <= numOfBFP ; i++){
		
		System.out.println("Please enter your name here: ");

		String name = getName();
		
		System.out.println("Please enter your gender here (Male or Female): ");
		genderInt = getGender();
		if (genderInt == 0){
			gender = "female";
		} else if (genderInt == 1){
			gender = "male";
		}
		
		System.out.println("Please enter your age here: ");
		age = getAge();
		
		System.out.println("Please enter a BMI value as a decimal point: ");
		BMI = getBMI();
		BFP = calculateBFP(genderInt, age, BMI);
		
		System.out.println("\n\n\n"); //adds 4 blank lines at the beginning of printing info back to user
		System.out.println("What's up " + name + "!"); //prints name provided
		System.out.println("You are " + age +" years old."); //prints age provided
		System.out.println("You are a " + gender + "."); //prints gender provided and the ageGroup that was determined based on age given
		System.out.println("Your BMI is " + BMI + "."); //prints BMI provided
		System.out.print("Your BFP is "); //prints string, prefacing BFP
		System.out.printf("%.02f", BFP); //prints BFP_Print, which is formatted and rounded to two decimal points using the Printf method
		System.out.println("%.");//prints percent sign
		
		bfpArray[i-1] = BFP;
		
		}
		
		System.out.println("\n");
		System.out.print("The average BFP for "+ numOfBFP + " participant(s) is ");
		System.out.printf("%.02f", calculateAverage(bfpArray));
		System.out.println("%.");
		
		
		
		input.close();
	}
	
	
	
	public static String getName(){
		
		Scanner nameInput = new Scanner(System.in);

		String name = nameInput.next();
		
		//nameInput.close();
		return name;
		
	}
	
	public static int getGender(){
		
		
		Scanner genderInput = new Scanner(System.in);	

		String gender = genderInput.nextLine();
		
		int genderInt = 0;
		
		if (gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("m")){ //this if statement says that if the string 'gender' is Male or male, their genderInt shall be 1
			
			genderInt = 1; //assigns genderInt to 1
			
		} else if (gender.equalsIgnoreCase("female")||gender.equalsIgnoreCase("f")){ //this else if statement says that if the string 'gender' is Female or female, their genderInt shall be 0
			 
			genderInt = 0; //assigns genderInt to 0
		}
		
		
		//genderInput.close();
		return genderInt;
	}
	
	public static int getAge(){
		Scanner ageInput= new Scanner(System.in);
			
		int age = ageInput.nextInt();
		
		//ageInput.close();
		return age;
		
	}
	
	public static double getBMI(){
		
		Scanner bmiInput = new Scanner(System.in);
		
		double BMI = 0;
		
		
		 BMI = bmiInput.nextDouble();
		
		//bmiInput.close();
		return BMI;
		
	}
	
	public static double calculateBFP(int genderInt, int age, double BMI){
		
		double BFP_Print = 0;
		double BFP_Child = ((1.51*BMI) - (.7 * age) - (3.6*genderInt)+1.4); //assigns BFP_Child to the formula given for children
		double BFP_Adult = ((1.20*BMI)+(.23*age)-(10.8*genderInt)-5.4); //assigns BFP_adult to the formula given for adults
		String ageGroup = "";
		
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
		
		
		
		return BFP_Print;
		
	}
	
	public static double calculateAverage(double[] bfpArray){
		double sum = 0.0;
		double average = 0.0;
		
		for(int i=0; i < bfpArray.length; i++){
			
			sum = sum + bfpArray[i];
			
		}
		
		average = sum / bfpArray.length;
		
		//average = ;
		
		
		return average;
		
	}
	

}
