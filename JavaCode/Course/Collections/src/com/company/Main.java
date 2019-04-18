package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Theatre theatre = new Theatre("Martian", 8 , 12);
//        theatre.getSeats();
        if(theatre.reserveSeat("H11")){
            System.out.println("Please pay");
        }else{
            System.out.println("Sorry, too late.");
        }
        if(theatre.reserveSeat("H11")){
            System.out.println("Please pay");
        }else{
            System.out.println("Sorry, too late.");
        }
    }
}
