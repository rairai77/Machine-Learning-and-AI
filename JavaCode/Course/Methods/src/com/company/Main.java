package com.company;

public class Main {

    public static void main(String[] args) {
        int score = calculateScore(true, 100000, 8, 5); // How you call a method!
        System.out.println("Your final score was " + score);
        score = 1500;
        int position = calculateHighScorePosition(score);
        displayHighScorePosition("Rick", position);
        score = 900;
        position = calculateHighScorePosition(score);
        displayHighScorePosition("Rolf", position);
        score = 400;
        position = calculateHighScorePosition(score);
        displayHighScorePosition("Ronald", position);
        score = 50;
        position = calculateHighScorePosition(score);
        displayHighScorePosition("Rhino", position);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int pos){
        System.out.println(name + " got in to position " + pos);
    }

    public static int calculateHighScorePosition(int score){
        if(score >= 1000) return 1;
        else if(score >= 500 && score < 1000) return 2;
        else if(score >= 100 && score < 500) return 3;
        else return 4;
    }
}
