import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        char fch = firstCharacter(name);
        System.out.println("First character: " + fch);

    }

    public static char firstCharacter(String name){
        char fch = name.charAt(0);
        return fch;
    }
}