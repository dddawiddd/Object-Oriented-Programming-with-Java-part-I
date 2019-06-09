
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int length = name.length();
        int i = 0;

        while(i<length){
            char letter = name.charAt(i);
            System.out.println(i+1 + ". character: " + letter);
            i++;
        }
    }
}