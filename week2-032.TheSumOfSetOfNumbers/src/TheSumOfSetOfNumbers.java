
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sume = 0;
        System.out.println("Until what?");
        int number = Integer.parseInt(reader.nextLine());
        for(int i = 1;i<=number;i++)
            sume += i;
        System.out.println(sume);
    }
}
