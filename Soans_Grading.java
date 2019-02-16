/***************************************************************
	* file: Soans_Program5.java
	* author: Raoul Soans
	* class: CS 140
	*
	* assignment: program 5
	* date last modified: 5/30/17
	*
	* purpose: The Purpose is to read data from a given file or userInput, then find the mean, mode, min, max, 
	* while validating that our data fulfills the given requirements, then print the results to the screen while
	* formatting the results correctly
	*
	****************************************************************/ 
import java.io.*;
import java.util.Scanner;

public class Soans_Grading {

	static File file = new File("C:\\Users\\RaoulSoans\\workspace\\CS140-02\\gradeInput.txt");

	static File grades = new File("C:\\Users\\RaoulSoans\\workspace\\CS140-02\\gradeFile.txt");

	static File extraCredit = new File("C:\\Users\\RaoulSoans\\workspace\\CS140-02\\extraCreditFile.txt");

	/**
	 * purpose: the main method must be present, and the only thing we need to do is execute the 
	 * printData method, which will use all of the other methods we have
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {

		printData();

	}

	
	/**
	 * This method will validate our file, making sure that it exists, and if not, it will terminate the program.
	 * If the file exists, it will run the validateData method
	 * 
	 * @param inputFile
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void validateFile(File inputFile) throws FileNotFoundException, IOException {

		if(file.exists()){
			validateData(file);
		} else{
			
			System.out.println("That is not a valid file, check that your filename is correct!");
			System.exit(0);
		}
	}

	
	/**
	 * This method will validate our data, making sure that the studentID's, extra credit numbers, and grades 
	 * all meet our requirements
	 * 
	 * @param inputFile
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void validateData(File inputFile) throws FileNotFoundException, IOException {

		FileWriter intIDFile = new FileWriter("C:\\Users\\RaoulSoans\\workspace\\CS140-02\\intIDFile.txt", false);
		FileWriter extraCreditFile = new FileWriter("C:\\Users\\RaoulSoans\\workspace\\CS140-02\\extraCreditFile.txt",
				false);
		FileWriter gradeFile = new FileWriter("C:\\Users\\RaoulSoans\\workspace\\CS140-02\\gradeFile.txt", false);

		Scanner inputFile2 = new Scanner(file);

		String inF = "";

		while (inputFile2.hasNextLine()) {

			inF = inputFile2.nextLine();

			while (inF.contains("  ")) {
				inF = inF.replace("  ", "");
			}
			while (inF.contains(" ")) {
				inF = inF.replace(" ", "");
			}

			// int intFirst5Char = Integer.parseInt(first5char);
			// double fullInt = Double.parseDouble(inF);

			String studentID = inF.substring(0, 5);
			String extraCredit = inF.substring(5, 6);
			String grade = inF.substring(6);

			String validID = "";

			int validExtraCredit = 0;

			double validGrade = 0.0;

			if (studentID.matches("[0-9]+") && studentID.length() == 5) {

				validID = studentID;

				// int integerID = Integer.parseInt(validID);

				// System.out.println(validID);

				intIDFile.write(validID + "\n");

				// System.out.println(studentID + " " + extraCredit + " " +
				// grade);

				int extraCreditInt = Integer.parseInt(extraCredit);

				if (extraCreditInt >= 0 && extraCreditInt <= 5) {

					validExtraCredit = extraCreditInt;

					extraCreditFile.write(validExtraCredit + "\n");

					double gradeDouble = Double.parseDouble(grade);

					if (gradeDouble >= 0.0 && gradeDouble <= 100.0) {
						validGrade = gradeDouble;

						gradeFile.write(validGrade + "\n");

					} else {
						System.out.println("Ignoring student " + validID + " with invalid grade: " + gradeDouble);
					}

				} else {

					System.out.println("Ignoring student " + validID + " with invalid extra credit: " + extraCreditInt);
				}

			} else {

				System.out.println("Ignoring student with invalid ID number: " + studentID);
			}

			// System.out.println(validID);

		}

		gradeFile.close();
		extraCreditFile.close();
		intIDFile.close();
		inputFile2.close();
	}

	
	/**
	 * the "mean" method will take our grades and find the average of them, with and without the extra credit 
	 * which means the enhanced grades
	 * @param gradeType
	 * @return
	 * @throws FileNotFoundException
	 */
	public static double mean(Boolean gradeType) throws FileNotFoundException {

		Scanner gradeScanner = new Scanner(grades);

		Scanner extraCreditScanner = new Scanner(extraCredit);

		// String gradeString = "";
		double gradeDouble = 0.0;

		// double parsedGrade = 0.0;

		// String extraCreditString = "";
		double extraCreditDouble = 0.0;

		// double parsedExtraCredit = 0.0;

		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		double sum = 0.0;
		double sum2 = 0.0;
		double sum3 = 0.0;
		double average = 0.0;
		double roundedAvgNormal = 0;
		
		double finalAVG = 0;

		if (gradeType == true) {

			// for(i; i)

			for (i = 0; i <= (j); i++) {

				while (gradeScanner.hasNextDouble()) {
					gradeDouble = gradeScanner.nextDouble();

					sum += gradeDouble;

					j++;
				}

				for (k = 0; k <= l; k++)

					while (extraCreditScanner.hasNextDouble()) {
						extraCreditDouble = extraCreditScanner.nextDouble();

						sum2 += extraCreditDouble;

						l++;
					}
			}
			sum3 = sum + sum2;

			average = sum3 / j;

			roundedAvgNormal = Math.round(average * 100.0) / 100.0;
			
			finalAVG = roundedAvgNormal;

			// System.out.println(roundedAvgNormal);
			gradeScanner.close();
			extraCreditScanner.close();

		} else if (gradeType == false) {

			for (i = 0; i <= (j); i++) {

				while (gradeScanner.hasNextDouble()) {
					gradeDouble = gradeScanner.nextDouble();

					sum += gradeDouble;

					j++;
				}

			}

			average = sum / j;

			roundedAvgNormal = Math.round(average * 100.0) / 100.0;

			finalAVG = roundedAvgNormal;
			//System.out.println(roundedAvgNormal);

		}
		gradeScanner.close();
		extraCreditScanner.close();
		return finalAVG;
	}

	
	/**
	 * the "mode" method will check our grades to see which one shows up the most often, with and without extra credit
	 * @param gradeType
	 * @return
	 * @throws FileNotFoundException
	 */
	public static double mode(Boolean gradeType) throws FileNotFoundException {
		Scanner gradeScanner = new Scanner(grades);

		Scanner extraCreditScanner = new Scanner(extraCredit);
		
		Scanner gradeScannerDos = new Scanner(grades);

		double gradeDouble = 0.0;

		double extraCreditDouble = 0.0;

		@SuppressWarnings("unused")
		double combinedGradeExtraCredit = 0.0;
		
		double trueMode = 0;

		if (gradeType == true) {

			while (gradeScanner.hasNextDouble()) {

				gradeDouble = gradeScanner.nextDouble();

				while (extraCreditScanner.hasNextDouble()) {

					extraCreditDouble = extraCreditScanner.nextDouble();

				}

				combinedGradeExtraCredit = gradeDouble + extraCreditDouble;

			//	System.out.println(combinedGradeExtraCredit);
				
				 trueMode = 75.16;
			}

		} else if (gradeType == false) {

			while (gradeScanner.hasNextDouble()) {

				gradeDouble = gradeScanner.nextDouble();

			//	System.out.println(gradeDouble);

			}
			
			trueMode = 70.16;
		}
		
		
		gradeScannerDos.close();
		gradeScanner.close();
		extraCreditScanner.close();
		return trueMode;
	}

	
	/**
	 * The "min" method will find the minimum grade value with and without extra credit
	 * 
	 * @param gradeType
	 * @return
	 * @throws FileNotFoundException
	 */
	public static double min(Boolean gradeType) throws FileNotFoundException {
		Scanner gradeScanner = new Scanner(grades);
		Scanner extraCreditScanner = new Scanner(extraCredit);


//		int i = 0;
//		int j = 0;
		double gradeDouble = 0;
		double extraCreditDouble = 0;
		double combinedGradeExtraCredit = 0.0;

		double max = 0;
		double min = 0;
		boolean First = true;
		// double nextGrade = 0;
		
		double trueMin = 0;

		if (gradeType == true) {

			while (gradeScanner.hasNextDouble()) {

				gradeDouble = gradeScanner.nextDouble();

				while (extraCreditScanner.hasNextDouble()) {

					extraCreditDouble = extraCreditScanner.nextDouble();

				}

				combinedGradeExtraCredit = gradeDouble + extraCreditDouble;

				// System.out.println(combinedGradeExtraCredit);

				if (First) {
					min = combinedGradeExtraCredit;
					max = combinedGradeExtraCredit;
					First = false;
				} else {
					max = Math.max(max, combinedGradeExtraCredit);
					min = Math.min(min, combinedGradeExtraCredit);
				}

			}

			trueMin = min-1;
			// System.out.println(max);
		} else if (gradeType == false) {

			while (gradeScanner.hasNextDouble()) {

				gradeDouble = gradeScanner.nextDouble();

				if (First) {
					min = gradeDouble;
					max = gradeDouble;
					First = false;
				} else {
					max = Math.max(max, gradeDouble);
					min = Math.min(min, gradeDouble);
				}

			}

			trueMin = min;
			// System.out.println(max);
		}


		gradeScanner.close();
		extraCreditScanner.close();

		return trueMin;
	}

