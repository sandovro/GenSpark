import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean play = true;
        while (play) {

            System.out.println("\nHello! What is your name?\n");

            Scanner scanner = new Scanner(System.in);

            String name = "";

            try {
                name = scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e);
            }

            Random rand = new Random();

            int ranNum = rand.nextInt(20);

            System.out.println("\nWell, " + name + ", I am thinking of a number between 1 and 20");
            System.out.println("Take a guess.\n");

            int guess = 0;

            try {
                guess = scanner.nextInt();
            } catch (Exception e) {
                System.out.println(e);
            }


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

                    try {
                        guess = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                } else {
                    numGuesses++;
                    System.out.println("\nYour guess is too high.");
                    System.out.println("Take a guess\n");

                    try {
                        guess = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }

            if (!found) {
                System.out.println("\nYou have exceeded the total number of guesses");
                System.out.println("Thank you for playing!");
                break;
            }

            System.out.println("Would you like to play again? (y or n)\n");
            scanner.nextLine();
            String ans = "";

            try {
                ans = scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e);
            }

            if (ans.equals("n"))
                play = false;
        }
    }
}