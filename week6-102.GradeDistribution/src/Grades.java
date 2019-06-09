import java.util.ArrayList;

public class Grades {
    private double grade;
    private double five= 0;
    private double four;
    private double three;
    private double two;
    private double one;
    private double zero;

    private ArrayList<Grades> clas = new ArrayList<Grades>();


    public void addToAeey(double number){
        clas.add(new Grades(number));
    }

    public Grades(double grade){
        this.grade = grade;
    }

    public Grades(){
        this.grade = 0;
    }

    public void calculate(){
        for(Grades element : clas){

            if(element.grade>=50&&element.grade<=60){
                this.five++;
            }
            else if(element.grade>=45&&element.grade<=50){
                four++;
            }
            else if(element.grade>=40&&element.grade<=45){
                three++;
            }
            else if(element.grade>=35&&element.grade<=40){
                two++;
            }
            else if(element.grade>=30&&element.grade<=35){
                one++;
            }
            else if(element.grade>=0&&element.grade<=30){
                zero++;
            }
        }
    }

    public void printresult(){

        System.out.print("5: ");
        for(int i = 0; i<five;i++){
            System.out.print("*");
        }
        System.out.println("");

        System.out.print("4: ");
        for(int i = 0; i<four;i++){
            System.out.print("*");
        }
        System.out.println("");

        System.out.print("3: ");
        for(int i = 0; i<three;i++){
            System.out.print("*");
        }
        System.out.println("");

        System.out.print("2: ");
        for(int i = 0; i<two;i++){
            System.out.print("*");
        }
        System.out.println("");

        System.out.print("1: ");
        for(int i = 0; i<one;i++){
            System.out.print("*");
        }
        System.out.println("");

        System.out.print("0: ");
        for(int i = 0; i<zero;i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public double acceptance() {
        return 100*((five+four+three+two+one)/(five+four+three+two+one+zero));
    }
}
