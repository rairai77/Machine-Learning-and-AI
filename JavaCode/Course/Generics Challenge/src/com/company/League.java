package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Player> {
    ArrayList<Team<T>> teams = new ArrayList<>();

    public void add(Team<T> teamToAdd){
        teams.add(teamToAdd);
        System.out.println("Added");
    }
    public void printInOrder(){
        Collections.sort(teams);
        for (Team team:
             teams) {
            System.out.println(team.getName());
        }
    }
}
