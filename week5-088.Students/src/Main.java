
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while(true){
            System.out.print("name: ");
            String name = reader.nextLine();
            if(name.equals("")){
                break;
            }

            System.out.print("studentnumber: ");
            String studentnumber = reader.nextLine();

            list.add(new Student(name,studentnumber));
        }

        for(Student asd :list)
            System.out.println(asd);

//88.3
        System.out.print("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result:");

        for(Student asd : list){
            while(asd.getName().contains(search)){
                System.out.println(asd);
                break;
            }
        }
    }
}
