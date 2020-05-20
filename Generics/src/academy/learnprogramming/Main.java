package academy.learnprogramming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // generics allows us to create methods and classes to specify, with a single method declaration, a set
        // of related methods, or with a single class declaration, a set of related types, respectively.

        // can create classes that take types as parameters.

//        ArrayList items = new ArrayList(); // shouldn't use raw types anymore
//        items.add(1);
//        items.add(2);
//        //items.add("m"); // problem doesn't show up until runtime
//        items.add(4);
//        items.add(5);
//
//        printDoubled(items);
//
//        ArrayList<Integer> nums = new ArrayList<>(); // specifying type
//        nums.add(1);
//        nums.add(2);
//        //nums.add("J"); // now gives a warning prior to runtime

        FootballPlayer adam = new FootballPlayer("Adam");
        FootballPlayer dad = new FootballPlayer("Dad");
        BaseballPlayer greg = new BaseballPlayer("Greg");
        SoccerPlayer monica = new SoccerPlayer("Monica");

        Team<FootballPlayer> raiders = new Team<>("Raiders"); // Football
        raiders.addPlayer(adam);
        raiders.addPlayer(dad);
        Team<FootballPlayer> niners = new Team<>("Niners");
        FootballPlayer les = new FootballPlayer("Les");
        niners.addPlayer(les);
        Team<FootballPlayer> chargers = new Team<>("Chargers");
        Team<FootballPlayer> rams = new Team<>("Rams");

        raiders.matchResult(niners, 21, 7);
        raiders.matchResult(chargers, 3, 14);
        niners.matchResult(chargers, 7, 7);

        //niners.matchResult(oakland, 3,5); //can't have Baseball Team play Football team
        // used <T> for team to catch this error

//        raiders.addPlayer(greg);
//        raiders.addPlayer(monica);

        System.out.println(raiders.numPlayers());

        Team<BaseballPlayer> oakland = new Team<>("Oakland Athletics");
        oakland.addPlayer(greg);

//        Team<String> broken = new Team<>("this won't work");
//        broken.addPlayer("Cass"); // extends player, must be type Player

        Team<SoccerPlayer> USA = new Team<>("US Women's Team");
        USA.addPlayer(monica);

        System.out.println("Rankings: ");
        System.out.println(raiders.getName() + ": " + raiders.ranking());
        System.out.println(niners.getName() + ": " + niners.ranking());
        System.out.println(chargers.getName() + ": " + chargers.ranking());

        System.out.println(raiders.compareTo(niners));
        System.out.println(raiders.compareTo(chargers));

    }

    private static void printDoubled(ArrayList n) {
        for(Object i : n) {
            System.out.println((Integer) i * 2);
        }
    }
}
