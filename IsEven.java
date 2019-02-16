import java.util.Scanner;


public class IsEven {

	public static void main(String[] args) {
		
		
		
		//boolean evenOdd=false;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter an integer from 0-10: ");
		int n = keyboard.nextInt();
		
		if(n > 10 || n < 1)
		{
			System.out.println("That number is not it range, please enter a number between 1 and 10");
		}
		else if(n >= 1 || n <= 10){
			
			System.out.print("Is that number even? ");
			
			if ((n % 2) == 0){
				
				System.out.println("Yes, this number is even.");
				
			}
			else {
				System.out.println("No, this number is not even.");
			}
			
		}
		
		
		
		
		
		keyboard.close();
	}

}
