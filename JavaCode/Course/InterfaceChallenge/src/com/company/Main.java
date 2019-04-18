package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player newPlayer = new Player();
        newPlayer.fillOut(readValues());
        for (String i: newPlayer.returnData()) {
            System.out.println(i);
        }
        System.out.println(newPlayer.toString());
    }
    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index =0;
        System.out.println("Choose a name");
        values.add(scanner.nextLine());
        System.out.println("Choose the amount of health");
        values.add(scanner.nextLine());
        System.out.println("Choose the toughness");
        values.add(scanner.nextLine());
        return values;
    }
}
