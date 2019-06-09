
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.




        while(true) {
            System.out.println("Type the password:");
            String put = reader.nextLine();
            if (password.equals(put)) {
                System.out.println("Right!\nThe secret is: Kutas kozła");
                break;
            }
            else
                System.out.println("Wrong!");
        }



/*
        while(true)
            System.out.println("Type the password:");
            put = reader.nextLine();
            if(password.equals(put))
                System.out.println("Right!");
            else
                System.out.println("Wrong!");

*/
    }
}
