package randomgame;

import java.util.Random;
import java.util.Scanner;

public class Ass2Attempt2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int randomNumber = random.nextInt(100) + 1;
		System.out.println("the number is: " + randomNumber);
		System.out.println("Guess a number between 1 and 100: ");
		int numberOfGuesses = 0;
		
		while (numberOfGuesses < 5) {
			int guess = scanner.nextInt();
			
			if (guess == randomNumber) {
					System.out.println("You Win!");
					break;
			}else if (guess < 1 || guess > 100) {
				System.out.println("Guess within range");

			} else if (randomNumber > guess) {
				if (numberOfGuesses < 4) {
				
				System.out.println("Guess a higher number");
				}
				numberOfGuesses++;
			

			} else {
				if (numberOfGuesses < 4)
				System.out.println("Guess a lower number");
				numberOfGuesses++;

			}

		} if (numberOfGuesses == 5) {
			System.out.println("You lose sucka, the number was " + randomNumber);
	
		}
	}
}
