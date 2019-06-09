
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        while(true){
            System.out.println("Type a word: ");
            String word = reader.nextLine();

            if(word.isEmpty()){
                Collections.sort(list);
                for(String asd : list)
                    System.out.println(asd);
                break;
            }
            list.add(word);
        }
    }
}
