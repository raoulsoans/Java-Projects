import java.util.Scanner;

public class Soans_ICA_4_1b {

	public static void main (String[] args)
    {
	int min, max, value;
        Scanner keyboardInput = new Scanner(System.in);

	System.out.print ("Enter a value: ");
	while(!keyboardInput.hasNextInt())
	{
	    System.out.print("Please enter a valid number: ");
	    keyboardInput.nextLine();
	}
	value = keyboardInput.nextInt();
	keyboardInput.nextLine();
	min = max = value;
	for (int count=2; count <= 10; count++)
	{
	    System.out.print ("Enter another value: ");
	    while(!keyboardInput.hasNextInt())
	    {
	        System.out.print("Please enter a valid number: ");
	        keyboardInput.nextLine();
	    }
	    value = keyboardInput.nextInt();
	    if (value < min)
	        min = value;
	    if (value > max)
	        max = value;
	}
	System.out.println ("Lowest: " + min);
	System.out.println ("Highest: " + max);
	
	keyboardInput.close();
    }
}