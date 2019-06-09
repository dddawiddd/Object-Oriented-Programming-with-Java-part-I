import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int sume = 1;


        if(number==0)
            System.out.println("Factorial is 1");
        else{
            for(int i=1; i<=number;i++)
                sume*=i;
            System.out.println("Factorial is " + sume);
        }
    }
}
