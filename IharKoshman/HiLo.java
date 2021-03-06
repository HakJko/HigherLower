package IharKoshman;

import java.util.Random;
import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        do {
            final int RANDOM_NUM = generateNumWhichUserWillGuess();
            System.out.println("The number you need to guess: " + RANDOM_NUM);
            int guess = 0;

            while (guess != RANDOM_NUM) {
                System.out.print("Guess a number between 1 and 100: ");
                guess = scanner.nextInt();
                System.out.printf("You entered %s.\n", guess);
                if (guess < RANDOM_NUM) {
                    System.out.println(guess + " is too low. Try again.");
                } else if (guess > RANDOM_NUM) {
                    System.out.println(guess + " is too high. Try again.");
                } else {
                    System.out.println(guess + " is correct. You win!");
                }
            }
            System.out.println("Would you like to play again (y/n)?");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you for playing! Goodbye!");
        scanner.close();
    }

    private static int generateNumWhichUserWillGuess() {
        Random rand = new Random();
        return rand.nextInt((100 - 1) + 1) + 1;
    }
}
