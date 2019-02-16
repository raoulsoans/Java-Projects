import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Soans_ICA_4_2 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter filename: ");
		String filename = kb.nextLine();
		File myFile =  new File(filename);
		Scanner input = new Scanner(myFile);
		
		System.out.println("What character do you want to look for? ");
		String charWanted = kb.next();
		
		
		System.out.println(charWanted);
		while (input.hasNext())
		{
		String line = input.nextLine();
		System.out.print(line + "\n");
		
		}
		input.close();

		
		if(!myFile.exists()){
			System.out.println("The file " + myFile + " does not exist, please try again");
			
			System.exit(0);
		}
		
		
		
		
//		String line1 = input.nextLine();
		
		
		
		
		

		kb.close();
	//	input.close();
	}

}
