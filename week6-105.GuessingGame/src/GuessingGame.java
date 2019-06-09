import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);

        int lowerL  = lowerLimit;
        int upperL = upperLimit;

        while(lowerL != upperL){

            //System.out.println("Is your number greater than" + average(lowerL,upperL));

            if(isGreaterThan(average(lowerL,upperL))){
                lowerL = average(lowerL,upperL)+1;
            }
            else
                upperL = average(lowerL,upperL);
        }
        System.out.println("The number you're thinking of is " + lowerL);
    }


    public boolean isGreaterThan(int value){

        System.out.println("Is your number greater than "+ value +"? (y/n)");
        String scan = reader.next();
        if(scan.equals("y")){
            return true;
        }
        return false;
    }

    public int average(int firstNumber, int secondNumber){
        return (secondNumber+firstNumber)/2;
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
