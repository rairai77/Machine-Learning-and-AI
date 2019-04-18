package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Team<BaseballPlayer> baseballTeam1 = new Team<BaseballPlayer>("BaseBall1");
        Team<BaseballPlayer> baseballTeam2 = new Team<BaseballPlayer>("BaseBall2");
        Team<BaseballPlayer> baseballTeam3 = new Team<BaseballPlayer>("BaseBall3");
        Team<FootballPlayer> footballPlayerTeam = new Team<FootballPlayer>("Footballers");

        League<BaseballPlayer> baseballPlayerLeague = new League<>();
        baseballPlayerLeague.add(baseballTeam1);
        baseballPlayerLeague.add(baseballTeam2);
        baseballPlayerLeague.add(baseballTeam3);
        //IT WORKS!!!
    }
}
