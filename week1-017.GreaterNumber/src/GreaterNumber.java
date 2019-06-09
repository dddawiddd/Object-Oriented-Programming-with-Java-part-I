import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first number:");
        int number1 = reader.nextInt();

        System.out.println("Type the second number:");
        int number2 = reader.nextInt();

        if(number1>number2)
            System.out.println("Greater number: " + number1);
        else if (number1<number2)
            System.out.println("Greater number: " + number2);
        else
            System.out.println("The numbers are equal!");



    }
}
