
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {

        System.out.println("Top ten players based on goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("\nTop 25 players based on penalty amounts\n");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("\nStatistics for Sidney Crosby\n");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("\nStatistics for Philadelphia Flyers\n");
        NHLStatistics.teamStatistics("PHI");

        System.out.println("\nplayers in Anaheim Ducks (abbreviation: ANA) ordered by points\n");
        NHLStatistics.sortByPoints();     // orders the players by points
        NHLStatistics.teamStatistics("ANA");


/*
        System.out.println("Top ten by points");

        NHLStatistics.sortByPoints();
        NHLStatistics.top(10);

        System.out.println("");

        NHLStatistics.sortByGoals();      // orders the players by goals
        NHLStatistics.top(10);

        System.out.println("");

        NHLStatistics.searchByPlayer("Koivu");         // prints stats of Mikko Koivu and Saku Koivu

        System.out.println("");

        NHLStatistics.teamStatistics("NYR");
*/

    }
}
