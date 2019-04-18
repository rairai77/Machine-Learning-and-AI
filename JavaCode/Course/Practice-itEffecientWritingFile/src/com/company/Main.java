package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        cone();
        box();
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
        box();
        cone();
    }
    private static void cone(){
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }
    private static void box(){
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }
}
