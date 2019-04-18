package com.company;

public class Main {

    public static void main(String[] args) {
//	    int newScore = calculateScore("Tim", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
//        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(200d));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score*1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score*1000;
    }
    public static void calculateScore() {
        System.out.println("No score!");

    }
    //CHALLENGE
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0d && inches >= 0d && inches <= 12d) {
            return(feet * 12d * 2.54d + inches * 2.54d);
        }
        return -1d;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            double inch = inches%12;
            System.out.println(inch);
            double feet = (inches-inch)/12;
            System.out.println(feet);
            return calcFeetAndInchesToCentimeters(feet, inch);
        }
        return -1;
    }

}
