import java.util.Scanner;

public class Soans_ICA_3_2a {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 and 9: ");
		
		int zeroThruNine;
		
		
		

		
		
		if(userInput.hasNextInt())
			zeroThruNine = userInput.nextInt();
		else
			zeroThruNine = 10;
		
		
		
		
		switch(zeroThruNine) {
			
			case 0: System.out.println(zeroThruNine);
				    break;
				    
			case 1: System.out.println(zeroThruNine);
					break;
					
			case 2: System.out.println(zeroThruNine);
					break;
					
			case 3: System.out.println(zeroThruNine);
					break;
			
			case 4: System.out.println(zeroThruNine);
					break;
					
			case 5: System.out.println(zeroThruNine);
					break;
			
			case 6: System.out.println(zeroThruNine);
					break;
			
			case 7: System.out.println(zeroThruNine);
					break;
			
			case 8: System.out.println(zeroThruNine);
					break;
					
			case 9: System.out.println(zeroThruNine);
					break;
					
			default:
					System.out.println("NOT ALLOWED");
					
		}
		
		
		
		userInput.close();
		
	}
	
}
