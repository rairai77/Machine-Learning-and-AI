package com.company;

public class Main {

    public static void main(String[] args) {
        // int has a width of 32
        int myIntMinValue = -2_147_483_648;
        int myIntMaxValue = 2_147_483_647;
        int intExpression = (myIntMaxValue / 2);

        // byte has a width of 8
        byte myByteMinValue = -128;
        byte myByteMaxValue = 127;
        byte byteExpression = (byte) (myByteMaxValue / 2);

        // short has a width of 16
        short myShortMinValue = -32768;
        short myShortMaxValue = 32767;
        short shortExpression = (short) (myShortMaxValue / 2);

        // long has a width of 64
        long myLongMinValue = -9223372036854775808L;
        long myLongMaxValue = 9223372036854775807L;
        long longExpression = myLongMaxValue / 2;

        // Challenge
        byte myByte = 30;
        short myShort = 40;
        int myInt = 50;
        long myLong = 50000L + 10L * (myByte + myInt + myShort);
        System.out.println(myLong);
    }
}
