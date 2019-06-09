
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name:");
        String name1 = reader.nextLine();

        System.out.println("Type your age:");
        int age1 = reader.nextInt();

        System.out.println("");

        System.out.println("Type your name:");
        String name2 = reader.nextLine();

        String name3 = reader.nextLine();


        System.out.println("Type your age:");
        int age2 = reader.nextInt();

        System.out.println(name1 + " and " + name2 + name3 + " are " + (age1+age2));

        // Implement your program here
    }
}
