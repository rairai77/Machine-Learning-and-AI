package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Array Definition can be done with other data-types
        int[] myIntArray = new int[10];//declares array with indices 0-9
        myIntArray[5] = 50;// replaces index 5 with the number 50
        int[] myIntArray2 = {0,1,2,3,4,5,6,7,8,9};// creates array with 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 stored already

        int[] intForExample = new int[10];
        for(int i=0; i<myIntArray.length; i++){//initialize array with a for loop (good for formulas)
            myIntArray[i] = i*10;
        }
        System.out.println(intForExample);//not how you should do it
        for(int i=0; i<intForExample.length; i++){
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }
    }//how you can do it

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + ", value is " + array[i]);
        }//how you should do it
    }
}

