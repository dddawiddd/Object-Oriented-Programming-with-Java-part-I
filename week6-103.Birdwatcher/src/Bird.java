
public class Bird {

    private String name;
    private String latinName;
    private int counter;

    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.counter = 0;
    }

    public String getName() {
        return this.name;
    }

    public void observer(){
        this.counter++;
    }

    public String toString(){
        return name + " (" + latinName + "): "+ this.counter + " observations" ;
    }
}
