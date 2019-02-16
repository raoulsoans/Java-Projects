import java.io.*;
import java.util.*;

public class Soans_ArrayProcessing {
	static Scanner kb = new Scanner(System.in);
	static String filename = kb.nextLine();
	static File arrayInputfile = new File(filename);	

	
	public static void main(String[] args) throws FileNotFoundException {
			
		
		//inputData(arrayInputfile);
		printArray(inputData(arrayInputfile));

		//printArray(arr1);
		kb.close();
	}

	public static int[] inputData(File filename) throws FileNotFoundException {
		int lines = 0;

		int[] arr1 = new int[0];

		Scanner input1Scanner = new Scanner(filename);

		int arrayPosition = 0;
		

		if (filename.exists()) {
			
			lines = input1Scanner.nextInt();

			arr1 = new int[lines];
			
			while(input1Scanner.hasNextInt()){
				arr1[arrayPosition++] = input1Scanner.nextInt();
			}

			
		} else {

			System.out.println("That is not a valid file, check that your filename is correct!");
			System.exit(0);
		}

		 input1Scanner.close();
		 
		return arr1;

	}

	public static void printArray(int[] array) {

		
		for (int lines = 0; lines < array.length; lines++){
			
			if (lines % 10 == 0){
				System.out.println();
				System.out.println();
			}
			
			
			System.out.printf("%10d", array[lines]);
		}

		System.out.println();
		System.out.println();
		reverseArray(array);
		

	}

	public static void reverseArray(int[] array) {

		
		for(int length = array.length; length >= 0; length--){
			
			if(length % 10 == 0){
				System.out.println();
				System.out.println();
			}
			
			System.out.printf("%10d", array[length]);
			
			
			
		}
		

	}

	public static int sum(int[] array) {
		
		
		
		
		
		
		
		
		return 0;

	}

	public static double mean(int[] array) {
		return 0;

	}

	public static int min(int[] array) {
		return 0;
	}

	public static int max(int[] array) {
		return 0;
	}

	public static void evenOdd(int[] array) {

	}

}
