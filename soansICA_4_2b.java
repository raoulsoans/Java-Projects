import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class soansICA_4_2b {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		int charNumber = 0;

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter filename: ");
		String filename = kb.nextLine();
		File myFile = new File(filename);
		Scanner input = new Scanner(myFile);

		System.out.println("What character do you want to look for? ");
		char charWanted = kb.nextLine().charAt(0);

		while (input.hasNextLine()) {
			String line = input.nextLine();
			// System.out.print(line + "\n");

			for (int counter = 0; counter < line.length(); counter++) {

				if (charWanted == line.charAt(counter)) {

					charNumber++;

				}

			}

		}

		input.close();

		System.out.println("The character " + charWanted + " occurred " + charNumber + " times.");


		// String line1 = input.nextLine();

		kb.close();
		// input.close();
	}

}
