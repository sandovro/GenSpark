import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------");
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight...");
        System.out.println("--------------------------------------------------------\n");

        boolean over = false;
        while (!over) {
            System.out.println("Which cave will you go into? (1 or 2)\n");

            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("\nYou approach the cave. It is dark and spooky...");
                System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
                System.out.println("Gobbles you down in one bite!");
                over = true;
            } else if (choice.equals("2")) {
                System.out.println("\nYou approach the cave. It is dark and spooky...");
                System.out.println("A large dragon jumps out in front of you! He proceeds to ask for your name");
                System.out.println("He then allows you to pick once item from his treasure");
                over = true;
            } else {
                System.out.println("\nYou have made an invalid choice...");
                System.out.println("Please try again!\n");
            }
        }
    }
}