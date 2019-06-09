
public class AverageOfGivenNumbers {
    
    // implement here again the method of exercise 43
    public static int sume(int number1, int number2, int number3, int number4) {
        int sume = number1 + number2 + number3 + number4;
        return sume;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        int sume = sume(number1,number2,number3,number4);
        double result = sume/4.0;
        return result;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
