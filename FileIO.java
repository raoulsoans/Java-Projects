
import java.io.*;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) throws IOException {

		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the filename you want to capitalize: ");
		String filename = kb.nextLine();
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);

		System.out.print("Enter the file you want to output your capitalized file to: ");
		String filename2 = kb.nextLine();
		File fileIO_Caps = new File(filename2);
		Scanner outputFile = new Scanner(fileIO_Caps);
		PrintWriter in2out = new PrintWriter(fileIO_Caps);
		
		
		System.out.println("Enter append file: ");
		String appendFile = kb.nextLine();
		
		FileWriter append = new FileWriter(appendFile , true);

		String s = "";


		while (inputFile.hasNextLine()) {

			s = inputFile.nextLine();

			String upperCase = s.toUpperCase();
			
			in2out.println(upperCase);
			
			append.write(upperCase + "\n");

		}
		System.out.println("\nPlease check your files to make sure the process has completed succefully!");
		
		
		append.close();
		in2out.close();
		outputFile.close();
		inputFile.close();
		kb.close();
	}

}
