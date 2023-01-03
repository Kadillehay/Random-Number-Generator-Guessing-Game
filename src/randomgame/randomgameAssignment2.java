package randomgame;

import java.util.Random;
import java.util.Scanner;

public class randomgameAssignment2 {
	public static void main(String[] args) {
		Random random = new Random();
		{

		}
		random.nextInt(101);

		System.out.println("Pick a number between 1 and 100:");
		doSomething();

//		System.out.println(doSomething());

	}

	static String doSomething() {
		Random random = new Random();
		int numberOfGuesses = 0;
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		String string = null;
		// TODO Auto-generated method stub
		Integer convertedInput = Integer.parseInt(userInput);

		int randomnumber = random.nextInt(101);

		while (numberOfGuesses < 5) {
			if (convertedInput > 0 && convertedInput <= 100) {

				if (convertedInput < randomnumber) {
					System.out.println("guess a higher number: ");
					convertedInput = scanner.nextInt();

				} else if (convertedInput > randomnumber) {
					System.out.println("guess a lower number");

					convertedInput = scanner.nextInt();

				} else {
					System.out.println("Guess within the parameter");

				}
				
			}

			return string;
		}
		return string;
	}
}