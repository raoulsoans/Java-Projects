import java.util.Scanner;
public class RaoulSoans_CIS3090 {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		int breadAssign = 0;
		int veggieAssign = 0;
		int numOfVeggies =0;
		int[] veggieArray = new int[numOfVeggies];
		
		System.out.println("-----Select Sandwich Bread-----");
		System.out.println("1: White Bread, $1.50");
		System.out.println("2: Wheat Bread, $1.80");
		System.out.println("3: French Bread, $2.00");
		System.out.println("4: Organic Bread, $2.30");
		System.out.println("Please select a bread by entering it's assigned number, 1 through 4:");
		
		breadAssign = input.nextInt();
		
		if (breadAssign < 1 || breadAssign > 4){
			System.out.println("That's not a valid value. Please enter a number between 1 and 4.");
			breadAssign = input.nextInt();
			
		}
		
		System.out.println("-----Select Sandwich Vegetables-----");
		System.out.println("1: Red Onions, $0.10 ");
		System.out.println("2: Olives, $0.10");
		System.out.println("3: Pickles, $0.10");
		System.out.println("4: Lettuce, $0.20");
		System.out.println("5: Green Peppers, $0.25");
		System.out.println("6: Tomatoes, $0.30");
		System.out.println("7: Cheese, $0.49");
		System.out.println("8: EXIT VEGETABLE SELECTION");
		
		while(veggieAssign > 1 && veggieAssign < 7)
		veggieAssign = input.nextInt();
		numOfVeggies ++;
		
		

	}

}
