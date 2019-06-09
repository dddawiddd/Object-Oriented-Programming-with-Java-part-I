import java.util.ArrayList;

public class Team {
    private String teamName;
    private int maxSize = 16;
    private ArrayList<Player> players = new ArrayList<Player>();

    public Team(String name){
        this.teamName = name;
    }

    public String getName(){
        return this.teamName;
    }

    public void addPlayer(Player player){
        if(players.size()<maxSize) {
            players.add(player);
        }
    }

    public void printPlayers(){
        for(Player asd : players)
            System.out.println(asd);
    }

    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int size(){
        return this.players.size();
    }

    public int goals(){
        int sumOfGoals =0;
        for(Player asd : players){
            sumOfGoals += asd.goals();
        }
        return sumOfGoals;
    }
}
