import java.util.Random;

public class Soans_ICA_5_1a {

	public static void main(String[] args) {

		System.out.println(diceRoller(0));

	}

	public static int diceRoller(int totalRolled) {

		Random randy = new Random();

	//	int timesToRoll = 0;

		totalRolled = 0;

		int roll1 = (randy.nextInt(6) + 1);
		int roll2 = (randy.nextInt(6) + 1);

		totalRolled = roll1 + roll2;

		int counter = 1;


			while (totalRolled != 2) {
				counter++;

				roll1 = (randy.nextInt(6) + 1);
				roll2 = (randy.nextInt(6) + 1);

				totalRolled = roll1 + roll2;

			}

		
		
		return counter;
	}

}
