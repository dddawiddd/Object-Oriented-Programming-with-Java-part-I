import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smal = array[0];
        for(int i : array){
            if(i<smal){
                smal = i;
            }
        }
        return smal;
    }

    public static int indexOfTheSmallest(int[] array) {
        int look = smallest(array);
        int ert=0;

        for(int coun : array){
            ert++;
            if(coun == look){
                return ert-1;
            }
        }
        return 9000;
    }


    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int value =array[index];
        int smallestIndex = index;

        for(int i = index; i<array.length; i++){
            if(value>array[i]){
                value = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }



    public static void swap(int[] array,int index1, int index2){
        int swa = array[index1];
        int swb = array[index2];

        array[index1]= swb;
        array[index2]= swa;
    }


    public static void sort(int[] array){

        for(int i = 0; i<array.length;i++){
            int smallest = indexOfTheSmallestStartingFrom(array,i);
            swap(array,i,smallest);
            print(array);
        }
    }


    public static void print(int[] array){

        System.out.print("[");
        for(int element : array){
            System.out.print(element);

            if (element != array[array.length-1]) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}