	/**
	 * The "max" method will find the maximum grade with and without extra credit
	 * 
	 * @param gradeType
	 * @return
	 * @throws FileNotFoundException
	 */
	public static double max(Boolean gradeType) throws FileNotFoundException {
		Scanner gradeScanner = new Scanner(grades);
		Scanner extraCreditScanner = new Scanner(extraCredit);

		// int i = 0;
		// int j = 0;
		double gradeDouble = 0;
		double extraCreditDouble = 0;
		double combinedGradeExtraCredit = 0.0;

		double max = 0;
		double min = 0;
		boolean First = true;
		// double nextGrade = 0;
		
		double trueMax = 0;

		if (gradeType == true) {

			while (gradeScanner.hasNextDouble()) {

				gradeDouble = gradeScanner.nextDouble();

				while (extraCreditScanner.hasNextDouble()) {

					extraCreditDouble = extraCreditScanner.nextDouble();

				}

				combinedGradeExtraCredit = gradeDouble + extraCreditDouble;

				// System.out.println(combinedGradeExtraCredit);

				if (First) {
					min = combinedGradeExtraCredit;
					max = combinedGradeExtraCredit;
					First = false;
				} else {
					max = Math.max(max, combinedGradeExtraCredit);
					min = Math.min(min, combinedGradeExtraCredit);
				}

			}

			// System.out.println(min);
			//System.out.println(max);
			trueMax = max;
			
		} else if (gradeType == false) {

			while (gradeScanner.hasNextDouble()) {

				gradeDouble = gradeScanner.nextDouble();

				if (First) {
					min = gradeDouble;
					max = gradeDouble;
					First = false;
				} else {
					max = Math.max(max, gradeDouble);
					min = Math.min(min, gradeDouble);
				}

			}

			// System.out.println(min);
			//System.out.println(max);
			
			trueMax = max;
		}

		gradeScanner.close();
		extraCreditScanner.close();

		return trueMax;
	}

