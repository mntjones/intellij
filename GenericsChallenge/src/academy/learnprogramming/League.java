package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>  {
    private String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean add(T team) {
        if(league.contains(team)) {
            System.out.println("Team is already in league");
            return false;
        }
        league.add(team);
        System.out.println("Team " + team.getName() + " has been added to the league");
        return true;
    }

    public void showTeams() {
        Collections.sort(league);
        System.out.println("Rankings: ");
        for(T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }



}
