/***************************************************************
	* file: Soans_Program_Invoice.java
	* author: Raoul Soans
	* class: CS 140
	*
	* assignment: program 3
	* date last modified: 4/16/17
	*
	* purpose: The purpose of this program is to take input from the user to determine whether you are a
	* member of the gas station or not, to input the quality of gas they want, and the amount of gas they want.
	* If they are a member, they get 10 cents off of every gallon, and the price of gas changes with the
	* quality. The console will display an invoice, displaying the subtotal before taxes, the county tax,
	* the city tax, a line of dashes, then the actual total price, all rounded to the nearest hundreth
	* and formatted correctly
	*
	****************************************************************/ 

import java.util.Scanner;

public class Soans_Invoice {

	
	/* Method: Main
	 * 
	 * purpose: The purpose of this program is to take input from the user to determine whether you are a
	 * member of the gas station or not, to input the quality of gas they want, and the amount of gas they want.
	 * If they are a member, they get 10 cents off of every gallon, and the price of gas changes with the
	 * quality. The console will display an invoice, displaying the subtotal before taxes, the county tax,
	 * the city tax, a line of dashes, then the actual total price, all rounded to the nearest hundredth
	 * and formatted correctly
	 */
	public static void main(String[] args) {
		
		
		Scanner userInput = new Scanner(System.in);
		
		
		//I am initializing nearly all of my variables in the start so I know where I can refer to all
		//of them
		final String membership;
		double gasPrice;
			gasPrice = 0;
		final int gasQuality;
		int gasAmount;
		//declaring some variables early, because if you declare them only in a conditional, they stay 
		//declared only in that conditional
		double subTotal;
			subTotal = 0;
		double total;
			total = 0;
		final double countyTax;
			countyTax = 0.07;
		final double cityTax;
			cityTax = .0375;
			
		double subCountyTax;
			subCountyTax = 0;
		double subCityTax;
			subCityTax = 0;
			
		//These next few print statements are what the User will first see and input their stuff into
		//This will store values in memory for later use
		System.out.print("Are you a member? ");
		membership = userInput.nextLine();
		
		System.out.print("  Quality of Gas: ");
		gasQuality = userInput.nextInt();
		
		System.out.print("    Gallons Sold: ");
		gasAmount = userInput.nextInt();
		
	
		
		//This is statement is the foundation for the program, banking on if you respond yes to
		//the membership prompt. If you do, then the rest of the program executes inside it
		//If not, it goes to the else if.
		if(membership.equalsIgnoreCase("yes")){
			
			/*If the variable gasQuality is set to 87 while being a member, then the price of gas is set to
			 *2.37, while the subtotal is the price of gas multiplied by the amount of gas you ordered.
			 */
			if (gasQuality == 87){
				
				gasPrice = 2.37;
				subTotal = ((gasPrice) * gasAmount);
				
			}
			
			/*If the variable gasQuality is set to 89 while being a member, then the price of gas is set to
			 *2.48, while the subtotal is the price of gas multiplied by the amount of gas you ordered.
			 */
			if (gasQuality == 89){
				
				gasPrice = 2.48;
				subTotal = ((gasPrice) * gasAmount);
				
			}
			
			/*If the variable gasQuality is set to 91 while being a member, then the price of gas is set to
			 *2.51, while the subtotal is the price of gas multiplied by the amount of gas you ordered.
			 */
			if (gasQuality == 91){
				
				gasPrice = 2.51;
				subTotal = ((gasPrice) * gasAmount);
				
			}
			
			
			//Round the subtotal
			double subTotalRounded;
			subTotalRounded = Math.round(subTotal*100.0)/100.0;
			
			//introduces new variables, the county and tax relative to the subtotal.
			subCountyTax = subTotalRounded * countyTax;
			subCityTax = subTotalRounded * cityTax;
			
			//These statements round the county and city taxes respectively to the nearest hundredth
			double subCountyTaxRounded = Math.round(subCountyTax * 100.0)/100.0;
			double subCityTaxRounded = Math.round(subCityTax * 100.0)/100.0;
			
			//gives us the total amount of money needed 
			total = subTotalRounded + subCountyTaxRounded + subCityTaxRounded;
			
			//this rounds the total to the nearest hundredth
			double totalRounded = Math.round(total * 100.0) / 100.0;
			
				//This is the invoice that you will see on the console, while all the math above is done behind 
				//the scenes
				System.out.println();
				System.out.printf("    INVOICE FOR GASOLINE\n");
				System.out.printf("      Member Status: "+ "Yes" + "\n");
				System.out.printf("Gasoline Sold Price: " + gasAmount + " @ " + gasPrice + "\n\n");
				System.out.printf("           Subtotal: $ " + subTotalRounded + "\n");
				System.out.printf("         County Tax: $ " + subCountyTaxRounded + "\n");
				System.out.printf("           City Tax: $ " + subCityTaxRounded + "\n");
				System.out.printf("                    -------------\n");
				System.out.printf("              Total: $ " + totalRounded);
			
			
		}
		
		else if(membership.equalsIgnoreCase("no")){
			
			/*If the variable gasQuality is set to 87 while NOT being a member, then the price of gas is set to
			 *2.47, while the subtotal is the price of gas multiplied by the amount of gas you ordered.
			 */
			if (gasQuality == 87){
				gasPrice = 2.47;
				subTotal = (gasPrice * gasAmount);
				
			}
			
			/*If the variable gasQuality is set to 89 while NOT being a member, then the price of gas is set to
			 *2.58, while the subtotal is the price of gas multiplied by the amount of gas you ordered.
			 */
			if (gasQuality == 89){
				
				gasPrice = 2.58;
				subTotal = (gasPrice * gasAmount);
				
			}
			
			/*If the variable gasQuality is set to 91 while NOT being a member, then the price of gas is set to
			 *2.61, while the subtotal is the price of gas multiplied by the amount of gas you ordered.
			 */
			if (gasQuality == 91){
				
				gasPrice = 2.61;
				subTotal = (gasPrice * gasAmount);
				
			}
			
			//Round the subtotal
			double subTotalRounded;
			subTotalRounded = Math.round(subTotal*100.0)/100.0;
			
			//introduces new variables, the county and tax relative to the subtotal.
			subCountyTax = subTotalRounded * countyTax;
			subCityTax = subTotalRounded * cityTax;
			
			//These statements round the county and city taxes respectively to the nearest hundredth
			double subCountyTaxRounded = Math.round(subCountyTax * 100.0)/100.0;
			double subCityTaxRounded = Math.round(subCityTax * 100.0)/100.0;
			
			//gives us the total amount of money needed 
			total = subTotalRounded + subCountyTaxRounded + subCityTaxRounded;
			
			//this rounds the total to the nearest hundredth
			double totalRounded = Math.round(total * 100.0) / 100.0;
			
				//This is the invoice that you will see on the console, while all the math above is done behind 
				//the scenes
				System.out.println();
				System.out.printf("    INVOICE FOR GASOLINE\n");
				System.out.printf("      Member Status: "+ "No" + "\n");
				System.out.printf("Gasoline Sold Price: " + gasAmount + " @ " + gasPrice + "\n\n");
				System.out.printf("           Subtotal: $ " + subTotalRounded + "\n");
				System.out.printf("         County Tax: $ " + subCountyTaxRounded + "\n");
				System.out.printf("           City Tax: $ " + subCityTaxRounded + "\n");
				System.out.printf("                    -------------\n");
				System.out.printf("              Total: $ " + totalRounded);
			

		}
		
		//closing the scanner I had in the beginning to prevent memory leak
		userInput.close();
	}
}