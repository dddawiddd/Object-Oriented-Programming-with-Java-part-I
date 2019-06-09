
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Grades asdasd = new Grades();

        System.out.println("Type exam scores, -1 completes:");

        while(true){
            double scan = lukija.nextInt();

            if(scan == -1){
                System.out.println("Grade distribution: ");
                asdasd.calculate();
                asdasd.printresult();
                System.out.println("Acceptance percentage:"+ asdasd.acceptance());
                break;
            }
            asdasd.addToAeey(scan);
        }
    }
}