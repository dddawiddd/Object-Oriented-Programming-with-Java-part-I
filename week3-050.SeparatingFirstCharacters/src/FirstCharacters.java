import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        if (name.length()>=3){
            char one = name.charAt(0);
            System.out.println("1. character: " + one);

            char two = name.charAt(1);
            System.out.println("2. character: " + two);

            char three = name.charAt(2);
            System.out.println("3. character: " + three);
        }

        else
            System.out.println("");
    }
}