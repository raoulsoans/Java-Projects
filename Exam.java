

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int passes = 0, failures = 0, students = 0, result;
		
		for (students = 0; students < 10; students++) {
			
			
			System.out.print("enter result (1=pass, 0=fail): ");
			result = keyboard.nextInt();
			if (result == 1)
				passes++;
			else
				failures++;

			
			
		}
		
		System.out.println(passes + " passed\n" + failures + " failed");
		
		
		if (passes < 5)
			
			System.out.println("Raise tuition");
		
		
		keyboard.close();
	}
	
	
}