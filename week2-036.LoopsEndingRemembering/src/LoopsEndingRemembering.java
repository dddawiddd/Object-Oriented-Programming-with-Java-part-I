import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int sume = 0;
        int i = 0;
        int e = 0;
        int o = 0;

        System.out.println("Type numbers:");

        while(true) {
            int n = Integer.parseInt(reader.nextLine());
            if(n == -1) {
                System.out.println("Thank you and see you later!");
                break;
            }
            sume += n;
            i++;
            if(n%2==0)
                e++;
            else
                o++;
        }

        double average = (double)sume/i;

        System.out.println("The sum is " + sume);
        System.out.println("How many numbers: " + i);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + e);
        System.out.println("Odd numbers: " + o);
    }
}
