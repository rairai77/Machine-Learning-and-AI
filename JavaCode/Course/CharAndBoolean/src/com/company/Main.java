package com.company;

public class Main {

    public static void main(String[] args) {
	    // The data-type char is limited to a single character, these can also have unicode symbols assigned to them
        // Width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode out put was: " +  myChar);

        //Booleans can be true or false
        boolean myBoolean = false;
        boolean isMale = true;

        //Challenge
        char challengeChar = '\u00AE';
        System.out.println(challengeChar);
    }
}
