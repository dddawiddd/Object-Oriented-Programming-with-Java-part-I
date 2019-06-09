import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides =numberOfSides;
        // Initialize here the number of sides
    }

    public int roll() {
        return random.nextInt(numberOfSides)+1;
    }
}
