import java.util.Scanner;

public class PrimeChecker {

	static boolean b = true;
	static boolean c = false;

	public static void main(String[] args) {

		//Scanner kb = new Scanner(System.in);
		//int s = kb.nextInt();

		System.out.println(isPrime(41));
		
		
		
		
		
		//kb.close();
	}

	public static boolean isPrime(int i) {
		if (i % 2 == 0)
			return false;

		for (int j = 3; j * j <= i; j += 2) {

			if (i % j == 0)

				return false;
		}

		return true;
	}
}