
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int n = reader.nextInt();
        int result = 0;

        for(int i=0;i<=n;i++){
            result += (int)Math.pow(2,i);
        }

        System.out.println("The result is "+ result);
    }
}
