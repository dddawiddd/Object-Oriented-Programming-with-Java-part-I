public class Player {
    private String name;
    private int amountOfGoals;

    public Player(String name, int amountOfGoals){
        this.name = name;
        this.amountOfGoals = amountOfGoals;
    }

    public Player(String name){
        this(name,0);   //without this (amountOfGoals) was also 0. why?
    }

    public String getName() {
        return name;
    }

    public int goals() {
        return amountOfGoals;
    }

    public String toString(){
        return "Player: "+ this.name + ", goals " + this.amountOfGoals;
    }
}
