import java.util.Random;
import java.util.Scanner;

class Player {
    private String name;      // Player name
    private int diceRoll;     // Value of the dice roll

  
    public Player(String name) {
        this.name = name;
    }


    public void rollDice() {
        Random random = new Random();
        diceRoll = random.nextInt(6) + 1; // Random number between 1 and 6
    }


    public int getDiceRoll() {
        return diceRoll;
    }


    public String getName() {
        return name;
    }
}
