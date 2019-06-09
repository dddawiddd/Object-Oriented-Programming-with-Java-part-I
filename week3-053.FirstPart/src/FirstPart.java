
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a word: ");
        String word = reader.nextLine();

        System.out.println("Length of the first part: ");
        int length = reader.nextInt();

        String part = partOfWord(word,length);
        System.out.println("Result: " + part);
    }

    public static String partOfWord(String word, int lenght){
        String part = word.substring(0,lenght);
        return part;
    }
}
