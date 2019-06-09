
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {

        Account konto = new Account("Dawids account",100.00);

        konto.deposit(20);

        System.out.println(konto);
    }
}
