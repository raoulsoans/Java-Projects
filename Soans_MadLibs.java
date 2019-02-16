
/***************************************************************
	* file: Soans_Program_Invoice.java
	* author: Raoul Soans
	* class: CS 140
	*
	* assignment: program 3
	* date last modified: 4/16/17
	*
	* purpose: The purpose of this program is to prompt user for input, take their input, read a file, and put
	* their input into the file and read it back to the console like a game of MadLibs
	*
	****************************************************************/

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Soans_MadLibs {

	// this is my main method, which runs the program, it's purpose is to prompt
	// user for input, take their input, read a file, and put
	// their input into the file and read it back to the console like a game of
	// MadLibs
	public static void main(String[] args) throws FileNotFoundException, IOException {

		// declare the Lines to read Variable so I don't declare inside a
		// conditional.
		int linesToRead = 0;

		// initialize my scanner and set it to system input, to take input form
		// the user
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter filename: ");

		// introduce a string to give a name to what the user will type in
		// this will later be used to allow the program to know which file I
		// want to grab for my MadLibs game
		String filename = kb.nextLine();

		// Create an of the File class so I can represent my file within Java
		File myFile = new File(filename);

		// Initialize a new scanner which will not scan user Input, but scan the
		// file, who's name we just gave it
		Scanner input = new Scanner(myFile);

		// This method wo't be used until after out for loop, but this will be
		// used to
		// create a new text file to store the answer which we gave to it.
		PrintWriter madLibEntries = new PrintWriter("MadLibEntries.txt");

		/*
		 * this method checks the file to make sure the first line is an integer
		 * while there is an integer, it will assign that integer to our
		 * linesToRead integer which we declared in the first line Then we'll
		 * flush the scanner, because converting back from integer data type to
		 * a String requires a flush, otherwise it will read the wrong line when
		 * we try to read the next lines of our Mad Libs file
		 */
		while (input.hasNextInt()) {

			linesToRead = input.nextInt();
			input.nextLine();
		}

		/*
		 * The for loop will count how many times we want to take user input for
		 * entering our MadLib words We will declare and initialize a counter,
		 * and say that as long as that counter is less than the linesToRead
		 * variable we created earlier, then we will increment it, so that once
		 * it reaches the linesToRead value that was assigned in the last
		 * method, it will stop asking us for input and move on
		 */
		for (int counter = 0; counter < linesToRead; counter++) {

			System.out.print(input.nextLine() + " ");
			// This is where we store our given user input into another file
			// which I've called
			// madLibEntries.txt. We will use the file later
			madLibEntries.println(kb.nextLine());

		}
		// this method closes the MadLibEntries file, so it doesn't remain open
		// and interfere with the
		// rest of our program
		madLibEntries.close();

		String entryFileName = "MadLibEntries.txt";
		/*
		 * This is the same thing that we did up above, except it's going to be
		 * for our MadLibEntries file which contains our answers.
		 */
		File myFile2 = new File(entryFileName);
		Scanner secondInput = new Scanner(myFile2);
		while (secondInput.hasNextLine()) {

			System.out.print(input.nextLine() + " ");
			System.out.print(secondInput.nextLine());

		}

		System.out.println(".");

		// this closes off all of our scanners
		kb.close();
		input.close();
		secondInput.close();
	}

}
