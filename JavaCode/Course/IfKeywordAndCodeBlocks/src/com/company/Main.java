package com.company;

public class Main {

    public static void main(String[] args) {
        // Code blocks are surrounded by {}
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score < 5000){//The curly braces are not needed if the IF statement only executes 1 statement
            System.out.println("Your score was less than 5000");
        }
        else if(score < 1000) {
            // Only executes if above if statement or else if statements do not execute, even then it still needs to meet a condition
            System.out.println("your score was less than 1000");
        }
        else {
            //This is only executed if the IF/ELSE IF tests aren't executed
            System.out.println("You have achieved a score of 5k or higher");
        }

        if(gameOver == true) {
            int finalScore = score + (levelCompleted*bonus); // You can access variables outside this code block, but
            // outside this code block this variable is not accessible
            System.out.println(finalScore);

        }

        //Challenge
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println(score + (levelCompleted * bonus));

    }
}
