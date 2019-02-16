
public class RaoulSoans_CIS3090_Assignment3 { //start of secondary testing class for the ZOO class

	public static void main(String[] args) { //start of main method
		
		
		Zoo zoo1 = new Zoo("SeaWorld", "San Diego", "small", 25, 54750, 400000); //creating a new object called zoo1, then using a secondary constructor to overload values to the 
		
		Zoo zoo2 = new Zoo("Woodland Park Zoo","Seattle, WA","medium",45,70000,1000000); //creating a new object for class Zoo called zoo2
		
		Zoo zoo3 = new Zoo("San Bernadino Zoo", "San Bernadino", "medium", 50, 100000, 1700000); //creating a new object for the zoo class called zoo3
		
		Zoo zoo4 = new Zoo("Nigerian Zoo","Nigeria","ultra-small",4,1000,20000);
	



		System.out.println("My first zoo is named "+ zoo1.getName() + ", which is located in " + zoo1.getLocation() + ".");
		System.out.println("This zoo is a " + zoo1.getSize() + " sized zoo.");
		System.out.println("The annual profit for the " + zoo1.getName() + " is $" +zoo1.getAnnualProfit() + ".");
		System.out.println("\n\n");
		
		System.out.println("My second zoo is named "+ zoo2.getName() + ", which is located in " + zoo2.getLocation() + ".");
		System.out.println("This zoo is a " + zoo2.getSize() + " zoo.");
		System.out.println("The annual profit for the " + zoo2.getName() + " is $" +zoo2.getAnnualProfit() + ".");
		System.out.println("\n\n");
		
		System.out.println("My third zoo is named "+ zoo3.getName() + ", which is located in " + zoo3.getLocation() + ".");
		System.out.println("This zoo is a " + zoo3.getSize() + " zoo.");
		System.out.println("The annual profit for the " + zoo3.getName() + " is $" +zoo3.getAnnualProfit() + ".");
		
		
		
	}

}
