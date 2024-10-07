import java.util.Scanner;

public class Number_game {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100.0) + 1;
        Scanner scanner = new Scanner(System.in);
        boolean guessedCorrectly = false;
        int numberOfAttempts = 0;

       
        System.out.println("You have 3 attempts.");

        while (!guessedCorrectly && numberOfAttempts < 3) {
            System.out.print("\nGuess a number between 1 and 100: \t");
            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                guessedCorrectly = true;
            } else {
                ++numberOfAttempts;
                String result = (userGuess > randomNumber) ? "Your guess is high." : "Your guess is low.";
                System.out.println(result);
            }
        }

        scanner.close();
        if (guessedCorrectly) {
            System.out.println("\nCongratulations! You guessed correctly! The number was " + randomNumber);
            System.out.println("...YOU WON...");
        } else {
            System.out.println("\nSorry, you ran out of guesses. The correct answer was " + randomNumber);
            System.out.println("\nSystem Generated Number is " + randomNumber);
            System.out.println("play again!!");
        }

    }

    
}

    

