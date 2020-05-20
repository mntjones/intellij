package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    // ArrayList<Team> teams;
        // Collections.sort(teams);

        //Create a generic class to implement a league table for a sport.
        //The class should allow teams to be added to the list, and store a list of teams
        // that belong to the league.

        //Class should have a method to print out the teams in order of rank.
        //Only teams of same type should be allowed to be on same league list.
        // Program should catch incompatible teams trying to get on lists.


        League<Team<SoccerPlayer>> soccer = new League<>("Soccer");
        Team<SoccerPlayer> lancers = new Team<>("Lancers");
        Team<SoccerPlayer>  warriors = new Team<>("Warriors");
        Team<SoccerPlayer>  lions = new Team<>("Lions");
        Team<SoccerPlayer>  tigers = new Team<>("Tigers");
        soccer.add(lancers);
        soccer.add(warriors);
        soccer.add(lions);
        soccer.add(tigers);


        League<Team<BaseballPlayer>> baseball = new League<>("Baseball");
        Team<BaseballPlayer> athletics = new Team<>("Oakland A's");
        Team<BaseballPlayer> angels = new Team<>("Anaheim Angels");
        Team<BaseballPlayer> astros = new Team<>("Houston Astros");
        Team<BaseballPlayer> mariners = new Team<>("Seattle Mariners");
        baseball.add(athletics);
        baseball.add(angels);
        baseball.add(angels);
        baseball.add(astros);
        baseball.add(mariners);
        // baseball.add(lancers); //getting error as expected

        athletics.matchResult(angels, 3, 1);
        athletics.matchResult(astros, 2, 2);
        athletics.matchResult(mariners, 5, 3);
        angels.matchResult(mariners, 2, 4);
        astros.matchResult(angels, 3, 2);
        mariners.matchResult(astros, 3, 3);

        baseball.showTeams();

    }
}
