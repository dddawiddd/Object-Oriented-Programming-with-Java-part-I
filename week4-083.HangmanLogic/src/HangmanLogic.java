
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if(!this.guessedLetters.contains(letter)){
            if(!this.word.contains(letter)){
                this.numberOfFaults++;
                this.guessedLetters += letter;
            }
            else
                this.guessedLetters += letter;
        }
    }

    public String hiddenWord() {
        int i = 0;
        String ans = "";
        String a;

        while(i<this.word.length()){
            a = "" + this.word.charAt(i);
            if(this.guessedLetters.contains(a)){
                ans += a;
            }
            else
                ans += "_";
            i++;
        }
        return ans;
    }
}
