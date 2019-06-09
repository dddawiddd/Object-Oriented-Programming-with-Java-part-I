
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int length = text.length();
        int i = 0;
        String add ="";
        for(i = length; i>0; i--){
            char numb = text.charAt(i-1);
            add += numb;
        }
        return add;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
