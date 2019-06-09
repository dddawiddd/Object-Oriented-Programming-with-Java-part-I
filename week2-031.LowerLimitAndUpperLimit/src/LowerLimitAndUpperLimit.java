
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First:");
        int n3 = reader.nextInt();

        System.out.println("Second:");
        int n2 = reader.nextInt();

        for(int n1 = n3; n1<=n2; n1++)
            System.out.println(n1);


    }
}
