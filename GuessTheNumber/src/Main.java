import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean play = true;
        while (play) {

            System.out.println("\nHello! What is your name?\n");

            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();

            System.out.println("\nWell, " + name + ", I am thinking of a number between 1 and 20");
            System.out.println("Take a guess.\n");

            Random rand = new Random();

            int ranNum = rand.nextInt(20);
            int guess = scanner.nextInt();
            boolean found = false;
            int numGuesses = 0;

            while (!found && numGuesses < 5) {

                if (guess == ranNum) {
                    found = true;
                    numGuesses++;
                    System.out.println("\nGood job, " + name + "! You guessed my number in " + numGuesses + " guesses!");
                } else if (guess < ranNum) {
                    numGuesses++;
                    System.out.println("\nYour guess is too low.");
                    System.out.println("Take a guess\n");
                    guess = scanner.nextInt();

                } else {
                    numGuesses++;
                    System.out.println("\nYour guess is too high.");
                    System.out.println("Take a guess\n");
                    guess = scanner.nextInt();
                }
            }

            if (!found) {
                System.out.println("\nYou have exceeded the total number of guesses");
                System.out.println("Thank you for playing!");
                break;
            }

            System.out.println("Would you like to play again? (y or n)\n");
            String ans = scanner.nextLine();
            ans = scanner.nextLine();

            if (ans.equals("n"))
                play = false;
        }
    }
}