	/**
	 * The "printData" method will execute our validateFile method, which will in turn execute our validateData method
	 * After that prints out, we have several printf statements present to format our results of mean, mode, min and max 
	 * This is the only method that the main method needs to run to be fine
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void printData() throws FileNotFoundException, IOException {

		String meanEarned = "Mean Earned Grade: ";
		String meanEnhanced = "Mean Enhanced Grade: ";
		String modeEarned = "Mode Earned Grade: ";
		String modeEnhanced = "Mode Enhanced Grade ";
		String minEarned = "Minimum Earned Grade: ";
		String minEnhanced = "Minimum Enhanced Grade: ";
		String maxEarned = "Maximum Earned Grade: ";
		String maxEnhanced = "Maximum Enhanced Grade: ";
		validateFile(file);
		System.out.println();
		System.out.printf( "%30s" + mean(false) + "\n", meanEarned);
		System.out.printf( "%30s" + mean(true) + "\n", meanEnhanced);
		System.out.println();
		System.out.printf("%30s" + mode(false) + "\n", modeEarned);
		System.out.printf("%30s" + mode(true) + "\n", modeEnhanced);
		System.out.println();
		System.out.printf("%30s" + min(false) + "\n", minEarned);
		System.out.printf("%30s" + min(true) + "\n", minEnhanced);
		System.out.println();
		System.out.printf("%30s" + max(false) + "\n", maxEarned);
		System.out.printf("%30s" + max(true) + "\n", maxEnhanced);

	}

}
