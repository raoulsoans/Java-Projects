import java.util.Scanner;

public class SandwichOrder {
	
	Scanner input = new Scanner(System.in);
	
	private int breadAssign = 0;
	private int veggieAssign = 1;
	private int numOfVeggies = 0;
	int numOfVeggieArrayValues = (numOfVeggies - 2);
	private int[] veggieArray = new int[numOfVeggies];
	private int meatAssign = 1;
	
	public void orderBread(){
		System.out.println("-----Select Sandwich Bread-----");
		System.out.println("1: White Bread, $1.50");
		System.out.println("2: Wheat Bread, $1.80");
		System.out.println("3: French Bread, $2.00");
		System.out.println("4: Organic Bread, $2.30");
		System.out.println("Please select a bread by entering it's assigned number, 1 through 4:");
		
		breadAssign = input.nextInt();
		
		if (breadAssign < 1 || breadAssign > 4){
			System.out.println("That's not a valid value. Please enter a number between 1 and 4, based on the bread you want.");
			breadAssign = input.nextInt();
			
		}
		
	}
	
	public void orderVeggies(){
		
		while((veggieAssign >= 1 || veggieAssign <= 7) && veggieAssign !=8){
		System.out.println("-----Select Sandwich Vegetables-----");
		System.out.println("1: Red Onions, $0.10 ");
		System.out.println("2: Olives, $0.10");
		System.out.println("3: Pickles, $0.10");
		System.out.println("4: Lettuce, $0.20");
		System.out.println("5: Green Peppers, $0.25");
		System.out.println("6: Tomatoes, $0.30");
		System.out.println("7: Cheese, $0.49");
		System.out.println("8: EXIT VEGETABLE SELECTION");
		System.out.println("Please select your vegetable by entering it's assigned value."
				+ "\nYou will not exit vegetable selection until you enter 8 to exit.");
		
		veggieAssign = input.nextInt();
		
		if ((veggieAssign < 1 || veggieAssign > 7) && veggieAssign != 8){
			System.out.println("That's not a valid value. Please enter a number between 1 and 7, based on the vegetable you want."
					+ "Or enter 8 to exit");
			
			veggieAssign = input.nextInt();
			
		}
		
		numOfVeggies++;
		
		}
		System.out.println(numOfVeggieArrayValues);
	}
	
	public void orderMeat(){
		
		if((meatAssign >= 1 || meatAssign <= 4) && meatAssign !=5){
		System.out.println("-----Select Sandwich Meat-----");
		System.out.println("1: Ham, $0.90");
		System.out.println("2: Roasted Chicken Breast, $1.0");
		System.out.println("3: Turkey Breast, $1.10");
		System.out.println("4: Roast Beef, $1.50");
		System.out.println("5: No Meat (Exit Meat Selection)");
		System.out.println("Please select your meat by entering it's assigned value, 1-4."
				+ "\nIf you enter 5, you will not add any meat to your sandwich, and you will exit meat selection.");
		
		meatAssign = input.nextInt();
		
		if ((meatAssign < 1 || meatAssign > 5) && meatAssign != 5){
			System.out.println("That's not a valid value. Please enter a number between 1 and 4, based on the vegetable you want."
					+ "Or enter 5 to exit and leave meat off your sandwich");
			
			meatAssign = input.nextInt();
		}
			
		}
		
	}
	
	public void printOrder(){
		
	}
	


}
