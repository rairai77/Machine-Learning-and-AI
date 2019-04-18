package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while(count != 6){
            System.out.println("count val is " + count);
            count++;
        }
        count = 0;
        while(true){
            if(count==6){
                break;
            }
            System.out.println("count val is " + count);
            count++;
        }
        do {
            System.out.println("Count value was " + count);
            count++;
            if(count > 100){
                break;
            }
        } while(count != 6);
        System.out.println("*****************CHALLENGE*******************");
        //CHALLENGE
        int number = 5;
        int finishNumber = 20;
        int even = 0;
        while(number <= finishNumber && even < 5){
            if(!isEvenNumber(number)){
                number++;
                continue;
            }
            System.out.println("Even number " + number);
            even++;
            number++;
        }
        System.out.println("Total even numbers found = " + even);
    }
    //Challenge
    public static boolean isEvenNumber(int number){
        if(number % 2 == 0) return true;
        else return false;
    }
}
