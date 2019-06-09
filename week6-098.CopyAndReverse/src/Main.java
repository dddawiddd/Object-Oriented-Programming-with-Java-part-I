import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }


    public static int[] copy(int[] array){

        int[] kropi = new int[array.length];

        for(int i = 0; i<array.length; i++)
            kropi[i] = array[i];

        return kropi;
    }


    public static int[] reverseCopy(int[] array){

        int[] reverse = new int[array.length];

        for(int i = array.length; i>0; i--)
            reverse[array.length-i] = array[i-1];

        return reverse;
    }
}
