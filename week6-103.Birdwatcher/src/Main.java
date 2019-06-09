import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<Bird>();

        while (true){

            System.out.print("? ");
            String scan = r.next();

            if(scan.equals("Add")){

                System.out.print("Name: ");
                String name = r.next();

                System.out.print("Latin Name: ");

                birds.add(new Bird(name,r.next()));
            }

            else if(scan.equals("Observation")){

                System.out.print("What was observed:? ");
                String name = r.next();
                int i =0;

                for(Bird dsaf : birds){
                    if(dsaf.getName().equals(name)){
                        dsaf.observer();
                        i++;
                    }
                }
                if(i==0){
                    System.out.println("Is not a bird!  ");
                }
            }

            else if(scan.equals("Statistics")){

                for(Bird rew : birds){
                    System.out.println(rew.toString());
                }
            }

            else if(scan.equals("Show")){
                System.out.println("What? ");

                String printOne = r.next();

                for(Bird rew : birds){
                    if(rew.getName().equals(printOne))
                        System.out.println(rew.toString());
                }
            }

            else if(scan.equals("Quit")){
                break;
            }
        }
    }
}