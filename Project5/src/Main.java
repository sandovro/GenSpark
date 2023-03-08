import java.util.Random;
import java.util.Scanner;

public class Main {

    static void printHangman(int missed){
        if (missed == 0) {
            System.out.println("+---+");

            System.out.println("    |\n");
            System.out.println("    |\n");
            System.out.println("    |\n");

            System.out.println("   ===\n");
        } else if (missed == 1) {
            System.out.println("+---+");

            System.out.println("O   |\n");
            System.out.println("    |\n");
            System.out.println("    |\n");

            System.out.println("   ===\n");
        } else if (missed == 2) {
            System.out.println("+---+");

            System.out.println("O   |\n");
            System.out.println("|   |\n");
            System.out.println("    |\n");

            System.out.println("   ===\n");
        } else if (missed == 3) {
            System.out.println("+---+");

            System.out.println("O   |\n");
            System.out.println("|   |\n");
            System.out.println("|   |\n");

            System.out.println("   ===\n");
        } else if (missed == 4) {
            System.out.println("+---+");

            System.out.println("O   |\n");
            System.out.println("|   |\n");
            System.out.println("|   |\n");

            System.out.println("^  ===\n");
        }

    }

    static void printLetters(String missed, String guessed, String word){
        System.out.println("Missed letters: "+missed+"\n");
        for (var c:word.toCharArray())
        {
            if (guessed.indexOf(c) >=0)
                System.out.print(c);
            else
                System.out.print("-");
        }
        System.out.println("\n");

    }

    static boolean checkIfWon(String word, String guessed) {
        for (var c:word.toCharArray()) {
            if (guessed.indexOf(c)<0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

        String[] words = {"cat", "dog", "mountain", "computer", "car", "food", "desk", "cup"};

        boolean keepPlaying = true;

        while (keepPlaying) {
            Random random = new Random();
            int ranIndex = random.nextInt(8);
            int missedNum = 0;
            String missedLetters = "";
            String word = words[0]; // ------ update index
            boolean won = false;
            String guessedCorrectly = "";

            System.out.println("H A N G M A N");

            while (!won) {
                printHangman(missedNum);
                printLetters(missedLetters, guessedCorrectly, word);
                if (missedNum==4)
                    break;

                char currChar;

                try {

                    Scanner scan = new Scanner(System.in);
                    System.out.println("Guess a letter.");

                    // check to see if letter was guessed already

                    currChar = scan.next().charAt(0);

                    if (word.indexOf(currChar) >= 0) {
                        guessedCorrectly += currChar;
                    } else {
                        missedNum++;
                        missedLetters += currChar;
                    }

                    won = checkIfWon(word, guessedCorrectly);

                    scan.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

            if (won) {
                System.out.println("\ntYes! The secret word is " + word + "! You have won!");
            } else {
                System.out.println("Sorry, you have lost.");
            }

            try {

                Scanner scan = new Scanner(System.in);
                System.out.println("Would you like to play again? (yes or no)");
                String choice = scan.nextLine();

                if (choice.equals("no"))
                    keepPlaying = false;
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }
}