
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {

            System.out.println("put a number");
            double number = Double.parseDouble(reader.nextLine());

            if(number>-30&&number<40) {
                    // double number = reader.nextDouble();
                    Graph.addNumber(number);
                }
        }










        /*
        while (true) {
            System.out.println("Input next point in graph: (yes or not) ");
            String question = reader.nextLine();
            if (question.equals("yes")) {
                System.out.println("put a number");
                double number = Double.parseDouble(reader.nextLine());

                if(number>-30&&number<40) {
                    // double number = reader.nextDouble();
                    Graph.addNumber(number);
                }

            }
            else {
                System.out.println("end");
                break;
            }
        }
*/


/*
        Graph.addNumber(7);
        double value = 13.5;
        Graph.addNumber(value);
        value = 3;
        Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
*/
    }
}
