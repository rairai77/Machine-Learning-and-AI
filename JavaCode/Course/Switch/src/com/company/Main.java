package com.company;

public class Main {

    public static void main(String[] args) {

        int switchValue = 3;

        switch(switchValue){
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("was a 3 or a 4 ora 5");
                break;
            default:
                System.out.println("Was not 1  or 2");
                break;
        }

        String month ="january";
        switch(month.toLowerCase()){
            case "january":case "february":case "march":case"april":
                System.out.println("It's " + month);
                break;
            default:
                System.out.println("I'm sad....");
        }

        //CHALLENGE

        char switchVal = 'A';
        switch (switchVal){
            case 'A':
                System.out.println("was A");
                break;
            case 'B':
                System.out.println("was B");
                break;
            case 'C':
                System.out.println("was C");
                break;
            case 'D':
                System.out.println("Was D");
                break;
            case 'E':
                System.out.println("was E");
                break;
            default:
                System.out.println("Youuuuuuuu failed!");
                break;
        }
    }
}
