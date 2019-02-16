import java.util.Scanner;

public class printF {
	
	public static void main(String[] args){
	
	Scanner kb = new Scanner(System.in);
	
	
	int hours;
	
	hours = kb.nextInt();
	
	System.out.printf("I work %,6d hours", hours);
	
	
	
	
	
	kb.close();
	}
}
