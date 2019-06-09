
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First:");
        int n1 = Integer.parseInt(reader.nextLine());
        System.out.println("Second:");
        int n2 = Integer.parseInt(reader.nextLine());
        int sume = 0;

        for(int i = n1;i<=n2;i++){
            sume += i;
        }
        System.out.println("The sume "+sume);
    }
}
