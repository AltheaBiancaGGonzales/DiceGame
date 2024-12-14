import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Dice Rolling Game!");
        System.out.println("Player 1 and Player 2 will roll the dice to determine the winner.\n");

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Player 1 dice roll
        System.out.print(player1.getName() + ", press Enter to roll the dice...");
        scanner.nextLine();  // Must press Enter key
        player1.rollDice();
        System.out.println(player1.getName() + " rolled a " + player1.getDiceRoll() + "\n");

        // Player 2 dice roll
        System.out.print(player2.getName() + ", press Enter to roll the dice...");
        scanner.nextLine();  // Must press Enter key
        player2.rollDice();
        System.out.println(player2.getName() + " rolled a " + player2.getDiceRoll() + "\n");

        // Determine and display the winner
        if (player1.getDiceRoll() > player2.getDiceRoll()) {
            System.out.println(player1.getName() + " WINS!");
        } else if (player2.getDiceRoll() > player1.getDiceRoll()) {
            System.out.println(player2.getName() + " WINS!");
        } else {
            System.out.println("It's a TIE!");
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
