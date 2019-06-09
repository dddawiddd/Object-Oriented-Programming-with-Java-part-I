import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = 0;
        NumberStatistics first = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        System.out.println("Type numbers: ");
        while(true) {
            number = Integer.parseInt(reader.nextLine());
            if(number==-1)
                break;
            first.addNumber(number);
            if(number%2==0)
                even.addNumber(number);
            else
                odd.addNumber(number);
        }

        System.out.println("sum: " + first.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
    }
}
