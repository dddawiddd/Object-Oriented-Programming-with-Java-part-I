import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        int lenght = text.length();
        String reverse ="";
        for(int i=lenght;i>0;i--){
            char read = text.charAt(i-1);
            reverse = reverse + read;
        }
        if(text.equals(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
