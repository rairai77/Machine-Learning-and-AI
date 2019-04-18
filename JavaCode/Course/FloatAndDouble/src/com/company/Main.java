package com.company;

public class Main {

    public static void main(String[] args) {

        // Integers do not contain remainders
	    // Width = 32 (4 bytes)
        int myIntValue = 5/2;

        // Floats will contain remainders, they have a maximum of 7 digits after the decimal
        // Width = 32 (4 bytes)
	    float myFloatValue = 5f/2f;

	    // Doubles also contain remainders, they have a maximum of 16 digits after the decimal
        // Width 64 (8 bytes)
        double myDoubleValue = 5d/2d;

        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        System.out.println("myIntValue = " + myIntValue);

        //Challenge
        double pounds = 200;
        double kilograms = pounds*0.45359237d;
        System.out.println("Kilograms = " + kilograms);
        // 90.7185
    }
}
