package com.company;

public class Main {

    public static void main(String[] args) {
        // byte, short, int, long, float, double, char and boolean are all primitive data-types

        // A string while not primitive is an integrated data-type, it is actually a class
        //it contains a sequence of characters
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myString;
        System.out.println("LastString is equal to " + lastString);
    }
}
