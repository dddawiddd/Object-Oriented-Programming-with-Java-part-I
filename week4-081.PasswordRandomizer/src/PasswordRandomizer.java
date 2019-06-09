import java.util.Random;

public class PasswordRandomizer {
    Random randomizer = new Random();
    int length;
    String word;

    public PasswordRandomizer(int length) {
        this.length = length;
        // Initialize the variable
    }

    public String createPassword() {
        this.word = "";
        for(int i=0;i<length;i++) {
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(randomizer.nextInt(25));
            this.word += symbol;
        }
        return this.word;
    }
}
