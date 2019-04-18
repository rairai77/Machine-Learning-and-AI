package com.company;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");
        // can't pass int into ArrayLists
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        //Can pass Integer and Double, and Character and so and and so forth (Hint try long form of word with Capital letter at the beginning)
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++){
            integerArrayList.add(Integer.valueOf(i));
        }
        for(int i=0; i<=10; i++){
            System.out.println(i + " --> " + integerArrayList.get(i).intValue());
        }
    }
}
