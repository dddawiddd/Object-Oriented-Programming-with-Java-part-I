
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Up to what number?");
        int n = reader.nextInt();
        for(int i = 1; i<=n;i++)
            System.out.println(i);
    }
}
