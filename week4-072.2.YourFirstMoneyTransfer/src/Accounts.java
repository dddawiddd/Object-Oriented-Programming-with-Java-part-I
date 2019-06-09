
public class Accounts {

    public static void main(String[] args) {

        Account first = new Account("Matt's account",1000);
        Account second = new Account("My account",0);

        first.withdrawal(100);
        second.deposit(100);

        System.out.println(first);
        System.out.println(second);
    }
}
